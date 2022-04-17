package Sergey.HW.HW6_2;

public class Person {

    /**
     * Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод - getName,
     * метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.
     */

    String name;
    int age;
    String gender;

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void getName () {
        if (gender == "Male"){
            this.name = "Mr." + name;
        } else {
            this.name ="Mrs." + name;
        }
        System.out.println(this.name);


    }
    void printObject(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
    }


}
