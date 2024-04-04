/**
 * Affichage
 */
public class Affichage {

    public static void main(String[] args) {
        int n = 3, i = 1;
        System.out.println("Aficchage Normal");
        affichageNormale(i, n);
        System.out.println("ART");
        afficheTerminale(i, n);
        System.out.println("ARNT");
        afficheNonTerminale(n);

    }

    public static void affichageNormale(int i, int n) {
        for (int j = i; j <= n; j++) {
            System.out.println("La valeur de i dans l'affichage normale est : " + j);
        }
    }

    // Affichage Terminale ART
    // Affiche avant d'incrementer FILE FIFO

    public static void afficheTerminale(int i, int n) {
        if (i <= n) {
            System.out.println("La valeur de i dans l'affichage terminale est : " + i);
            afficheTerminale(i + 1, n);
            // if (i=2<=n=3) {
            // System.out.println("La valeur de i dans l'affichage terminale est : " + i);
            // afficheT(i + 1, n);
            // if (i=3<=n=3) {
            // System.out.println("La valeur de i dans l'affichage terminale est : " + i);
            // afficheT(i + 1, n);
            // if (i=4<=n=3) {
            // // ça ne repassera
            // // afficheT(i + 1, n);
            // }
            // }
            // }
        }
        // System.out.println("Jeex na");
        // INstruction 2
        // INstruction 3
        // INstruction 4
        // INstruction 5
    }

    // Affichage Non Terminale ART
    // Incremente avant d'Afficher LIFO Dernier Arrivé Premier Servi

    public static void afficheNonTerminale(int n) {
        if (n > 0) {
            afficheNonTerminale(n - 1);
            System.out.println("La valeur de i dans l'affichage non terminale est : " + n);
        }
    }
}