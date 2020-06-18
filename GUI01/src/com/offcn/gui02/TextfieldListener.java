package com.offcn.gui02;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextfieldListener {
	public static void main(String[]args) {
		Frame f=new Frame("TextFieldListener");
		
		TextField tf=new TextField();
		
		f.add(tf);
		
		f.setSize(200,200);
		
		tf.addActionListener(new MyactionListener03());
		
		f.setVisible(true);
		
		
	}
	
	
}

class MyactionListener03 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}