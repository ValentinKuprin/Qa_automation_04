package Sergey.Lessons;

import java.sql.SQLOutput;

public class Les5 {
    public static void main(String[] args) {
        Test t = new Test();
        int a = 10;
        int b = 25;
        t.sum(a, b);


        int g = 1;
        int p = 9;
        int z = 24;

       int r1 = t.sum1(g, p, z);
        System.out.println(r1);

        int x = 15;
        int y = 3;
        System.out.println(t.division(x, y));

    }
}
