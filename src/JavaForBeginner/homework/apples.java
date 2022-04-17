package JavaForBeginner.homework;

public class apples {

    public static void countApples(int apples, int students) {
        int resultApples;
        int mod = 0;
        if (apples / students == 0) {
            resultApples = apples / students;
        } else {
            resultApples = apples / students;
            mod = apples % students;
        } if (apples % 10 == 1 && apples % 100 != 11){
            String caseOne = " яблоко ";
        } else if (apples % 10 >= 2 && apples % 10 <= 4)

        System.out.println("Task15");
        System.out.println("Если " + apples + " яблок(а) поделить на " + students
                + " учеников, то каждый ученик получит по " + resultApples
                + " яблок(a), и " + mod + " яблок(а) останется учителю.");
    }

    public static void main(String[] args) {

    }

}
// 1 21 31 41 51 61 101 яблоко % 100
// 234 22-24 32-34 42-44 яблока %10 == >=2  <=4
// 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20  25-30 35-40  111 - яблок
