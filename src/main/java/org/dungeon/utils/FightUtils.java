package org.dungeon.utils;

import org.dungeon.creature.Creature;
import org.dungeon.creature.Monster;
import org.dungeon.creature.Player;

public class FightUtils {
    private static int attack(Creature attacker,Creature defenser) {
        int damage = attacker.getAttack() - defenser.getDefense();
        defenser.setHealth(damage > 0 ? defenser.getHealth() - damage : 0);
        return damage;
    }

    public static void playerAttack(Player player, Monster monster) {
        System.out.printf("Monster 체력 : %d\n", monster.getHealth());
        int damage = attack(player, monster);
        int monsterHealth = Math.max(monster.getHealth(), 0);
        System.out.printf("Monster가 %d의 피해를 입었습니다.\n", damage);
        System.out.printf("Monster 체력 : %d\n", monsterHealth);
        if (monsterHealth > 0) {
            System.out.println("Monster가 화가 났습니다. 이제 당신이 공격 당할 차례입니다.\n");
        } else {
            System.out.println("GAME OVER.\n");
        }

    }

    public static void monsterAttack(Player player, Monster monster) {
        System.out.printf("Player 체력 : %d\n", player.getHealth());
        int damage = attack(monster, player);
        System.out.printf("Player가 %d의 피해를 입었습니다.\n", damage);
        System.out.printf("Player 체력 : %d\n", Math.max(player.getHealth(), 0));
        System.out.println("Player가 Monster를 공격할 차례입니다.\n");
    }

}
