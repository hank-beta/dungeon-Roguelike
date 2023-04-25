package org.dungeon.creature.monster;

import org.dungeon.creature.Monster;

public class Golem extends Monster {
    public Golem(int health, int attack, int defense, String name) {
        super(health, attack, defense, name);
        this.setName("쟈코 골렘");
        this.setMessage("쿵. 쿵. 쿵. 쿵. 쿵. 쿵. 쿵");
        this.setHealth(150);
        this.setAttack(25);
        this.setDefense(15);
    }
}
