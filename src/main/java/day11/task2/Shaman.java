package day11.task2;

import day11.task2.Interfeces.Healer;
import day11.task2.Interfeces.MagicAttack;

public class Shaman extends Hero implements Healer, MagicAttack {


    private static final int HEAL_HIMSELF = 50;
    private static final int HEAL_TEAMMATE = 30;

    public Shaman() {
        magicAtt = 15;
        magicDef = 0.2;
        physAtt = 10;
        physDef = 0.2;
    }


    @Override
    public void healHimself() {
        if (health + HEAL_HIMSELF > MAX_HEALTH) {
            health = MAX_HEALTH;

        } else {
            health += HEAL_HIMSELF;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + HEAL_TEAMMATE > MAX_HEALTH) {
            hero.health = MAX_HEALTH;

        } else {
            hero.health += HEAL_TEAMMATE;
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        double magDamage = magicAtt * (1 - hero.magicDef);
        if (hero.health - magicAtt < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= magDamage;
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
