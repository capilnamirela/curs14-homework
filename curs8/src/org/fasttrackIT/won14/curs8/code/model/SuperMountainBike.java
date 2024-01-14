package org.fasttrackIT.won14.curs8.code.model;

public class SuperMountainBike extends MountainBike {
    public SuperMountainBike(Integer numberOfWheels, String color, String name, String suspension) {
        super(numberOfWheels, color, name, suspension);
        System.out.println("Created super mountain bike");
    }

}
