public class TestFileDynamique {
    public static void main(String[] args) {
        FileDynamique FileDynamique = new FileDynamique();
        for (int i = 0; i < 10; i++) {
            FileDynamique.enfiler(i+1);
        }

        FileDynamique.defiler();
        FileDynamique.defiler();
        FileDynamique.defiler();
        FileDynamique.defiler();
        FileDynamique.defiler();
    }
}
