package com.ram.streams;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamApp {
    
    public static void main(String[] args) {
    
        Predicate<Person> agePredicate = (person) -> person.getAge() > 10;
        Consumer<Person> ageConsumer = (person) -> System.out.println(person.getAge());
        Consumer<Person> namePrint = (person) -> System.out.println(person.getName());

//        Predicate<Person> namePredicate = (person) -> person.getName().equalsIgnoreCase("Ram");
//
//        List<Person> persons = List.of(new Person("Ram", 35),
//            new Person("Gita", 32),
//            new Person("Vedh", 7),
//            new Person("Ananya", 10));
//
//        List<Person> filterdList = persons.stream()
//            .filter(namePredicate)
//            .collect(Collectors.toList());
//
//
//        System.out.println(filterdList.toString());
    
        print(namePrint,  new Person("Gita", 32));
    }
    
    public static void print(Person person) {
        System.out.println(person.toString());
        
    }
    
    public static void print(Consumer<Person> consumer, Person person) {
        consumer.accept(person);
    }
}
