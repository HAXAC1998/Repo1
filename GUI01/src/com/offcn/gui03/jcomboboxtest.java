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
		
		JComboBox jComboBox = new JComboBox();//�����˵�
		
		jComboBox.addItem("��ѡ����һ");
		jComboBox.addItem("���֤");
		jComboBox.addItem("���֤");
		jComboBox.addItem("���֤");
		
		jPanel.add(jComboBox);
		
		jFrame.add(jPanel);
		
		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(3);
		
		
		

	}

}
