/**
 * TableauDynamique
 */
public class TableauDynamique {

    private Personne tableauPersonne[];
    private static final int TAILLE_MAX = 5;
    private int taille;

    public TableauDynamique() {
        this.tableauPersonne = new Personne[TAILLE_MAX];
        this.taille = 0;
    }

    // Nombre d'elements
    public int length() {
        return this.taille;
    }

    public void ajouterPersonne(Personne personne) {
        if (this.tableauPersonne.length == length()) {
            this.etendreTableau();
        }
        System.out.println("Taille " + this.taille);
        this.tableauPersonne[this.taille] = personne;
        this.taille++;
        // return true;
    }

    public Personne getPersonne(int index) {
        return tableauPersonne[index];
    }

    public void etendreTableau() {
        Personne nouveauTableau[] = new Personne[this.size() + TAILLE_MAX];
        for (int i = 0; i < this.tableauPersonne.length; i++) {
            nouveauTableau[i] = this.tableauPersonne[i];
        }
        System.out.println("Etendue ... la taille est " + this.size());
        // Renommage du nouveau tableau en tableauPersonne
        this.tableauPersonne = nouveauTableau;
    }

    // Capacité Tableau
    public int size() {
        return this.tableauPersonne.length;
    }

    public boolean supprimerPersonne(int index) {
        if (index <= length()) {
            System.out.println("Suppression ... de l'element ");
            for (int i = index; i < this.tableauPersonne.length - 1; i++) {
                this.tableauPersonne[i] = this.tableauPersonne[i + 1];
            }
            this.taille--;
            return true;
        }
        return false;
    }
}