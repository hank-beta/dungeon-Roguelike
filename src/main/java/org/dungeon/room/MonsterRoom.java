package org.dungeon.room;

import org.dungeon.creature.Monster;
import org.dungeon.creature.Player;
import org.dungeon.creature.MonsterRoomSpawner;
import org.dungeon.utils.FightUtils;
import org.dungeon.utils.SystemUtils;

public class MonsterRoom implements Room {
    Monster monster;

    public MonsterRoom() {
        this.monster = MonsterRoomSpawner.spawn();
    }

    public void introduce() {
        SystemUtils.encounterMonster(monster);
    }

    public void attackMonster(Player player) {
        FightUtils.playerAttack(player, monster);

        if (monster.getHealth() <= 0) {
            return;
        }

        FightUtils.monsterAttack(player, monster);
    }

    public void defenseMonster(Player player) {
        FightUtils.playerDefense(player, monster);
    }

    @Override
    public void enterRoom(Player player) {
        this.introduce();

        while(true) {
            int selectNumber = SystemUtils.selectMenu();

            if (selectNumber == 1) {
                this.attackMonster(player);
            } else if (selectNumber == 2) {
                this.defenseMonster(player);
            }

            if (this.monster.getHealth() == 0) {
                SystemUtils.echo(this.monster.getName() + "가 죽었습니다. 다음 방으로 넘어가시죠.");
                break;
            } else if (player.getHealth() == 0) {
                SystemUtils.echo(player.getName() + "가 죽었습니다. GAME OVER");
                break;
            }
        }
    }
}
