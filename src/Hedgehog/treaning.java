package Hedgehog;

import java.util.Arrays;

public class treaning {


    public static int min(int[] list) {
        if (list.length > 0) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < list.length; i++) {
                if (min > list[i])
                    min = list[i];
            }
            return min;
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(min(new int[]{-52, 56, 30, 29, -54, 0, -110}));


    }
}
