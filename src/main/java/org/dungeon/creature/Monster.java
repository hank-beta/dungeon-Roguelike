package org.dungeon.creature;

public class Monster extends Creature{
    public String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Monster(int health, int attack, int defense, String name) {
        super(health, attack, defense, name);
    }
}
