public class TestListeDoublementCirculaire {
    public static void main(String[] args) {

        ListeDoublementCirculaire Element1 = new ListeDoublementCirculaire(12);
        ListeDoublementCirculaire Element2 = new ListeDoublementCirculaire(78);
        ListeDoublementCirculaire Element3 = new ListeDoublementCirculaire(15);
        ListeDoublementCirculaire Element4 = new ListeDoublementCirculaire(86);
        ListeDoublementCirculaire Element5 = new ListeDoublementCirculaire(75);

        // Enregistrement des Suivants

        Element1.setSuivant(Element2);
        Element2.setSuivant(Element3);
        Element3.setSuivant(Element4);
        Element4.setSuivant(Element5);
        Element5.setSuivant(Element1);

        // Enregistrement des Précedents

        Element1.setPrecedent(Element5);
        Element2.setPrecedent(Element1);
        Element3.setPrecedent(Element2);
        Element4.setPrecedent(Element3);
        Element5.setPrecedent(Element4);

        ListeDoublementCirculaire suivant = Element2;
        ListeDoublementCirculaire precedent = Element5;
        // System.out.println("Suivant " + suivant);
        // System.out.println("Precedent " + precedent);

        ListeDoublementCirculaire Element = Element1;
        int i=1 ;


        do {
            System.out.println(":::::::::::");
            System.out.println("Je suis l'élement " + i + " Ma valeur est => "+ Element.getValeur());
            System.out.println("Mon suivant est le => " + Element.getSuivant().getValeur());
            System.out.println("Mon precedent est le => " +  Element.getPrecedent().getValeur());
            System.out.println(":::::::::::");
            Element = Element.getSuivant();
            i++;

        } while ((Element.getSuivant() != suivant) && (Element.getPrecedent() != precedent));

    }
}


Nom : Yaya Elimane
Prenom : VAR  
Date et Lieu de Naissance : 30 Juillet 1998 à Saint-Louis
Adresse : Leona , Mosquée Rawane Ngom , Saint-Louis  
CNI : 1251199802216
Telephone : + 221777679440