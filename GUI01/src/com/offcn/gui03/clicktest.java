package com.offcn.gui03;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class clicktest {
	static int click;//����һ��ȫ�ֱ���
	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		
		jFrame.setSize(300,200);
		
		jFrame.setLayout(new BorderLayout(0,0));
		
		JButton jButton = new JButton("���һ��");
		
		Dimension dimension = new Dimension(280,120);
		
		jButton.setPreferredSize(dimension);
		
		JLabel jLabel = new JLabel();
		
		jLabel.setText("");
		
		jFrame.add(jButton,BorderLayout.NORTH);
		
		jFrame.add(jLabel,BorderLayout.SOUTH);
		
		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(3);
		
		
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jLabel.setText("�����"+(++click)+"��");//��Ҫһ��������
				
			}
		});
		
		
		
		
		
		
		
	}

}
