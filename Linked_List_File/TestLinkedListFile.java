/**
 * TestLinkedListFile
 */
public class TestLinkedListFile {

    public static void main(String[] args) {
        LinkedListFile File = new LinkedListFile();
        for (int i = 0; i < 10; i++) {
            File.enfiler(i + 1);
        }

        for (int j = 0; j < 10; j++) {
            System.out.println("Je defile le " + j + 1 + "e element qui est : " + File.defiler().getValue());
        }
    }
}