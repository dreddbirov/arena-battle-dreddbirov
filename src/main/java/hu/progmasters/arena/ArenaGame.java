package hu.progmasters.arena;

import java.util.concurrent.TimeUnit;

public class ArenaGame {

    public static void main(String[] args) throws InterruptedException{

        Arena arena = new Arena();
        Human human = new Human("Pisti");
        Monster monster = new Monster("Büdi");

        arena.setHuman(human);
        arena.setMonster(monster);

        arena.letsBattle();
    }
}
