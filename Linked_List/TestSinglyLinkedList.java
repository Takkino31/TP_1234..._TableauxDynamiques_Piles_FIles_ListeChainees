/**
 * TestSinglyLinkedList
 */
public class TestSinglyLinkedList {

    public static void main(String[] args) {
        SinglyLinkedList Element1 = new SinglyLinkedList(62);
        SinglyLinkedList Element2 = new SinglyLinkedList(13,Element1);
        SinglyLinkedList Element3 = new SinglyLinkedList(94,Element2);
        SinglyLinkedList Element4 = new SinglyLinkedList(51,Element3);
        SinglyLinkedList Element5 = new SinglyLinkedList(89,Element4);

        SinglyLinkedList next = Element5;
        while (next!=null) {
            System.out.println("Ma valeur est " + next.getElementValue());
            SinglyLinkedList Element = next;
            next = Element.getNextElement();
        }
    }
}
