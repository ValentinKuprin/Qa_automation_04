package JavaForBeginner.homework;

import java.util.Arrays;

public class Hw7_6 {
    public static void main(String[] args) {
        String line = "______________";

        /** 1
         * Создать массив catsNames, заполнить его любыми значениями (см картинку котов из презентации).
         */
        Hw5.printTaskNumber();
        String[] catsNames = new String[]{"Васька", "Черный", "Мурзик", "Машка", "Мишка", "Барс", "Рыжик2", "Лева"};
        System.out.print(Arrays.toString(catsNames));
        System.out.println("\n");


        /** 2
         * В массиве catsNames изменить значение элемента с индексом 4 на “Рыжик”,
         * а значение элемента с индексом 1 на “Черныш”.
         */
        Hw5.printTaskNumber();
        for (int i = 0; i < 8; i++) {
            if (i == 4) {
                catsNames[i] = "Рыжик";
            } else if (i == 1) {
                catsNames[i] = "Черныш";
            }
        }
        System.out.println(Arrays.toString(catsNames));

        /** 3
         * Создать массив catsColors и заполнить его значениями.
         */
        Hw5.printTaskNumber();
        String[] catsColors;
        catsColors = new String[8];
        catsColors[0] = "Серый";
        catsColors[1] = "Черный";
        catsColors[2] = "Серый";
        catsColors[3] = "Полосато_коричнвый";
        catsColors[4] = "Рыжий";
        catsColors[5] = "Серый";
        catsColors[6] = "Песочный";
        catsColors[7] = "Серый";
        System.out.println(Arrays.toString(catsColors));


        /** 6
         * Распечатать для массивов catsNames и catsColors:
         * имя кота в коробке с номером 6
         * имена котов из коробок с четными индексами
         * имена котов из коробок, чьи индексы кратны 4
         * цвет котов из коробок с нечетными индексами
         * цвет котов из коробок, чьи индексы кратны 3
         */
        Hw5.printTaskNumber();

        for (int i = 0; i < 8; i++) {

            if (i == 6) {
                System.out.println("имя кота в коробке с номером 6 " + catsNames[i] + "[" + i + "]");
            }
            if (i % 2 == 0) {
                System.out.println("имена котов из коробок с четными индексами " + catsNames[i] + "[" + i + "]");
                System.out.println(line);
            }
            if (i % 4 == 0) {
                System.out.println("имена котов из коробок, чьи индексы кратны 4 " + catsNames[i] + "[" + i + "]");

            }
            if (i % 2 != 0) {
                System.out.println("цвет котов из коробок с нечетными индексами " + catsColors[i] + "[" + i + "]");

            }
            if (i / 3 == 0) {
                System.out.println("цвет котов из коробок, чьи индексы кратны 3 " + catsColors[i] + "[" + i + "]");
            }
            System.out.println(line);

        } // Править цикл, смешивают выводы.
    }


}
