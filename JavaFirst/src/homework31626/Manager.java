package homework31626;

public class Manager extends Employee {
    int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.println(name + " have a team of " + teamSize + " people");
    }

    public void printInformation(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Team size: " + teamSize);
    }
}
