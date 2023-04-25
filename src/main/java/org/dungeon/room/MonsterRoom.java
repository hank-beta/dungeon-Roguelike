package org.dungeon.room;

import org.dungeon.creature.Monster;
import org.dungeon.creature.Player;
import org.dungeon.creature.monster.Goblin;
import org.dungeon.creature.monster.MonsterRoomSpawner;
import org.dungeon.utils.FightUtils;
import org.dungeon.utils.SystemUtils;

public class MonsterRoom implements Room {
    Monster monster;

    public MonsterRoom() {
        this.monster = MonsterRoomSpawner.spawnMonsterRoom();
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



    @Override
    public void enterRoom(Player player) {
        this.introduce();

        while(true) {
            int selectNumber = SystemUtils.selectMenu();

            if (selectNumber == 1) {
                this.attackMonster(player);
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
