package com.offcn.gui02;

import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ifelse {
	public static void main(String[]args) {
		JFrame f=new JFrame("ÅÐ¶ÏÆæÅ¼");
		f.setSize(300,150);
		JPanel jpanel=new JPanel();
		f.add(jpanel);
		jpanel.setLayout(new GridLayout(1,3));
		
		TextField tf1=new TextField();
		Button button=new Button("ÅÐ¶Ï");
		TextField tf2=new TextField();
		
		button.addActionListener(new MyActionListener(tf1,tf2));
		
		jpanel.add(tf1);
		jpanel.add(button);
		jpanel.add(tf2);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(3);
		
		
		
		
	}

}
class MyActionListener implements ActionListener{
	TextField t1,t2;
	public  MyActionListener(TextField t1 , TextField t2) {
		this.t1=t1;
		this.t2=t2;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int i=Integer.parseInt(t1.getText());
		
		if(i%2==0) {
			t2.setText("Å¼Êý");
		}else
			t2.setText("ÆæÊý");
		
		
		
	}
	
}