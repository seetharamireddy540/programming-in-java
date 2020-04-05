package com.ram.streams;

import lombok.Builder;

import java.util.Objects;

@Builder
public class Person {
    
    private String name;
    private int age;
    
    public Person(final String name, final int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        final Person person = (Person) o;
        return getAge() == person.getAge() &&
            Objects.equals(getName(), person.getName());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
    
    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}
