package Sergey.Lessons.LS6_7;
// Шаблон для создания персонажа

public class Person { // Объект
   private String name;
   private int age;
   private char gender;


    private Person friend;

    public Person() {
        this.friend = null;
    }

    public Person(String name, int age, char gender) { //конструктор
        this();
        this.name = name;
        this.age = age;
        this.gender = gender;
    }



    String getName() {
        if (gender == 'M') {
            return ("Mr." + name);
        } else {
            return ("Mrs." + name);
        }
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    void printObject() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
        //  System.out.println(getName());

    }




}
