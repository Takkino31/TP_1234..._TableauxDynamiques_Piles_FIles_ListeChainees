/**
 * TestNat
 */
public class TestNat {

    public static void main(String[] args) throws ErrConst, ErrSom, ErrProd {
        try {
            Nat a = new Nat(214748364);
            Nat b = new Nat(214483648);
            int somme = Nat.somme(a.getN(), b.getN());
            System.out.println("Somme :" + somme);
        } catch (ErrSom e) {
            // TODO: handle exception
            System.err.println("Erreur :::: " + e.getMessage());
            System.out.println("La valeur ayant provoquée l'erreur :::: " + e.getValue());
        }

        try {
            Nat a = new Nat(134);
            Nat b = new Nat(1023);
            int somme = Nat.difference(a.getN(), b.getN());
            System.out.println("Difference :" + somme);
        } catch (ErrNat e) {
            // TODO: handle exception
            System.err.println("Erreur :::: " + e.getMessage());
            System.out.println("La valeur ayant provoquée l'erreur :::: " + e.getValue());
        }

        try {
            Nat a = new Nat(Integer.MAX_VALUE);
            Nat b = new Nat(Integer.MAX_VALUE);
            int produit = Nat.produit(a.getN(), b.getN());
            System.out.println("Produit :" + produit);
        } catch (ErrProd e) {
            // TODO: handle exception
            System.err.println("Erreur :::: " + e.getMessage());
            System.out.println("La valeur ayant provoquée l'erreur :::: " + e.getValue());
        }

    }
}
