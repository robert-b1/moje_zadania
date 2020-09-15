package najczesciejWystepujacaLitera;

public class NajczesciejWystepujacaLitera {


    public static void main(String[] args) {
        String slowo = "hadAslfhuiArqhbAfbviqeiAfdbcAaeowwq";

        //rozwiązanie za pomocą pętli
        int[] licznik = new int[256];//może wystąpić 256 znaków więć taka duża tablica
        for (int i = 0; i < slowo.length(); i++) {
            //przeszukanie całego słowa w celu znalezienia
            // i policzenia wszystkich takich samych liter
            char litera = slowo.charAt(i);
            licznik[litera] += 1;
        }

        int maxlicznik = -1;
        char najwięcejLiter = 0;
        //porównanie w pętli których liter jest najwięcej
        for (char litera : slowo.toCharArray()) {
            if (licznik[litera] > maxlicznik) {
                maxlicznik = licznik[litera];
                najwięcejLiter = litera;
            }
        }
        System.out.println(najwięcejLiter);
        System.out.println(maxlicznik);
    }
}
