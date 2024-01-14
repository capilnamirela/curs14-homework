package org.fasttrackIT.won14.curs8.code;

import org.fasttrackIT.won14.curs8.code.model.MountainBike;
import org.fasttrackIT.won14.curs8.code.model.SuperMountainBike;


public class Main {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(2, "red", "Devron", "best suspension");
        System.out.println(mountainBike.getNumberOfWheels());
        System.out.println(mountainBike.getColor());
        System.out.println(mountainBike.getName());
        System.out.println(mountainBike.getSuspension());

        SuperMountainBike superMountainBike = new SuperMountainBike(4,"black", "Ferari", "super best suspension");
        System.out.println(superMountainBike.getNumberOfWheels());
        System.out.println(superMountainBike.getColor());
        System.out.println(superMountainBike.getName());
        System.out.println(superMountainBike.getSuspension());

        mountainBike.move();

        Bike myBike = new Bike(5, "RedBike");
        Bike anotherBike = new Bike(5, "black", "BlackBike");

        System.out.println(myBike);
        System.out.println(anotherBike);

        mountainBike.showSomething();
        mountainBike.showSomething("Ceva");
        mountainBike.showSomething("ceva", "extraCeva");

    }
}