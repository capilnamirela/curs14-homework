package org.fasttrackit;

import org.assertj.core.api.Assertions;
import org.fasttrackit.ex1.Exercises;
import org.junit.jupiter.api.Test;

public class ExercisesTest {

    @Test
    public void instantiateClass(){
        Exercises exercises = new Exercises();
    }

    @Test
    public void callMethodFarenheitToCelsius(){
        Exercises exercises = new Exercises();
        exercises.farenheitToCelsius(100);
    }

    @Test
    public void methodFarenheitToCelsiusReturnsADouble(){
        Exercises exercises = new Exercises();
        Double result = exercises.farenheitToCelsius(100);
        Assertions.assertThat(result).isEqualTo(37.77777777777778);
    }

    @Test
    public void callMethodCelsiusToFarenheit(){
        Exercises exercises = new Exercises();
        exercises.celsiusToFarenheit(37.77777777778);
    }

    @Test
    public void methodCelsiusToFarenheitReturnsADouble(){
        Exercises exercises = new Exercises();
        Double result = exercises.celsiusToFarenheit(37.77777777778);
        Assertions.assertThat(result).isEqualTo(100);
    }


}
