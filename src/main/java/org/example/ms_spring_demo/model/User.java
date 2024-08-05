package org.example.ms_spring_demo.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PRIVATE;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@FieldDefaults(level = PRIVATE)
public class User {

     String  id;
     String name;
     Integer age;

}
