package lesson7;

public class Warrior extends Hero {


    public Warrior(int health, int damage ) {
        super(health, damage);

    }

    @Override
    void hit(Hero h) {//добавить чтобы не смогли ударить своих в команде
        if(h != this) {
            h.causeDamage(damage);
        }
    }

    @Override
    void healing(Hero h) {
        System.out.println("Войны не умеют лечить!");
    }
}
