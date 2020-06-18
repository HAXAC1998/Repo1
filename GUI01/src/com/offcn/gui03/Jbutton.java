package com.offcn.gui03;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Jbutton {

	public static void main(String[] args) {
		JFrame jframe = new JFrame();
		JPanel jpanel = new JPanel();
		JButton jbutton = new JButton("普通按钮");
		JButton jbutton2 = new JButton("设置背景颜色");
		jbutton2.setBackground(Color.yellow);
		
		JButton jbutton3=new JButton("设置按钮为不可用");
		
		jbutton3.setEnabled(false);
		
		JButton jbutton4 = new JButton("设置按钮底部对齐");
		
		Dimension dimension = new Dimension(160,200);
		
		jbutton4.setPreferredSize(dimension);
		
		jbutton4.setVerticalAlignment(3);//设置垂直对齐方式
		
		jpanel.add(jbutton);
		jpanel.add(jbutton2);
		jpanel.add(jbutton3);
		jpanel.add(jbutton4);
		
		jframe.add(jpanel);
		jframe.setBounds(100, 100, 600, 300);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(3);
		
				

	}

}
