package Sergey.HW.Hw7_1;

public class Manager extends Worker{

    int NumberOfSubordinates;

    public Manager(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name);
        NumberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return NumberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        NumberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        } else {
            return getBaseSalary() * getNumberOfSubordinates() / 100.0 * 3;
        }
    }
}

/**
    в классе, метод getSalary будет возвращать значение по формуле - <базовая ставка> *
        (<количество подчиненных> / 100 * 3). Если количество подчиненных 0, то результат как у обычного рабочего.
 */