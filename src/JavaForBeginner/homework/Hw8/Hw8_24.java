package JavaForBeginner.homework.Hw8;

import java.util.Arrays;

public class Hw8_24 {

    public static int[] countUniqueNonUnique(int[] array) {
        int n = 0;

        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= 0) {
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[i] == array[j]) {
                            array[j] = -1;
                            n++;
                        }
                    }
                }
            }
            return  new int[]{array.length - n, n};
        }
        return new int[]{0,0};

    }

    public static void main(String[] args) {
        int[] array = new int[]{3, 4, 4, 5, 6, 9, 5, 1, 2, 1, 7, 3, 4, 4, 5, 6, 9, 5, 1, 2, 1, 7, 3, 4, 4, 5, 6, 9, 5, 1, 2, 1, 7,};
        int[] array1 = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(countUniqueNonUnique(array)));
    }


}
