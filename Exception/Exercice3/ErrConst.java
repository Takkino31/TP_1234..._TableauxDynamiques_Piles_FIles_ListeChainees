/**
 * ErrConst
 */
public class ErrConst extends ErrNat {
    ErrConst(int value){
        super("La valeur ne doit pas etre négative ", value);
    }
}