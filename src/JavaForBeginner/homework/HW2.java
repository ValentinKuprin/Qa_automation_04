package JavaForBeginner.homework;

public class HW2 {

    public static void main(String[] args) {

        String line = "____________________";
        int k = 5;
        int l = 10;
        int m = 15;
        int sumKL = k + l;
        int multKM = k * m;
        int LM = l - m;
        int devKL = k / l;
        int apple = 40;
        int student = 6;
        ////////////
        int x = 2;
        int y = 3;
        int a = k;
        int b = l;
        int c = m;
        int d = y - x;

        //12
        System.out.println(line);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(line);
        //13
        //System.out.println(""k, l, m); // -------- не сделано !!!!
        //14
        System.out.println("" + k + ", "  + l + ", "+ m);
        System.out.print(k + ", ");
        System.out.print(l + ", ");
        System.out.println(m + " ");
        System.out.println(line);
        //15
        System.out.println("Task15");
        System.out.println("int k =  " + k + "\nint l = " + l
                + "\nint m = " + m);
        System.out.println(line);
        //16
        System.out.println("Task16");
        System.out.println("Sum of k and l = " + (k + l));
        System.out.println("k * m = " + (k * m));
        System.out.println("Разность переменных l и m = " + (l - m));
        System.out.println(line);
        //17
        System.out.println("Task17");
        System.out.println("Результат деления k на l = " + (k / l) + ", а остаток от деления  = " + ( k % l));
        System.out.println("Результат деления k на m = " + (k / m) + ", а остаток от деления  = " + ( k % m));
        System.out.println("Результат деления l на m = " + (l / m) + ", а остаток от деления  = " + (l % m));
        System.out.println("Результат деления m на k = " + (m / k) + ", а остаток от деления  = " + ( m % k));
        System.out.println("Результат деления l на k = " + (l / k) + ", а остаток от деления  = " + (l % k));
        System.out.println("Результат деления m на l = " + (m / l) + ", а остаток от деления  = " + (m % l));
        // k\k l\l m\m

        System.out.println(line);
        //18
        System.out.println("Task18");
        System.out.println("Если " + apple + " яблок поделить на " + student
                + " учеников, то каждый ученик получит по " + (apple / student) + " яблок(a), и " + (apple % student)
                + " яблок(а) останется учителю.");
        System.out.println("Если " + 100 + " яблок поделить на " + 21
                + " учеников, то каждый ученик получит по " + (100 / 21) + " яблок(a), и " + (100 % 21)
                + " яблок(а) останется учителю.");
        System.out.println(line);
        System.out.println("Task19");
        //19
        m++;
        m--;
        System.out.println((k + l + m++) + (k + l + m--));
        System.out.println((m++) - (l + k + m));

        //20
        System.out.println(line);
        System.out.println("Task20");
        System.out.println("Если результат (48 % 8) = 0 кратно, result = "
                + (48 % 8));
        System.out.println((48 % 2) + " и " + (8 % 2) + " четное");
        System.out.println((47 % 2) + " и " + (49 % 2) + " нечетное");
        //21
        int result21 = (x + 3) * (x + 3);
        //22

        int result22a = ((3 + 4 * x) / 5);
        int result22b = (10 * (y - 5) * (a + b + c)) / x;
        int result22c = (9 * ((4 / x) + ((9 + x) / x)));
        int result22 = result22a - result22b + result22c;
        //23

        int result23 = (((5 * x) + (7 * y)) / ((8 * x) + (10 * y)) / (3 * x - y) / (x + y))
                / (a + b + (c / d) + ((a + b) / (c + d)) +  (a * b));

        System.out.println(line);
        System.out.println("|  task |  result  |");
        System.out.println(line);
        System.out.println("|\t21\t| \t " + result21 + "\t   |");
        System.out.println(line);
        System.out.println("|\t22\t|\t " + result22 + "\t   |");
        System.out.println(line);
        System.out.println("|\t23\t| \t " + result23 + "\t   |");
        System.out.println(line);





    }
}
