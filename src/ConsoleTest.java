import java.io.Console;
public class ConsoleTest {

	public static void main(String[] args) {
		Console console = System.console();
		System.out.print("Input integer value : ");
		int input = Integer.parseInt(console.readLine());
		System.out.println("Square of "+input+" is "+(input*input));

	}

}
