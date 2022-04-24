package JavaForBeginner.homework.Hw8;

import JavaForBeginner.Utils;

import java.util.Arrays;

import static JavaForBeginner.Utils.*;

// {“1(800)123-45-67”, “USA”}

public class Hw8_17 {

    public static String[] getArrayPhoneNomberAndCountryName(int[] array) {
        String str = "";
        String[] str1 = new String[2];

        for (int i = 0; i < array.length; i++) {
            if (array[0] == 1) {
                str1[1] = "USA";
            }
            if (i == 1) {
                str1[0] += "("; //+ Integer.toString(array[i]);
            }
            if (i == 4) {
                str1[0] += ")"; //+ Integer.toString(array[i]);
            }
            if (i == 7) {
                str1[0] += "-";// + Integer.toString(array[i]);
            }
            if (i == 9) {
                str1[0] += "-";// + Integer.toString(array[i]);
            }
            str1[0] += (array[i]);

        }
        return str1;
    }

    public static void main (String[]args){
        int[] array1 = new int[] {1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7};

        System.out.println(Arrays.toString(getArrayPhoneNomberAndCountryName(array1)));
            }


        }



