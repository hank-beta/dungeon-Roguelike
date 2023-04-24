package org.dungeon.room;

import org.dungeon.creature.Monster;
import org.dungeon.creature.Player;
import org.dungeon.utils.FightUtils;

import java.util.Scanner;

public class MonsterRoom implements Room {
    Monster monster;

    public MonsterRoom(Monster monster) {
        this.monster = monster;
    }

    public boolean attackMonster(Player player) {
        FightUtils.playerAttack(player, monster);

        if (monster.getHealth() <= 0) {
            return true;
        }

        FightUtils.monsterAttack(player, monster);

        return player.getHealth() > 0;
    }


    @Override
    public void enterRoom(Player player) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================\n\n");
        System.out.println("Monster: '취르륵 인간, 아가리를 벌려라'\n\n");
        System.out.println("=====================\n\n");


        while(monster.getHealth() != 0) {
            System.out.println("플레이어는 세가지 선택을 할 수 있습니다.\n" +
                    "[1] 공격\n" +
                    "[2] 수비\n" +
                    "[3] 아이템 사용");


            int selectNumber = scanner.nextInt();

            if (selectNumber == 1) {
                attackMonster(player);
//                boolean isWin = attackMonster(player);

            }













        }

//        if (isWin) {
//            System.out.println("Monster가 죽었습니다. 다음 방으로 넘어가시죠.\n");
//        } else {
//            System.out.println("당신이 디졌습니다. GAME OVER\n");
//        }
    }
}
