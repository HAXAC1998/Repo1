package com.offcn.gui02;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.xml.soap.Text;

public class practise01 {
	public static void main(String[]args) {
		Myframe f=new Myframe();
		
		
		
	}
	
}
class Myframe extends Frame{
	public Myframe() {
		
	TextField tf1=new TextField(15);
	Label label=new Label("+");
	TextField tf2=new TextField(15);
	Button button=new Button("=");
	TextField tf3=new TextField(10);
	
	button.addActionListener(new Actionlistener05(tf1,tf2,tf3));;
	setLayout(new FlowLayout());
	addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});
	
	add(tf1);
	add(label);
	add(tf2);
	add(button);
	add(tf3);
	
	
	pack();
	
	setVisible(true);
		
	}
	
	
}
class Actionlistener05 implements ActionListener{
	TextField t1,t2,t3;
	public Actionlistener05(TextField t1, TextField t2,TextField t3){
		this.t1=t1;
		this.t2=t2;
		this.t3=t3;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int i=Integer.parseInt(t1.getText());
		int j=Integer.parseInt(t2.getText());
		t3.setText(""+(i+j));
		
		
	}
	
}