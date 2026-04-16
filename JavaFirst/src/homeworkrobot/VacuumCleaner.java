package homeworkrobot;

public class VacuumCleaner implements Walker, Cleaner {

    @Override
    public void walk() {
        System.out.println("VacuumCleaner is walking");
    }

    @Override
    public void clean() {
        System.out.println("VacuumCleaner is cleaning");
    }
}
