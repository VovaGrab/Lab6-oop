import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> colectie = new HashSet<>();


        colectie.add("element1");
        colectie.add("element2");
        colectie.add("element3");


        boolean rezultat = colectie.add("element1");

        if (!rezultat) {
            System.out.println("Eroare: Elementul există deja în colecție!");
        }


        System.out.println("Colecția: " + colectie);
    }
}
