package com.offcn.gui02;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class KeyListener {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setLayout(new GridLayout(2,1));
		frame.setSize(300,200);
		Button button =new Button("Çë°´ÏÂ¼üÅÌ");
		
		TextField tf=new TextField();
		
		
		button.addKeyListener(new MyKeyListener(tf));
		frame.add(button);
		frame.add(tf);
		
		frame.setVisible(true);
		
		
		
		
	}
}
class MyKeyListener implements java.awt.event.KeyListener{
	TextField t1;
	public MyKeyListener(TextField t1){
		this.t1=t1;
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		t1.setText(t1.getText()+e.getKeyChar());
	    
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
