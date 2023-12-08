package tema_2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.swing.JTree;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;


public class XML_Viewer extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblTime;
	SimpleDateFormat formatter= new SimpleDateFormat("HH:mm:ss");
	JTree tree;

	private class UpdateClock extends TimerTask
	{
		public void run() { lblTime.setText(formatter.format(new Date(System.currentTimeMillis()))); }
	}
	
	private void fillTree(DefaultMutableTreeNode tree_node, Node xml_node)
	{
		if (xml_node != null)
		{
			Node xml_child = xml_node.getFirstChild();
			while (xml_child != null)
			{
				if (xml_child.getNodeType() == Node.TEXT_NODE && !xml_child.getNodeValue().trim().isEmpty())
				{
					DefaultMutableTreeNode tree_child = new DefaultMutableTreeNode(xml_child.getNodeValue().trim());
					tree_node.add(tree_child);
				}
				else if (xml_child.getNodeType() != Node.TEXT_NODE)
				{
					DefaultMutableTreeNode tree_child = new DefaultMutableTreeNode(xml_child.getNodeName().trim());
					tree_node.add(tree_child);
					fillTree(tree_child, xml_child);
				}	
				xml_child = xml_child.getNextSibling();
			}
		}
	}
	
	private void createTree(File xml_path)
	{
		try
		{
			DocumentBuilderFactory my_factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder my_builder = my_factory.newDocumentBuilder();
			Document my_xml = my_builder.parse(xml_path);
			Node my_element = my_xml.getDocumentElement(); 

			DefaultMutableTreeNode root = new DefaultMutableTreeNode(my_element.getNodeName());
			tree.setModel(new DefaultTreeModel(root));
			
			fillTree(root, my_element);
			
			((DefaultTreeModel) tree.getModel()).nodeChanged(root);
		}
		catch (Exception e){ System.out.println(e.toString()); }
	}
	
	public XML_Viewer() 
	{
		setTitle("Procesare XML");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tree = new JTree();
		JScrollPane myScroll = new JScrollPane(tree);
		tree.setModel(null);
		myScroll.setBounds(10, 78, 583, 348);
		contentPane.add(myScroll);
		
		lblTime = new JLabel("oo:mm:ss");
		lblTime.setBounds(461, 38, 100, 14);
		contentPane.add(lblTime);
		
		JButton btnOpenXML = new JButton("Open XML");
		btnOpenXML.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				JFileChooser jfc = new JFileChooser(System.getProperty("user.dir"));
				jfc.setFileFilter(new FileNameExtensionFilter(null, "xml"));
				if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
					createTree(jfc.getSelectedFile());
			}
		});
		btnOpenXML.setBounds(10, 34, 166, 23);
		contentPane.add(btnOpenXML);
		
		
		new Timer().schedule(new UpdateClock(), 0, 500);
	}

}
