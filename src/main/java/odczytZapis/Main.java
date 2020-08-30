package odczytZapis;

import java.io.*;

public class Main {
     String nazwaPlikuOdczyt;
     String nazwaPlikuZapis;
    public static String tekstDoZapisu;


    //metoda sprawdzająca czy plik istnieje

    public static boolean czyPlikIstnieje(String nazwaPlikuOdczyt) {
        File czyIstnieje = new File(nazwaPlikuOdczyt);
        return czyIstnieje.exists() && czyIstnieje.isFile();
    }

    //metoda do odczytu pliku lilia po linii
    public static void odczytLiniaPoLinii(String nazwaPlikuOdczyt) throws IOException {
        BufferedReader plikLiniowy = null;
        try {
            plikLiniowy = new BufferedReader(new FileReader(nazwaPlikuOdczyt));
            System.out.println("\n\nOdczyt linia po linii:\n");
            String linia = plikLiniowy.readLine();
            while (linia != null) {
                System.out.println(linia);
                linia = plikLiniowy.readLine();
            }
        } finally {
            if (plikLiniowy != null) {
                plikLiniowy.close();//zamknięcie pliku
            }
        }
    }

    //metoda do odczytu pliku znak po znaku
    public static void odczytZnakPoZnaku(String nazwaPlikuOdczyt) throws IOException {
        FileReader plikZPZ = null;
        try {
            plikZPZ = new FileReader(nazwaPlikuOdczyt);
            System.out.println("\n\nOdczyt pliku znak po znaku:\n");
            int znaki;
            //odczyt pliku znak po anaku i wyświetlenie na ekranie
            while ((znaki = plikZPZ.read()) != -1) {//jeśli znaki = -1 to znaczy koniec pliku
                System.out.println((char) znaki);
            }
        } finally {// klauzula finally służy do wykonania instrukcji
            // niezależnie od tego kiedy i w jaki sposób (normalnie lub
            // przez wyjątek) zostało zakończone wykonywanie bloku try
            if (plikZPZ != null) {
                plikZPZ.close();//zamknięcie pliku
            }
        }
    }

    //metoda do zapisu pliku przy pomocy FileWriter
    public static void zapisPliku(String nazwaPlikuZapis) throws IOException{
        FileWriter plikZapisz = null;
        try {
            // tworzy nowy plik jeżeli nie istnieje, w przeciwnym przypadku
            // usuwa zawartość pliku i nadpisuje od początku
            plikZapisz = new FileWriter(nazwaPlikuZapis);
            //zapis łańcucha
            plikZapisz.write(tekstDoZapisu);
            //zapis po znaku
            for (char znak = 'a'; znak <='z'; znak++){
                plikZapisz.write(znak);
                plikZapisz.write('\n');
            }
        }finally {
            if (plikZapisz != null){
                plikZapisz.close();
            }
        }
    }
    // metoda do zapisu przy użyciu klasy PrintWriter, która ma metody znane z
    // System.out
    public static void zapisPliku2(String nazwaPlikuZapis) throws IOException{
        PrintWriter plikZapisz = null;
        try {// true w konstruktorze FileWriter otwiera plik w trybie dopisywania
            // na końcu
            plikZapisz = new PrintWriter(new FileWriter(nazwaPlikuZapis, true));
            plikZapisz.println(tekstDoZapisu);
        }finally {
            if (plikZapisz != null){
                plikZapisz.close();
            }
        }
    }



}
