package lesson3_1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = false;
        int check = 1;

        do {
            int num = randomNumber(10);
            check = checkStart(num, flag, check);

        } while (check == 1);
        sc.close();
    }


    public static int randomNumber (int s){
        Random rand = new Random();
        return rand.nextInt(s);
    }

    public static boolean getNumberFromScanner ( int num, boolean flag){
        int x;
        x = sc.nextInt();

        if (x>num){
              flag = false;
              System.out.println("загаданное число меньше");
        }else if(x<num){
              flag = false;
              System.out.println("загаданное число больше");
        } else {
              flag = true;
        }

        return flag;
    }

    public static int checkStart (int num, boolean flag, int check){
        int k = 0;
        System.out.println("Угадайте число от 0 до 10");
        for(int i =0; i<3; i++){
            flag = getNumberFromScanner (num, flag);
            if (flag){
                System.out.println("Вы выиграли!");
                break;
            }
        }
        System.out.println("Повторить игру еще раз?");
        check = sc.nextInt();
        if (check == 1){
            return 1;
        }else return 0;
    }



}
