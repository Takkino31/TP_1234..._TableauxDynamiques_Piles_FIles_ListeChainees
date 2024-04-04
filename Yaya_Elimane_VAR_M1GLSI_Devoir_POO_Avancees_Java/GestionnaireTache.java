/**
 * GestionnaireTache
 */
public class GestionnaireTache {

    private Tache[] taches;
    private int nombreTaches;

    public GestionnaireTache(int nombreMax) {
        this.nombreTaches = 0;
        this.taches = new Tache[nombreMax];
    }

    public boolean ajouter(Tache tache) {
        if (nombreTaches == this.taches.length) {
            return false;
        }
        this.taches[++nombreTaches] = tache;
        System.out.println("Le nombre de tache est :" + this.nombreTaches);
        return true;
    }

    public Tache getTacheByIdTache(int identifiant) {
        for (int i = 0; i < taches.length; i++) {
            if (taches[i].getIdentifiant() == identifiant) {
                return taches[i];
            }
        }
        return null;
    }

    public boolean modifier(Tache tache) {
        for (Tache t : taches) {
            if (t.getIdentifiant() == tache.getIdentifiant()) {
                t.setTitre(tache.getTitre());
                t.setEtat(tache.getEtat());
                return true;
            }
        }
        return false;
    }

    public boolean supprimer(int id) {
        for (int i = 0; i < this.taches.length; i++) {
            if (this.taches[i].getIdentifiant() == id) {
                this.taches[i] = this.taches[i + 1];
                return true;
            }
        }
        return false;
    }

    public Tache[] lister() {
        return this.taches;
    }

    public Tache[] lister(String etat) {
        Tache[] newListeTache = new Tache[this.taches.length];

        for (int i = 0; i < taches.length; i++) {
            if (this.taches[i].getEtat() == etat) {
                newListeTache[i] = this.taches[i];
            }
        }
        return newListeTache;
    }

}