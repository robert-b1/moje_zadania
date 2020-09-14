import java.util.Arrays;
import java.util.Map;

public class CzyJestAnagramem {

    public static void main(String[] args) {

        CzyJestAnagramem czyJestAnagramem = new CzyJestAnagramem();
        System.out.println(czyJestAnagramem.czyAnagram("mama", "amma"));

        System.out.println(czyJestAnagramem.czyAnagram2("mama", "amma"));

    }

    //dla mnie najprostrzy sposób na sprawdzenie czy wyrazy są anagramami
    public boolean czyAnagram(String slowo1, String slowo2){

        //tworzenie dwów stringBuilderów
        StringBuilder stb1 = new StringBuilder();
        StringBuilder stb2 = new StringBuilder();

        //sprawdzenie na wstępie czy dwa wyrazy mają te same długości
        if (slowo1.length() != slowo2.length())
            return false;

        //tworzenie dwóch tablic liter, z których składją się wyzazy
        //i zamienienie wszystkich liter w wyrazach na małe
        char arr1[] = slowo1.toLowerCase().toCharArray();
        char arr2[] = slowo2.toLowerCase().toCharArray();
        //sortowanie w kolejności liter
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //przy pomocy foreach zapisywanie w poszczególne StringBuidery
        //posortowanych wcześniej liter wyrazów
        for (char znak : arr1){
            stb1.append(znak);
        }

        for (char znak : arr2){
            stb2.append(znak);
        }

        System.out.println(stb1.toString());
        System.out.println(stb2.toString());

        if (stb1.toString().equals(stb2.toString()))
            return true;
        else
            return false;
    }

    //-----------------------------------------------------------------//

    //następnym przykład z rozwiązaniem wykożystujący stream super krótkie
    static boolean czyAnagram2(CharSequence slowo1, CharSequence slowo2){
        System.out.println("Czy słowa: " + slowo1 +" i " + slowo2 + " to anagramy");
        return Arrays.equals(slowo1.codePoints().sorted().toArray(),
                slowo2.codePoints().sorted().toArray());
    }

}
