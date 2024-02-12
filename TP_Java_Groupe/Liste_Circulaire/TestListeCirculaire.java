/**
 * TestListeCirculaire
 */
public class TestListeCirculaire {

    public static void main(String[] args) {


        ListeCirculaire Element1 = new ListeCirculaire(76,null);
        ListeCirculaire Element2 = new ListeCirculaire(32,null);
        ListeCirculaire Element3 = new ListeCirculaire(12,null);
        ListeCirculaire Element4 = new ListeCirculaire(79,null);
        ListeCirculaire Element5 = new ListeCirculaire(30,null);

        Element1.setSuivant(Element2);
        Element2.setSuivant(Element3);
        Element3.setSuivant(Element4);
        Element4.setSuivant(Element5);
        
        Element5.setSuivant(Element1);

        ListeCirculaire element = Element1;
        int i = 1;
        do {
            System.out.println("Je suis l'element " + i + " Ma valeur est : => "+ element.getValeurElement());
            element = element.getSuivant();
            i++;
        } while (element != Element1);

    }
}