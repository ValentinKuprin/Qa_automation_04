package JavaForBeginner.school;

public class Student {

    public static void main(String[] args) {

        String learner = "Вова Сидоров";
        int classroom = 5;
        int age = 10;

        String learner1 = "Маша Семенова";
        int classroom1 = 10;
        int age1 = 14;
        String line = "_______________";

        System.out.println(line);
        System.out.println("\tУченик\n" + classroom +"-го класса\n" + learner + ",\n" + "\t" + age + " лет");
        System.out.println(line);
        System.out.println("\tУченица\n" + classroom1 +"-го класса\n" + learner1 + ",\n" + "\t" + age1 + " лет");
        System.out.println(line);

    }
}
