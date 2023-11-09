package ru.innovationcampus.testbeds1.module2;

public class Robot extends Unit{
    private  int armor = 100;

    //generate -> Getter&Setter

    @Override
    public int getArmor() {
        return armor;
    }

    @Override
    public void setArmor(int armor) {
        this.armor = armor;
    }
}
