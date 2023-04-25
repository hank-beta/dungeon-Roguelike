package org.dungeon.utils;

import org.dungeon.creature.Monster;

import java.util.Scanner;

public class SystemUtils {

    public static void echo(String message) {
        System.out.println(message + "\n");
    }

    public static void encounter(String message) {
        echo("=====================");
        echo(message);
        echo("=====================");
    }

    public static void encounterMonster(Monster monster) {
        String message = "몬스터 룸에 들어오셨습니다. 어떻게든 때려죽이고 다음 방으로 이동하세요.\n"
        + "[" + monster.getName() + "] : " + monster.getMessage();
        encounter(message);
    }



    public static int selectMenu() {
        echo("플레이어는 세가지 선택을 할 수 있습니다.\n" +
                "[1] 공격\n" +
                "[2] 수비\n" +
                "[3] 아이템 사용");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String getText() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


}
