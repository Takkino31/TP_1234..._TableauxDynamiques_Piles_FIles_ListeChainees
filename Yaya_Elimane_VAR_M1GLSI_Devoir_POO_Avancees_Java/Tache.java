/**
 * Tache
 */
public class Tache {

    private int identifiant;
    private static int dernierId = 1;
    private String titre, etat;

    public Tache(String titre) {
        this.titre = titre;
        this.identifiant = dernierId++;
        this.etat = "PREVU";
    }

    public Tache(String titre, String etat) {
        this.titre = titre;
        this.identifiant = dernierId++;
        this.etat = etat;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        if (etat == "EN_COURS," || etat == "PREVU" || etat == "TERMINE") {
            this.etat = etat;
            System.out.println("Etat enregistré avec SUCCES");
        }
        System.err.println("Vous devriez fournir un des etats suivants : EN_COURS, TERMINE ou PREVU");
    }

    @Override
    public String toString() {
        return "Je suis la tache :" + this.identifiant + "\n" +
                "Mon titre est :" + this.titre + "\n" +
                "Je suis actuellement :" + this.etat + "\n";
    }
}