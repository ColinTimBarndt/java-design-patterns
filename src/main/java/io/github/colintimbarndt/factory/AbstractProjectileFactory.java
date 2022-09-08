package io.github.colintimbarndt.factory;

/**
 * This is using one abstract factory class and have it extended by concrete projectile factory classes.
 */
public abstract class AbstractProjectileFactory {
    public abstract Projectile createProjectile(Player owner);
}
