public class TestDynamiqueArray {
    public static void main(String[] args) {
        DynamiqueArray tab = new DynamiqueArray();

        System.out.println("Avant Ajout");
        for (int i = 0; i < tab.length(); i++) {
            System.out.println("Element " + (i+1) + " === " + tab.get(i));
        }

        tab.add(5);
        tab.add(4);
        tab.add(2);
        tab.add(90);
        tab.add(18);
        tab.add(6);
        tab.add(5);
        tab.add(4);
        tab.add(2);
        tab.add(90);
        tab.add(18);
        tab.add(6);

        System.out.println("Après Ajout");
        for (int i = 0; i < tab.length(); i++) {
            System.out.println("Element " + (i+1) + " === " + tab.get(i));
        }
        
        tab.remove(3);
        System.out.println("Après Suppression");
        for (int i = 0; i < tab.length(); i++) {
            System.out.println("Element " + (i+1) + " === " + tab.get(i));
        }

        tab.set(3,3);
        System.out.println("Après Modification");
        for (int i = 0; i < tab.length(); i++) {
            System.out.println("Element " + (i+1) + " === " + tab.get(i));
        }


        System.out.println("La taille du tableau est : "+ tab.size());
        System.out.println("FIN DE L'execution (^^)");
    }


}
