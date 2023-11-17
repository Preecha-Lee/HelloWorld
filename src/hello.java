import javax.swing.JOptionPane;

public class hello {
	public static void main (String[] args)
	{
		char x='A';
		char y;
		y=(char)(x+1);
		System.out.println("Hello สวัสดีครับ "+y);
		//JOptionPane input = new JOptionPane();
		String s = JOptionPane.showInputDialog(null,"Enter your name","Hello",JOptionPane.NO_OPTION);
		JOptionPane.showMessageDialog(null, "Hello "+s+"\nNice to meet you.","Greeting",JOptionPane.NO_OPTION);
		
	}

}
