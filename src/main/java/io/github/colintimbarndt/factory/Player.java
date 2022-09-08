package io.github.colintimbarndt.factory;

public class Player {
    private final String name;
    private final double maxHealth;
    private double health;

    public Player(String name) {
        this.name = name;
        maxHealth = 20.0;
        health = maxHealth;
    }

    public String getName() {
        return name;
    }

    public void performMove() {
        // DO SOMETHING
    }

    public void heal(double amount) {
        health += Math.min(maxHealth, health + amount);
    }

    public void damage(double amount) {
        health = Math.max(0, health - amount);
    }

    public boolean isAlive() {
        return health > 0.0;
    }

    public void playHitSound() {
        // Plays hit sound
    }
}
