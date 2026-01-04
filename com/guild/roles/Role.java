package com.guild.roles;

public class Role {
    
    // Instance Variables (Encapsulated)
    private String name;  // Name of the role
    private Integer age;   // The guild member's age (Integer wrapper allows null for "unknown")
    private String race;   // Race (e.g., "Human" , "Elf" , "Orc" )
    private Double mana;   // Magic energy level of the guild member
    

    // No-argument constructor
    public Role() {
        this.name = "Unknown";
        this.age = null; // Represents an unknown age
        this.race = "Human";
        this.mana = 0.00;
    }
    
    //Parameterized Constructor
    public Role(String name, Integer age, String race, Double mana) {
        this.name = name; // The name of the guild member
        this.age = age; // The age of the guild member
        this.race = race; // The race of the guild member
        this.mana = mana; //The magic energy level of the guild member
    }
    
    // Getter Methods
    public String getName() {
        return this.name; // return the name of the role
    }
    
    public Integer getAge() {
        return this.age; // return the age of the role (may be null)
    }
    
    public String getRace() {
        return this.race; // return the race of the role
    }
    
    public Double getMana() {
        return this.mana; // return the current mana level
    }
    
    // Setter Methods
    /** @param name the new name to assign */
    public void setName(String name) {
        this.name = name;
    }
    
    /** @param age the new age to assign */
    public void setAge(Integer age) {
        this.age = age;
    }
    
    /** @param race the new race to assign */
    public void setRace(String race) {
        this.race = race;
    }
    
    /** @param mana the new mana value to assign */
    public void setMana(Double mana) {
        this.mana = mana;
    }
    
    
    // A method to print the role's basic action
    public void performAction() {
        System.out.println(name + " is performing a magical action.");
    }
}
