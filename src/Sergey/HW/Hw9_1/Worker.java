package Sergey.HW.Hw9_1;

import Sergey.HW.Hw7_1.Employee;


public class Worker extends Employee {


    public Worker(double baseSalary, String name) {
        super(baseSalary, name);
    }

    @Override
    public final double getBaseSalary() {
        return super.getBaseSalary();
    }

    @Override
    public  double getSalary() {
        return getBaseSalary();
    }

}
