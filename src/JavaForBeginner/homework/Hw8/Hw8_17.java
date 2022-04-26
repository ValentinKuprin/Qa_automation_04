package JavaForBeginner.homework.Hw8;

import JavaForBeginner.Utils;

import java.util.Arrays;

import static JavaForBeginner.Utils.*;

// 23 Написать метод, который принимает массив целых положительных чисел больше 0,
// и возвращает массив уникальных чисел.



public class Hw8_17 {


    public static int[] getUniqueArray(int[] array) {
       if (checkLongArrayIsZero(array) && checkNegativeNumber(array)) {
           for (int i = 0; i< array.length+1; i++) {
               if (array[i] == array[i+1]) {
                   array[i+1] = -1;
               }
           }
       }

        return new int[]{};
    }


    public static void main(String[] args) {
        int[] array = new int[] {3, 4, 4, 5, 6, 9, 5, 1, 2, 1, 7};
        int[] array2 = new int[] {1, 1, 1, 1, 1, 1, 1};
        int[] array3 = new int[] {1, 1, 1, 1, 1, 1, -1};
        int[] array4 = new int[] {};

        System.out.println(Arrays.toString(getUniqueArray(array)));
        System.out.println(Arrays.toString(getUniqueArray(array2)));
        System.out.println(Arrays.toString(getUniqueArray(array3)));
        System.out.println(Arrays.toString(getUniqueArray(array4)));



    }
}





