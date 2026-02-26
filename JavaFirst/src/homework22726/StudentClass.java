package homework22726;

public class StudentClass {
    public static void main(String[] args){
        Student student1 = new Student("Arman", 18, 12);
        student1.displayInfo();
        student1.promote();
        student1.displayInfo();

        Student student2 = new Student("Anna", 16);
        student2.displayInfo();

    }
}

class Student {

    String name;
    int age;
    int grade;

    Student(String name1, int age1, int grade1) {
        name = name1;
        age = age1;
        grade = grade1;
    }

    Student(String name1, int age1) {
        name = name1;
        age = age1;
    }

    void promote() {
        grade++;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

}