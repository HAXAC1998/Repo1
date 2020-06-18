import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.border.Border;

public class practise03 {
	public static void main(String[]args) {
		Frame f=new Frame();
		f.setLayout(new GridLayout(2,1));
		f.setSize(400,300);
		
		
		Panel panel1=new Panel();
		Button button1=new Button("West(p1-西)");
		Button button2=new Button("East(P1-东)");
		Button button3=new Button("p2-Button1");
		Button button4=new Button("P2-Button2");
		Panel panel3=new Panel(new GridLayout(2,1));
		panel1.setLayout(new BorderLayout());
		
		
		panel1.add(button1,"West");
		panel1.add(button2,"East");
		panel3.add(button3);
		panel3.add(button4);
		panel1.add(panel3,"Center");
		
		
		
		Panel panel2=new Panel();
		panel2.setLayout(new BorderLayout());
		Button button5=new Button("West(p3-西)");
		Button button6=new Button("East(p3-东)");

		Panel panel4=new Panel(new GridLayout(2,2));
		panel2.add(button5,"West");
		panel2.add(button6,"East");
		
		Button button7=new Button("p4-Button0");
		Button button8=new Button("p4-Button1");
		Button button9=new Button("p4-Button2");
		Button button10=new Button("p4-Button3");
		panel4.add(button7);
		panel4.add(button8);
		panel4.add(button9);
		panel4.add(button10);
		panel2.add(panel4);
		f.add(panel1,"North");
		f.add(panel2,"South");
		
		f.setVisible(true);
		
		
		
		
		
		
		
		
		
		
				
		
	}
}
		