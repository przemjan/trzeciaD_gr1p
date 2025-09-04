import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int numerButa;

        System.out.println("POdaj numer buta:");
        numerButa = klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("Podaj srednią z majcy: ");
        double srednia = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.println("Podaj imię: ");
        String name = klawiatura.nextLine();

        System.out.println("Twój numer buta: " + numerButa +
                ", średnia: " + srednia + ", imię: " + name);
    }
}
