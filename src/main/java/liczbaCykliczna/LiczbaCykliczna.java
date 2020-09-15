package liczbaCykliczna;

import java.math.BigInteger;

public class LiczbaCykliczna {

    //wiem co to jest liczba cykliczna i mniej więcej wiem o co tu chodzi
    //ale nie wszystko jest tu dla mnie jasne 
    public boolean czyJestCykliczna(String number){
        String[] permutations = new String[number.length()];

        for (int index = 0; index < permutations.length; index++){
            permutations[index] = number.substring(index) + number.substring(0, index);
        }

        BigInteger value = new BigInteger(number);
        String formatString = "%0" + number.length() + "d";

        outerLoop: for (int multiplicator = 2; multiplicator <= number.length(); multiplicator++) {
            BigInteger multiplication = value.multiply(BigInteger.valueOf(multiplicator));
            String formattedResult = String.format(formatString, multiplication);
            for (String permutation : permutations) {
                if (formattedResult.equals(permutation)) {
                    continue outerLoop;
                }
            }
            return false;
        }

        return true;
    }
}
