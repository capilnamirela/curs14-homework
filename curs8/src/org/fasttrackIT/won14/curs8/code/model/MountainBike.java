package org.fasttrackIT.won14.curs8.code.model;

import org.fasttrackIT.won14.curs8.code.Bike;

public class MountainBike extends Bike {
    private String suspension;

    public MountainBike(Integer numberOfWheels, String color, String name, String suspension) {
        super(numberOfWheels, color, name);
        this.suspension = suspension;
        System.out.println("Created MountainBike");

    }

    public String getSuspension() {
        return suspension;
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Mountain Bike moved");
    }

    public void showSomething() {
        System.out.println("Do something");
    }

    public void showSomething(String somethig) {
        System.out.println(somethig);
    }

    public void showSomething(String something, String extraSomethig) {
        System.out.println(something + "extra" + extraSomethig);

    }

}
