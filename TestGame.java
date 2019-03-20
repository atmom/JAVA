package lesson7;

public class TestGame {
    public static void main(String[] args) {

        Hero h1 = new Warrior(100,  20);
        Hero h2 = new Warrior(100,  30);
        Hero h3 = new Killer(80,  50);
        Hero h4 = new Killer(80,  50);
        Hero h5 = new Doctor(60,  15);
        Hero h6 = new Doctor(60,  15);



        Team team1 = new Team("красные");
        team1.teamBilding(h1,h2,h3);
        team1.teamAlive(h1,h2,h3);

        Team team2 = new Team("синие");
        team2.teamBilding(h4,h5,h6);
        team2.teamAlive(h4,h5,h6);










//        h1.info();
//        h2.info();
//
//        h1.hit(h2);
//
//        h1.info();
//        h2.info();


    }
}
