/**
 * FileDynamique
 */
// FIFO

// EstVide
// Ajouter
// Supprimer
// AjouterPosition
// SupprimerPosition
// SupprimerQueue
// SupprimerEntete
// AJouterTete
// SupprimerTete
// TailleListe

public class FileDynamique {
    private int[] fileTab;
    private static final int TAILLE_BLOC = 3;
    private int taille, sortie;

    // 1 SORTIE 0 1 2
    // 2
    // 4
    // 5 Entree 6
    // tab 0

    public FileDynamique() {
        this.fileTab = new int[TAILLE_BLOC];
        this.sortie = -1;
    }

    public void enfiler(int nombre) {
        if (this.taille == this.fileTab.length) {
            etendreLeTableau();
        }
        fileTab[taille] = nombre;
        taille++;
    }

    public int defiler() {
        sortie += 1;
        System.out.println("SORTIE = " + sortie);
        return fileTab[sortie];
    }

    public int length() {
        return this.taille;
    }

    public void etendreLeTableau() {
        int nouveauTableau[] = new int[this.fileTab.length + TAILLE_BLOC];
        for (int index = 0; index < this.fileTab.length; index++) {
            nouveauTableau[index] = this.fileTab[index];
        }
        this.fileTab = nouveauTableau;
    }
}