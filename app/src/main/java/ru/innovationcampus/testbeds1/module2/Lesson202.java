package ru.innovationcampus.testbeds1.module2;

public class Lesson202 {
    public static void main(String[] args) {
        Unit u1 = new Unit();
        System.out.println(u1.getName());
        u1.setName("Skif");
        u1.setHp(150);
        System.out.println(u1.getName());

        Wizard w1 = new Wizard();
        w1.setName("Gendalf");
        System.out.println(w1.getMana());

        Robot r1 = new Robot();
        r1.setName("R2D2");
        r1.setArmor(77);


        Unit[] enemies = {w1, r1, w1, r1};
        for(Unit next: enemies) {
            next.attack(u1);
        }

    }
}
