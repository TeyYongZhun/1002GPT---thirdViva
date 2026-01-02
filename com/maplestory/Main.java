package com.maplestory;

public class Main{
    public static void main(String [] args){
        //Requirement 1: Create multiple MagicShield objects using different constructors  
        MagicShield shield1 = new MagicShield(); //test empty constructor
        MagicShield shield2 = new MagicShield(2.5, 7.0, "Fire"); // test constructor with arguments
        MagicShield shield3 = new MagicShield(10.0, 2.0, "Dark"); // test constructor with arguments
        System.out.println("Testing Requirement 1: (No-argument constructor & argument constructor)");
        System.out.println("Command of no-argument constructor:\nMagicShield shield1 = new MagicShield();\nSystem.out.println(shield1.toString());\n\nResult:");
        System.out.println(shield1.toString());
        System.out.println("Command of argument constructor:\nMagicShield shield2 = new MagicShield(2.5, 7.0, \"Fire\");\nSystem.out.println(shield2.toString());\n\nResult:");
        System.out.println(shield2.toString());

        //Requirement 2: Test setters with valid and invalid values (verify exceptions) 
        //Test setters with valid one
        System.out.println("Testing Requirement 2: (Testing setter)");
        System.out.println("Command of valid setter: shield1.setRadius(5.0);\nshield1.setThickness(3.0);\n\nResult:");
        shield1.setRadius(5.0);
        shield1.setThickness(3.0);
        System.out.println("New Radius: " + shield1.getRadius());
        System.out.println("New Thickness: " + shield1.getThickness());
        //Test setters with invalid one
        System.out.println("\nCommand of invalid setter:\nshield1.setRadius(-5.0);\nshield1.setThickness(-3.0);\n\nResult:");
        try{
            shield1.setRadius(-5.0);
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }
        try{
            shield1.setThickness(-3.0);
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }
        //supposed it will throw an exception here
        //test setter for elementType here
        System.out.println("\nCommand of setting ElementType to empty (Should become Neutral):\nshield1.setElementType(\"\");\n\nResult:");
        shield1.setElementType("");
        System.out.println("Resulting Type: " + shield1.getElementType()+"\n");

        //Requirement 3: Calculate and print defense power and mana cost for different shields
        //I just run toString method here, as it will auto run calculateManaCost and calculateDefensePower method
        System.out.println("Testing Requirement 3: (Checking mana cost and defense power calculation)");
        System.out.println("Command: \nshield2.calculateDefensePower();\nshield2.calculateManaCost();\n\nResult:");
        System.out.println("Defense power of shield 2: "+shield2.calculateDefensePower());
        System.out.println("Mana cost of shield 2: "+shield2.calculateManaCost());
        System.out.println("Note: Shield 2-> Radius = 2.5, Thickness = 7, Coefficient = 1.1 (Fire)");
        System.out.println("\nCommand: \nshield3.calculateDefensePower();\nshield3.calculateManaCost();\n\nResult:");
        System.out.println("Defense power of shield 3: "+shield3.calculateDefensePower());
        System.out.println("Mana cost of shield 3: "+shield3.calculateManaCost());
        System.out.println("Note: Shield 3-> Radius = 10, Thickness = 2, Coefficient = 1.4 (Dark)");

        //Requirement 4: Use static methods to calculate shield properties for arbitrary parameter combinations
        System.out.println("\nTesting Requirement 4 (use static method to calculate properties):");
        System.out.println("Command:\nMagicShield.calculateDefensePower(3.0, 4.0, \"Ice\");\nMagicShield.calculateManaCost(3.0, 4.0);");
        System.out.printf("\nResult:\nStatic Defense: %.2f%n",MagicShield.calculateDefensePower(3.0, 4.0, "Ice")); // If works correctly: (3*4)*1.2 = 14.4
        System.out.printf("Static Mana Cost: %.2f%n",MagicShield.calculateManaCost(3.0, 4.0)); // If works correctly: 3*10 + 4*2 = 38.0
        
        //Requiremet 5: Output the total number of shields created (verify the static counter) 
        System.out.println("\nTesting Requirement 5:");
        System.out.println("Command: MagicShield.getShieldCount()");
        System.out.println("\nResult:\nTotal Shields Created: " + MagicShield.getShieldCount()+"\n"); //supposed to be 3 since we created 3 MagicShield objects

        //Requirement 6: Test edge cases: null, 0, negative values
        //Testing edge case 
        System.out.println("Testing Requirement 6:");
        System.out.println("Initializing Radius & Thickness to 0 (should be possible) and ElementType to null (Should become Neutral)");
        System.out.println("Command: MagicShield shield4 = new MagicShield(0,0,null);\n\nResult:");
        MagicShield shield4 = new MagicShield(0,0,null);
        System.out.println(shield4.toString());
        System.out.println("Initializing Radius & Thickness to -1.0");
        System.out.println("Command: MagicShield shield5 = new MagicShield(-1.0,-1.0,null);\n\nResult:");
        MagicShield shield5 = new MagicShield(-1.0,-1.0,null);
        System.out.println(shield5.toString());
    }
}