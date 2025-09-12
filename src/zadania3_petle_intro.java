import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class zadania3_petle_intro {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("zadanka.txt");
        String text= """
                    1. Napisz pętlę do sprawdzania poprawności danych wejściowych, która wyświetla
                prośbę o wpisanie liczby z przedziału od 10 do 24.
                2.  Napisz pętlę do sprawdzania poprawności danych wejściowych, która wyświetla
                prośbę o wpisanie litery 'T', 't', 'N' lub 'n'.
                3. Napisz pętlę do sprawdzania poprawności danych wejściowych, która wyświetla
                prośbę o wpisanie tekstu "Tak" lub "Nie".
                4. Napisz pętlę for, która wyświetla Twoje imię 10 razy.
                5. Napisz pętlę for, która wyświetla wszystkie liczby nieparzyste od 1 do 49.
                6. Napisz pętlę for, która wyświetla co piątą liczbę z przedziału od 0 do 100.
                7. Napisz pętlę for, która powtarza operacje siedem razy i za każdym powtórzeniem
                prosi użytkownika o wprowadzenie liczby. Pętla powinna obliczać sumę
                wprowadzonych wartości.	
                8. Napisz pętlę while, która umożliwia użytkownikowi wpisanie liczby. Tę liczbę
                należy pomnożyć przez 10 i zapisać wynik w zmiennej product. Pętla powinna
                wykonywać iteracje dopóty, dopóki wartość zmiennej product jest mniejsza
                niż 100.
                9. Napisz pętlę do-while, która wyświetla prośbę o wpisanie dwóch liczb. Program
                ma dodawać te liczby i wyświetlać ich sumę. W pętli należy wyświetlać
                użytkownikowi pytanie o to, czy ponownie wykonać opisaną operację.
                Po uzyskaniu twierdzącej odpowiedzi należy wykonać następną iterację pętli.
                W przeciwnym razie należy zakończyć pracę kodu.
                10. Napisz pętlę for wyświetlającą następujący zestaw liczb:
                0, 10, 20, 30, 40, 50 . . . 1000
                11. Napisz pętlę for, która wyświetla prośbę o podanie liczby. Pętla powinna
                wykonywać 10 iteracji i obliczać sumę bieżącą wprowadzanych wartości.
                12. Napisz pętlę for, która oblicza sumę następującego ciągu liczb:
                1/30 + 2/29 + 3/28+….+30/1=?
                13. Napisz pętlę zagnieżdżoną, która wyświetla 10 wierszy ze znakami '#'. W każdym
                wierszu należy wyświetlić 15 takich znaków.
                13. Napisz pętle zagnieżdżone wyświetlające następujący wzór:
                *******
                ******
                *****
                ****
                ***
                **
                *
                14. Napisz pętle zagnieżdżone wyświetlające taki oto wzór:
                ##
                #  #
                #    #
                #      #
                #        #
                #          # 
                """;
        pw.println(text);
        pw.close();
    }

}
