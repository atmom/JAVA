package lesson6;


public class Main {

    public static void main(String[] args) {

    Cat [] cats = {new Cat("Мурзик", "слабый" ),new Cat("Пушок",  "сильный")};
	Dog[] dogs = {new Dog("Дружок",  "сильный"),new Dog("Боец", "слабый") };


	for ( int i = 0; i<cats.length; i++){

		if (cats[i].getStrength()== "слабый") {
			cats[i].run(150,100);
			cats[i].swim(150,0);
			cats[i].jamp(150,1);

		} else {
			cats[i].run(150,200);
			cats[i].swim(150,0);
			cats[i].jamp(150,2);
		}
	}

		for ( int i = 0; i<dogs.length; i++){

			if (dogs[i].getStrength()== "слабый") {
				dogs[i].run(150,400);
				dogs[i].swim(0.3,0.3);
				dogs[i].jamp(0.5,1);

			} else {
				dogs[i].run(600,500);
				dogs[i].swim(0.3,0.5);
				dogs[i].jamp(1,2);
			}
		}



    }
}
