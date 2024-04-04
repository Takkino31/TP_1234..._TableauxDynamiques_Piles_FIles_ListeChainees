public class TestEtudiant {
    public static void main(String[] args) {
        try {
            Etudiant e1 = new Etudiant(-3, "Cheikh Ibrahima", "Lo");
            System.out.println("Le nom de l'etudiant : " + e1.getNom());
            System.out.println("Le prénom de l'etudiant : " + e1.getPrenom());
            System.out.println("Le  numéro de l'etudiant : " + e1.getNumero());
        } catch (EtudiantException e) {

            // TODO: handle exception
            e.IncorrectNumber("La note est incorrecte");
            e.printStackTrace();
        }
    }
}
