package org.fasttrackIT.won14.curs8.code;

public class Bike extends Vehicle {
    private final Integer numberOfWheels;
    private final String color;
    private final String name;

    public Bike(Integer numberOfWheels, String color, String name) {
        System.out.println("Created bike");
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.name = name;
    }

    public Bike(Integer numberOfWheels, String name) {
        System.out.println("Created bike");
        this.numberOfWheels = numberOfWheels;
        this.name = name;
        this.color = "red";
    }

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getColor() {

        return color;
    }

    public String getName() {

        return name;
    }

    public void move(){
        super.move();
        System.out.println("The bike moved");
    }


    public final void createBikes(){

        System.out.println("Create secret ultra sonic");
    }

    @Override
    public String toString(){
        return "Bike: numberOfWheels-%s, color-%s, name-%s".formatted(numberOfWheels, color, name);
    }
}
