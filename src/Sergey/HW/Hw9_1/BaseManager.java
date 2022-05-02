package Sergey.HW.Hw9_1;

public abstract class BaseManager extends Worker{



    int NumberOfSubordinates;

    public BaseManager(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name);
        NumberOfSubordinates = numberOfSubordinates;
    }

    protected abstract int getIndex();

    public int getNumberOfSubordinates() {
        return NumberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        NumberOfSubordinates = numberOfSubordinates;
    }

    public double getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        } else {
            return getBaseSalary() * getNumberOfSubordinates() / 100.0 * getIndex();
        }
    }


}
