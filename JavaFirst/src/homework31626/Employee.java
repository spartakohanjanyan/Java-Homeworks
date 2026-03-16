package homework31626;

public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " is working");
    }
    public void printInformation(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
