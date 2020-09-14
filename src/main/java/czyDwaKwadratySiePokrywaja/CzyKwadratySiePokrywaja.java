package czyDwaKwadratySiePokrywaja;

public class CzyKwadratySiePokrywaja {

    //tworzę statyczną klasę wewnętrz
    static class Punkt{
        int x,y;
    }

    //teraz metoda, która sprawdza wcześniejsze założenie
    //jako argumenty podaję wierzchołki przekątnych kwadratów
    static boolean czySiePokrywają(Punkt l1, Punkt r1, Punkt l2, Punkt r2){
        if (l1.x >= r2.x || l2.x >=r1.x){
            return false;
        }

        if (l1.y <=r2.y || l2.y <= r1.y){
            return false;
        }
        return true;
    }

    //tworzę obiekty i przypisuję im przykładowe wartości
    public static void main(String[] args) {
        Punkt l1 = new Punkt(), r1 = new Punkt(),
                l2 = new Punkt(), r2 = new Punkt();
        l1.x = 0;
        l1.y = 10;
        r1.x = 10;
        r1.y = 0;
        l2.x = 5;
        l2.y = 5;
        r2.x = 15;
        r2.y = 0;

        if (czySiePokrywają(l1, r1, l2, r2)){
            System.out.println("Kwadraty się pokrywają");
        }
        else{
            System.out.println("Kwadraty się nie pokrywają");
        }
    }
}
