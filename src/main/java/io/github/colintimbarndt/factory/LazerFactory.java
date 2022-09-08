package io.github.colintimbarndt.factory;

public class LazerFactory extends AbstractProjectileFactory {
    @Override
    public Lazer createProjectile(Player owner) {
        return new Lazer(owner);
    }
}
