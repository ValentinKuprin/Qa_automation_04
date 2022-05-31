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


        List<Integer> numbers = new ArrayList<>();
        for (int i = 100; i < 1001; i++) {
            numbers.add(i);
        }

        Iterator<Integer> iterator = numbers.iterator(); // создаем итератор
        while (iterator.hasNext()) { //numbers.removeIf(item -> item % 2 == 0); лямбда метод
            int item = iterator.next(); //следующий итератор
            if (item % 2 == 0) { //
                iterator.remove();
            }
        }
        System.out.println(numbers);

        //set() - заменяет элемент под итератором
        //add() добавляет элемент после итератора

//        for (Integer integer : numbers) {
//            System.out.println(integer);
//        }



//        Iterator<Integer> iterator = numbers.iterator();
//        Integer nextInt = iterator.next();
//        // for (Integer integer : numbers) {
//        if (nextInt % 2 == 0){
//            nextInt.remove();
//        }
//
//        while (iterator.hasNext()) {
//            Integer nextNumber = iterator.next();
//            if (nextNumber % 2 == 0) {
//                numbers.remove(nextNumber);
//            }
//        }


//        for (Integer i = 0; i < numbers.size(); i++) {
//            if (numbers.get(i) % 2 == 0) {
//                numbers.remove(i);
//            }
//        }
//        System.out.print(numbers);


    }


}
