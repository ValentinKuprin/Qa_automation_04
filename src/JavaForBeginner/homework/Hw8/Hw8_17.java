package JavaForBeginner.homework.Hw8;

import JavaForBeginner.Utils;

import java.util.Arrays;

import static JavaForBeginner.Utils.*;

//11 Написать метод, который принимает на вход массив целых положительных чисел,
// и возвращает количество четных чисел в этом массиве


public class Hw8_17 {

    public static boolean checkPositiveNгmber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                return false;
            }
        }
        return true;
    }




    public static void main(String[] args) {



    }
}





