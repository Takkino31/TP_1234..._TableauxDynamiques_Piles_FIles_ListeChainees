/**
 * Etudiant
 */
public class Etudiant {

    private String nom, prenom;
    private int note;

    public Etudiant (String nom, String prenom , int note) throws NoteEtudiantIncorrecte{
        this.nom = nom;
        this.prenom = prenom;
        this.setNote(note);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) throws NoteEtudiantIncorrecte {
        if (note < 0 || note >20 ) {
            throw new NoteEtudiantIncorrecte("Note Error from Setter");
        }
        this.note = note;
    }

    @Override
    public String toString() {
        return "Je m'appelle "+ this.prenom + " " + this.nom +" . J'ai une note de " + this.getNote();
    }
}