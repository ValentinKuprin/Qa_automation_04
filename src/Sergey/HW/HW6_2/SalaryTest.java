package Sergey.HW.HW6_2;

import java.util.Arrays;

public class SalaryTest {
    public static void main(String[] args) {


        Employee[] employees = new Employee[3];

        Employee Jhon = new Employee("Jhon Rich", 36, "Male", 23456.78);
        Employee Vik = new Employee("Vika Ram", 26, "Female", 45678.78);
        Employee Dir = new Employee("Dr Dir ", 19, "Male", 12345.78);


        employees[0] = Jhon;
        employees[1] = Vik;
        employees[2] = Dir;

        Employee[] e = { new Employee("Jhon Rich", 36, "Male", 21456.78),
                         new Employee("Vika Ram", 26, "Female", 43678.78),
                         new Employee("Dr Dir ", 19, "Male", 52345.78)};

        System.out.println(Arrays.deepToString(employees));

        Salary salary = new Salary();

       System.out.println("Sum salary = " + salary.getSum(employees));
       System.out.println("Sum salary = " + salary.getSum(e));






    }
}
