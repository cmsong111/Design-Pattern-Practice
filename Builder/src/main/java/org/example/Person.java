package org.example;

public class Person {
    int age;
    String name;


    // Constructor
    public Person() {
        this.age = 0;
        this.name = "";
    }

    // Getter & Setter
    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    // Builder
    public static Person builder() {
        return new Person();
    }

    public Person build() {
        return this;
    }

    // toString
    @Override
    public String toString() {
        return "Person (" +
                "age=" + age +
                ", name='" + name + '\'' +
                ')';
    }
}
