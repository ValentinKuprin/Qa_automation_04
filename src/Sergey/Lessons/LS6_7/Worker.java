package Sergey.Lessons.LS6_7;

public class Worker extends  Person{

        private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Worker() {
        super(null, 0, (char) '0');
    }

    public Worker(String name, int age, char gender, int salary) {
        super(name, age, gender);
        this.salary = salary;
    }
}
