package com.niantic;

public class Wizard extends Character {

    protected int mana;
    protected int requiredMana;


    public Wizard(String name, int health, int level, int experience, int mana) {

        super(name, health, level, experience);
        this.mana = mana;
        this.requiredMana = mana;
    }

    public int getMana() {
        if (mana > 0) {
            mana -= 10;
        }
        // }
        //{
        return mana;
        // }

    }
    //public void regenerateMana(int amount); {
    //if (amount > 0) {
    //  mana+= amount;

    //   }


    public void castSpell(Character target) {
        int requiredMana = 10;

        //target.takeDamage(attackDamage);
        if (mana >= 10) {
            mana -= 10;
            super.attack(target);
            target.takeDamage(attackDamage);

            System.out.println("You have successfully cast a spell!");
        } else {

            System.out.println("Not enough mana :(, recover your mana to cast a spell!");
        }
    }


    @Override
    public void levelUp() {

        int manaIncrease = 10;
        mana += manaIncrease;
        super.levelUp();

        System.out.println(" Health before level up: ");


        System.out.println("Wizard leveled up! Mana increased by 10.");
    }

    //@Override
    public void regenerateMana(int amount) {
       if (amount > 0) {
           this.requiredMana +=amount;
       }
        System.out.println("Regenerating mana.....");


    }
}


















