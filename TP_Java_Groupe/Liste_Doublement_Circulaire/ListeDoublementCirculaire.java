/**
 * ListeDoublementCirculaire
 */
public class ListeDoublementCirculaire {

    private int valeur;

    ListeDoublementCirculaire suivant, precedent;

    ListeDoublementCirculaire(int valeur){
        this.valeur = valeur;
        this.suivant = this.precedent = null;
    }

    public int getValeur() {
        // if ...
        return valeur;
    }

    public void setValeur(int valeur) {
        // if ...
        this.valeur = valeur;
    }

    public ListeDoublementCirculaire getPrecedent() {
        return precedent;
    }

    public void setPrecedent(ListeDoublementCirculaire precedent) {
        this.precedent = precedent;
    }

    public ListeDoublementCirculaire getSuivant() {
        return suivant;
    }

    public void setSuivant(ListeDoublementCirculaire suivant) {
        this.suivant = suivant;
    }
    
}