package com.offcn.gui03;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class Jlisttest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		
		jFrame.setSize(300,150);
		
		JPanel jPanel = new JPanel();
			
		String[] strs =new String[] {"结婚证","身份证","离婚证"};
		
		JList jList = new JList(strs);
		
		jPanel.add(jList);
		
		jFrame.add(jPanel);
		
		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(3);
		
				
		
		
		

	}

}
