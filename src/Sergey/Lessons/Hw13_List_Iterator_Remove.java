package Sergey.Lessons;

import java.util.ArrayList;
import java.util.Iterator;


public class Hw13_List_Iterator_Remove {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
// List - интерфейс, реализован в классе ArrrayList, интерфейс реализуется в объекте,
// поэтому создаем объект классa ArrayList и записываем в переменную list Типа List

        list.add("White.");
        list.add("Tan.");
        list.add("Yellow.");
        list.add("Orange.");
        list.add("Red.");
        list.add("Pink.");
        list.add("Purple.");
        list.add("Blue.");
        list.add("Blu.");

//  или Правильное исполнение в Java
        Iterator<String> iterator = list.iterator(); // получаем из List
        while (iterator.hasNext()) // Возвращает метод true or false
            if (iterator.next().contains("l")) { // Возвращает следующее значение
                iterator.remove(); //ремув удаляет предыдущее значение, которое стоит перед next
            }
        System.out.println(iterator.next());

// классическое исполнение
        for (int i = list.size()-1; i >= 0 ; i--) {
            if (list.get(i).contains("l"));{
                list.remove(i);
            }
        }
        System.out.println(list);

// или (1) или            (2)  list.removeIf(str -> str.contains("l")); стрелочная функция или лямда выражение

//        for (int i = list.size(); i-- > 0;) {
//            if (list.get(i).contains("l")) {
//                list.remove(i);
//            }
//        }


        List<Integer> numbers = new ArrayList<>();
        for (int i = 100; i < 1001; i++) {
            numbers.add(i);
        }

        Iterator<Integer> iterator1 = numbers.iterator(); // создаем итератор
        while (iterator.hasNext()) { //numbers.removeIf(item -> item % 2 == 0); лямбда метод
            int item = iterator1.next(); //следующий итератор
            if (item % 2 == 0) { //
                iterator1.remove(); // удаление по значению
            }
        }
        System.out.println(numbers);

// Классический вид
//        for (int i = numbers.size(); i-- > 0;) {
//            if (numbers.get(i) % 2 == 0) {
//                list.remove(i); //удаление по индексу
//            }
//        }

        //set() - заменяет элемент под итератором
        //add() добавляет элемент после итератора

//        for (Integer integer : numbers) {
//            System.out.println(integer);
//        }


//        for (Integer i = 0; i < numbers.size(); i++) {
//            if (numbers.get(i) % 2 == 0) {
//                numbers.remove(i.intValue());
//            }
//        }
//        System.out.print(numbers);
    }
}
