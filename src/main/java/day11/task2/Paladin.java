package day11.task2;

import day11.task2.Interfeces.Healer;

public class Paladin extends Hero implements Healer {

    private static final int HEAL_HIMSELF = 25;
    private static final int HEAL_TEAMMATE = 10;

    public Paladin() {

        magicAtt = 0;
        magicDef = 0.2;
        physAtt = 15;
        physDef = 0.5;

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
        if (health + HEAL_TEAMMATE > MAX_HEALTH) {
            health = MAX_HEALTH;

        } else {
            health += HEAL_TEAMMATE;
        }

    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}