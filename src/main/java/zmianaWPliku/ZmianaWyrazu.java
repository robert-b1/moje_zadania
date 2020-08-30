package zmianaWPliku;

import java.io.*;

public class ZmianaWyrazu {
    private String txt;
    final private String stareSlowo, noweSlowo, wczytanyPlik, zapisanyPlik;

    public ZmianaWyrazu(String stareSlowo, String noweSlowo, String wczytanyPlik, String zapisanyPlik) throws IOException {
        this.stareSlowo = stareSlowo;
        this.noweSlowo = noweSlowo;
        this.wczytanyPlik = wczytanyPlik;
        this.zapisanyPlik = zapisanyPlik;
        zaladowacPlik();
        zapisacPlik();
    }

    private void zaladowacPlik() throws IOException {
        txt = "";
        BufferedReader br = null;
        String linie;
        try {
            br = new BufferedReader(new FileReader(wczytanyPlik));
            while ((linie = br.readLine()) != null) {
                txt = txt + linie.replace(stareSlowo, noweSlowo) + '\n';
            }
        } finally {
            if (br != null) {
                br.close();
            }
        }
    }

    private void zapisacPlik() throws IOException {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(zapisanyPlik));
            bw.write(txt);
        } finally {
            if (bw != null) {
                bw.close();
            }
        }
    }

    public static void main(String[] args) throws IOException {

        new ZmianaWyrazu("kota", "psa",
                "C:\\Users\\Lenovo\\Desktop\\nauka_java\\moje_zadania\\src\\main\\resources\\Zwierzaki.txt",
                "C:\\Users\\Lenovo\\Desktop\\nauka_java\\moje_zadania\\src\\main\\resources\\Zwierzaki2.txt");
    }

}
