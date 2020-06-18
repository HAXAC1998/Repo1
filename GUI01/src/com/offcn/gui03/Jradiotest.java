package com.offcn.gui03;

import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Jradiotest {
	public static void main(String[]args) {
		JFrame jframe = new JFrame();
		
		JPanel jpanel=new JPanel();
		
		JLabel jlabel = new JLabel("现在是什么季节");
		
		JRadioButton jRadioButton1 = new JRadioButton("春天");
		JRadioButton jRadioButton2 = new JRadioButton("夏天",true);
		JRadioButton jRadioButton3 = new JRadioButton("秋天");
		JRadioButton jRadioButton4 = new JRadioButton("冬天");
		
		ButtonGroup buttonGroup = new ButtonGroup();
		
		buttonGroup.add(jRadioButton1);
		buttonGroup.add(jRadioButton2);
		buttonGroup.add(jRadioButton3);
		buttonGroup.add(jRadioButton4);
		
		
		jpanel.add(jlabel);
		jpanel.add(jRadioButton1);
		jpanel.add(jRadioButton2);
		jpanel.add(jRadioButton3);
		jpanel.add(jRadioButton4);
		
		jframe.add(jpanel);
		jframe.setBounds(100, 100, 400, 200);
		jframe.setVisible(true);
		
		jframe.setDefaultCloseOperation(3);
	}

}
