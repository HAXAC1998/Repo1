package com.offcn.gui02;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

public class Paint {

	public static void main(String[] args) {
		Frame f=new Frame();
		f.setSize(300,300);
		
		f.add(new Drawpanel());
		f.setVisible(true);
	}

}
class Drawpanel extends Panel{
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(100, 100, 50, 50);
		
		g.setColor(Color.BLUE);
		g.fillRect(100, 50, 100, 100);
		
		Color color=g.getColor();
		System.out.println(color);
	}
	
}