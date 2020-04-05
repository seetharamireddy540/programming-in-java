package com.ram.modules;

// Java code for Stream flatMap(Function mapper)

import io.vavr.control.Try;

import java.util.ArrayList;
import java.util.List;

class GFG {
    // Driver code
    public static void main(String[] args) {

        List<List<Integer>> listOfList = new ArrayList<>();
        listOfList.get(0).set(1,0);

         // Creating a list of Prime Numbers
//        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11, 13);
//
//        // Creating a list of Odd Numbers
//        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
//
//        // Creating a list of Even Numbers
//        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);
//
//        List<List<Integer>> listOfListofInts =
//            Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);
//
//        List<Integer> listofInts = listOfListofInts.stream()
//            .flatMap(list -> list.stream())
//
//            .collect(Collectors.toList());
        System.out.println(doSomething(5, 0)
            .onFailure(e-> e.printStackTrace())
            .onSuccess(i -> System.out.println(i)));
        
//        System.out.println("listofInts - The Structure after flattening is : " +
//            listofInts);
    }
    
    public static Try<Integer> doSomething(Integer op1, Integer op2) {
        return Try.of(() -> op1/op2)
            .onFailure(e -> e.printStackTrace())
            .onSuccess(input -> System.out.println("Final Result " + input));
        
    }
}