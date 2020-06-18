import java.awt.Color;
import java.awt.Frame;

public class Frame01 {
	public static void main(String[]args) {//主方法 main方法名
		
		Frame fr=new Frame("我的第一个frame");//创建一个窗口对象，窗口存在内存中
		
		fr.setSize(200,200);//给窗口设置大小，宽和高，都是整数
		
		fr.setLocation(100,100);//设置窗口位置
		
		fr.setBackground(Color.RED);//设置窗口的颜色
		
		fr.setResizable(false);//设置窗口大小不可变
		
		fr.setVisible(true);//设置窗口可见性
		
				
		
				
		
		
	}

}
