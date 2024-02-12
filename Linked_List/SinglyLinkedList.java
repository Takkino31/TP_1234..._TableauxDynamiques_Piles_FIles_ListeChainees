/**
 * SinglyLinkedList
 */
public class SinglyLinkedList {

    private int elementValue;
    private SinglyLinkedList nextElement;

    SinglyLinkedList(int value){
        this.elementValue = value;
        this.nextElement = null;
    }

    SinglyLinkedList(int value, SinglyLinkedList nextElement){
        this.elementValue = value;
        this.nextElement = nextElement;
    }

    public int getElementValue() {
        return elementValue;
    }

    public void setElementValue(int elementValue) {
        this.elementValue = elementValue;
    }

    public SinglyLinkedList getNextElement() {
        return nextElement;
    }

    public void setNextElement(SinglyLinkedList nextElement) {
        this.nextElement = nextElement;
    }


}