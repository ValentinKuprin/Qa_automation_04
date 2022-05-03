package JavaForBeginner.homework.Hw8;

import JavaForBeginner.Utils;

import java.util.Arrays;

import static JavaForBeginner.Utils.*;

// 26 Написать метод, который принимает на вход 2 массива int[] и возвращает
// объединенный массив уникальных неповторяющихся элементов


public class Hw8_17 {

    public static int[] getUniqueSumArray(int[] array, int[] array1) {

        if (array == null || array1 == null || array.length == 0 && array1.length == 0) {
            return array;
        }
            int[] sumTwoArrays = new int[array.length + array1.length];
            for (int i = 0; i < array.length; i++) {
                sumTwoArrays[i] = array[i];
            }
            for (int i = 0; i < array1.length; i++) {
                sumTwoArrays[array.length + i] = array1[i];
            }

        return getUniqueArray(sumTwoArrays);
}



        public static void main (String[]args){
            int[] array = new int[]{1, 2, 3, 4, 5, 13, 12, 7, 9};
            int[] array1 = new int[]{1, 2, 3, 4, 5,7, 9,8, 11 ,17};
            System.out.println(Arrays.toString(getUniqueSumArray(array, array1)));


        }


    }





