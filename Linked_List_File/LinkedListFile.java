/**
 * LinkedListFile
 */
public class LinkedListFile {

    // FIFO First IN FIRST OUT
    private Element firstElementFile, lastElementFile;
    private int size = 0;

    public void enfiler(int value) {

        Element element = new Element(value, null);

        if (this.length() == 0) {
            this.firstElementFile = this.lastElementFile = element;
            // this.lastElementFile = element;
        } else {
            this.lastElementFile.setNext(element);
            this.lastElementFile = element;
        }
        this.size++;
    }

    public Element defiler() {
        if (this.firstElementFile == null) {
            return null;
        }

        Element e = this.firstElementFile;
        this.firstElementFile = this.firstElementFile.getNext();
        this.size--;
        return e;
    }

    public int length() {
        return size;
    }
}