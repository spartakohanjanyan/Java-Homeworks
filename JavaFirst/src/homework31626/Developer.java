package homework31626;

public class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(name + " is coding in " + programmingLanguage);
    }

    public void printInformation(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Programing language: " + programmingLanguage);
    }
}
