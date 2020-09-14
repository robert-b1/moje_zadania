package największaLiczbaWTalicy;

import java.util.Arrays;
import java.util.Collections;

public class NajwiększaLiczbaTablicy {


    public static void main(String[] args) {
        int[] tab = {54, 2, 30, 35, 65, 34, 5, 8, 23, 65, 4, 5, 6, 3, 59, 55, 3, 2, 54, 5, 5};

        //największa liczba tablicy
        System.out.println(Arrays.stream(tab).max().getAsInt());


        //największa liczba tablicy
        int max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        System.out.println(max);

//sortowanie na stałe tablicy i dwie nawiększe liczby w tablicy
        Arrays.sort(tab);
        int max1 = tab[tab.length - 1];
        int max2 = tab[tab.length - 2];
        System.out.println(max1 + " " + max2);

        //największa i najmniejsza liczba w tablicy
        int min = tab[0];
        System.out.println(min + " " + max1);
    }
}
