package Sergey.Lessons;

import java.util.*;


public class Collections {
    public static void main(String[] args) {

        int[] arr = {1, 2, 30};

        ArrayList list = new ArrayList(); // тип Object - super Type родитель всех классов
        list.add("Sergey");
        list.add("Anna");
        list.set(0, "Ivan"); // Добавить Иван на 0 индекс

        List<String> str = new ArrayList<>(); // Интерфейс, ПРИМЕНЯЕМ когда не знаем размер массива, собираем данные в лист
        str.add("Sergey");
        str.add("Anna");
        str.set(0, "Ivan"); // Добавить Иван на 0 индекс

        Integer i = (Integer)list.get(0); // используется в крайних случаях, скорее всего делается чтото не то

        System.out.println(list.get(0)); // достать элемент листа
        System.out.println(list.contains("an"));
        System.out.println(list.indexOf(2));
        System.out.println(list.size()); // размер листа
        System.out.println(list.remove(0));  //удалить элемент листа по индексу (возвращает удаленное значение)
        System.out.println(list); // содержимое листа
        // Вопрос когда использовать массив когда лист ?

        // <E> - дженерик - времени исполнения (можно менять тип, не работает с примитивным типом, только Референс тайп)

        ArrayList<Integer> list1 = new ArrayList<Integer>(); // Лист Integerev, diamond assintacsis

        List<Integer> list3 = new ArrayList<>(); //Интерфейс
        // такая запись ошибочная (ArrayList<Integer> list1 = new ArrayList<Integer>();)
        // ДЛЯ LIST используется интерфейс List<Integer> list = new ArrayList<>();
        // Плюсы .get(index) - Быстрый доступ к нужному значению (константное время доступа) посчитать смещение, выигрывает по производительности
        // НЕДОСТАТОК - при добавлении нового элемента нужно пересоздавать массив

        List<String> list22 = new LinkedList<>(); // Связанный список, при добавлении нового значения "Anna"
        // мы добавляем еще один баккет Anna и в нем ссылка на сергея оставляем внутри, в следующем новом будет ссылка на Anna  и тд
        //Другими словами При добавлении  нового элемента указываем ссылку на предыдущего (ссылка - 2 поля значение пердыдущего и нех item = null)
        // Плюсы Быстрое добавление
        // НЕДЛОСТАТОК Для получения необходимого элемента нужно пройти по всему листу

        list22.add("Sergey");
        list22.add("Anna");
        list22.set(0, "Ivan"); // Добавить Иван на 0 индек

        for (String name : str) { // итарационная переменная типа который используется в списке (foreach)
            System.out.println(name); // принимает значение str на каждой итерации

            Set<String> set = new HashSet<>(); // Интерфейс,
            set.add("Sergey");
            set.add("Anna");
            System.out.println(set);
            System.out.println(set.contains("Ivan")); //
            // Сравнивает Хэшкод, возвращается одно число (сжатие с потерями) сжатие информации до числа, может совпадать
            // Мгновенный поиск, без перебора (Хэш код это адрес в Set адрес ячейки (одномерная координата) информация хранится в баккете)
            // Содержит только уникальное значение ! Двух одинаковых имен быть не может

            "Ivan".hashCode(); // Integer значение (представленное ввиде списка - (баккет) (теперь дерево) в конкретной ячейке),
            // если значения хэш  совпадут то,в списке перебором будет искать ножное значение (через equals)
            "Sergey".hashCode(); //

            Map<String, Integer> map = new HashMap<>(); // Интерфейс, близок к кэш сету, (Словарь)
            // алгоритм такой же, только ХэшМэп хранит пары: Ключ/Значение
            // ИСПОЛЬЗУЕМ когда нужны пары значений которые относятся друг к другу и быстрого многократного поиска!
            // Содержит только уникальное значение ! Двух одинаковых имен быть не может
            map.put("one", 1);
            map.put("two", 2);
            map.get("two"); // Вернет 2
            System.out.println(map.get("one"));

           // for (map.values() ){}  провериьт значение в map



        }


    }
}
