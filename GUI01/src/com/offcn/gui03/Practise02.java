package com.offcn.gui03;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.offcn.gui02.Demo01;

public class Practise02 {
	public static void main(String[]args) {
		JFrame jframe = new JFrame("��ϰ");
		
		jframe.setLayout(new  BorderLayout());
		jframe.setBounds(100, 100, 250, 330);
		
		JPanel jpanel1 = new JPanel();
		JPanel jpanel2 = new JPanel();
		JPanel jpanel3 = new JPanel();
		
		JButton button1 = new JButton("����");
		JButton button2 = new JButton("ƻ��");
		JButton button3 = new JButton("�㽶");
		JButton button4 = new JButton("��֦");
		JButton button5 = new JButton("����");
		JButton button6 = new JButton("����");
		
		Dimension dimension = new Dimension(250, 230);
		
		
		button3.setPreferredSize(dimension);
		
		button3.setVerticalAlignment(0);
		
		
		jpanel1.add(button1);
		jpanel1.add(button2);
		jpanel2.add(button3);
		jpanel3.add(button4);		
		jpanel3.add(button5);		
		jpanel3.add(button6);		
		
		jframe.add(jpanel1,BorderLayout.NORTH);
		jframe.add(jpanel2,BorderLayout.CENTER);
		jframe.add(jpanel3,BorderLayout.SOUTH);
		
		
		
		jframe.setVisible(true);
		
		jframe.setDefaultCloseOperation(3);
		
		
	}

}
