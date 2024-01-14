public class StringExercise {
    public static void main(String[] args) {
        String magie = "HocusPocus";
        System.out.println(magie.length());

        String substring = magie.substring( 3);
        System.out.println(substring);
        System.out.println(magie.substring(2, 8));

        System.out.println(magie.toUpperCase());
        System.out.println(magie.toLowerCase());


        String magieHocus = magie.substring(0,5);
        String magiePocus = magie.substring(5);

        System.out.println(magieHocus.toUpperCase() + magiePocus.toLowerCase());

        String forest = "       Padurea Neagra     ";
        System.out.println(forest.trim());
        System.out.println(forest);

        String names = "Ion2George4Popescu3Ionel";
        String[] namesArray = names.split("[0-9]");
        for(String name: namesArray) {
            System.out.println(name);
        }

        System.out.println(magie.indexOf('c'));
        System.out.println(magie.indexOf('c',3));

        System.out.println(magie.contains("cus"));

        String toBeReplaced = "MagieAlba";
        System.out.println(toBeReplaced);
        System.out.println(toBeReplaced.replace("lba","**"));

        String someString = "Ge0Rg3";
        System.out.println(someString);
        System.out.println(someString.replaceAll("[0-9]", "T"));
        System.out.println(someString.replaceAll("[A-Z]", "*"));

        System.out.println("George"+4+"Mihai");
        System.out.println(String.format("George%sMihai",4));

        int a = 4;
        String aString = String.valueOf(a);
        System.out.println(aString);

        String aNumber = "12";
        int aInteger = Integer.parseInt(aNumber);
        System.out.println(aInteger);

        for (String name: namesArray){
            if(name.startsWith("I")){
                System.out.println(name);
            }
        }

        String test = "test";
        System.out.println(test.charAt(3));






    }
}
