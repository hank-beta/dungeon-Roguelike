package org.dungeon.creature;

abstract public class Creature {
    private int health;
    private int attack;
    private int defense;
    private final String name;

    public Creature(int health, int attack, int defense, String name) {
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
