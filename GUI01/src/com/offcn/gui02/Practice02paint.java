package com.offcn.gui02;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Practice02paint {
	public static void main(String[]args) {
		Frame f=new Frame("°ÂÔËÎå»·");
		f.setSize(300,200);
		f.add(new Drawpanel02());
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		
		});
	}

}
class Drawpanel02 extends Panel{
	int w=80;
	int h=80;
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.drawOval(10, 10,w, h);
		
		g.setColor(Color.blue);
		g.drawOval(80, 10,w, h);
		
		g.setColor(Color.green);
		g.drawOval(150, 10,w, h);
		
		g.setColor(Color.black);
		g.drawOval(50, 70,w, h);
		
		g.setColor(Color.yellow);
		g.drawOval(120, 70,w, h);
		
	}
	
};