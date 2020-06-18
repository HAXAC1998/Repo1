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
		
		JLabel jLabel1 = new JLabel("留言板");
		
		jPanel1.add(jLabel1,BorderLayout.NORTH);
		
		JTextArea textArea = new JTextArea("留言内容：",10,46);
		
		textArea.setEditable(false);//设置文本域不可编写
		
		textArea.setLineWrap(true);//设置自动换行
		
		textArea.setFont(new Font("楷体", Font.BOLD, 15));
		
		
		
		JScrollPane jScrollPane = new JScrollPane(textArea);
		
		Dimension preferredSize = textArea.getPreferredSize();
		
		jScrollPane.setBounds(100, 100, preferredSize.width, preferredSize.height);
		
		jPanel2.add(jScrollPane);
		
		jPanel3.setLayout(new GridLayout(9, 0, 1, 10));
		
		JButton jButton1 = new JButton("清屏");
		JButton jButton2 = new JButton("至顶");
		JButton jButton3 = new JButton("至尾");
		
		jButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setText("留言内容：");
				
				
				
			}
		});
		
		jButton1.setSize(20,5);
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setCaretPosition(0);//设置至顶按钮，使滚动条到顶端
				
				
			}
		});
		
		jButton3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setCaretPosition(textArea.getDocument().getLength());
				//设置至底按钮，使滚动条到达低端。
				
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
		
		JLabel jLabel2 = new JLabel("你");
		JComboBox jComboBox = new JComboBox();
		JLabel jLabel3 = new JLabel("地说：");
		JTextField jtextfield = new JTextField(15);
		JButton jButton4 = new JButton("提交");
		
		
		jButton4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String str=(String)jComboBox.getSelectedItem();//获得输入的下拉框中的值
				textArea.setText("留言内容："+"你"+str+"地说"+jtextfield.getText());
				
			}
		});
		
		jComboBox.addItem("微笑");
		jComboBox.addItem("生气");
		jComboBox.addItem("沮丧");
		
		
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
