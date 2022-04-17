package Sergey.HW.Hw4;

public class Hw4_2 {

    public static void main(String[] args) {
        String line = "=================================";

        /** Задача №1
         * необходимо вывести все буквы “о” из этой строки. Для указанной строки ответ будет “ооооо” (или в столбик)
         */

        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') {
                System.out.print(s.charAt(i));   // как сделать сумму полученных строк о+о+о+о
            }
        }
        System.out.println("\n\"Задача №1\"" + "\n" + line);

        /** Задача №2
         * необходимо подсчитать количество букв “е” в строке. Для указанной строки ответ будет 4.
         */
        String s1 = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'е') {
                count = count + 1;
            }
        }
        System.out.println("Задача №2\n" + count + "\n" + line);

        /** Задача №3
         * необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
         * Для указанной строки ответ будет 6, 15, 29.
         */

        String s2 = "Посмотрите как Рите нравится ритм";
        s2 = s2.toLowerCase();

        int index = s2.indexOf("рит");
        while (index != -1) {
            System.out.println(index);

            index = s2.indexOf("рит", index + 1);
        }

        /** Экстра задача
         * Дан массив:
         * необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
         */
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int count1 = 0;
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!array[i][j].contains("е")) {
                    count1 = count1 + 1;
                }
            }
        }
        System.out.println("Задача №4\n" + count1);

    }
}



































