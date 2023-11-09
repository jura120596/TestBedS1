package ru.innovationcampus.testbeds1.module2;

public class Unit {
    private String name;
    private int hp = 100, armor = 100;


    public void attack(Unit enemy) {
        System.out.println(this.name + " attack " + enemy.name);
        enemy.setHp(enemy.getHp() - 10);
    }






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
