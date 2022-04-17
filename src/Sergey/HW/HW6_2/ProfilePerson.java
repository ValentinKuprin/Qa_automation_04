package Sergey.HW.HW6_2;

public class ProfilePerson {
    public static void main(String[] args) {

        Person person = new Person("Paladin",30, "Male");
        Person person1 = new Person ("Elfia", 25, "Femail");

        person.getName();
        person1.getName();
        person.printObject();
        person1.printObject();


        Employee employee = new Employee("Paladin",30, "Male", 15387.32);
        Employee employee1 = new Employee ("Elfia", 25, "Femail", 25789.35);
        Employee employee2 = new Employee ("Paladin", 45, "Mail", 33789.35);

        System.out.println(employee.isSameName(employee2));



    }
}
