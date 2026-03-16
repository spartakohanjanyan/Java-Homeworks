package homework31626;

public class Student extends Human {
    int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}
