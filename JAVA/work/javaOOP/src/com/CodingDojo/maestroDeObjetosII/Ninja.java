package com.CodingDojo.maestroDeObjetosII;

public class Ninja extends Human {
    public Ninja() {
        this.stealth = 10;
    }

    public void steal(Human target) {
        int stealingAmount = this.stealth;
        target.health -= stealingAmount;
        this.health += stealingAmount;
        System.out.println("El ninja robó vida de su contrincante, la  vida que robó fue: " + stealingAmount);
    }

    public void runAway() {
        int damageTaken = 10;
        this.health -= damageTaken;
        System.out.println("¡Ninja huyó! La salud disminuye en: " + damageTaken);
    }


}