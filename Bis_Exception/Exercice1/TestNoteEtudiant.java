
/**
 * TestNoteEtudiant
 */
public class TestNoteEtudiant {

    public static void main(String[] args) {
        try {

            Etudiant Etudiant = new Etudiant("Lô", "Aïssatou", 22);
            System.out.println(Etudiant);
        } catch (NoteEtudiantIncorrecte e) {
            e.printStackTrace();
            System.err.println(e);
        }
    }
}