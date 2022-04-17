package Sergey.HW.Hw7_2;

/**
 * Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
 */
public class Month {

  private  String name;
  private  int days;
  private  int workDays;

    public Month(String name, int days, int workDays) {
        this.name = name;
        this.days = days;
        this.workDays = workDays;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }

    public int getWorkDays() {
        return workDays;
    }
}


