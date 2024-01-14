import java.util.Scanner;

public class Course3Scanner{
	public static void main(String[] args){
		System.out.println("Start");
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduceti nr int ");
		int intValue = scan.nextInt();
		System.out.println(intValue);

		System.out.println("Introduceti un string ");  
		String stringVar = scan.next();
		System.out.println(stringVar);

		System.out.println("Introduceti nr double ");
		double doubleVariable = scan.nextDouble();
		System.out.println(doubleVariable);

	}

}