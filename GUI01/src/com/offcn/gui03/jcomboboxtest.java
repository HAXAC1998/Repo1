package com.offcn.gui03;

import java.awt.Frame;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class jcomboboxtest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("jcombobox");
		
		jFrame.setBounds(100, 100, 200, 150);
		
		JPanel jPanel = new JPanel();
		
		JComboBox jComboBox = new JComboBox();//下拉菜单
		
		jComboBox.addItem("请选择其一");
		jComboBox.addItem("身份证");
		jComboBox.addItem("结婚证");
		jComboBox.addItem("离婚证");
		
		jPanel.add(jComboBox);
		
		jFrame.add(jPanel);
		
		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(3);
		
		
		

	}

}
