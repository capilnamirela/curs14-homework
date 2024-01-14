package org.fasttrackit.ex2;

import org.fasttrackit.ex2.NameNotInListException.NameNotInListException;

import javax.naming.InvalidNameException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonService {

    private final List<Person> personList = new ArrayList<>();

    public static void addPerson(List<Person> personList, Person person) throws InvalidNameException, InvalidAgeException {
        if (person.getName() == null || !(person.getName().matches("[a-zA-z]+"))) {
            throw new InvalidNameException("Type a valid name!");
        }
        if (person.getAge() < 0 || person.getAge() > 120 || person.getAge() == null) {
            throw new InvalidAgeException("Type a valid age between 0 and 120!");
        }
        personList.add(person);
    }

    public static Person removePerson(List<Person> personList, Integer id) throws IdNotFoundException {
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getId().equals(id)) {
                iterator.remove();
                return person;
            }
        }
        throw new IdNotFoundException("The ID that you want to remove does not exist in list!");
    }

    public static List<Person> getAllPersons(List<Person> personList) throws TheListIsEmptyException {
        if (personList.size() > 0) {
            return personList;
        } else {
            throw new TheListIsEmptyException("The list you requested is empty!");
        }
    }

    public static List<Person> getAllPersonsOlderThan(List<Person> personList, int age) {
        List<Person> personsOlderThan = new ArrayList<>();
        for (Person person : personList) {
            if (person.getAge() > age) {
                personsOlderThan.add(person);
            }
        }
        return personsOlderThan;
    }

    public static List<String> getAllPersonsNames(List<Person> personList) {
        List<String> personsNames = new ArrayList<>();
        for (Person person : personList) {
            personsNames.add(person.getName());
        }
        if (personsNames.size() > 0) {
            return personsNames;
        } else {
            throw new TheListIsEmptyException("The list you requested is empty!");
        }
    }

    public static List<Person> getPersonByName(List<Person> personList, String name) throws NameNotInListException {
        List<Person> personsWithName = new ArrayList<>();
        for (Person person : personList) {
            if (person.getName().equals(name)) {
                personsWithName.add(person);
            }
        }
        if (personsWithName.size() > 0) {
            return personsWithName;
        } else {
            throw new NameNotInListException("Name not in list!");
        }
    }

    public static Person getPersonById(List<Person> personList, Integer id) {

        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        throw new IdNotFoundException("This ID doesn't exist");
    }

}







