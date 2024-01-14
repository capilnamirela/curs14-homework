import java.util.Random;
import java.util.Scanner;

public class Extramile7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numarRandom = randomNumber();
        System.out.println(numarRandom);

        int numarIntrodus = 0;
        boolean verificare = false;

        while (verificare == false) {

            System.out.println("Introduceti un numar: ");
            numarIntrodus = scanner.nextInt();

            if (numarIntrodus > numarRandom) {
                System.out.println("Sorry, you're too high. Try again.");
            } else if (numarIntrodus < numarRandom) {
                System.out.println("Sorry, you're too low. Try again.");
            } else {
                System.out.println("You guessed it! Congratulations!");
                verificare = true;
            }
        }
    }


    public static int randomNumber() {
        Random random = new Random();
        int nrRandom = random.nextInt(100);
        return nrRandom;
    }


}
