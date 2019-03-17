package lesson4_1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static int SIZE_X = 5;
    static int SIZE_Y = 5;
    static int NUMBER_OF_CHIPS = 4;

    static char [] [] map = new char[SIZE_Y][SIZE_X];

    static char PLAYER_DOT = 'X';
    static char AT_DOT = '0';
    static char EMPTY_DOT = '.';


    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void initMap() {

        for (int i = 0; i< SIZE_Y; i++) {
            for (int j = 0; j<SIZE_X; j++){
                map [i] [j] = EMPTY_DOT;

            }
        }
    }

    private static void printFiel () {
        int empty = 1;
        System.out.print ("   ");
        for (int d = 0; d<SIZE_X; d++) {
           System.out.print ("-"+empty + "--");
            empty++;
        }
        empty = 1;
        System.out.println();

        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print( empty + " | ");
            empty++;
            for (int j = 0; j < SIZE_X; j++) {
                System.out.print(map[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void setSym(int y, int x, char sym) {
        map[y] [x] = sym;
    }

    private static boolean isCellValid(int y, int x) {
        if (x<0 || y<0 || x> SIZE_X-1 || y >SIZE_Y-1) {
            return  false;
        }
        return map [y] [x] == EMPTY_DOT;
    }

    private static void playerStep() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты: X Y (1 - " + SIZE_X + ")");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(y, x));
        setSym(y, x, PLAYER_DOT);

    }

    private static void aiStep() {
        int x;
        int y;

        do {

            x = random.nextInt(SIZE_X);
            y = random.nextInt(SIZE_Y);
        } while (!isCellValid(y, x));
        setSym(y, x, AT_DOT);
    }

    private static boolean isDraw() {
        for (int i =0; i <SIZE_Y; i++) {
            for (int j = 0; j< SIZE_X; j++) {
                if(map[i][j] == EMPTY_DOT) {
                    return false;
                }
            }
        }
        return  true;
    }

    private static boolean checkWin(char sym) {
        int countD = 0;
        int countDr =0;
        int countG = 0;
        int countV = 0;

        for (int i =0; i<SIZE_Y; i++) {
            for (int j = 0; j<SIZE_X; j++){
                if(i == j && map [i] [j] == sym) {
                    countD++;
                }
            }
        }

        for (int i =0; i<SIZE_Y; i++) {
           for (int j = SIZE_X-1; j !=-1; j--) {
               if (i == SIZE_Y-j-1 && map [i] [j] == sym) {
                        countDr++;
               }
           }

        }
        for (int k=0; k<SIZE_Y; k++){
            for (int s = 0; s+1<SIZE_X; s++){
                if ((map [k] [s] == map [k] [s+1]) && map[k][s] == sym) {
                    countG++;
                }
            }
        }
        for (int k=0; k+1<SIZE_Y; k++){
            for (int s = 0; s<SIZE_X; s++){
                if ((map [k] [s] == map [k+1] [s]) && map[k][s] == sym) {
                    countV++;
                }
            }
        }

        return (countD == SIZE_X || countD == NUMBER_OF_CHIPS ) || (countDr == SIZE_X || countDr == NUMBER_OF_CHIPS) ||
                (countG == SIZE_X-1 || countG == NUMBER_OF_CHIPS-1) || (countV == SIZE_X-1 || countV == NUMBER_OF_CHIPS-1);
    }



    public static void main(String[] args) {
	initMap();
	printFiel();

	while (true) {
	    playerStep();
	    printFiel();
	    if(checkWin(PLAYER_DOT)) {
	        System.out.println("Победил игрок");
	        break;
        }
	    if(isDraw()) {
	        System.out.println("Ничья!");
	        break;
        }
	    aiStep();
	    printFiel();
	    if(checkWin(AT_DOT)) {
	        System.out.println("Победил искусственный разум");
	        break;
        }
	    if (isDraw()) {
            System.out.println("Ничья!");
            break;
        }
    }
	System.out.println("Игра закончена");
    }
}
