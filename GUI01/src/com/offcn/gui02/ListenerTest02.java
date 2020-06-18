package com.offcn.gui02;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ListenerTest02 {
	public static void main(String[]args) {
		Frame f=new Frame("Listener Test");
		
		f.setSize(200,200);
		
		f.setLayout(new BorderLayout());
		
		Button button1=new Button("start");
		Button button2=new Button("end");
		
		button1.addActionListener(new MyactionListener02());
		button2.addActionListener(new MyactionListener02());
		
		f.add(button1,new BorderLayout().NORTH);
		f.add(button2,new BorderLayout().CENTER);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			
			}
		});
		
		f.setVisible(true);
	}
}
class MyactionListener02 implements ActionListener{
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getActionCommand());
	}
}