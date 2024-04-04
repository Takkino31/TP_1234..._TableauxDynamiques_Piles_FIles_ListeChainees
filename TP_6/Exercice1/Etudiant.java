/**
 * Etudiant
 */
public class Etudiant {
    private String nom, prenom, filiere;
    private int age, niveau;

    public Etudiant(String nom, String prenom, int niveau, String filiere, int age) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setNom(nom);
        this.setFiliere(filiere);
        this.setAge(age);
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

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}