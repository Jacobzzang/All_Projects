package co.jacob.app;

import java.awt.FlowLayout;

import javax.swing.*;

public class MemoGUIApp extends JFrame{
	JTextField txtNo,txtDate,txtContent;
	JButton btnInsert,btnDelete,btnSearch;
	JTextArea txtArea;
	public MemoGUIApp() {
		JPanel panel = (JPanel)this.getContentPane();
		panel.setLayout(new FlowLayout());
		
		panel.add(new JLabel("��ȣ"));
		txtNo = new JTextField(20);
		panel.add(txtNo);
		
		panel.add(new JLabel("��¥"));
		txtDate = new JTextField(20);
		panel.add(txtDate);
		
		panel.add(new JLabel("����"));
		txtContent = new JTextField(20);
		panel.add(txtContent);
		
		
		btnInsert = new JButton("���");
		panel.add(btnInsert);
		btnDelete = new JButton("����");
		panel.add(btnDelete);
		btnSearch = new JButton("��ȸ");
		panel.add(btnSearch);
		
		this.setSize(300,400);
		this.setTitle("�޸����");
		this.setVisible(true);
	
	}
	
	public static void main(String[] args) {
		new MemoGUIApp();
	}
}
