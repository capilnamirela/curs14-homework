package org.fasttrackit;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student studentMihai = new Student("Mihai", "Poapa", 25, "AAA", List.of("aa"));
        //System.out.println(student.getAge());
        Student studentAna = new Student("Ana", "Mihai");

        Student studentGeorge = studentMihai.withFirstName("George")
                .withAge(21);

        System.out.println(studentMihai);
        System.out.println(studentGeorge);

        Student studentIon = Student.builder()
                .firstName("Ion")
                .lastName("Ionut")
                .age(11)
                .hobbies(List.of())
                .schoolName("School AAA")
                .build();
        System.out.println(studentIon);


    }
}