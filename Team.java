package lesson7;

import java.util.FormatFlagsConversionMismatchException;
import java.util.Random;

public class Team {


    String type;
    static final int MAX_PLAYER = 3;
    private boolean aLive;



    public Team(String type) {
        this.type = type;
    }

    void teamBilding (Hero h1, Hero h2, Hero h3) {
        System.out.println("Команда: " + type );
        h1.info();
        h2.info();
        h3.info();
    }

//     void teamStrong (Team [] command){
//
//        System.out.println("Команда: " + type );
//        for (int i = 0; i< command.length; i++){
//            command[i].info();
//        }
//
//    }

    void teamAlive (Hero h1, Hero h2, Hero h3) {

        if((h1.getHealth()+h2.getHealth()+h3.getHealth())>0){
            System.out.println("В бой!");
        }else {
            System.out.println("Все умерли!");
        }


    }

//    void includGem (Hero h1, Hero h2, Hero h3){
//        if (h1.getHealth()>h2.getHealth()&&h1.getHealth()>h3.getHealth()){
//            System.out.println("Игрок выбран, нападаю "+"урон "+ h1.getDamage());
//        } else if(h2.getHealth()>h1.getHealth()&&h2.getHealth()>h3.getHealth()){
//            System.out.println("Игрок выбран, нападаю "+"урон "+ h2.getDamage());
//        } else {
//
//        }
//    }




}
