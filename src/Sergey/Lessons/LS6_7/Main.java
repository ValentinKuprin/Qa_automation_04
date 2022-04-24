package Sergey.Lessons.LS6_7;

public class Main {

    public static class  MainN { //нэсэд

    }
    public class  MainI {// инэр

    }

    public static void main(String[] args) {
        Main.MainN mn = new Main.MainN();


        Main m = new Main();
        Main.MainI mi = m.new MainI();

    }

    // public static final class() // нельзя изменить (или один раз в конструткоре) ссылаться в других классах нальзя. используется для констант
   // public abstract  class // поле абстрактным быть не может(класс и метод могут),
    // Если класс обстрактный то нельзя создать экземпляр эжтого класса (объект этого класс Employee e = new Emploee();)
    //Абстрактный метод - не имеет тело (public abstract double getSalary()) - нуже в будущем для перекрытия, добавляли реализацию у наследников.
    // Если класс помечен как обстрактный, и содержит абстрактный метод, то наследуемйы класс тоже должен быть абстрактным или в нем должнен быть перегружееный абстрактный метод
    //(public abstract double getSalary()) return getBaseSalary c телом метода

}
