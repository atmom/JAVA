package lesson3_1;

import java.util.Scanner;

public class Calc {

    public static  Scanner in = new Scanner(System.in);

    public static void checkNum () {

        String[] line = in.nextLine().split(" ");
//        for (int k = 0; k<line.length; k+=2){
//            if(in.hasNextInt()) {
//                System.out.println("OK");
//                continue;
//            } else {
//                System.out.println("Допущена ошибка!");
//                break;
//
//            }
//        }
        payment(line);

    }

    public static int operation (int res, int b, String oper) {

                switch (oper) {
                    case "+":
                        res +=  b;
                        break;
                    case "-":
                        res -=  b;
                        break;
                    case "*":
                        res *=  b;

                        break;
                    case "/":
                        res /=  b;

                        break;
                }

            return res;

    }

    public static void payment (String [] arr) {
        int res =0;
        res = Integer.parseInt(arr[0]);
        for (int i = 0; i<arr.length-2; i+=2) {
            //res = Integer.parseInt(arr[i]);
            int b = Integer.parseInt(arr[i+2]);
            String oper = arr[i+1];
            res=operation(res,b,oper);

        }
        System.out.println(res);
    }



    public static void main(String[] args) {
       checkNum();
    }
}
