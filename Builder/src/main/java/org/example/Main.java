package org.example;

public class Main {
    public static void main(String[] args) {

        Person person = Person.builder()
                .setAge(20)
                .setName("John")
                .build();

        System.out.println(person.toString());
    }
}
