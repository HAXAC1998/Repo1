package com.offcn.gui03;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jlabeltest {
	public static void main(String[]args) {
		JFrame jframe=new JFrame("Jlabel");
		
		JPanel jpanel = new JPanel();
		
		JLabel jlabel1 = new JLabel("��ͨ��ǩ");
		JLabel jlabel2 = new JLabel();
		jlabel2.setText("������setText�ı�ǩ");
		
		ImageIcon imageIcon = new ImageIcon("d:\\��.jpg");
		
		JLabel jlabel3 = new JLabel("ֲ��",imageIcon,JLabel.CENTER);
		
		jpanel.add(jlabel1);
		jpanel.add(jlabel2);
		jpanel.add(jlabel3);
		
		jframe.add(jpanel);
		
		jframe.setBounds(200,200, 600, 300);
		
		jframe.setVisible(true);
		
		jframe.setDefaultCloseOperation(3);
		
		
		
		
		
	
		
	}

}
