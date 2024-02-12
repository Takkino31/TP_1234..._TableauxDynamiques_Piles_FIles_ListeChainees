
/**
 * User
 */
public class User {

    private String nom;
    private int age;

    User(String nom, int age) throws UserException {
        this.setNom(nom);
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

    public void setAge(int age) throws UserException {
        if (age < 18 || age > 22) {
            throw new UserException("L'age doit etre compris entre 18 et 22");
        }
        this.age = age;
    }
}