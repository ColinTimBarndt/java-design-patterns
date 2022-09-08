package io.github.colintimbarndt.factory;

public class Arrow extends Projectile {
    public Arrow(Player owner) {
        super(owner);
    }

    @Override
    public void hit(Player player) {
        player.damage(1.0);
        getOwner().playHitSound();
    }
}
