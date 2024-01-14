package org.fasttrackit.ex2;

import org.fasttrackit.ex2.NameNotInListException.NameNotInListException;

import java.util.ArrayList;
import java.util.List;

import static org.fasttrackit.ex2.PersonService.*;

public class Main {
    public static void main(String[] args) throws InvalidNameException, InvalidAgeException, IdNotFoundException, TheListIsEmptyException, javax.naming.InvalidNameException, NameNotInListException {
        List<Person> personList = new ArrayList<>();
        addPerson(personList, new Person("Ana", 25));
        addPerson(personList, new Person("Ioan", 33));
        addPerson(personList, new Person("Andrei", 45));
        addPerson(personList, new Person("Mihai", 12));
        addPerson(personList, new Person("Ana", 32));
        addPerson(personList, new Person("Ana", 33));
        addPerson(personList, new Person("Ada", 22));

        System.out.println(personList);
        System.out.println("Person removed: " + removePerson(personList, 3));

        System.out.println("Get all persons: " + getAllPersons(personList));
        System.out.println("Persons older than: " + getAllPersonsOlderThan(personList, 30));
        System.out.println("Persons names: " + getAllPersonsNames(personList));
        System.out.println("Person by name: " + getPersonByName(personList, "Ana"));
        System.out.println("Person by ID: " + getPersonById(personList, 4));
    }
}
