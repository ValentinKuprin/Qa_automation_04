package Sergey.HW.Hw7_1;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Worker[] workers = new Worker[10];
            Worker worker = new Worker(1100, "Sergey");
            Worker worker1 = new Worker(1200, "Grisha");
            Worker worker2 = new Worker(1300, "Misha");
            Worker worker3 = new Worker(1400, "Vasya");
            Worker worker4 = new Worker(1500, "Dima");
            Worker worker5 = new Worker(1600, "Vitya");
            Worker worker6 = new Worker(1700, "Anton");
            Worker worker7 = new Worker(1800, "Sasha");
            Worker worker8 = new Worker(1900, "Roma");
            Worker worker9 = new Worker(2000, "Nikita");

        workers[0] = worker;
        workers[1] = worker1;
        workers[2] = worker2;
        workers[3] = worker3;
        workers[4] = worker4;
        workers[5] = worker5;
        workers[6] = worker6;
        workers[7] = worker7;
        workers[8] = worker8;
        workers[9] = worker9;


        Manager [] manager = {
                                new Manager(1200, "Anna", 45),
                                new Manager(1300, "Masha", 30),
                                new Manager(1000, "Irina", 0),
                                new Manager(1300, "Ira", 20)};


        Director director = new Director(2000, "Temofei", 3);


        System.out.println(UtilitaryClass.findWorkersByName(workers, "Sasha").getName());
        System.out.println(UtilitaryClass.findBySubName(workers, "on").getName());
        System.out.println(UtilitaryClass.sumSalary(workers));
        System.out.println(UtilitaryClass.minSalary(workers).getSalary());
        System.out.println(UtilitaryClass.maxSalary(workers).getSalary());
        System.out.println(UtilitaryClass.maxSalary(workers).getName());
        System.out.println(UtilitaryClass.minNumberOfSubordinates(manager).getName());
        System.out.println(UtilitaryClass.maxNumberOfSubordinates(manager).getName());
        System.out.println(UtilitaryClass.maxDifferenceBetweenBaseSalaryAndSalary(manager).getSalary());
        System.out.println(UtilitaryClass.minDifferenceBetweenBaseSalaryAndSalary(manager).getSalary());





    }







}
