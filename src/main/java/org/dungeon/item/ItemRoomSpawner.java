package org.dungeon.item;

import org.dungeon.utils.MathUtils;

public class ItemRoomSpawner {
    public static Item spawn() {
        int num = MathUtils.getNum(100);

        if (num > 50) {
            return new Potion();
        } else if (num > 5){
            return new Rune();
        } else {
            return new Sword();
        }

    }
}
