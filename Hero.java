package lesson7;

public abstract class Hero  {
    protected int health;
   // protected String type;
    protected int damage;

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    abstract void hit(Hero h);
    abstract void healing(Hero h);

    void causeDamage(int damage) {
        health -= damage;
    }

    void info() {


        System.out.println("жизнь "+health + " " + "урон " + damage);
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }
}
