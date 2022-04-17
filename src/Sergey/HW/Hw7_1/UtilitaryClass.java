package Sergey.HW.Hw7_1;



public class UtilitaryClass {


    // поиск сотрудника в массиве по его имени
    public static Worker findWorkersByName(Worker[] workers, String name) {
        for (int i = 0; i < workers.length; i++) {
            if (name.equals(workers[i].getName())) {
                return workers[i];
            }
        }
        return null;
    }

    // поиск сотрудника в массиве по вхождению указанной строки в его имени

    public static Employee findBySubName(Employee[] employees, String subName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().contains(subName)) {
                return employees[i];
            }
        }
        return null;
    }

    // подсчет зарплатного бюджета для всех сотрудников в массиве

    public static double sumSalary(Worker[] workers) {
        int sum = 0;
        for (int i = 0; i < workers.length; i++) {
            sum += workers[i].getSalary();
        }
        return sum;
    }

    // поиск наименьшей зарплаты в массиве
    public static Worker minSalary(Worker[] workers) {
        Worker min = null;
        for(int i = 0; i < workers.length; i++)  {
            if (min == null || workers[i].getSalary() < min.getSalary()) {
                min = workers[i];
            }
        }
        return min;
    }

    // поиск наибольшей зарплаты в массиве

    public static Worker maxSalary (Worker[] workers) {
        Worker max = null;
        for (int i = 0; i < workers.length; i++) {
            if (max == null || max.getSalary() < workers[i].getSalary()) {
                max = workers[i];
            }
        }
        return max;
    }
    // поиск наименьшего количества подчиненных в массиве менеджеров

    public static Manager minNumberOfSubordinates(Manager[] manager) {
        Manager min = null;
        for (int i = 0; i < manager.length; i++) {
            if (min == null || manager[i].getNumberOfSubordinates() < min.getNumberOfSubordinates()) {
                min = manager[i];
            }
        }
        return  min;
    }

    // поиск наибольшего количества подчиненных в массиве менеджеров

    public static Manager maxNumberOfSubordinates(Manager[] manager) {
        Manager max = null;
        for (int i = 0; i < manager.length; i++) {
            if (max == null || manager[i].getNumberOfSubordinates() > max.getNumberOfSubordinates()) {
                max = manager[i];
            }
        }
        return max;
    }

    // поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров

    public static Manager maxDifferenceBetweenBaseSalaryAndSalary (Manager[] managers) {
        Manager max = null;
        for (int i = 0; i < managers.length; i++) {
            if (max == null || managers[i].getSalary() > max.getSalary()) {
                max = managers[i];
            }
        }
        return max;
    }

    // поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров

    public static Manager minDifferenceBetweenBaseSalaryAndSalary(Manager[] managers) {
        Manager min = null;
        for (int i = 0; i < managers.length; i++){
            if (min == null || min.getSalary() > managers[i].getSalary()) {
                min = managers[i];
            }
        }
        return min;
    }

}