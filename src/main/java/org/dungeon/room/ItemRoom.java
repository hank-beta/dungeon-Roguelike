package org.dungeon.room;

import org.dungeon.creature.Player;
import org.dungeon.item.Item;

public class ItemRoom implements Room{
    Item item;

    public ItemRoom(Item item) {
        this.item = item;
    }

    @Override
    public void enterRoom(Player player) {

    }
}
