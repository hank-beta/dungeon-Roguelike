package org.dungeon.creature.monster;

import org.dungeon.creature.Monster;

public class Goblin extends Monster {

    public Goblin(int health, int attack, int defense, String name) {
        super(health, attack, defense, name);
        this.setName("쟈코 고블린");
        this.setMessage("취르륵 인간, 아가리를 벌려라");
        this.setHealth(50);
        this.setAttack(50);
        this.setDefense(10);
    }
}
