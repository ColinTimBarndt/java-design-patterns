package io.github.colintimbarndt.factory;

public class HealingRayFactory extends AbstractProjectileFactory {
    @Override
    public HealingRay createProjectile(Player owner) {
        return new HealingRay(owner);
    }
}
