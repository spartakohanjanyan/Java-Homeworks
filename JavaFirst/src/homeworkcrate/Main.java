package homeworkcrate;

class Main {
    public static void main(String[] args) {

        Crate<String> stringCrate = new Crate<>();
        stringCrate.pack("car");
        System.out.println(stringCrate.unpack());

        Crate<Integer> intCrate = new Crate<>();
        intCrate.pack(14323);
        System.out.println(intCrate.unpack());
    }
}