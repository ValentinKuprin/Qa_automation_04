package common;

public interface IBaseEmployee {

    public final static  String NAME = "Ivan";

    String getName();
    double getSalary();

    default void print(String str) {
        System.out.print(str);
    }

    static void println(String str) {
        System.out.println(str);
    }

}
