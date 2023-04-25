package org.dungeon;


import org.dungeon.creature.Monster;
import org.dungeon.creature.Player;
import org.dungeon.item.Item;
import org.dungeon.item.Potion;
import org.dungeon.room.ItemRoom;
import org.dungeon.room.MonsterRoom;
import org.dungeon.room.RestRoom;
import org.dungeon.room.Room;
import org.dungeon.utils.MathUtils;
import org.dungeon.utils.SystemUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameManager {
    private final List<Room> roomList = new ArrayList<Room>();

    public GameManager(int length) {

        for (int i = 0; i < length; i++) {
            roomList.add(new MonsterRoom());

//            int nonce = (int) Math.round(Math.random() * 10);
//
//            if (nonce >= 0 && nonce <= 5) {
//                Monster monster = new Monster(MathUtils.getNum(), MathUtils.getNum(), MathUtils.getNum(), "김말숙");
//                MonsterRoom monsterRoom = new MonsterRoom(monster);
//                roomList.add(monsterRoom);
//            } else if (nonce > 5 && nonce <= 8){
//                Item item = new Potion();
//                ItemRoom itemRoom = new ItemRoom(item);
//                roomList.add(itemRoom);
//            } else {
//                RestRoom restRoom = new RestRoom();
//                roomList.add(restRoom);
//            }
        }
    }

    public void load(){

    }

    public void save() {

    }

    public void start () {
        int round = 1;
        SystemUtils.echo("ADMIN: 던전 게임을 시작합니다. 사용자의 이름을 입력해주세요.");
        String name = SystemUtils.getText();
        Player player = new Player(100, 50, 20, name);
        while (roomList.size() != round) {
            SystemUtils.echo("ADMIN:  ** " + round + "라운드가 시작됩니다. **");

            Room room = roomList.get(round - 1);
            room.enterRoom(player);

            round++;
        }
    }
}
