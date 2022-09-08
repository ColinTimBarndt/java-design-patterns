package io.github.colintimbarndt.factory;

public class HealingRay extends Projectile {
    public HealingRay(Player owner) {
        super(owner);
    }

    @Override
    public void hit(Player player) {
        player.heal(4.0);
    }
}
