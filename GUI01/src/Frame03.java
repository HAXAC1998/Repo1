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
	//����Myframe�Ĺ��췽��������Ҫ�Ĳ�������װ�������ڴ����������ʱ���췽��ִ��
	public Myframe(int x,int y,int width,int height,Color c) {
		
		
		setLocation(x,y);
		setSize(width,height);
		setBackground(c);
	    setVisible(true);
		
		
		
	}
}
		
		
		
