package Sergey.HW.HW8;


import java.util.Arrays;

public class Hw8_2 {
//1 Завершите метод, который принимает логическое значение и возвращает "Yes"строку для true, или "No"строку для false.
    public static String boolToWord(boolean b) {
        if (b == true) {
            return "Yes";
        } else {
            return "No";
        }
    }
//2 Ваша задача — создать функцию, которая выполняет четыре основные математические операции.
//Функция должна принимать три аргумента - операция(строка/символ), значение1(число), значение2(число).
//Функция должна возвращать числовой результат после применения выбранной операции.

    public static Integer basicMath(String op, int v1, int v2) {
        int result = 0;
        if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"));
            if (op.equals("+")) {
                result = v1 + v2;
            }
            if (op.equals("-")) {
                result = v1 - v2;
            }
            if (op.equals("*")) {
                result = v1 * v2;
            }
            if (op.equals("/")) {
                result = v1 / v2;
            }
            return result;
        }//2
//3 Создайте функцию, которая возвращает массив целых чисел от n до 1, где n>0.

    public static int[] reverse(int n){
        int[] array = new int[n];
        if (n > 0) {
            for (int i = 0; i < array.length; i ++) {
                array[i] = n--;
            }
        }
        return array;
    }//3

//4 Напишите функцию, которая разбивает строку и преобразует ее в массив слов.

    public static String[] stringToArray(String s) {

        String[] array = s.split(" ");
        System.out.println(Arrays.toString(array));

        return array;
    }//4

//5 Программное обеспечение для распознавания символов широко используется для оцифровки печатных текстов.
// Таким образом, тексты можно редактировать, искать и сохранять на компьютере.
//Когда документы (особенно довольно старые, написанные на пишущей машинке) оцифровываются,
// программы распознавания символов часто допускают ошибки.
//Ваша задача - исправить ошибки в оцифрованном тексте. Вам нужно только исправить следующие ошибки:
//S неверно истолковывается как 5
//O неверно истолковывается как 0
//I неверно истолковывается как 1
//Тестовые случаи содержат числа только по ошибке.

    public static String correct(String string) {

        for (int i = 0; i < string.length(); i ++) {
            if (string.charAt(i) == '5') {
                string = string.replace('5', 'S');
            } else if (string.charAt(i) == '0') {
                string = string.replace('0', 'O');
            } else if (string.charAt(i) == '1') {
                string = string.replace('1', 'I');
            }

        }
        return string;
    }//5

    public static void main(String[] args) {

        System.out.println(basicMath("+", 5, 7));
        System.out.println(basicMath("-", 5, 7));
        System.out.println(basicMath("*", 5, 7));
        System.out.println(basicMath("/", 5, 7)); //2


        System.out.println(Arrays.toString(reverse(5))); //3

        System.out.println(stringToArray("I love you")); //4

        System.out.println(correct("IF-RUDYARD KIPLING")); //5

        System.out.println(correct("ERNEST HEMINGWAY - THE OLD MAN AND THE SEA"));
        System.out.println(correct("ERNEST HEMINGWAY - FOR WHOM THE BELL TOLLS"));
        System.out.println(correct("ERNEST HEMINGWAY - A FARWELL TO ARMS"));
        System.out.println(correct("STEPHEN HAWKING - THE UNIVERSE IN A NUTSHELL"));
        System.out.println(correct("STEPHEN HAWKING - A BRIEF HISTORY OF TIME"));
        System.out.println(correct("RICHARD P. FEYNMAN - STATISTICAL MECHANICS"));
        System.out.println(correct("RICHARD P. FEYNMAN - THE FEYNMAN LECTURES ON PHYSICS"));
        System.out.println(correct("ROBERT MERLE - THE DAY OF THE DOLPHIN"));












    }
}
