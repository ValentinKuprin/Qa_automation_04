package Sergey.HW.HW6_2;

public class Employee {

    /**
     * Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
     * Класс должен иметь метод isSameName(Employee employee) который возвращает true, если у сотрудника у
     * которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.
     */

    String name;
    int age;
    String gender;
    double salary;

    public Employee(String name, int age, String gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    void printObject() {
        System.out.println();
    }

    boolean isSameName(Employee employee) {
        if (employee.name.equals(name)) {
        }
        return true;
    }
}
