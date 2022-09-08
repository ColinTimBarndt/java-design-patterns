package io.github.colintimbarndt.factory;

public abstract class Projectile {
    private final Player owner;

    public Projectile(Player owner) {
        this.owner = owner;
    }

    abstract void hit(Player player);

    public Player getOwner() {
        return owner;
    }
}
