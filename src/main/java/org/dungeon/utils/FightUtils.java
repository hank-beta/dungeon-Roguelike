package org.dungeon.utils;

import org.dungeon.creature.Creature;
import org.dungeon.creature.Monster;
import org.dungeon.creature.Player;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FightUtils {
    private static int attack(Creature attacker,Creature defenser) {
        int damage = attacker.getAttack() - defenser.getDefense();
        defenser.setHealth(defenser.getHealth() > damage  ? defenser.getHealth() - damage : 0);
        return damage;
    }

    private static void reportBeforeFight(Creature creatureA, Creature creatureB) {
        System.out.printf("--------------------------------%n");
        System.out.printf("    Player & Monster Stat       %n");
        System.out.printf("--------------------------------%n");

        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"Name", "Health", "Attack", "Defense"});
        data.add(new Object[]{creatureA.getName(), creatureA.getHealth(), creatureA.getAttack(), creatureA.getDefense()});
        data.add(new Object[]{creatureB.getName(), creatureB.getHealth(), creatureB.getAttack(), creatureB.getDefense()});

        // Find the maximum length of each column
        int[] maxLengths = new int[data.get(0).length];
        for (Object[] row : data) {
            for (int i = 0; i < row.length; i++) {
                int length = String.valueOf(row[i]).length();
                if (length > maxLengths[i]) {
                    maxLengths[i] = length;
                }
            }
        }

        // Print the table
        for (Object[] row : data) {
            for (int i = 0; i < row.length; i++) {
                String cell;
                if (row[i] instanceof String) {
                    cell = String.format("%-" + maxLengths[i] + "s", row[i]);
                } else {
                    cell = String.format("%" + maxLengths[i] + "s", row[i]);
                }
                System.out.print("| " + cell + " ");
            }
            System.out.println("|");
        }
    }

    private static void reportAfterFight(Creature creature, int damage) {
        System.out.printf("%s가 %d의 피해를 입었습니다.\n", creature.getName(), damage);
        System.out.printf("%s 체력 : %d\n",  creature.getName(), Math.max(creature.getHealth(), 0));
    }

    private static int defense(Creature defenser,Creature attacker) {
        int damage = attacker.getAttack() - defenser.getDefense();
        if (damage > 0) {
            defenser.setHealth(defenser.getHealth() - damage );
        }
        return Math.max(damage, 0);
    }

    public static void playerAttack(Player player, Monster monster) {
        reportBeforeFight(player, monster);
        int damage = attack(player, monster);
        reportAfterFight(monster, damage);
    }

    public static void monsterAttack(Player player, Monster monster) {
        reportBeforeFight(player, monster);
        int damage = attack(monster, player);
        reportAfterFight(player, damage);
    }

    public static void playerDefense(Player player, Monster monster) {
        reportBeforeFight(player,monster);
        int damage = defense(player, monster);

        if (damage > 0) {
            reportAfterFight(player, damage);
            SystemUtils.echo(player.getName() + "님, 방어력보다 높은 공격이 들어왔습니다.");
        } else {
            SystemUtils.echo(player.getName() + "님, 완벽하게 방어하셨습니다.");
        }
    }

}
