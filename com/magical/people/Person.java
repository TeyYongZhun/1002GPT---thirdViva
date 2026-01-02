package com.magical.people;

public class Person{

    //Instance Variables
    private String name;
    private int age;

    private static final int DEFAULT_AGE = 18;
    // static means this variable belongs to the class, not individual objects
    // It is shared by all instances to track the total count
    private static int personCount = 0;

    // No-argument constructor
    public Person() {
        this.name = "Unknown Student";
        this.age = DEFAULT_AGE;
        personCount++; // Increment total count when a new person is created
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        personCount++; // Increment total count when a new person is created
    }

    // Encapsulation Methods (Getters/Setters)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    // Validates age before setting it
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    // Class Methods
    // Static method to get the total number of students
    public static int getPersonCount() {
        return personCount;
    }

    // Custom comparison method
    // Returns true if name and age are identical
    public boolean compareTo(Person other) {
        // Check if the other person is null to avoid errors
        if (other == null) {
            return false;
        }
        
        // Use .equals() for Strings and == for integers
        return this.name.equals(other.name) && this.age == other.age;
    }
}
