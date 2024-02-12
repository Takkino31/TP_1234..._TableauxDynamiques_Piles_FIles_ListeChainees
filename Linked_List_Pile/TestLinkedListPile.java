/**
 * TestLinkedListPile
 */
public class TestLinkedListPile {

    public static void main(String[] args) {
        LinkedListPile List = new LinkedListPile();
        for (int i = 0; i < 10; i++) {
            List.empiler(i + 1);
        }

        for (int j = 0; j < 10; j++) {
            System.out.println("Je depile le " + j + "e elemnt qui est : " + List.depiler().getValue());
        }
    }
}