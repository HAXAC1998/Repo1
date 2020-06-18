package com.offcn.gui03;

import java.awt.Font;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Jtextfield {

	public static void main(String[] args) {
		JFrame jframe = new JFrame();
		JPanel jpanel = new JPanel();
		JTextField tf = new JTextField(20);
		
		tf.setText("干得漂亮");
		JTextField tf2 = new JTextField("猥琐发育，别浪");
		
		tf2.setFont(new Font("黑体", Font.BOLD, 16));
		
		JTextField tf3 = new JTextField(30);
		
		tf3.setText("挺烦的");
		
		tf3.setHorizontalAlignment(JTextField.CENTER);
		
		jpanel.add(tf);
		jpanel.add(tf2);
		jpanel.add(tf3);
		
		jframe.add(jpanel);
		jframe.setBounds(200,200, 100, 300);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(3);
		
		
		
		
		
		

	}

}
