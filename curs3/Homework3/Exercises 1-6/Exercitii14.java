import java.util.Scanner;

public class Exercitii14{
	public static void main(String[] args){
		
		byteParam();

		numarIntreg12();

		int numar1 = 0;
		int numar2 = 0;
		System.out.println("Cel mai mare dintre cele doua numere este: " + maxim2(numar1, numar2));

		int numarr1 = 0;
		int numarr2 = 0;
		int numarr3 = 0;
		System.out.println("Cel mai mare dintre cele trei numere este: " + maxim3(numarr1, numarr2, numarr3));

	}

	public static void byteParam(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introd un parametru tip byte = ");
		byte paramByte = scanner.nextByte();

		if (paramByte > 10){
			System.out.println("Parametrul introdus: " + paramByte + " este mai mare decat 10");
			} 
	}

	public static void numarIntreg12(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduceti un numar intre 1 si 12: ");
		int numarIntrod = scanner.nextInt();

		String[] luniAn = {"Ianuarie","Februarie","Martie","Aprilie","Mai","Iunie","Iulie","August","Septembrie","Octombrie","Noiembrie","Decembrie"};
		
		for (int i=1; i<=luniAn.length; i++){
			if (i == numarIntrod){
				System.out.println("Luna corespunzatoare numarului este: " + luniAn[i-1]);
			}
		}
	}

	public static int maxim2(int nr1, int nr2){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nr.1= ");
		nr1 = scanner.nextInt();
		System.out.print("Nr.2= ");
		nr2 = scanner.nextInt();

		if (nr1 > nr2){
        	return nr1;
		} else {
			return nr2;
		}
	}

	public static int maxim3(int nrr1, int nrr2, int nrr3){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nr.1= ");
		nrr1 = scanner.nextInt();
		System.out.print("Nr.2= ");
		nrr2 = scanner.nextInt();
		System.out.print("Nr.3= ");
		nrr3 = scanner.nextInt();
		
		int max = nrr1;
		if (nrr2 > max){
        	max = nrr2;
        }
		if (nrr3 > max){
        	max = nrr3;
		}
		return max;
	}

}