import java.util.Scanner;

public class Extramile8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti nr. n: ");
        int n = scanner.nextInt();
        System.out.print("Introduceti nr. k: ");
        int k = scanner.nextInt();

        System.out.print("Numerele divizibile sunt: ");
        int arrayDivizori[] = divizori(n, k);

        int pozitie = 0;
        for (pozitie = 0; pozitie < arrayDivizori.length; pozitie++) {
            System.out.print(arrayDivizori[pozitie] + " ");
        }

    }

    public static int[] divizori(int n, int k) {
        int nrDivizori = 0;
        for (int i = 1; i < n; i++) {
            if ((i % k) == 0) {
                nrDivizori++;
            }
        }
        int arrayDivizori[] = new int[nrDivizori];
        int indexArray = 0;
        for (int j = 1; j < n; j++) {
            if (j % k == 0) {
                arrayDivizori[indexArray] = j;
                indexArray++;
            }
        }
        return arrayDivizori;


    }


}
