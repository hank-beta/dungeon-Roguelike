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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameManager {
    private final List<Room> roomList = new ArrayList<Room>();

    public GameManager(int length) {

        for (int i = 0; i < length; i++) {
//            Monster monster = new Monster(MathUtils.getNum(30), MathUtils.getNum(30), MathUtils.getNum(30), "김말숙");
            Monster monster = new Monster(30, 30, 30, "말숙이");
            MonsterRoom monsterRoom = new MonsterRoom(monster);
            roomList.add(monsterRoom);

            continue;
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
        int round = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("던전 게임을 시작합니다. 사용자의 이름을 입력해주세요.");
        String name = scanner.nextLine();
//        Player player = new Player(MathUtils.getNum(100), MathUtils.getNum(100), MathUtils.getNum(20), name);
        Player player = new Player(100, 50, 20, name);
        while (roomList.size() != round) {

            Room room = roomList.get(round);
            room.enterRoom(player);

            round++;
        }
    }
}
