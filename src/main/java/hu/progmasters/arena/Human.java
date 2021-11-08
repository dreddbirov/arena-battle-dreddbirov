package hu.progmasters.arena;

public class Human {
    private String name;
    private int life = 100;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}
