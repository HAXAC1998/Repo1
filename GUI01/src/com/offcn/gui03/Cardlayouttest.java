package com.offcn.gui03;

import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cardlayouttest {
	public static void main(String[]args) {
		JFrame jframe =new JFrame("test cardlayout");
		JPanel jpanel1=new JPanel();
		JPanel jpanel2=new JPanel();
		
		JPanel cards=new JPanel();
		
		cards.setLayout(new CardLayout());
		
		JButton button1=new JButton("��¼��ť");
		JButton button2=new JButton("ע�ᰴť");
		JButton button3=new JButton("�һ����밴ť");
		
		JTextField jf1=new JTextField("�û����ı���",20);
		JTextField jf2=new JTextField("�����ı���",20);
		JTextField jf3=new JTextField("��֤�ı���",20);
		
		jpanel1.add(button1);
		jpanel1.add(button2);
		jpanel1.add(button3);
		
		jpanel2.add(jf1);
		jpanel2.add(jf2);
		jpanel2.add(jf3);
		
		cards.add(jpanel1,"card1");
		cards.add(jpanel2,"card2");
		
		
     	CardLayout layout=(CardLayout)cards.getLayout();
     	
     	layout.show(cards, "card2");
     	
     	jframe.add(cards);
     	
     	jframe.setBounds(100,100, 400, 200);
     	
     	jframe.setDefaultCloseOperation(3);
		
		jframe.setVisible(true);
		
				
		

}
}