package Sergey.Lessons;

public class Les3 {
    public static void main(String[] args) {

        // Условные операторы
        int i = 3;
        if (i == 2) {
            System.out.println("Привет i = 2 ");
        } else if (i > 1) {
            System.out.println("> 1");
        } else {
            System.out.println("< 1");
        }
        // Логичесие операторы  && - (амперсант)-and и , ||-(пайп) - or или

        if (i > 1 && i < 5) {
            System.out.println("Привет i = 2, 3, 4");
        } else if (i < 1) {
            System.out.println("<= 1");
        } else {
            System.out.println(">= 5");
        }
        // Бинарная арефметика
        int a = 4; // 100
        int b = 3; // 011
        System.out.println(a | b); // 111 = 7


        //Цикл for
      //  for (int i = 0; i < 5; i = i + 1) {
            System.out.println("Hi1");

        }
    }