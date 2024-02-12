/**
 * Nat
 */
public class Nat {

    private int n;

    Nat(int n) throws ErrConst {
        if (n < 0) {
            throw new ErrConst(n);
        }
        this.setN(n);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public static int somme(int a, int b) throws ErrSom {
        long result = a + b;
        if (result > Integer.MAX_VALUE) {
            throw new ErrSom((int) result);
        }
        return (int) (result);
    }

    public static int difference(int a, int b) throws ErrDiff {
        long result = a - b;
        if (result < Integer.MIN_VALUE) {
            throw new ErrDiff((int) result);
        }
        return (int) (result);
    }

    public static int produit(int a, int b) throws ErrProd {
        long result = a * b;
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            throw new ErrProd((int) result);
        }
        return (int) (result);
    }
}