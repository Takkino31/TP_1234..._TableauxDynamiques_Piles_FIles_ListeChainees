/**
 * Tableau2
 */
public class Tableau2 {

    public static void main(String[] args) {
        int[] t = { 10, 20, 30, 40 };
        int n = t.length;
        int  i = n-1;
        System.out.println("Affichage en Terminal");
        affichageInverseTerminal(i, t);
        System.out.println();
        System.out.println("Affichage en Non Terminal");
        
    }

    public static void affichageInverseTerminal(int i, int[] t) {
        if (i>=0) {
            System.out.println(" "+ t[i]);
            affichageInverseTerminal( i-1, t);
        }
    }
}