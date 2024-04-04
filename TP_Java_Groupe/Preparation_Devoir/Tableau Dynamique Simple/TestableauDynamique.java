/**
 * TestableauDynamique
 */
public class TestableauDynamique {

    public static void main(String[] args) {
        TableauDynamique TableauDynamiquePersonne = new TableauDynamique();
        for (int i = 0; i < 15; i++) {
            Personne P = new Personne("Nom " + (i + 1), "Prenom " + (i + 1), "Adresse " + (i + 1), i + 20);
            TableauDynamiquePersonne.ajouterPersonne(P);
        }
        System.out.println("===========0000===========");
        System.out.println("La taille avant suppression est "+TableauDynamiquePersonne.length());
        for (int index = 0; index < TableauDynamiquePersonne.length(); index++) {
            System.out.println(TableauDynamiquePersonne.getPersonne(index).getNom() + " "
                    + TableauDynamiquePersonne.getPersonne(index).getPrenom());
        }
        System.out.println("===========0000===========");
        TableauDynamiquePersonne.supprimerPersonne(8);

        System.out.println("La taille après suppression est " +TableauDynamiquePersonne.length());
        for (int index = 0; index < TableauDynamiquePersonne.length(); index++) {
            System.out.println(TableauDynamiquePersonne.getPersonne(index).getNom() + " "
                    + TableauDynamiquePersonne.getPersonne(index).getPrenom());
        }
        System.out.println("===========0000===========");
    }
}