package JavaForBeginner.homework.Hw10;
// написать алгоритм CapitalizeWords, который принимает на вход предложения с единичным пробелом между словами,
// и возвращает предложение, в котором все слова написаны с большой буквы
// "   happy birthday!    " --> "Happy Birthday!"
// "   john jacob smith jr." --> "John Jacob Smith Jr."

import java.sql.SQLOutput;

public class Hw10 {

    public static String capitalizeWords(String sentence) {
        if (sentence != null) {
            sentence = sentence.trim();

            if (sentence.length() != 0) {
                sentence = sentence.substring(0, 1).toUpperCase() + sentence.substring(1);

                for (int i = 1; i < sentence.length(); i++) {
                    if (sentence.charAt(i) == ' ') {
                        sentence = sentence.substring(0, i + 1)
                                + sentence.substring(i + 1, i + 2).toUpperCase() + sentence.substring(i + 2);
                    }
                }

                return sentence;
            }

            return "длина 0";
        }

        return "null";
    }

    public static void main(String[] args) {
        System.out.println(capitalizeWords(" "));
        System.out.println(capitalizeWords(null));
        // System.out.println(capitalizeWords("   john jacob smith jr."));
        // System.out.println(capitalizeWords(""));
        // System.out.println(capitalizeWords("   happy birthday!    "));




    }
}
