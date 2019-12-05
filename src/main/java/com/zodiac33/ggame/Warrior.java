package com.zodiac33.ggame;

import java.util.Random;

public class Warrior extends Unit {
    private int damage;
    public Warrior(String name, int health, int damage) {
        super(name, health);
        this.damage=damage;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Damage: "+damage);
    }
    public boolean attack(Mob mob) {
        boolean died=false;
        mob.setHealth(mob.getHealth()-damage+new Random().nextInt(7)-new Random().nextInt(5));
        if (mob.getHealth()<=0) {died=true;}
        return died;
    }
    @Override
    public String getName() {
        return super.getName();
    }
}
