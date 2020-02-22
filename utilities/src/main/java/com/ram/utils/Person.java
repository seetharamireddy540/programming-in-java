package com.ram.utils;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Value
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private float salary;

}
