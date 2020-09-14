package przecinajaceLinie;

import java.awt.geom.Line2D;

public class CzyLinieSiePrzecinaja {

    public static void main(String[] args) {


        //używamy biblioteki geometrycznej Lined2D
        Line2D linia1 = new Line2D.Float(100, 100, 200, 200);
        Line2D linia2 = new Line2D.Float(150, 150, 150, 200);

        boolean wynik = linia2.intersectsLine(linia1);
        System.out.println(wynik);

        //Lub jeszcze krócej można to zapisać
        System.out.println(Line2D.linesIntersect(100, 100, 200, 200, 150, 150, 150,200));

    }
}