import java.util.Random;

public class ExStrings {
    public static void main(String[] args) {
        String[] namesArray = {"Ana", "Nicoleta", "Aurora", "Maria", "Cristina", "Andreea"};
        String[] altArray = {"Ana Ionescu", "Maria Clara Popescu", "Cristina Alina Popa", "Andreea Ene"};
        String contine = "na";

        literaA(namesArray);
        givenString(namesArray, contine);
        litarer(namesArray);
        primele3litere(namesArray);
        randomLetter(namesArray);
        abreviere(altArray);
    }
    public static void literaA(String[] namesArray){
        for(String name : namesArray) {
            if(name.startsWith("A")) System.out.println(name);
        }
    }
    public static void givenString(String[] namesArray, String contine){
        for(String name : namesArray) {
            if(name.contains(contine)) System.out.println(name);
        }
    }
    public static void litarer(String[] namesArray) {
        for (String name : namesArray) {
            System.out.println(name.replace("r", "*"));
        }
    }
    public static void primele3litere(String[] namesArray) {
        for (String name : namesArray) {
            System.out.println(name.substring(0, 3));
        }
    }
    public static void randomLetter(String[] namesArray) {
        Random random = new Random();
        for (String name : namesArray) {
            int lungime = name.length();
            int nrRandom = random.nextInt(lungime);
            System.out.println(name.substring(nrRandom, nrRandom+1));
        }
    }

   public static void abreviere(String[] altArray){
        for (String name : altArray){
            String[] numeSplitArray = name.split(" ");
            if (numeSplitArray.length == 3) {
                System.out.println(numeSplitArray[0] + " " + numeSplitArray[1].substring(0, 1) + ". " + numeSplitArray[2]);
            } else {
                System.out.println(name);
            }
      }
   }
}
