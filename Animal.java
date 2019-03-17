package lesson6;

public class Animal {
    String name;
    String strength;



    public Animal(String name, String strength) {
        this.name = name;
        this.strength = strength;
    }

    public String getStrength() {
        return strength;
    }

    public  void run(double distance, double opportiunities) {

            System.out.println(name +" " + strength+ " " + "run: " + (distance<= opportiunities));

    }

    public void swim (double distance, double opportiunities){

            System.out.println(name + " " + strength + " " + "swim: " + (distance<= opportiunities));

    }

    public void jamp (double distance, double opportiunities ){

            System.out.println(name + " " + strength +" " + "jamp: " + (distance<= opportiunities));

    }



}

 class Cat extends Animal {

     public Cat(String name, String strength) {
         super(name, strength);
     }



}

class Dog extends Animal {

    public Dog(String name, String strength) {
        super(name, strength);
    }
}


