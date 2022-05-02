package Sergey.HW.Hw9_2;

public class Person {

    public static void main(String[] args) {

        Employee employee = new Employee( "Petya", 32, 'M', 1200.0);

        Month[] months = {
                new Month("Jan", 31, 21),
                new Month("Jan", 31, 21)};

        System.out.println(employee.getSalary(months));





    }
}
