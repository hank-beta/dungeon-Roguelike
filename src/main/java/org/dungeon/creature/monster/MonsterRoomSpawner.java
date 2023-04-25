package org.dungeon.creature.monster;

import org.dungeon.creature.Monster;
import org.dungeon.utils.MathUtils;

public class MonsterRoomSpawner {
    public static Monster spawnMonsterRoom() {
        int monsterNum = MathUtils.getNum(100);

        if (monsterNum > 50) {
            return new Goblin(0,0,0,"");
        } else if (monsterNum > 5){
            return new Slime(0,0,0,"");
        } else {
            return new Golem(0,0,0,"");
        }

    }
}
