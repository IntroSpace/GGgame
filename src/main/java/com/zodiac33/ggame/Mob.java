package com.zodiac33.ggame;

class Mob{
    private String name;
    private int health;
    private int damage=10;
    public Mob(String name, int health) {
        this.name=name;
        this.health=health;
    }
    public void setHealth(int health) {
        this.health=health;
    }
    public int getHealth() {
        return health;
    }
    public void printInfo() {
        System.out.println(name + " with Health: "+health);
    }
    public String getName() {
        return name;
    }
    public void attack(Robot robot) {
        if (robot.getArmor() > 0) robot.damageArmor(damage);
        else robot.setHealth(robot.getHealth()-damage);
        System.out.println(name+" attacked");
    }
}
