import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame03 {
	public static void main(String[]args){
		
		Myframe f=new Myframe(200, 200, 500, 500,null );
		
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
	
	}
}
class Myframe extends Frame{
	//设置Myframe的构造方法，将需要的参数都封装进来，在创建这个对象时构造方法执行
	public Myframe(int x,int y,int width,int height,Color c) {
		
		
		setLocation(x,y);
		setSize(width,height);
		setBackground(c);
	    setVisible(true);
		
		
		
	}
}
		
		
		
