package com.offcn.gui03;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Jbutton {

	public static void main(String[] args) {
		JFrame jframe = new JFrame();
		JPanel jpanel = new JPanel();
		JButton jbutton = new JButton("��ͨ��ť");
		JButton jbutton2 = new JButton("���ñ�����ɫ");
		jbutton2.setBackground(Color.yellow);
		
		JButton jbutton3=new JButton("���ð�ťΪ������");
		
		jbutton3.setEnabled(false);
		
		JButton jbutton4 = new JButton("���ð�ť�ײ�����");
		
		Dimension dimension = new Dimension(160,200);
		
		jbutton4.setPreferredSize(dimension);
		
		jbutton4.setVerticalAlignment(3);//���ô�ֱ���뷽ʽ
		
		jpanel.add(jbutton);
		jpanel.add(jbutton2);
		jpanel.add(jbutton3);
		jpanel.add(jbutton4);
		
		jframe.add(jpanel);
		jframe.setBounds(100, 100, 600, 300);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(3);
		
				

	}

}
