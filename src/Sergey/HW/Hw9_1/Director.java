package Sergey.HW.Hw9_1;

public final class Director extends BaseManager {
    private static final int INDEX = 9;

    public Director(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }

    @Override
    public int getIndex() {
        return INDEX;
    }

}

