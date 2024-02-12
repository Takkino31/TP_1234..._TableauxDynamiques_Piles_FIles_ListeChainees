/**
 * ListeCirculaire
 */
public class ListeCirculaire {
    private int valeurElement;
    private ListeCirculaire suivant; 


    ListeCirculaire (int valeur, ListeCirculaire listeCirculaire){
        this.valeurElement = valeur;
        this.suivant = listeCirculaire;
    }

    // ListeCirculaire(int valeur){
    //     this.valeurElement = valeur;
    //     this.suivant = null;
    // }

    public int getValeurElement() {
        return valeurElement;
    }

    public void setValeurElement(int valeurElement) {
        this.valeurElement = valeurElement;
    }

    public ListeCirculaire getSuivant() {
        return suivant;
    }

    public void setSuivant(ListeCirculaire suivant) {
        this.suivant = suivant;
    }

}