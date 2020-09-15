package brakującaLiczbaWTabeli;

public class brakującaLiczbaWTabeli {
    public static void main(String[] args) {
        int[] tab = {0, 1, 2, 4, 5};
        int[] poprawnaTab = {0, 1, 2, 3, 4, 5};
        brakującaLiczbaWTabeli BLWT = new brakującaLiczbaWTabeli();
        System.out.println("Brakująca liczba to: "
                + BLWT.findMissing(tab));
    }

    public int findMissing(int[] tab) {
        int sumDobTab = (tab.length+1)*tab.length/2;//(n*(n+1))/2 - ten wzór się spradzi gdy tablica zaczyna się od 1
        int sumaTab =0;

        for (int element : tab){
            sumaTab += element;
        }
        return sumDobTab - sumaTab;
    }
}
