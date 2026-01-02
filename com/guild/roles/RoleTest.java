package com.guild.roles;

public class RoleTest {

        public static void main(String args[]) {
                Role role1 = new Role("Abu", 20, "Human", 0.0);
                Role role2 = new Role("Eve", 100, "Elf", 100.0);
                Role role3 = new Role("Gru", 4232, "Ork", 150.0);

                role1.setName("Ali");
                role2.setAge(9999);
                role3.setMana(42639.0);

                role1.performAction();
                role2.performAction();
                role3.performAction();

                System.out.println();
                System.out.println("Name:" + role1.getName() + "\nAge:" + role1.getAge() + "\nRace:" + role1.getRace()
                                + "\nMana:" + role1.getMana());

                System.out.println();

                System.out.println("Name:" + role2.getName() + "\nAge:" + role2.getAge() + "\nRace:" + role2.getRace()
                                + "\nMana:" + role2.getMana());

                System.out.println();

                System.out.println("Name:" + role3.getName() + "\nAge:" + role3.getAge() + "\nRace:" + role3.getRace()
                                + "\nMana:" + role3.getMana());
        }

}
