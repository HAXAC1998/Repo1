import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class practise2 {
	public static void main(String[]args) {
		Frame f=new Frame();
		f.setLayout(new BorderLayout());
		
		Button East=new Button("East");
		Button South=new Button("South");
		Button West=new Button("West");
		Button North=new Button("North");
		
		f.add(East,"East");
		f.add(South,"South");
		f.add(West,"West");
		f.add(North,"North");
		
		
		
		Panel p=new Panel();
		p.setSize(100,100);
		p.setLayout(new FlowLayout(1,5,10));
		
		Button button1=new Button("1");
		Button button2=new Button("2");
		Button button3=new Button("3");
		Button button4=new Button("4");
		Button button5=new Button("5");
		Button button6=new Button("6");
		Button button7=new Button("7");
		Button button8=new Button("8");
		Button button9=new Button("9");
		
		p.add(button1);
		p.add(button2);
		p.add(button3);
		p.add(button4);
		p.add(button5);
		p.add(button6);
		p.add(button7);
		p.add(button8);
		p.add(button9);
	
		f.add(p,"Center");
		
		f.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		f.pack();
		
		f.setVisible(true);
		
		
		
		
		
		
	}
	
	
	
	
}
