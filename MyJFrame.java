package tema_2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyJFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textInputField;
	private JList<String> listFormatii;
	private DefaultListModel<String> modelFormatii;
	private JButton btnSterge;

	private class AddFormatie implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			if (textInputField.getText().length() != 0)
			{
				modelFormatii.addElement(textInputField.getText());
				textInputField.setText("");
				btnSterge.setEnabled(true);
			}
		}
	}
	
	private class RemoveFormatie implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			while (listFormatii.getSelectedIndex() != -1)
				modelFormatii.remove(listFormatii.getSelectedIndex());

			if (modelFormatii.isEmpty())
				btnSterge.setEnabled(false);
		}
	}
	
	public MyJFrame() {
		setResizable(false);
		setTitle("Formatii");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textInputField = new JTextField();
		textInputField.addActionListener(new AddFormatie());
		textInputField.setBounds(5, 5, 424, 20);
		contentPane.add(textInputField);
		textInputField.setColumns(10);
		
		modelFormatii = new DefaultListModel<String>();
		
		listFormatii = new JList<String>(modelFormatii);
		listFormatii.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		listFormatii.setBounds(5, 25, 424, 261);
		contentPane.add(listFormatii);
		
		btnSterge = new JButton("Sterge");
		btnSterge.addActionListener(new RemoveFormatie());
		btnSterge.setBounds(5, 297, 424, 23);
		btnSterge.setEnabled(false);
		contentPane.add(btnSterge);
	}
}
