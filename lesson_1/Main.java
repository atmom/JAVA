package lesson1_1;

public class Main {

    public static void main(String[] args) {
        byte one = 127;
        short two = 32767;
        int a = 2, b = 1, c = 3, d = 2;
        long y = 200000L;
        float f = 25.21f;
        double g = -124;
        char h = '5';
        boolean val = false;
        String top = "JAVA";

        System.out.println (calculate (2,4,4,5));
        System.out.println (task10and20 (4,12));
        isPositiveOrNegative(-30);
        System.out.println (isNegative (-14));
        greetings ("Ирина");
        year (2360);
    }
	public static int calculate (int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean task10and20 (int x1, int x2) {
       return ((x1+x2) >= 10 && (x1+x2) <= 20);
    }

    public static void isPositiveOrNegative(int x) {
        if(x >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative (int x) {
        if (x < 0) {
            return true;
        }
        return false;
    }

    public static void greetings (String name) {
        System.out.println ("Привет," + name);
    }

    public static void year (int x){
        if ((x%400 == 0) || (x%4 == 0 && x%100!=0)) {
            System.out.println ("Год високосный");
        }
        else {
            System.out.println ("Год не високосный");
        }

    }
}
