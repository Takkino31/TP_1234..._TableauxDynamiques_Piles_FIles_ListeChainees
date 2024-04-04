/**
 * Membre
 */
public class Membre {

    private String nom;
    private int age;
    public Membre(String nom, int age) throws MembreAgeErreur{
        this.nom = nom;
        this.setAge(age);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws MembreAgeErreur {
        if (age < 18) {
            throw new MembreAgeErreur("Vous n'avez pas l'age requis");
        }
        else if (age > 22) {
            throw new MembreAgeErreur("Vous êtes ");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Je m'appelle "+ this.nom+ " et j'ai "+ this.age;
    }
}