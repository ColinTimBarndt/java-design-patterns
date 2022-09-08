package io.github.colintimbarndt.factory;

public class Lazer extends Projectile {
    public Lazer(Player owner) {
        super(owner);
    }

    @Override
    void hit(Player player) {
        player.damage(5.0);
        getOwner().playHitSound();
    }
}
