import model.Animal;

public class Main {

    public static void main(String[] args) {
        Clock myClock = new Clock(15 ,4 );
        System.out.println(myClock.getHour());
        System.out.println(myClock.getMinutes());
        System.out.println(myClock.getTime());

        myClock.setHour(13);
        myClock.setMinutes(57);

        System.out.println(myClock.getTime());

        Animal cat = new Animal("Felina", 22, 10, 20);
        System.out.println("My cat: " + cat.getType() + "," + cat.getAge() + "," + cat.getWeight() + "," + cat.getHeight());

        Animal dog = new Animal("Canine", 5, 15, 25);
        System.out.println("My cat: " + dog.getType() + "," + dog.getAge() + "," + dog.getWeight() + "," + dog.getHeight());



    }
}
