package com.zodiac33.ggame;

import java.util.Random;

class Robot extends Unit{
    private int armor;
    public Robot(String name, int health, int armor) {
        super(name, health);
        this.armor=armor;
    }
    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }
    @Override
    public int getHealth() {
        return super.getHealth();
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Armor: "+armor);
    }
    public void damageArmor(int damage) {
        this.armor-=damage/(new Random().nextInt(2)+2);
    }
    public int getArmor() {
        return armor;
    }
}
