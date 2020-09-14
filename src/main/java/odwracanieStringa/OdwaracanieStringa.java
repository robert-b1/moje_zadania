package odwracanieStringa;

public class OdwaracanieStringa {

    public static void main(String[] args) {
        String text = "Ala ma kota";
        String newText = new StringBuilder(text).reverse().toString();
        System.out.println(newText);
    }
}
