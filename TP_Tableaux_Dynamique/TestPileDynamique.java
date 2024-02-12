public class TestPileDynamique {
    
    public static void main(String[] args) {
       
        PileDynamique PileInteger = new PileDynamique();
        PileInteger.empilerInteger(10);
        PileInteger.empilerInteger(20);
        PileInteger.empilerInteger(30);
        PileInteger.empilerInteger(40);
        PileInteger.empilerInteger(50);
        PileInteger.empilerInteger(60);
        PileInteger.empilerInteger(70);
        PileInteger.empilerInteger(80);

        System.out.println("Après Ajout la taille est "+ PileInteger.length());
        // System.out.println("Element " + " === " + PileInteger.depilerInteger());
        // System.out.println("Element " + " === " + PileInteger.depilerInteger());
        // System.out.println("Element " + " === " + PileInteger.depilerInteger());
        // System.out.println("Element " + " === " + PileInteger.depilerInteger());
        // System.out.println("Element " + " === " + PileInteger.depilerInteger());
        // System.out.println("Element " + " === " + PileInteger.depilerInteger());
        // System.out.println("Element " + " === " + PileInteger.depilerInteger());
        // System.out.println("Element " + " === " + PileInteger.depilerInteger());
        for (int i = 0; i < PileInteger.length(); i++) {
            System.out.println("Element "+ (i+1) + " === " + PileInteger.depilerInteger());
        }

    }
}
