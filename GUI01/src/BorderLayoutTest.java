import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayoutTest {
	public static void main(String[]args) {
		
		Frame f=new Frame();
		
		f.setLayout(new BorderLayout());
		
		Button East=new Button("East");
		Button West=new Button("West");
		Button South=new Button("South");
		Button North=new Button("North");
		Button Center=new Button("Center");
		/*
		f.add(East,new BorderLayout().EAST);
		f.add(West,new BorderLayout().WEST);
		f.add(South,BorderLayout.SOUTH);
		f.add(North,new BorderLayout().NORTH);
		f.add(Center,new BorderLayout().CENTER);
	    */
		
		f.add(East,"East");
		f.add(West,"West");
		f.add(South,"South");
		f.add(North,"North");
		f.add(Center,"Center");
		
		f.pack();
		
		f.setVisible(true);
		
	}

}