public class ErrNat extends Exception {

    private int value;

    ErrNat(String msg, int value) {
        super(msg);
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
