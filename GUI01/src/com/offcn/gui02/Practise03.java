package com.offcn.gui02;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Practise03 {
	public static void main(String[]args) {
		
		Frame f=new Frame("Frame����");
		
		f.setSize(300,100);
		
		Button button1 =new Button("ȷ��");
		Button button2 =new Button("ȡ��");
		
		button1.addActionListener(new MyActionListener06());
		button2.addActionListener(new MyActionListener06());
		
		f.setLayout(new GridLayout(1,2));
		
		f.add(button1,"West");
		f.add(button2,"East");
		
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		
		
	}
	}
class MyActionListener06 implements	ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("ȷ��")) {
			Frame frame=new Frame("�´���");
			
			frame.setSize(200,200);
			
			frame.setVisible(true);
			
		
				
			
			
				
			
		}else 
			System.exit(0);
	}
	    
}