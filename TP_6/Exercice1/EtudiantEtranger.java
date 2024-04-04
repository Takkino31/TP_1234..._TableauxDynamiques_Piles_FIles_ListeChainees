/**
 * EtudiantEtranger
 */
public class EtudiantEtranger extends Etudiant{

    private String paysOrigine;

    EtudiantEtranger(String nom, String prenom, int niveau, String filiere, int age,String paysOrigine){
        super(nom,prenom,niveau,filiere,age);
        this.setPaysOrigine(paysOrigine);
    }

    public String getPaysOrigine() {
        return paysOrigine;
    }

    public void setPaysOrigine(String paysOrigine) {
        this.paysOrigine = paysOrigine;
    }

    
}