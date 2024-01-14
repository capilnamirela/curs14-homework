package org.fasttrackit.ex2;

import lombok.Builder;
import lombok.Data;

import javax.naming.InvalidNameException;

@Data
public class Person {
    private static Integer count = 0;
    private Integer id;
    private String name;
    private Integer age;

    @Builder(toBuilder = true)
    public Person(String name, Integer age) throws InvalidNameException {
        count++;
        this.id = count;
        if (name == null || !(name.matches("[a-zA-z]+"))) {
            throw new InvalidNameException("Type a valid name, only letters!");
        } else {
            this.name = name;
        }
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Invalid age, type a valid age between 0 and 120");
        } else {
            this.age = age;
        }
    }

}
