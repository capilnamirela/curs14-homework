public class ConfidentialApp {
    public static void main(String[] args) {

        String phrase = "Ana are mere, multe mere bune are Ana.";
        String[] cuvSensibile = {"mere", "Ana"};
        confidential(phrase, cuvSensibile);
    }
    public static int countChar(String cuvant, char litera) {
        int nrAparitii = 0;
        for (int contor = 0; contor < cuvant.length(); contor++) {
            if (cuvant.charAt(contor) == litera) {
                nrAparitii++;
            }
        }
        return nrAparitii;
    }
    public static String stelute(String cuvant) {
        String cuvantAscuns = cuvant.replaceAll("[A-Za-z]", "*");
        return cuvantAscuns;
    }
    public static boolean contine(String[] propozitie, String cuvant) {
        boolean verificare = false;
        for (int indexArray = 0; indexArray < propozitie.length; indexArray++) {
            if (propozitie[indexArray].equals(cuvant)) {
                verificare = true;
            }
        }
        return verificare;
    }
    public static String[] arrayOfStrings(String phrase) {
        String[] cuvinte = phrase.split("[ .!,]");
        return cuvinte;
    }
    public static void confidential(String phrase, String[] arraySensitiveWords) {
        String[] arrayPhrase = arrayOfStrings(phrase);

        for (int i=0; i<arrayPhrase.length; i++){
            if (contine(arraySensitiveWords, arrayPhrase[i]) == true) {
                System.out.print(stelute(arrayPhrase[i] + " "));
            } else {
                System.out.print(arrayPhrase[i] + " ");
            }
        }
    }
}

