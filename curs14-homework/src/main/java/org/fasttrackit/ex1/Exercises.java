package org.fasttrackit.ex1;

public class Exercises {

    public static double farenheitToCelsius(double temperature) {
        double result = (temperature - 32) * 5 / 9;
        return result;
    }

    public static double celsiusToFarenheit(double temperature) {
        double result = Math.round((temperature * 9 / 5 + 32) * 1.0 / 1.0);
        return result;
    }

}
