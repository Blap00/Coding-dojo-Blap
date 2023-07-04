package com.CodingDojo.maestroDeObjeto;

public class HumanTest {
    public static void main(String[] args) {
        Human attacker = new Human();
        Human target = new Human();

        System.out.println("Attacker's health before attack: " + attacker.getHealth());
        System.out.println("Target's health before attack: " + target.getHealth());

        attacker.attack(target);

        System.out.println("Attacker's health after attack: " + attacker.getHealth());
        System.out.println("Target's health after attack: " + target.getHealth());
    }
}
