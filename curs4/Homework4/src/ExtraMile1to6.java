public class ExtraMile1to6 {
    public static void main(String[] args) {

        String[] nume = {"Ana", "Maria", "Cristina", "Diana", "Andreea", "Andrei", "Marius"};

        countWhileDoWhileFor();
        arrayParam(nume);
        arraySecondElement(nume);
        douaElemLinie(nume);
        System.out.println();
        System.out.println(spatiiLibere("excava", 15));
        System.out.println(sumaCifrePare(123489));


    }
    public static void countWhileDoWhileFor(){
        System.out.println("count to 100 using WHILE:");
        int i = 0;
        while(i<=100){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        System.out.println("count to 100 using DO WHILE:");
        int j = 0;
        do {
            System.out.print(j + " ");
            j++;
        }
        while (j <= 100) ;
        System.out.println();
        System.out.println("count to 100 using FOR: ");
        for (int k = 0; (k <= 100); k++){
            System.out.print(k + " ");
        }
        System.out.println();
    };
    public static void arrayParam(String[] nume){
        for (String n : nume) {
            System.out.println(n);
        }
    }
    public static void arraySecondElement(String[] nume) {
        for (int i = 0; i < nume.length; i = i + 2) {
            System.out.println(nume[i]);
        }
    }
    public static void douaElemLinie(String[] nume){
        for (int i=0; i < nume.length; i++){
            if (i%2 == 0){
                System.out.print(nume[i]+" ");
            }else {
                System.out.println(nume[i]);
            }
        }
    }
    public static String spatiiLibere(String cuvant, int lungimeMax){
        String cuvantReturnat = null;
        int lungimeCuvant = cuvant.length();
        if ( lungimeCuvant >= lungimeMax){
            cuvantReturnat = cuvant.substring(0, lungimeMax);
        } else {
            cuvantReturnat = String.format("%" + (lungimeMax - lungimeCuvant) + "s%s", "", cuvant);
        }
        return cuvantReturnat;
    }
    public static int sumaCifrePare(int numar){
        String[] strArray = Integer.toString(numar).split("");
        int[] intArray = new int[strArray.length];
        for (int i = 0; i<strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        int suma = 0;
        for (int cifra : intArray){
            if (cifra%2 == 0) {
                suma = suma + cifra;
            }
        }
        return suma;
    }



}
