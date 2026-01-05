package com.magical.people;

public class PersonTest {
    public static void main(String[] args) {
        //1.Create multiple Person objects using both no-arg and parameterized constructors
        Person student1 = new Person("Harry", 20);
        System.out.println("Student 1 created: " + student1.getName() + ", Age: " + student1.getAge());

        //No-Arg Constructor
        Person student2 = new Person();
        System.out.println("Student 2 created: " + student2.getName() + ", Age: " + student2.getAge());
        System.out.println();


        //2.Call setAge() with valid and invalid ages and verify that exceptions are thrown for invalid input
        
        student2.setName("Ron");

        // Invalid Age Test (Negative)
        try {
            student2.setAge(106);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        System.out.println("Student 2 updated: "+student2.getName()+" , Age: "+student2.getAge());
        System.out.println();


        //3.Call compareTo() to compare different students and output whether they are exactly the same
       
        // Create a student identical to Student 1
        Person student3 = new Person("Harry", 20);
        
        // Compare Identical
        if (student1.compareTo(student3)) {
            System.out.println("Result: Student 1 and Student 3 are the same person.");
        } else {
            System.out.println("Result: Student 1 and Student 3 are different.");
        }

        // Compare Different
        if (student1.compareTo(student2)) {
            System.out.println("Result: Student 1 and Student 2 are the same person.");
        } else {
            System.out.println("Result: Student 1 and Student 2 are different people. (Correct)");
        }
        System.out.println();


        //4.Call getPersonCount() to verify that the total student count in the academy is correct
        System.out.println("Total Students Created: " + Person.getPersonCount());
    }
}
