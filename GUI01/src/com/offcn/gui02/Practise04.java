package com.offcn.gui02;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Practise04 {
	public static void main(String[]args) {
		JFrame jframe=new JFrame("Á·Ï°");
		
		jframe.setSize(250,150);
		
		JPanel jpanel=new JPanel();
		
		jpanel.setBackground(Color.yellow);
		
		jframe.add(jpanel);
		
		jpanel.setLayout(new FlowLayout(3,20,20));
		
		Button button1=new Button("Java");
		Button button2=new Button("Python");
		Button button3=new Button("PHP");
		Button button4=new Button("C++");
		
		jpanel.add(button1);
		jpanel.add(button2);
		jpanel.add(button3);
		jpanel.add(button4);
		
	
		jframe.setDefaultCloseOperation(3);
		
		jframe.setVisible(true);
	}

}
