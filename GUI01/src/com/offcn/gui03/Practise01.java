package com.offcn.gui03;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Practise01 {
	public static void main(String[]args) {
		JFrame jframe=new JFrame("登录");
		
		jframe.setSize(300,150);
		
		JPanel jpanel1=new JPanel();
		
		JPanel jpanel2=new JPanel();
				
		JPanel jpanel3=new JPanel();
		
		jframe.setLayout(new GridLayout(3,1));
		
		
		
		Label label1=new Label("用户名");
		TextField tf1=new TextField(15);
		Label label2=new Label("密码");
		TextField tf2=new TextField(15);
		Button button1=new Button("登录");
		Button button2=new Button("取消");
		
		jpanel1.add(label1);
		jpanel1.add(tf1);
		jpanel2.add(label2);
		jpanel2.add(tf2);
		jpanel3.add(button1);
		jpanel3.add(button2);
		
		
		
		jframe.add(jpanel1);
		jframe.add(jpanel2);
		jframe.add(jpanel3);
		
		
		jframe.setVisible(true);
		
				
		
	}

}
