
/**
 * Etudiant
 */
public class Etudiant {

    private int numero;
    private String nom , prenom;

    Etudiant(int numero, String prenom, String nom) throws EtudiantException {
        this.setNumero(numero);
        this.setNom(nom);
        this.setPrenom(prenom);
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) throws EtudiantException{
        if (nom == null || nom.isEmpty()) {
            throw new EtudiantException("Le nom est incorrect");
        }
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) throws EtudiantException{
        if (prenom == null || prenom.isEmpty()) {
            throw new EtudiantException("Le prénom est incorrect");
        }
        this.prenom = prenom;
    }

    public int getNumero() {
        return numero;
    }

    /**
     * @param numero
     * @throws EtudiantException
     */
    public void setNumero(int numero) throws EtudiantException {
        if (numero<0 || numero >20) {
            throw new EtudiantException("Le numéro est incorrect");
        }
        this.numero = numero;
    }
}
