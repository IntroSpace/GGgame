package com.zodiac33.ggame;

public class Unit {
    private String name;
    private int health;

    public Unit(String name, int health) {
        this.name = name;
        this.health = health;
    }
    public void printInfo(){
        System.out.print("Name:" + name);
        System.out.println(" and Health:" + health);
    }
    public void setHealth(int health) {
        this.health=health;
    }
    public int getHealth() {
        return health;
    }
    public String getName() {
        return name;
    }
}
