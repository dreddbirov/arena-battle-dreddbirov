package hu.progmasters.arena;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Arena {
    private Human human;
    private Monster monster;

    public Arena() {
    }

    public void letsBattle() throws InterruptedException {
        int round = 1;
        int humanHitPoint;
        int monsterHitPoint;
        Random random = new Random();
        while (human.getLife() > 0 && monster.getLife() > 0) {
            System.out.println("Round" + round);

            monsterHitPoint = random.nextInt(11);
            human.setLife(human.getLife() - monsterHitPoint);
            System.out.println("Monster damage: " + monsterHitPoint + ", Human has " + human.getLife() + " life left.");

            humanHitPoint = random.nextInt(11);
            monster.setLife(monster.getLife() - humanHitPoint);


            if(round % monster.getSpecialAttack() == 0) {
                human.setLife(human.getLife() - 1);
                System.out.println("Monster used special attack in round " + round + ", dealing 1 damage on human.");
            }
            System.out.println("Human damage: " + humanHitPoint + ", Monster has " + monster.getLife() + " life left.");

            System.out.println();
            round++;
            TimeUnit.SECONDS.sleep(1);
        }
        String winnersName = monster.getLife() > human.getLife() ? monster.getName() + " the Monster" : human.getName() + " the Human";
        System.out.println(winnersName + "WINS!");
        System.out.println("Monster life: " + monster.getLife());
        System.out.println("Human life: " + human.getLife());
        System.out.println("Total rounds: " + round);
    }


    public void setHuman(Human human) {
        this.human = human;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }
}
