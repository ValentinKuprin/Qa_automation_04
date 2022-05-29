package Sergey.HW;

import java.util.ArrayList;
import java.util.*;

public class Hw13 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("White");
        list.add("Tan");
        list.add("Yellow");
        list.add("Orange");
        list.add("Red");
        list.add("Pink");
        list.add("Purple");
        list.add("Blue");
        list.add("Blu");


        System.out.println(list.get(2));
        System.out.println(list.size());

        list.removeIf(str -> str.contains("l"));
        System.out.println(list);


//        List<Integer> numbers = new ArrayList<>();
//        for (int i = 100; i < 1001; i++) {
//            numbers.add(i);
//        }
//
//        for (Integer i = 0; i < numbers.size(); i++) {
//            if (numbers.get(i) % 2 == 0) {
//                numbers.remove(i);
//            }
//        }
//        System.out.print(numbers);


    }


}
