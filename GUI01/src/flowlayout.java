import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class flowlayout {
	public static void main(String[]args) {
		
		Frame frame=new Frame();
		
		frame.setLayout(new FlowLayout(1,30,30));
		
		Button button1=new Button("button1");	
		Button button2=new Button("button2");
		Button button3=new Button("button3");
		
		
		frame.pack();
		
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
	
		frame.setVisible(true);
				
	}
}
