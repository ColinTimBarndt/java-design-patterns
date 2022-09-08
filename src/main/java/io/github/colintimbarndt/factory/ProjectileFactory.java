package io.github.colintimbarndt.factory;

/**
 * This is using one concrete factory.
 */
public class ProjectileFactory {
    private ProjectileFactory() {}

    static Arrow createArrow(Player owner) {
        return new Arrow(owner);
    }

    static Lazer createLazer(Player owner) {
        return new Lazer(owner);
    }

    static HealingRay createHealingRay(Player owner) {
        return new HealingRay(owner);
    }
}
