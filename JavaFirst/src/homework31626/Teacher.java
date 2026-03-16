package homework31626;

public class Teacher extends Human{
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}
