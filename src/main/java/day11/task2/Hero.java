package day11.task2;

import day11.task2.Interfeces.PhysAttack;

public abstract class Hero implements PhysAttack {

    static final int MAX_HEALTH = 100;
    static final int MIN_HEALTH = 0;
    int health;

    double physDef; // (процент поглощения физического урона)
    double magicDef; // (процент поглощения магического урона)
    int physAtt; //(величина физической атаки), по необходимости
    int magicAtt; //(величина магической атаки), по необходимости

    public Hero() {
        health = MAX_HEALTH;
    }

    public void physicalAttack(Hero hero) {
        double physDamage = physAtt * (1 - hero.physDef);
        if (hero.health - physDamage < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= physDamage;
        }
    }

    @Override
    public String toString() {
        return "Hero{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                ", magicAtt=" + magicAtt +
                '}';
    }
}
