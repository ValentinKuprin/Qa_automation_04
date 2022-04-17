package Sergey.HW.Hw7_2;

public class MonthUtils {

    /**
     * Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы
     * для использования (объекты класса Month).
     */

    public static Month[] MOUNTH_ARRAY = {
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
            new Month("December", 31, 23),
    };

  //  public static Month[] getMonth() {
  //      return MOUNTH_ARRAY;
  //  }

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
