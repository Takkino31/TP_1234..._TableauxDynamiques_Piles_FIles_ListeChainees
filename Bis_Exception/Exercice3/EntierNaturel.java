/**
 * EntierNaturel
 */
public class EntierNaturel{

    private int entier;

    public EntierNaturel(int entier) throws ErrConst{
        if (entier<0) {
            throw new ErrConst(entier);
        }
        this.setEntier(entier);
    }

    public int getEntier() {
        return entier;
    }

    public void setEntier(int entier) throws ErrConst{
        if (entier < 0) {
            throw new ErrConst("L'entier ne peut etre negatif");
        }
        this.entier = entier;
    }
    public static int somme(int a, int b) throws ErrSom{
        long result = a + b;
        if (result > Integer.MAX_VALUE) {
            throw new ErrSom("Trop grand");
        }
        return a+b;
    }

    public static int difference(int a, int b) throws ErrDiff{
        long result = a - b;
        if (result < Integer.MIN_VALUE) {
            throw new ErrDiff("Trop petit");
        }
        return a-b;
    }

    public static int produit(int a, int b) throws ErrProd{
        long result = a * b;
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            throw new ErrProd("Trop grand");
        }
        return a*b;
    }
}