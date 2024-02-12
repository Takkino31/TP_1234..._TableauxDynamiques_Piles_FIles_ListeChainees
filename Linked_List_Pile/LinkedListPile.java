/**
 * LinkedListPile
 */
public class LinkedListPile {

    // LIFO Last In First Out

    private Element elementStartingPile;
    public int size = 0;

    LinkedListPile() {
        this.elementStartingPile = null;
    }

    public void empiler(int value) {
        Element element = new Element(value, null);
        if (elementStartingPile == null) {
            this.elementStartingPile = element;
        } else {
            element.setNext(this.elementStartingPile);
            this.elementStartingPile = element;
        }
        this.size++;
    }

    public Element depiler() {
        Element e = this.elementStartingPile;
        this.elementStartingPile = this.elementStartingPile.getNext();
        this.size--;
        return e;
    }

    public boolean isEmpty() {
        return elementStartingPile == null ? true : false;
    }

    public int length() {
        return size;
    }
}