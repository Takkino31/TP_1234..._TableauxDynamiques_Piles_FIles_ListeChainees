/**
 * Element
 */
public class Element {

    private int value ;
    private Element next;

    Element(int value, Element next){
        this.setValue(value);
        this.setNext(next);
    }
 
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }
}