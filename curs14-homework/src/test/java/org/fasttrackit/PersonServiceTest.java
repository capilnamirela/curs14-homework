package org.fasttrackit;

import org.assertj.core.api.Assertions;
import org.fasttrackit.ex2.NameNotInListException.NameNotInListException;
import org.fasttrackit.ex2.Person;
import org.fasttrackit.ex2.PersonService;
import org.junit.jupiter.api.Test;

import javax.naming.InvalidNameException;
import java.util.ArrayList;
import java.util.List;

class PersonServiceTest {

    @Test
    public void instantiateClassPerson() throws InvalidNameException {
        Person person = new Person("Ana", 25);
    }

    @Test
    public void methodAddPersonValidAge() throws InvalidNameException {
        //verify if age is between 0 - 120, returns an exception if age<0 or age>120
        //GIVEN
        Person person = new Person("Ana", 25);
        //WHEN
        Integer age = person.getAge();
        //THEN
        Assertions.assertThat(age).isEqualTo(25);
    }

    @Test
    public void methodAddPersonValidName() throws InvalidNameException {
        //verify if name is written only in letters, no other characters and is not null
        //GIVEN
        Person person = new Person("Ana", 15);
        //WHEN
        String name = person.getName();
        //THEN
        Assertions.assertThat(name).isEqualTo("Ana");
    }

    @Test
    public void methodAddPersonVerifName() throws InvalidNameException {
        //GIVEN
        Person person = new Person("Ana", 25);
        List<Person> personList = new ArrayList<>();
        //WHEN
        PersonService.addPerson(personList, person);
        // THEN
        Assertions.assertThat(person.getName()).isEqualTo("Ana");
    }

    @Test
    public void methodAddPersonVerifAge() throws InvalidNameException {
        //GIVEN
        Person person = new Person("Ana", 25);
        List<Person> personList = new ArrayList<>();
        //WHEN
        PersonService.addPerson(personList, person);
        // THEN
        Assertions.assertThat(person.getAge()).isEqualTo(25);
    }

    @Test
    public void methodRemovePerson() throws InvalidNameException {
        //GIVEN
        Person person1 = new Person("Ana", 25);
        List<Person> personList1 = new ArrayList<>();
        personList1.add(person1);
        System.out.println(person1.getId());
        //THEN
        PersonService.removePerson(personList1, person1.getId());
    }

    @Test
    public void methodGetAllPersonsListNotEmpty() throws InvalidNameException {
        //GIVEN
        Person person = new Person("Ana", 25);
        List<Person> personList = new ArrayList<>();
        PersonService.addPerson(personList, person);
        //THEN
        PersonService.getAllPersons(personList);
    }

    @Test
    public void methodGetPersonOlderThanFalse() throws InvalidNameException {
        //GIVEN - verify that a person with age<30 is not in the list
        Person person = new Person("Ana", 25);
        List<Person> personList = new ArrayList<>();
        PersonService.addPerson(personList, person);
        //WHEN
        List<Person> olderThan = PersonService.getAllPersonsOlderThan(personList, 30);
        //THEN
        Assertions.assertThat(olderThan).isEmpty();
    }

    @Test
    public void methodGetPersonOlderThanTrue() throws InvalidNameException {
        //GIVEN - verify that a person with age>30 is in the list
        Person person = new Person("Ana", 33);
        List<Person> personList = new ArrayList<>();
        PersonService.addPerson(personList, person);
        //WHEN
        List<Person> olderThan = PersonService.getAllPersonsOlderThan(personList, 30);
        //THEN
        Assertions.assertThat(olderThan).isEqualTo(personList);
    }

    @Test
    public void methodGetAllPersonsNamesNotEmpty() throws InvalidNameException {
        //GIVEN
        Person person = new Person("Ana", 25);
        List<Person> personList = new ArrayList<>();
        PersonService.addPerson(personList, person);

        List<String> personListNames = new ArrayList<>();
        personListNames.add(person.getName());

        //WHEN
        List<String> allPersonsNames = PersonService.getAllPersonsNames(personList);
        //THEN
        Assertions.assertThat(allPersonsNames).isEqualTo(personListNames);
    }

    @Test
    public void methodGetPersonByName() throws InvalidNameException, NameNotInListException {
        //GIVEN
        Person person = new Person("Ana", 33);
        List<Person> personList = new ArrayList<>();
        PersonService.addPerson(personList, person);
        //WHEN
        List<Person> personsByName = PersonService.getPersonByName(personList, "Ana");
        //THEN
        Assertions.assertThat(personsByName).isEqualTo(personList);
    }

    @Test
    public void methodGetPersonById() throws InvalidNameException {
        //GIVEN
        Person person = new Person("Ana", 33);
        List<Person> personList = new ArrayList<>();
        PersonService.addPerson(personList, person);
        //WHEN
        Person personById = PersonService.getPersonById(personList, person.getId());
        //THEN
        Assertions.assertThat(personById).isEqualTo(person);

    }

}