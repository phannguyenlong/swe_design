package composite.exercise;

/**
 * This is leaf
 */
public class Player implements Tournament {
    private String name;
    private int strength;

    public Player(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public Tournament getWinner() {
        return this;
    }

    @Override
    public String toString() {
        return "Player" + name;
    }
}
