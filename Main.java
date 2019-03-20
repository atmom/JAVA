package lesson2_1;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //первое задание
        int[] arrFirst = {1, 0, 0, 1, 1, 0};

        for (int i = 0; i<arrFirst.length; i++) {
            if (arrFirst[i] == 1){
                arrFirst[i] = 0;
            }else{
                arrFirst[i] = 1;
            }
        }
        System.out.println (Arrays.toString (arrFirst));
        //второе задание
        int[] arrSecond = new int[8];
        arrSecond[0] = 0;
        arrSecond[1] = 3;
        arrSecond[2] = 6;
        arrSecond[3] = 9;
        arrSecond[4] = 12;
        arrSecond[5] = 15;
        arrSecond[6] = 18;
        arrSecond[7] = 21;
        System.out.println(Arrays.toString(arrSecond));
        //третье задание
        int[] arrChange = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i=0; i<arrChange.length; i++){
            if (arrChange [i] <6){
                arrChange [i] *= 2;
            }
        }
        System.out.println (Arrays.toString(arrChange));
        //четвертое задание
        int [][] table = new int [3][3];
        for (int i=0; i<table.length; i++){
            for (int j=0; j<table.length; j++){
                if (i == j){
                    table [i][j] = 1;
                }
            }
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
        //пятое задание
        int[] arrMaxMin = {1, 45, 35, 4, 8, -6};
        int max = arrMaxMin[0];
        int min = arrMaxMin[0];
        for (int i = 0; i<arrMaxMin.length; i++){
           if (arrMaxMin[i]> max){
               max = arrMaxMin[i];
           } else if (arrMaxMin[i] < min) {
               min = arrMaxMin[i];
           } else {
               continue;
           }
        }
        System.out.print ("Задан массив ");
        System.out.println(Arrays.toString(arrMaxMin));
        System.out.println("Максимальное значение = "+max+", минимальное значение = "+ min);
        //шестое задание
        int[] arrSumm = {1, 1, 1, 2, 1};
        System.out.println(summArr(arrSumm));
        //седьмое задание
        int[] arrBias = {1, 2, 3, 4};
        int n = 1;
        biasArr(arrBias, n);
        // допзадание 1
        int [] numbers = new int[50];
        for (int i =0; i<50;i++){
           numbers[i] = i*2+1;
        }
        System.out.println(Arrays.toString(numbers));
        // допзадание 2
        int [] arrRand = new int [15];
        Random s = new Random();
        for (int i =0; i<arrRand.length; i++){
            arrRand [i] = s.nextInt(10);
        }
        System.out.println(Arrays.toString(arrRand));
        int evenNumber = 0;
        for (int i=0; i<arrRand.length; i++){
            if(arrRand[i]%2 == 0){
                evenNumber++;
            }
        }
        System.out.println("Чётных чисел (включая 0) в массиве "+ evenNumber);
        //допзадание 3
        int [] arrRandFirst = new int[5];
        double mediumFirst = 0;
        int [] arrRandSecond = new int[5];
        double mediumSecond = 0;
        for (int i=0; i<arrRandFirst.length; i++){
            arrRandFirst [i] =s.nextInt(6);
            mediumFirst += arrRandFirst[i];
        }
        System.out.println(Arrays.toString(arrRandFirst));
        mediumFirst/=arrRandFirst.length;
        System.out.println("Среднее арифмитическое значение первого массива = " + mediumFirst);
        for (int i = 0; i<arrRandSecond.length; i++){
            arrRandSecond [i] = s.nextInt(6);
            mediumSecond += arrRandSecond[i];
        }
        System.out.println(Arrays.toString(arrRandSecond));
        mediumSecond/=arrRandSecond.length;
        System.out.println("Среднее арифмитическое значение второго массива = " + mediumSecond);
        if (mediumFirst>mediumSecond){
            System.out.println("Среднее арифмитическое значение первого массива больше второго. ");
        } else if (mediumFirst<mediumSecond){
            System.out.println("Среднее арифмитическое значение первого массива меньше второго.");
        } else {
            System.out.println("Средние арифметические значения двух массивов равны.");
        }
    }
    public static boolean summArr(int[] arr){
        int summOpen = 0;
        int summClose = 0;
        for (int i = 0; i<arr.length; i++ ){
        summOpen += arr[i];
        summClose = 0;
            for (int j = i+1;j<arr.length; j++){
                summClose += arr[j];
            }
        if (summOpen == summClose)return true;
        }
        return false;
    }

    public static void biasArr(int[] arr, int a){
       if (a>=0){
           int k = 0;
           for (int i = arr.length - 1; i>a;i--){
                arr[i] = arr [i-1];
                arr[0] = k;//надо как то прописать элемент, который будет двигаться с 0 и ++
            }
           System.out.println(Arrays.toString(arr));
       }
    }


}





