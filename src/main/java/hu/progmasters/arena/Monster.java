package hu.progmasters.arena;

import java.util.Random;

public class Monster {
    private String name;
    private int life = 100;
    private final int specialAttack;

    public Monster(String name) {
        this.name = name;
        Random random = new Random();
        int x = random.nextInt(3) +3;
        specialAttack = x;

    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getSpecialAttack() {
        return specialAttack;
    }

    public void setLife(int life) {
        this.life = life;
    }
}
