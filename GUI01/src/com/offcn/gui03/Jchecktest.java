package com.offcn.gui03;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Jchecktest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("常见的编程语言");
		
		JPanel jPanel = new JPanel();
		
		jFrame.setBounds(100, 100, 200, 150);
		
		JCheckBox jCheckBox1 = new JCheckBox("C");
		JCheckBox jCheckBox2 = new JCheckBox("C#");
		JCheckBox jCheckBox3 = new JCheckBox("Python");
		JCheckBox jCheckBox4 = new JCheckBox("php");
		JCheckBox jCheckBox5 = new JCheckBox("java",true);
		JCheckBox jCheckBox6 = new JCheckBox("go");
		
		jPanel.add(jCheckBox1);
		jPanel.add(jCheckBox2);
		jPanel.add(jCheckBox3);
		jPanel.add(jCheckBox4);
		jPanel.add(jCheckBox5);
		jPanel.add(jCheckBox6);
		
		jFrame.add(jPanel);
		
		jFrame.setSize(400,100);
		
		jFrame.setVisible(true);
	}

}
