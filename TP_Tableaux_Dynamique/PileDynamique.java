
public class PileDynamique {
    private int taille;


	private int [] intStack;
    private static final int TAILLE_BLOC = 5;
    private int pointeur ;

    public PileDynamique(){
        this.taille = 0;
        this.intStack = new int[TAILLE_BLOC];
        this.pointeur = 0;
    }

    public boolean isEmpty(){
        return taille == 0;
    }

    
    public void empilerInteger(int value){
        System.out.println("EMPILER Pointeur " + this.pointeur);
        if (this.pointeur == this.intStack.length){
            System.out.println("Pointeur == "+ this.pointeur);
            this.extendPile();
        }
        // System.out.println("EMPILER ");
        this.intStack[pointeur++] = value;
        // System.out.println("EMPILER Pointeur  = " + this.pointeur);
    }

    public int depilerInteger(){
        // System.out.println("this.intStack[pointeur--] " + this.intStack[(this.pointeur-1)] );
        System.out.println("DEPILER Pointeur  = " + this.pointeur);
        // this.pointeur -=1;

        // Ou bien : pointeur = pointeur-1
        return this.intStack[--this.pointeur];
    }

    public int length(){
        return this.pointeur;
    }


    public void extendPile(){
        int newIntStack [] = new int[this.intStack.length + TAILLE_BLOC];
        System.out.println("La nouvelle taille de la pile (TABLEAU) => " + (this.intStack.length + TAILLE_BLOC));
        for (int i = 0; i < this.intStack.length ; i++) {
            newIntStack[i] = this.intStack[i];
        }
        this.intStack = newIntStack;
    }
}
