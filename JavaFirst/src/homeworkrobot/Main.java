package homeworkrobot;

public class Main {

    public static void performMorningRoutine(Cleaner c, Talker t) {
        c.clean();
        t.speak();
    }

    public static void main(String[] args) {

        Android android = new Android();
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        Human human = new Human();

        performMorningRoutine(android, android);

        performMorningRoutine(vacuumCleaner, android);

        performMorningRoutine(android, human);
    }
}
