import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        String myString = "abcd";
        String otherString = "ab"+"cd";
        String objectString = new String("abcd");

        System.out.println(myString + " "+otherString + " " + objectString);
       verifyEquality(myString, objectString);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nr 1:");
        int nr1 = scanner.nextInt();
        System.out.println("Nr 2:");
        int nr2 = scanner.nextInt();

        //int result =  sumOfTwoNumbers(nr1,nr2);
       // System.out.println(result);

        int result = sumOfTwoNumbers(nr1, nr2);


    }

    private static void verifyEquality(String myString, String objectString) {
        if(myString.equals(objectString)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");

        }
    }

    private static int sumOfTwoNumbers(int nr1, int nr2) {
        return nr1 + nr2;
    }


}



