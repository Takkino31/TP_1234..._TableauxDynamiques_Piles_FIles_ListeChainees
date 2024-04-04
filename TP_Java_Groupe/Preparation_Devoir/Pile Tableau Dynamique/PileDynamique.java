/**
 * PileDynamique
 */
public class PileDynamique {

    // LIFO Dernier Arrivé Premier Servi ::::> BRAS LONG

    private Personne tableauPersonne[];
    private static final int TAILLE_MAX = 5;
    private int taille;

    public PileDynamique() {
        this.tableauPersonne = new Personne[TAILLE_MAX];
        this.taille = 0;
    }

    // Nombre d'elements
    public int length() {
        return this.taille;
    }

    // Capacité Tableau
    public int size() {
        return this.tableauPersonne.length;
    }

    public void empiler(Personne personne) {
        this.tableauPersonne[taille] = personne;
        this.taille++;
    }

    public Personne getPersonne(int index) {
        return this.tableauPersonne[index];
    }

    public Personne depiler() {
        int i = this.taille - 1;
        System.out.println("Yeksina  " + i);
        this.taille--;
        return this.tableauPersonne[i];
    }

}