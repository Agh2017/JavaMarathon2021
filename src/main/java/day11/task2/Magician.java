package day11.task2;


import day11.task2.Interfeces.MagicAttack;

public class Magician extends Hero implements MagicAttack {

    public Magician() {
        physAtt = 5;
        physDef = 0;
        magicDef = 0.8;
        magicAtt = 20;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double magDamage = magicAtt*(1-hero.magicDef);
        if (hero.health - magicAtt < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= magDamage;
        }

    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
