import java.util.Scanner;

/**
 * GestionTache
 */
public class GestionTache {

    public static void main(String[] args) {
        GestionnaireTache Mestaches = new GestionnaireTache(10);
        System.out.println("Bienvenue dans votre Gestionnaire des Taches");
        for (int i = 0; i < 5; i++) {
            Tache T = new Tache("Tache " + (i + 1));
            Mestaches.ajouter(T);
        }
        System.out.println("1-- Lister mes taches");
        System.out.println("2-- Ajouter une tache");
        System.out.println("3-- Modifier une tache");
        System.out.println("4-- Supprimer une tache");
        Scanner myObj = new Scanner(System.in);
        System.out.println("Saisir le numero de votre choix entre 1 et 4");

        int choice = myObj.nextInt();
        System.out.println("Mon choix est " + choice);
        while (choice != 0) {

            switch (choice) {
                case 1:
                    System.out.println("Liste des taches");
                    Tache[] taches = Mestaches.lister();
                    System.out.println("1-- Lister mes taches");
                    System.out.println("----------");
                    System.out.println("==============================00000==============================");

                    for (int i = 0; i < taches.length; i++) {
                        System.out.println(taches[i]);
                    }

                    System.out.println("Fin Lister mes tache");
                    System.out.println("==============================00000==============================");
                    break;

                case 2:
                    System.out.println("==============================00000==============================");
                    System.out.println("2 -- Ajout d'une nouvelle tâche à mes tâches");
                    Tache nouvelleTache = creationTache();
                    boolean ajouTache = Mestaches.ajouter(nouvelleTache);
                    if (ajouTache) {
                        System.out.println("La tâche a été ajoutée avec success");
                        System.out.println(nouvelleTache);
                    } else {
                        System.err.println("Erreur lors de l'ajout de la tâche");
                    }
                    System.out.println("==============================00000==============================");
                    System.out.println("Fin Ajout d'une tache");
                    System.out.println("==============================00000==============================");
                    break;

                case 3:
                    System.out.println("2 -- Modification d'une tache");

                    System.out.println("==============================00000==============================");

                    int idTache = myObj.nextInt();
                    do {
                        System.out.println("Veuillez entrez l'identifiant de la tâche ");
                        idTache = myObj.nextInt();
                    } while (idTache <= 0);
                    // System.out.println("2 -- Ajout d'une nouvelle tâche à mes tâches");

                    // titre = myObj.nextLine();

                    break;
                case 4:
                    System.out.println("Suppression d'une tache");

                    break;
                case 5:
                    System.out.println("Liste une taches selon l'etat EN_COURS, TERMINE ou PREVU");

                    break;

                default:
                    break;
            }
            choice = 0;
        }

        myObj.close();
    }

    public static Tache creationTache() {
        Scanner myObj = new Scanner(System.in);
        String titre = myObj.nextLine();
        do {
            System.out.println("Veuillez entrez un titre avec au moins 3 caracteres");
            titre = myObj.nextLine();
        } while (titre.length() <= 2);

        System.out.println("Le titre de ma tache à ajouter est " + titre);
        System.out.println("-----------");
        int etatInt;
        do {
            System.out.println("Veuillez entrez un numero correct pour l'état :: \n" +
                    "1 :: pour EN_COURS \n" +
                    "2 :: pour TERMINE \n" +
                    "3 :: pour PREVU");
            etatInt = myObj.nextInt();
            System.out.println("La valeur de etatInt == " + etatInt);
        } while (etatInt != 1 && etatInt != 2 && etatInt != 3);

        System.out.println("-----------");
        String etatString = "";
        switch (etatInt) {
            case 1:
                etatString = "EN_COURS";
                break;

            case 2:
                etatString = "TERMINE";
                break;

            case 3:
                etatString = "PREVU";
                break;

            default:
                break;
        }
        System.out.println("L'etat de ma tache à ajouter est " + etatString);
        myObj.close();
        return new Tache(titre, etatString);
    }


    public static Tache modificationTache(int identifiant) {
        
        Scanner myObj = new Scanner(System.in);
        String titre = myObj.nextLine();
        do {
            System.out.println("Veuillez entrez un titre avec au moins 3 caracteres");
            titre = myObj.nextLine();
        } while (titre.length() <= 2);

        System.out.println("Le titre de ma tache à ajouter est " + titre);
        System.out.println("-----------");
        int etatInt;
        do {
            System.out.println("Veuillez entrez un numero correct pour l'état :: \n" +
                    "1 :: pour EN_COURS \n" +
                    "2 :: pour TERMINE \n" +
                    "3 :: pour PREVU");
            etatInt = myObj.nextInt();
            System.out.println("La valeur de etatInt == " + etatInt);
        } while (etatInt != 1 && etatInt != 2 && etatInt != 3);

        System.out.println("-----------");
        String etatString = "";
        switch (etatInt) {
            case 1:
                etatString = "EN_COURS";
                break;

            case 2:
                etatString = "TERMINE";
                break;

            case 3:
                etatString = "PREVU";
                break;

            default:
                break;
        }
        System.out.println("L'etat de ma tache à ajouter est " + etatString);
        myObj.close();
        return new Tache(titre, etatString);
    }
}