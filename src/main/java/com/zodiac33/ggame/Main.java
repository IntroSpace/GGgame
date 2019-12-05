package com.zodiac33.ggame;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Unit units[]=new Unit[3];
        Mob mob=new Mob("DEATH", 1000);
        for (int i=0; i<units.length; i++) {
            switch (new Random().nextInt(3)) {
                case 0: units[i]=new Robot("Robot", 100, 100); break;
                case 1: units[i]=new Wizard("Wizard", 100, 10); break;
                case 2: units[i]=new Warrior("Warrior", 100, 15); break;
            }
        }
        while(!((Warrior) units[1]).attack(mob)) {
            for (Unit unit:units) {
                switch (unit.getName()){
                    case "Robot": mob.attack((Robot) unit); break;
                    case "Warrior": ((Warrior) unit).attack(mob); break;
                }
            }
            mob.printInfo();
            mob.attack((Robot) units[0]);
            System.out.println("------------------------------------------------------");
        }
        System.out.println(mob.getName()+" DEAD");
    }
}
