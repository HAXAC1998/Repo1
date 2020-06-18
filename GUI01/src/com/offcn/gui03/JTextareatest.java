package com.offcn.gui03;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.StyledEditorKit.BoldAction;

public class JTextareatest {

	public static void main(String[] args) {
		JFrame jframe = new JFrame();
		
		JPanel jpanel = new JPanel();
		
		jframe.setBounds(100, 100, 300, 200);
		
		JTextArea jTextArea = new JTextArea("«Î ‰»Îƒ⁄»›",6,25);
				
		jTextArea.setBackground(Color.yellow);
		
		jTextArea.setFont(new Font("ø¨ÃÂ", Font.BOLD, 13));
		
		jTextArea.setLineWrap(true);
		
		JScrollPane jScrollPane = new JScrollPane(jTextArea);
		
		Dimension preferredSize = jTextArea.getPreferredSize();
		
		jScrollPane.setBounds(110, 90, preferredSize.width, preferredSize.height);
		
		
		jpanel.add(jScrollPane);
		
		
		jframe.add(jpanel);
		
		jframe.setVisible(true);
		
		
		
		
				
				
		
		

	}

}
