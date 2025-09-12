package petle;

import java.util.Scanner;

public class PoprDan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 1 lub 3");
        int num = scanner.nextInt();

        while(num != 1 && num !=3){
            System.out.println("Nie umiesz czytać?");
            num = scanner.nextInt();
        }
        System.out.println("No nareszcie :)");

    }
}
