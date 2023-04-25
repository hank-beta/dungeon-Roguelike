package org.dungeon.room;

import org.dungeon.creature.Player;

public interface Room {
    public void enterRoom(Player player);

    public void introduce();
}
