package Sergey.Lessons;

import java.util.ArrayList;

public class List {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        System.out.println(arrayList);

        arrayList.add(1, "c");

        arrayList.remove(2);
        arrayList.size();

        arrayList.set(1, "B");
        System.out.println(arrayList.contains("B"));
        System.out.println(arrayList.indexOf("b"));

        int a = (int) arrayList.get(3);


        ArrayList<Integer> arr3 = new ArrayList<>(4);
        arr3.add(2);
        arr3.add(23);
        arr3.add(24);


        for (int i = 0; i < arr3.size(); i++) {
            System.out.println(arr3.get(i));
        }

        for(int number : arr3) {
            System.out.println(number);
        }


    }
}
