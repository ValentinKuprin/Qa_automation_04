package Sergey.HW.HW8;

import java.util.Arrays;

public class example_solution_to_cw_8_2 {

//1 Завершите метод, который принимает логическое значение и возвращает "Yes"строку для true, или "No"строку для false.
    // https://www.codewars.com/kata/53369039d7ab3ac506000467/train/java
//    public static String boolToWord(boolean b) {
//        if (b == true) {
//            return "Yes";
//        } else {
//            return "No";
//        }
//    }
//////////////////////////////////////////////////////////////////////////////////////
//  {
//    return b ? "Yes" : "No";
//  }
//
//}
//////////////////////////////////////////////////////////////////////////////////////
//2 Ваша задача — создать функцию, которая выполняет четыре основные математические операции.
//https://www.codewars.com/kata/57356c55867b9b7a60000bd7/train/java
//Функция должна принимать три аргумента - операция(строка/символ), значение1(число), значение2(число).
//Функция должна возвращать числовой результат после применения выбранной операции.
//    public static Integer basicMath(String op, int v1, int v2) {
//        int result = 0;
//        if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"));
//            if (op.equals("+")) {
//                result = v1 + v2;
//            }
//            if (op.equals("-")) {
//                result = v1 - v2;
//            }
//            if (op.equals("*")) {
//                result = v1 * v2;
//            }
//            if (op.equals("/")) {
//                result = v1 / v2;
//            }
//            return result;
//
//        }
////////////////////////////////////////////////////////////////////////////////////////////////
//  switch (op) {
//    case "-":
//      return v1 - v2;
//    case "+":
//      return v1 + v2;
//    case "*":
//      return v1 * v2;
//    case "/": {
//      if (v2 == 0)
//        throw new IllegalArgumentException("Division by zero");
//      return v1 / v2;
//    }
//    default:
//      throw new IllegalArgumentException("Unknown operation: " + op);
//    }
//  }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    switch (symbol){
//      case "+": return x+y;
//      case "-": return x-y;
//      case "*": return x*y;
//      case "/": return x/y;
//    }
//    return 0;
//  }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    return (op=="+") ? (v1+v2) : (op=="-") ? (v1-v2) : (op=="*") ? (v1*v2) : (v2==0) ? null : (v1/v2);
//
//  }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    int valor = 0;
//    if("+".equals(op)) valor = v1 + v2;
//    if("-".equals(op)) valor = v1 - v2;
//    if("*".equals(op)) valor = v1 * v2;
//    if("/".equals(op)) valor = v1 / v2;
//    return valor;
//  }
//////////////////////////////////////////////////////////////////////////////
//    return op.equals("+")?v1+v2:op.equals("-")?v1-v2:op.equals("*")?v1*v2:v1/v2;
//  }
///////////////////////////////////////////////////////////////////////////////////////
//    switch (op.charAt(0)) {
//      case '+':
//        return v1+v2;
//      case '-':
//        return v1-v2;
//      case '*':
//        return v1*v2;
//      case '/':
//        return v1/v2;
//      default:
//        return 0;
//    }
/////////////////////////////////////////////////////////////////////////////////////////////////////
//3 Создайте функцию, которая возвращает массив целых чисел от n до 1, где n>0. https://www.codewars.com/kata/5a00e05cc374cb34d100000d/train/java
//    public static int[] reverse(int n){
//        int[] array = new int[n];
//        if (n > 0) {
//            for (int i = 0; i < array.length; i ++) {
//                array[i] = n--;
//            }
//        }
//        return array;
//    }
////////////////////////////////////////////////////////////////////////////////////////////////////////
//4 Напишите функцию, которая разбивает строку и преобразует ее в массив слов.
//    https://www.codewars.com/kata/57e76bc428d6fbc2d500036d/train/java
//    public static String[] stringToArray(String s) {
//
//        String[] array = s.split(" ");
//        System.out.println(Arrays.toString(array));
//
//        return array;
//    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////
//    public static String[] stringToArray(String s) {
//        return s.split(" ");
//    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //      String[] arrSplit = s.split("\\s+");
    //      for (int i=0; i < arrSplit.length; i++)
    //      {
    //        System.out.print(arrSplit[i]);
    //      }
    //      return arrSplit;
    ////////////////////////////////////////////////////////////////////////
    //5 Программное обеспечение для распознавания символов широко используется для оцифровки печатных текстов.
    //// Таким образом, тексты можно редактировать, искать и сохранять на компьютере.
    ////Когда документы (особенно довольно старые, написанные на пишущей машинке) оцифровываются,
    //// программы распознавания символов часто допускают ошибки.
    ////Ваша задача - исправить ошибки в оцифрованном тексте. Вам нужно только исправить следующие ошибки:
    ////S неверно истолковывается как 5
    ////O неверно истолковывается как 0
    ////I неверно истолковывается как 1
    ////Тестовые случаи содержат числа только по ошибке.
    // https://www.codewars.com/kata/577bd026df78c19bca0002c0/train/java
    //     public static String correct(String string) {
    //
    //        for (int i = 0; i < string.length(); i ++) {
    //            if (string.charAt(i) == '5') {
    //                string = string.replace('5', 'S');
    //            } else if (string.charAt(i) == '0') {
    //                string = string.replace('0', 'O');
    //            } else if (string.charAt(i) == '1') {
    //                string = string.replace('1', 'I');
    //            }
    //
    //        }
    //        return string;
    //    }
    //////////////////////////////////////////////////////////////////////////////////
    //  public static String correct(String string) {
    //    return string.replace("5","S").replace("0", "O").replace("1","I");
    //  }
    //////////////////////////////////////////////////////////////////////////////////
    //    if(string ==null || string.isEmpty()) {
    //    return string;
    //    }
    //
    //    string = string.replace("1","I").replace("0","O").replace("5","S");
    //
    //    return string;
    //  }
    ////////////////////////////////////////////////////////////////////////////////////////
    //    return string.replaceAll("5","S")
    //                 .replaceAll("0","O")
    //                 .replaceAll("1","I");
    ///////////////////////////////////////////////////////////////////////////////////////
    //    public static String correct(String string) {
    //        StringBuilder result = new StringBuilder();
    //        for (char c : string.toCharArray()) {
    //            switch (c) {
    //                case '5':
    //                    result.append('S');
    //                    break;
    //                case '0':
    //                    result.append('O');
    //                    break;
    //                case '1':
    //                    result.append('I');
    //                    break;
    //                default:
    //                    result.append(c);
    //            }
    //        }
    //
    //        return result.toString();
    ////////////////////////////////////////////////////////////////////////////////////////////
    //    String[] stringLetters = string.split("");
    //    String answer = "";
    //
    //    for (String s : stringLetters) {
    //      if (s.equals("5"))
    //        answer += "S";
    //      else if (s.equals("0"))
    //        answer += "O";
    //      else if (s.equals("1"))
    //        answer += "I";
    //      else
    //        answer += s;
    //    }
    //
    //    return answer;
    //  }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    //        String result = new String(string);
    //        HashMap<String, String> replaceMap = new HashMap<>();
    //
    //        replaceMap.put("5", "S");
    //        replaceMap.put("0", "O");
    //        replaceMap.put("1", "I");
    //
    //        for (var entry : replaceMap.entrySet()) {
    //            result = result.replace(entry.getKey(), entry.getValue());
    //        }
    //
    //        return result;
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //    char[] sc = string.toCharArray();
    //    String s = "";
    //    for(char c:sc){
    //      if(c =='5'){
    //        s += 'S';
    //      }else if(c == '0'){
    //        s += 'O';
    //      }else if(c == '1'){
    //        s += 'I';
    //      }else{
    //        s += c;
    //      }
    //    }
    //    return s;
    //  }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //        String newString1 = string.replace("5", "S");
    //        String newString2 = newString1.replace("0", "O");
    //        String newString3 = newString2.replace("1", "I");
    //
    //        return newString3;
    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    //    string = string.replace('5','S');
    //    string = string.replace('0','O');
    //    string = string.replace('1','I');
    //    string.replace('5','S');
    //    string.replace('0','O');
    //    string.replace('1','I');
    //
    //    return string;
    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    //        String[] arr = str.split("");
    //
    //        for (int i = 0; i < arr.length; i++) {
    //            if(arr[i].equals("5")) {
    //                arr[i] = "S";
    //            } else if(arr[i].equals("0")) {
    //                arr[i] = "O";
    //            } else if(arr[i].equals("1")){
    //                arr[i] = "I";
    //            }
    //        }
    //        str = String.join("", arr);
    //        return str;
    //    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //    for (int i = 0; i < string.length(); i++) {
    //            if (string.charAt(i) == '0') {
    //                string = string.replace('0', 'O');
    //            }
    //            if (string.charAt(i) == '1') {
    //                string = string.replace('1', 'I');
    //            }
    //            if (string.charAt(i) == '5') {
    //                string = string.replace('5', 'S');
    //            }
    //        }
    //        return string;
    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    //        StringBuilder sb = new StringBuilder();
    //        for (int i = 0; i < string.length(); i++) {
    //            switch (string.charAt(i)) {
    //                case '5':
    //                    sb.append('S');
    //                    break;
    //                case '0':
    //                    sb.append('O');
    //                    break;
    //                case '1':
    //                    sb.append('I');
    //                    break;
    //                default:
    //                    sb.append(string.charAt(i));
    //            }
    //        }
    //        return sb.toString();
    //    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //    char[] result = string.toCharArray();
    //        for (int i = 0; i < result.length; i++){
    //            switch (result[i]){
    //                case '5':
    //                    result[i] = 'S';
    //                    break;
    //                case '0':
    //                    result[i] = 'O';
    //                    break;
    //                case '1':
    //                    result[i] = 'I';
    //                    break;
    //            }
    //        }
    //        return String.valueOf(result);
    //  }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //    String newstr = "";
    //        for (int i = 0; i < string.length(); i ++) {
    //            switch (String.valueOf(string.charAt(i))) {
    //                case "5":
    //                    newstr = newstr + "S";
    //                    break;
    //                case "0":
    //                    newstr = newstr + "O";
    //                    break;
    //                case "1":
    //                    newstr = newstr + "I";
    //                    break;
    //                default:
    //                    newstr = newstr + (String.valueOf(string.charAt(i)));
    //                    break;
    //            }
    //        }
    //        return newstr;
    ////////////////////////////////////////////////////////////////////////////////////////////////



    public static void main(String[] args) {

//        System.out.println(basicMath("+", 5, 7));
//        System.out.println(basicMath("-", 5, 7));
//        System.out.println(basicMath("*", 5, 7));//2
//        System.out.println(basicMath("/", 5, 7));
//
//
//        System.out.println(Arrays.toString(reverse(5)));// 3
//        System.out.println(stringToArray("I love you")); //4
//
//        System.out.println(correct("IF-RUDYARD KIPLING")); //5





    }
}
