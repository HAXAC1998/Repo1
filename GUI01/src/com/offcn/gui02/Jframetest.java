package com.offcn.gui02;

import java.awt.Color;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Jframetest {
	public static void main(String[]args) {
		
		JFrame jframe=new JFrame("test swing");
		
		jframe.setSize(200,200);
		
		JPanel jpanel=new JPanel();
		
		jpanel.setSize(200,200);
		
		jpanel.setBackground(Color.WHITE);
		
		jframe.add(jpanel);
		
		Label label=new Label("’‚ «label");
		
		jpanel.add(label);	
		
		jframe.setVisible(true);
		
		
		
	}

}
