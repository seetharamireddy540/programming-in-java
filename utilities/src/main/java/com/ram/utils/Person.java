package com.ram.utils;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private float salary;

}
