import java.util.Scanner;

public class Exercitiu5{
	public static void main(String[] args){

		String proc = "0%";
		System.out.println("Tax percent for your income is " + procent(proc));

	}

	public static String procent(String proc){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introd valoarea venitului: ");
		int venit = scanner.nextInt();

		proc = "0%";

		if (venit <= 2000){
			return "0%";
		} else if (venit <= 5000){
			return "20%";
		} else {
			return "35%";
		}
	}
}

