import java.util.Scanner;

public class Remainder{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);

		System.out.print("a = ");
		int a = console.nextInt();
		System.out.print("b = ");
		int b = console.nextInt();

		int catulImpartirii = a/b;
		int restulImpartirii = a%b;

		System.out.println(a + " divided by " + b + " is " + catulImpartirii + " remainder " + restulImpartirii);
	}

}
