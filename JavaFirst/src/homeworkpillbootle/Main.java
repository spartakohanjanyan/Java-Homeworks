package homeworkpillbootle;

public class Main {
    public static void main(String[] args) {

        PillBottle<Pill> bottle1 = new PillBottle<>();
        bottle1.pack(new Pill("Citramon"));

        PillBottle<Vitamin> bottle2 = new PillBottle<>();
        bottle2.pack(new Vitamin("Vitamin C"));

    }
}
