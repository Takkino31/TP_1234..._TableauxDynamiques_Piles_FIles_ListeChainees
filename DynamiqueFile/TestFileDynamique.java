// import java.io.File;

/**
 * TestFileDynamique
 */
public class TestFileDynamique {

    public static void main(String[] args) {
        
        // Object Element = new Object();
        FileDynamique FileDynamique = new FileDynamique();
        System.out.println(FileDynamique);

		for (int i = 1; i < 100; i += 2)
		{
			FileDynamique.popOrEnfiler(i);

			System.out.println("Contenu de la file après ajout de " + i);
			System.out.println(FileDynamique);
		}
        // System.out.println("Contenu de la file après retrait de " + FileDynamique.pushOrDefiler());
        
        while(!FileDynamique.isEmpty())
		{
			System.out.println("Contenu de la file après retrait de " + FileDynamique.pushOrDefiler());
			System.out.println(FileDynamique);
		}
    }
}