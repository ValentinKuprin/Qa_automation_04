package JavaForBeginner.Lesson;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Lesson9 {

    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "is";
        String str3 = "fun";
        String space = " ";

        char a = 'a';
        Character aa = 'a';
        Character aaa = new Character('a');
        System.out.println(a ==aa); // через == сравниваются примитивные типы
        System.out.println(aa.equals(aaa)); // через equals сравниваются референсные типы
        System.out.println(aa == aaa); // false тк ааа новый объект

        String strA = "a";
        //System.out.println(a == strA); разные


        System.out.println(str1 + space + str2 + space + str3);
        String str4 = str1 + space + str2 + space + str3;
        System.out.println(str4);
        System.out.println(str4.charAt(0));
        System.out.println(str4.charAt(4));
        //System.out.println(str1.charAt(4));//StringIndexOutOfBoundsException: String index out of range: 4

//        for (int i = 0; i <= 4; i++) {
//            System.out.println(str4.charAt(i)) ;
//        }
//        for (int i = 0; i < str4.length(); i++) {
//            if (str4.charAt(i) == 'a') {
//                System.out.println(str4.charAt(i)); // печатаем букву
//                System.out.println(i);//печатаем индекс
//            } else {
//                System.out.println("Letter is not a");
//            }
//        }
//
        for (int i = 0; i < str4.length(); i++) {
            if (str4.charAt(i) < 'i') {
                System.out.println(str4.charAt(i));
            } else {
                System.out.println(">= i");
            }

        }

        System.out.println(Character.toString('i' - 1));
        System.out.println('i' - 1);


// перевели строку в массив букв
        String[] arrayStr = new String[str4.length()];
        for (int i = 0; i < str4.length(); i++) {
            arrayStr[i] = Character.toString(str4.charAt(i));

        }
        System.out.println(Arrays.toString(arrayStr));


        System.out.println(str4.toCharArray()); //+ "- массив чаров, выглядит как обычная строка"
        System.out.println(Arrays.toString(str4.toCharArray()));




        char[] arrayChar = str4.toCharArray();
        System.out.println(arrayStr[0].equals(arrayChar[0]));
        System.out.println(arrayStr[0].compareTo(Character.toString(arrayChar[0]))); // лексикографическое сравнение, сравнивает два string

        System.out.println(str4.toLowerCase()); //строчные буквы
        System.out.println(str4.toUpperCase()); // Заглавные буквы
        String str5 = str4.toUpperCase();
        System.out.println(str4.compareToIgnoreCase(str5)); // 0 не учитывает регистр букв

    }
}
