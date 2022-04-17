package Sergey.HW.Hw7_2;

/**
 * Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных.
 * Все поля сделать приватными и для каждого поля добавить методы set и get. Класс должен иметь метод -
 * getSalary(Month[] monthArray), метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
 * К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.
 */
public class Manage extends Employee {

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

    public double getSalary(Month[] monthArray) {
        double result = 0;
        for (int i = 0; i < monthArray.length; i++) {
             result += getSalary() * monthArray[i].getWorkDays()
                    + (getSalary() * monthArray[i].getWorkDays() / 100 * getNumberOfSubordinates());
        }
        return result;

    }
}

