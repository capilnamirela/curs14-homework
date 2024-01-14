import java.util.Scanner;

public class MyFirstDebuggerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Length of array is: ");

        int lengthOfArray = scanner.nextInt();
        String[] names = new String[lengthOfArray];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Introdu un nume: ");
            String name = scanner.next();
            names[i] = name;

        }

        for (String  savedName : names) {
            System.out.println(savedName);

        }


    }
}
