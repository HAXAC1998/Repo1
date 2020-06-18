

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class panel01 {
	public static void main(String[]args) {
		Frame f=new Frame("f");
		
		f.setLayout(null);
		
		f.setBounds(300, 300, 200, 200);
		
		f.setVisible(true);
		
		Panel panel01=new Panel();
		
		panel01.setBounds(100,100,100,100);
		
		f.setBackground(Color.green);
		
		panel01.setBackground(Color.BLUE);
		
		f.add(panel01);
		
		
		
		
	}

}
