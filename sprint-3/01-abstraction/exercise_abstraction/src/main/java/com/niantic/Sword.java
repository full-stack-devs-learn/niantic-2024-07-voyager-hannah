package com.niantic;

public class Sword extends Weapon {
    public Sword(String name, int damage) {
        super(name, damage);
    }

    @Override
    public int attack() {
        int damage = getDamage();
        int newCharge = Math.min(100, getPercentCharged() + 10);
        setPercentCharged(newCharge);
        return damage;
    }

    @Override
    public int powerAttack() {
        int charge = getPercentCharged();
        int damage= 0;
        if(charge >= 100) {
            damage = getDamage() * 4;
            setPercentCharged(0);
        } else if (charge >= 50){
            damage = getDamage() * 2;
            setPercentCharged(charge - 50);
        } else {
            damage = getDamage();
        }

        return damage;
    }

    @Override
    public int getRange() {
        return 1;
    }
}

