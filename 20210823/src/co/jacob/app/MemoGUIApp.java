package co.jacob.app;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MemoGUIApp extends JFrame{
	JTextField txtNo,txtDate,txtContent;
	JButton btnInsert,btnDelete,btnSearch;
	JTextArea txtArea;
	MemoStorage memoStorage;
	public MemoGUIApp() {
		memoStorage = MemoStorage.getInstance();
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
		
		//��Ϲ�ư
		btnInsert = new JButton("���");
		btnInsert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String no = txtNo.getText();
				String date = txtDate.getText();
				String content = txtContent.getText();
				Memo memo = new Memo(no,date,content);
				boolean result = memoStorage.saveDate(memo);
				if(result) {
					JOptionPane.showMessageDialog(panel, "��ϿϷ�");
				}
				else {
					JOptionPane.showMessageDialog(panel, "��Ͻ���");
				}
				clearText();
				
			}});
		panel.add(btnInsert);

		//������ư
		btnDelete = new JButton("����");
		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String no = txtNo.getText();
			
				memoStorage.deleteData(no);
				JOptionPane.showMessageDialog(panel, "�����Ϸ�");
				
			}
		});
		
		panel.add(btnDelete);
		//��ȸ��ư
		btnSearch = new JButton("��ȸ");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<Memo> list = memoStorage.searchData();
				txtArea.setText("");
				for(Memo memo : list) {
					txtArea.append(memo.toString());
				}
			
			}
			
		});
		panel.add(btnSearch);
		
		txtArea = new JTextArea(15,23);
		panel.add(txtArea);
		
		this.setSize(300,400);
		this.setTitle("�޸����");
		this.setVisible(true);
	
	
	//�����ư
	btnSave = new JButton("����");
	btnSave.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			List<Memo> list = memoStorage.searchData();
			txtArea.setText("");
			for(Memo memo : list) {
				txtArea.append(memo.toString());
			}
		
		}
		
	});
	panel.add(btnSave);
	}
	public static void main(String[] args) {
		new MemoGUIApp();
	}
	
	private void clearText() {
		txtNo.setText("");
		txtDate.setText("");
		txtContent.setText("");
	}
}
