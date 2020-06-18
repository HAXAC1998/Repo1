import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;

public class textarea {
	public static void main(String[]args) {
		
		Frame f=new Frame();
		f.setLayout(new GridLayout(5,4,3,3));//设置窗口为表格布局，5行4列，水平间距3，垂直间距3
		
		TextArea ta=new TextArea();
		
		Panel panel1=new Panel(new GridLayout(1,4,3,3));
		Panel panel2=new Panel(new GridLayout(1,4,3,3));
		Panel panel3=new Panel(new GridLayout(1,4,3,3));
		Panel panel4=new Panel(new GridLayout(1,4,3,3));
		
		String[]str1= {"7","8","9","/"};
		for(int i=0;i<str1.length;i++) {
			
			Button button=new Button(""+str1[i]) ;
			panel1.add(button);
			
		}
		
		String[]str2= {"4","5","6","*"};
		for(int i=0;i<str2.length;i++) {
			
			Button button=new Button(""+str2[i]) ;
			panel2.add(button);
			
		}

		String[]str3= {"1","2","3","-"};
		for(int i=0;i<str3.length;i++) {
			
			Button button=new Button(""+str3[i]) ;
			panel3.add(button);
			
		}
		String[]str4= {"0",".","=","+"};
		for(int i=0;i<str4.length;i++) {
			
			Button button=new Button(""+str4[i]) ;
			panel4.add(button);
			
		}
		f.add(ta);
		f.add(panel1);
		f.add(panel2);
		f.add(panel3);
		f.add(panel4);
		f.setSize(200,200);
		f.setVisible(true);
	}
}
