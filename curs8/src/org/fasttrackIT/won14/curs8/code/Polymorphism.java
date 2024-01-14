package org.fasttrackIT.won14.curs8.code;

import org.fasttrackIT.won14.curs8.code.model.MountainBike;
import org.fasttrackIT.won14.curs8.code.model.StreetBike;

public class Polymorphism {
    public static void main(String[] args) {
        Bike bike = new MountainBike(4, "red", "Test", "something");
        Bike otherBike = new StreetBike(3, "red", "test");
        Vehicle vehicle = new Bike(4, "test");

        printTypeOfBike(bike);
        printTypeOfBike(otherBike);
    }

    public static void printTypeOfBike(Bike bike){
        if (bike instanceof MountainBike) {
            System.out.println("This is a mountain bike");
        }
        if (bike instanceof StreetBike){
            System.out.println("This is a street bike");
        }
    }
}
