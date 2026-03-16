package homework31626;

public class MainHuman {
    public static void main(String[] args) {

        Student student = new Student("Hamo", 20, 3);
        Teacher teacher = new Teacher("Barxudaryan", 40, "Math");

        student.displayInfo();
        teacher.displayInfo();
    }
}
