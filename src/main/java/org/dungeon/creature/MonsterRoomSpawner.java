package org.dungeon.creature;

import org.dungeon.creature.monster.Goblin;
import org.dungeon.creature.monster.Golem;
import org.dungeon.creature.monster.Slime;
import org.dungeon.utils.MathUtils;

public class MonsterRoomSpawner {
    public static Monster spawn() {
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
