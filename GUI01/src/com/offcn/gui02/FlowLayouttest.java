package com.offcn.gui02;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayouttest {
	public static void main(String[]args) {
		JFrame jframe=new JFrame("Flowlayout");
		
		jframe.setSize(300, 200);
		
		JPanel jpanel=new JPanel();
		
		
		
		jpanel.setBackground(Color.green);
		
		jframe.add(jpanel);
		
		jpanel.setLayout(new FlowLayout(3,20,20));
		
		jframe.setVisible(true);
		
		for(int i=1;i<=9;i++) {
			
			Button button=new Button(""+(i));
			
			jpanel.add(button);
			
			jframe.setDefaultCloseOperation(3);
			
}
				
				
	
	}

}
