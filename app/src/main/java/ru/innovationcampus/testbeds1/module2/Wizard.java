package ru.innovationcampus.testbeds1.module2;

public class Wizard extends Unit{
    private int mana = 50;

    @Override
    public void attack(Unit enemy) {
        System.out.println(this.getName() + " magic attack "
                                                    + enemy.getName());
        enemy.setHp(enemy.getHp() - 10);
        this.mana -= 5;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
