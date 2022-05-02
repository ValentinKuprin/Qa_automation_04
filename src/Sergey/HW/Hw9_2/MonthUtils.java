package Sergey.HW.Hw9_2;

public class MonthUtils {

    // public static final Month[] MOUNTH_ARRAY = {
    private static final Month January = new Month("January", 31, 21);
    private static final Month February = new Month("February", 28, 20);
    private static final Month March = new Month("March", 31, 23);
    private static final Month April = new Month("April", 30, 22);
    private static final Month May = new Month("May", 31, 21);
    private static final Month June = new Month("June", 30, 22);
    private static final Month July = new Month("July", 31, 22);
    private static final Month August = new Month("August", 31, 22);
    private static final Month September = new Month("September", 30, 22);
    private static final Month October = new Month("October", 31, 21);
    private static final Month November = new Month("November", 30, 22);
    private static final Month December = new Month("December", 31, 23);

    public static final Month[] MOUNTH_ARRAY = {
            January, February, March, April, May, June, July, August, September, October, November, December
    };

    public static final Month[] Q1 = {
            January , February , March
    };




  //  public static Month[] getMonth() {
  //      return MOUNTH_ARRAY;
  //  }

    public static Month[] getQ1() {
        return Q1;
    }

    public static Month getMonth (int index) { // Конкретный месяц
        return MOUNTH_ARRAY[index];
    }
    public static int sizeMonthArray() { //Узнаем длинну массива
        return MOUNTH_ARRAY.length;
    }



    public static Month[]  getArray_() { // Возвращает новый массив каждый раз
        return new Month[] {
                new Month("January", 31, 21),
                new Month("February", 28, 20),
                new Month("March", 31, 23),
                new Month("April", 30, 22),
                new Month("May", 31, 21),
                new Month("June", 30, 22),
                new Month("July", 31, 22),
                new Month("August", 31, 22),
                new Month("September", 30, 22),
                new Month("October", 31, 21),
                new Month("November", 30, 22),
                new Month("December", 31, 23)};
    }







}
