package JavaForBeginner;

public class Person {

    public static void main(String[] args) {

        int yob = 1990;
        int year = 2022;

        System.out.println("Если человек родился в " + yob + " году, то его возраст " + (year - yob));
        yob = 1991;
        System.out.println("Если человек родился в " + yob + " году, то его возраст " + (year - yob));
    }


}
