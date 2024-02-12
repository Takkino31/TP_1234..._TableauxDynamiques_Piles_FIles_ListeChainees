/**
 * TestFileDynamique
 */
public class TestFileDynamique {

    
    public static void main(String[] args) {
        FileDynamique fileDynamique = new FileDynamique();
        fileDynamique.enfiler(12);
        fileDynamique.enfiler(43);
        fileDynamique.enfiler(2);
        fileDynamique.enfiler(13);
        fileDynamique.enfiler(5);
        fileDynamique.enfiler(10);
        fileDynamique.enfiler(3);
        fileDynamique.enfiler(21);
        fileDynamique.enfiler(19);
        
        // for (int i = 0; i < 12; i++) {
        //     System.out.println("On enfile à la position "+(i)+" le chiffre "+(i+1));
        //     fileDynamique.enfiler(i+1);
        // }

        // fileDynamique.defiler();
        System.out.println("Varaible defiler " +fileDynamique.defiler());
        fileDynamique.enfiler(23);
        System.out.println("Variable defiler " +fileDynamique.defiler());
        System.out.println("Variable defiler " +fileDynamique.defiler());
        System.out.println("Variable defiler " +fileDynamique.defiler());
        System.out.println("Variable defiler " +fileDynamique.defiler());
        System.out.println("Variable defiler " +fileDynamique.defiler());
        System.out.println("Variable defiler " +fileDynamique.defiler());
        System.out.println("Variable defiler " +fileDynamique.defiler());
        System.out.println("Variable defiler " +fileDynamique.defiler());
        System.out.println("Variable defiler " +fileDynamique.defiler());
        System.out.println("Variable defiler " +fileDynamique.defiler());
        System.out.println("Variable defiler " +fileDynamique.defiler());
        System.out.println("Variable defiler " +fileDynamique.defiler());

    }
}