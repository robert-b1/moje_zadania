package rysowanieKwadratu;

import java.util.Scanner;

public class kwadratIPrzekątne {

    public static void main(String[] args) {
        kwadratIPrzekątne wynik = new kwadratIPrzekątne();
        System.out.println(wynik.kwardatZPrzekątnymi('*', 10));
    }

    public String kwardatZPrzekątnymi(char sign, int size) {
        //StringBuilder jest zdecydowanie szybszy, od zastępnowania Stringów, co się dzieje przy każdorazowej
        // konkatenacji.
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                // i == 0 oraz i == size - 1, to poziome kreski
                // j == 0 lewa, pionowa kreski
                // j == size - 1 prawej, pionowej kreski nie ma, żeby nie było spacji na końcu. Brakujący znak jest
                // przed nową linią.
                // i == j oraz i + j == size - 1, to przekątne.
                if (i == 0 || i == size - 1 || j == 0 || i == j || i + j == size - 1) {
                    sb.append(sign + " ");
                } else sb.append("  ");
            }
            //znak prawej, pionowej kreski + nowa linia.
            sb.append(sign + "\n");
        }
        return sb.toString();
    }


}

