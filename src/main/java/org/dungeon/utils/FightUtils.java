package org.dungeon.utils;

import org.dungeon.creature.Creature;
import org.dungeon.creature.Monster;
import org.dungeon.creature.Player;

public class FightUtils {
    private static int attack(Creature attacker,Creature defenser) {
        int damage = attacker.getAttack() - defenser.getDefense();
        defenser.setHealth(defenser.getHealth() > damage  ? defenser.getHealth() - damage : 0);
        return damage;
    }

    public static void playerAttack(Player player, Monster monster) {
        System.out.printf("%s 체력 : %d\n",monster.getName(), monster.getHealth());
        int damage = attack(player, monster);
        System.out.printf("%s가 %d의 피해를 입었습니다.\n", monster.getName() ,damage);
        System.out.printf("%s 체력 : %d\n",monster.getName(), Math.max(monster.getHealth(), 0));
    }

    public static void monsterAttack(Player player, Monster monster) {
        System.out.printf("%s 체력 : %d\n", player.getName(), player.getHealth());
        int damage = attack(monster, player);
        System.out.printf("%s가 %d의 피해를 입었습니다.\n", player.getName(), damage);
        System.out.printf("%s 체력 : %d\n",  player.getName(), Math.max(player.getHealth(), 0));
    }

}
