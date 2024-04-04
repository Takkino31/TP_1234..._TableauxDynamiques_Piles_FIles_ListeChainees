/**
 * TestPileDynamique
 */
public class TestPileDynamique {

    public static void main(String[] args) {
        PileDynamique PileDynamiquePersonne = new PileDynamique();

        for (int i = 0; i < 5; i++) {
            Personne P = new Personne("Nom " + (i + 1), "Prenom " + (i + 1), "Adresse " + (i + 1), i + 20);
            PileDynamiquePersonne.empiler(P);
        }

        System.out.println("===========0000===========");
        System.out.println("La taille avant de depiler est " + PileDynamiquePersonne.length());

        System.out.println("Defiler avec ::: " + PileDynamiquePersonne.depiler().getNom());
        System.out.println("Defiler avec ::: " + PileDynamiquePersonne.depiler().getPrenom());

        System.out.println("La taille apres avoir depiler est ::: " + PileDynamiquePersonne.length());

        // for (int i = 0; i < 2; i++) {
        // System.out.println(PileDynamiquePersonne.getPersonne(i).getNom() + " "
        // + PileDynamiquePersonne.getPersonne(i).getPrenom());

        // }

    }
}