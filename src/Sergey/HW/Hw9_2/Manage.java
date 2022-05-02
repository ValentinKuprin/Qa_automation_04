package Sergey.HW.Hw9_2;


public final class Manage extends BaseEmployee {

    private int NumberOfSubordinates;

    public Manage(String name, int age, char gender, double salary, int numberOfSubordinates) {
        super(name, age, gender, salary);
        NumberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return NumberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        NumberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary(Month[] monthArray) {
        return super.getSalary(monthArray) * (1.0 + getNumberOfSubordinates() / 100);
    }
}

