package org.dungeon.creature.monster;

import org.dungeon.creature.Monster;

public class Slime extends Monster {
    public Slime(int health, int attack, int defense, String name) {
        super(health, attack, defense, name);
        this.setName("쟈코 슬라임");
        this.setMessage("츄르륵");
        this.setHealth(20);
        this.setAttack(5);
        this.setDefense(10);
    }
}
