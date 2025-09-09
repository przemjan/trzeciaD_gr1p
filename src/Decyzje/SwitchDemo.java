package Decyzje;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj odpowiedz (a,b,c)");
        String answer = scan.nextLine().toLowerCase();

        char litera = answer.charAt(0);
        int liczba = 5;
        String napis = " ";

        switch (liczba) {
            case 'a':

                System.out.println("Styczeń");
                //fallthrough

            case 'b':
                System.out.println("Luty");
                break;
            case 'c':
                System.out.println("Marzec");
                break;
            default:
                System.out.println("Nieoczekiwany błąd. Kod błędu nieznany");
                break;
        }
        System.out.println("Za chwilę dalszy ciąg programu...");
    }

}
