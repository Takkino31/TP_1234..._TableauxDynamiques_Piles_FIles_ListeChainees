/**
 * TestMembre
 */
public class TestMembre {

    public static void main(String[] args) {
        try {
            Membre Membre = new Membre("Rafahi Mbacké", 0);
            System.out.println(Membre);
        } catch (MembreAgeErreur e) {
            // TODO: handle exception
            e.printStackTrace();
            System.err.println(e);
        }
    }
}