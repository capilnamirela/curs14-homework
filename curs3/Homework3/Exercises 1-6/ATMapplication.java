import java.util.Scanner;

public class ATMapplication{
	public static void main(String[] args){
		
		short pIN = 1234;
		int sumaDisponibila = 3_000;

		verificari(pIN, sumaDisponibila);

	}	

	public static void verificari(short pIN, int sumaDisponibila){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduceti PIN: ");
		short pinIntrodus = scanner.nextShort();

		if (pIN == pinIntrodus){
			System.out.println("PIN corect! ");

			System.out.print("Ce suma doriti sa retrageti? ");
			int sumaSolicitata = scanner.nextInt();

			if (sumaSolicitata <= sumaDisponibila){
				System.out.println("Suma solicitata este disponibila! Dupa retragerea sumei de: " + sumaSolicitata + "lei, ramane disponibila suma de: " + (sumaDisponibila - sumaSolicitata) + "lei.");
			} else {
            	System.out.println("Suma nu este disponibila, suma maxima care poate fi retrasa este de: " + sumaDisponibila + "lei!");
			}
		} else {
			System.out.println("PIN incorect! ");
		}	
	}
}