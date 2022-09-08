package io.github.colintimbarndt.factory;

public class ArrowFactory extends AbstractProjectileFactory {
    @Override
    public Arrow createProjectile(Player owner) {
        return new Arrow(owner);
    }
}
