package com.offcn.gui03;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Practise04 {

	private static Jtextfield jtextfield;

	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		
		jFrame.setSize(520,300);
		
		jFrame.setResizable(false);

		
		jFrame.setLayout(new BorderLayout());
		
		JPanel jPanel1 = new JPanel();
		JPanel jPanel2 = new JPanel();
		JPanel jPanel3 = new JPanel();
		JPanel jPanel4 = new JPanel();
		
		JLabel jLabel1 = new JLabel("���԰�");
		
		jPanel1.add(jLabel1,BorderLayout.NORTH);
		
		JTextArea textArea = new JTextArea("�������ݣ�",10,46);
		
		textArea.setEditable(false);//�����ı��򲻿ɱ�д
		
		textArea.setLineWrap(true);//�����Զ�����
		
		textArea.setFont(new Font("����", Font.BOLD, 15));
		
		
		
		JScrollPane jScrollPane = new JScrollPane(textArea);
		
		Dimension preferredSize = textArea.getPreferredSize();
		
		jScrollPane.setBounds(100, 100, preferredSize.width, preferredSize.height);
		
		jPanel2.add(jScrollPane);
		
		jPanel3.setLayout(new GridLayout(9, 0, 1, 10));
		
		JButton jButton1 = new JButton("����");
		JButton jButton2 = new JButton("����");
		JButton jButton3 = new JButton("��β");
		
		jButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setText("�������ݣ�");
				
				
				
			}
		});
		
		jButton1.setSize(20,5);
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setCaretPosition(0);//����������ť��ʹ������������
				
				
			}
		});
		
		jButton3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setCaretPosition(textArea.getDocument().getLength());
				//�������װ�ť��ʹ����������Ͷˡ�
				
			}
		});
		/*new Dimension()
		
		jButton1.setPreferredSize(dimension);
		jButton2.setPreferredSize(dimension);
		jButton3.setPreferredSize(dimension);
		*/
		
		jPanel3.add(jButton1);
		jPanel3.add(jButton2);
		jPanel3.add(jButton3);
		
		JLabel jLabel2 = new JLabel("��");
		JComboBox jComboBox = new JComboBox();
		JLabel jLabel3 = new JLabel("��˵��");
		JTextField jtextfield = new JTextField(15);
		JButton jButton4 = new JButton("�ύ");
		
		
		jButton4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String str=(String)jComboBox.getSelectedItem();//���������������е�ֵ
				textArea.setText("�������ݣ�"+"��"+str+"��˵"+jtextfield.getText());
				
			}
		});
		
		jComboBox.addItem("΢Ц");
		jComboBox.addItem("����");
		jComboBox.addItem("��ɥ");
		
		
		jPanel4.add(jLabel2);
		jPanel4.add(jComboBox);
		jPanel4.add(jLabel3);
		jPanel4.add(jtextfield);
		jPanel4.add(jButton4);
		
		jFrame.add(jPanel1,BorderLayout.NORTH);
		jFrame.add(jPanel2,BorderLayout.CENTER);
		jFrame.add(jPanel3,BorderLayout.EAST);
		jFrame.add(jPanel4,BorderLayout.SOUTH);
		
		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(3);
		
		
		
		
		
		
		

	}

}
