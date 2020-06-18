import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Demo05 {
	public static void main(String[]args) {
		
		Frame f=new Frame("f");
		
		f.setLayout(new FlowLayout(1,30,50));
		
		f.setBounds(300, 300, 300, 200);
		/*
		Button button1=new Button("button1");
		Button button2=new Button("button2");
		Button button3=new Button("button3");
		Button button4=new Button("button4");
		Button button5=new Button("button5");
		Button button6=new Button("button6");
		*/
		for(int i=0;i<6;i++) {
			Button button=new Button("Button"+i);
			
			f.add(button);
		}
		
		/*f.add(button1);
		f.add(button2);
		f.add(button3);
		f.add(button4);
		f.add(button5);
		f.add(button6);
		*/
		f.setVisible(true);
	}

}
