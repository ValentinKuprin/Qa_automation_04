package Sergey.HW.Hw7_1;

public class Director extends Sergey.HW.Hw7_1.Manager {

    public Director(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }


    public double getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        } else {
            return getBaseSalary() * getNumberOfSubordinates() * 100.0 * 3;
        }
    }
}
