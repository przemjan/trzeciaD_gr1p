public class String_demo {
    public static void main(String[] args) {
        String name = "Franciszek";

        int dlugosc = name.length();

        char inicjal = name.charAt(1);
        System.out.println("Inicjal: " + inicjal);

        String duze, male;
        name = name.toUpperCase();
        male = name.toLowerCase();

        System.out.println(name);
    }
}
