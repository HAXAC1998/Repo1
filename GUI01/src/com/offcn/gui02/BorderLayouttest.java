package com.offcn.gui02;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayouttest {
	public static void main(String[]args) {
		
		JFrame jframe=new JFrame();
		jframe.setSize(300,150);
		
		
		
	    jframe.setLayout(new BorderLayout());
	    
	    Button button1=new Button("East");
	    Button button2=new Button("West");
	    Button button3=new Button("Center");
	    Button button4=new Button("North");
	    Button button5=new Button("South");
	    
	    jframe.add(button1,new BorderLayout().EAST);
	    jframe.add(button2,new BorderLayout().WEST);
	    jframe.add(button3,new BorderLayout().CENTER);
	    jframe.add(button4,new BorderLayout().NORTH);
	    jframe.add(button5,new BorderLayout().SOUTH);
	    
	    jframe.setDefaultCloseOperation(3);
	    
	    jframe.setVisible(true);
	}
	
	

}
