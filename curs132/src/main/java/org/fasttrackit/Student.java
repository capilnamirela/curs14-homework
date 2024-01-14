package org.fasttrackit;

import lombok.*;

import java.util.List;

@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data
@RequiredArgsConstructor
@With
@Builder
public class Student {
    private final String firstName;
    private final String lastName;
    private Integer age;
    private String schoolName;
    private List<String> hobbies;



}
