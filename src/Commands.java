public class Commands {


    /**- коментирование (//)

    public static void main(Sting[] args) {}       (psvm / main)
        System.out.println(); - вывод в консоль    (sout)

    /n - перенос на другую сторону
    /t - 4 пробела (если есть 1 символ + 3 проб. и тд.)







Hot keys
Ctrl + Alt + l - выравнивание кода
Ctrl + Q - Описание функции
Ctrl + N - Вызвать конструктор
Shift + F6 - Refactor (изменить имя всех переменных);

Alt + Enter - импорт, ошибка, возможные варианты
     Alt + insert - Генератор кода


     Специальные команды
     Arrays.deepToString(b) - Распечатать многострочный массив.
     !array[i][j].contains("е") - Массив НЕ содержит букву "e" ("!"- НЕ)
     .toString - Преобразовать в строку
     .toLowerCase() - привести к строчному шрифту
     .toUpperCase() -

boolen   a.equals(b) - сравнить две переменные ()
         compare(int a, int b) (Сравнение (результат 1, 0, -1)
Short    Short.compare(a, b) - разность
[]       array.lenght - длинна массива
[]       Arrays.toString(переменная) - Содержание массива
[]       Arrays.asList
[]       Arrays.deepToString(переменная) - Содержание многомерного массива
String   String.valueOf();
String   str.replace ".", "слово" после точки добавить слово
String   str.charAt(i) - Обращение к элементу строки, возвращает символ по i-позиции
String   str.indexOf("!", _) - Поиск эллемента в строке (на какое позиции) _ - с какой позиции начать (опционально)
String   str.lastIndexOf(!, 2) Поиск эллемента в справа на лево (на какое позиции) начиная со 2 позиции
String   str.replace("!", "-") - Заменить одно значение на другое (! на -)
String   str.repite(i) - повторяет строку n - раз
String   str.lenght() - длинна строки
String   str.substring(1, 4) с какого по какой символ вывести Привет = рив
String   Character.toString('i' - 1); - Печать буквы а не значения символа из ASCII cod
String   str.compareTo(); - лексикографическое сравнение, сравнивает два string
пример arrayStr[0].compareTo(Character.toString(arrayChar[0])); если arrayStr[0] < Character.toString(arrayChar[0] - -1,
  если arrayStr[0] > Character.toString(arrayChar[0] - +1, если arrayStr[0] = Character.toString(arrayChar[0] - 0

     subtrack

String split - позволяет разбить строку на подстроки по определенному разделителю.
String[] split(String regex) Метод возвращает массив строк. Метод принимает строку regex в качестве параметра.

     a.getClass - Вывести класс переменной
numberInteger instanceof Integer (мы справшиваем этот клас такой то? и получаем ответ true or false)

Double.parseDouble(str1) - Double.parseDouble(str2)) - разность
(Double.valueOf(str1) - Double.valueOf(str2)) - разность




     MAth

     1+dice.nextInt(6) - Рандомное число 1+ (начинается от 5 и до (6))


     Округление                https://www.youtube.com/watch?v=s9s4uTxSBe4

     Math.floor(10,9) >> Округлит в меньшую сторону до 10.0, -10.9 округлит до -11.0  Тип данных Long, приведение типа (int) перед
     Math.ceil(10.1) - Округлит в большую сторону 11.0, (-10.6) до - 10.0
     Math.round(10.49 \ 10.5) - До 0.5 округлит в меньшую сторону, больше 0.5 в большую сторону -10.5 округлит до -10.
     Math.nextUP / .nextDown
     Math.rint(double a) - возвращает целое число, которое ближайшее по значению аргумента, другими словами — округляет дробь до целого.
     DecimalFormat( "#.###" ) - Строка #.### — это шаблон, который указывает, что мы форматируем передаваемое значение до 3 десятичных знаков.
     Чтобы изменить шаблон после создания объекта DecimalFormat, можно использовать его методы applyPattern и applyLocalizedPattern:

     Math.nextMP(d) - Округление после . - почитать


     Рандомное число            https://www.youtube.com/watch?v=0jTCfOHtYaQ
     ((int)(Math.random()*10)+ 10) - рандомное число от 0 до 1 можно *10 увеличить диапазон до 10-1=9, для целого числа привед. типов.
     + 10 -нижняя граница, верхняя 20-1=19, но если +857, то нижний будет 857, а верхний 866, если пустота и +0, то нижний диапазон =0.
     *10) -20 = от -20 до -11. Если известны границы, нужно посчитать верхняя граница - нижняя + 10...100 = 110-10+1=101 Диапазон от 10 до 0.1
     * -20....-11 -11-(-20)=9 + 1.
     * ((char)((int)(Math.random()*26)+ 65)) - Ранодомная буква от А до Z
     * int let = (int)(Math.random()*26+97 -> System.out.print((char)let) - Рандомная буква от a до z.
     *
     *  Математические операции             https://www.youtube.com/watch?v=rVRZT4RIsYk
     *  Math.sqrt() - Корень квадратный, возвращает double
     *  Math.abs(-8.5) - Абсолютное значение = 8.5 и дабл и инт
     *  Math.pow(5,6) - Возведение в степень 5 в степени 6 вернет double
     *  Math.fma(a b c) - (a+b)*c
     *  Math.max(int a, int b) - Максимальное значение, double and int, только 2 значения Math.max(int c (Math.max(int a, int b)) и тд.
     *  Math.min(int a, int b, ....) - Минимальное значение
     *  Math.PI - 3.141592653589793
     *  MAth.E - 2.718281828459045 Число Элера
     *
     *
     *




     Циклы
     for (int i = 0; i > 5; i = i + i){
     ef(i = 5)
     sout
     } else {
     sout
     }

     int i = 0;
     while (i > 5) {
     Sout
     i = i + 1
     }

     int i = 0;
     do {    - Выполнится хотя бы одно действие до условия !
     sout
     i = 1 + 1
     }

     Коды для печати текста разными цветами
     //    public static final String ANSI_RESET = "\u001B[0m";
     //    public static final String ANSI_BLACK = "\u001B[30m";
     //    public static final String ANSI_RED = "\u001B[31m";
     //    public static final String ANSI_GREEN = "\u001B[32m";
     //    public static final String ANSI_YELLOW = "\u001B[33m";
     //    public static final String ANSI_BLUE = "\u001B[34m";
     //    public static final String ANSI_PURPLE = "\u001B[35m";
     //    public static final String ANSI_CYAN = "\u001B[36m";
     //    public static final String ANSI_WHITE = "\u001B[37m";


     .split(" ")[0] - Разбить строку через пробил, записать в 0 индекс




















     */




}
