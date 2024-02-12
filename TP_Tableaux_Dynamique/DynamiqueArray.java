/**
 * DynamicArray
 */
public class DynamiqueArray {

    private int taille;
    private int tableau [];
    private static final int TAILLE_MAX = 5;

    public DynamiqueArray(){
        this.taille = 0;
        this.tableau = new int[TAILLE_MAX];
    }

    public int length(){
        return this.taille;
    }

    public void add(int value){
        if (this.taille == this.tableau.length) 
            this.extendArray();
        this.tableau[taille] = value;
        this.taille++;
    }

    public int get(int index){
        return this.tableau[index];
    }


    public boolean set(int value, int index){
        this.tableau[index] = value;
        return true;
    }

    public void remove(int index){
        for (int i = index+1; i < length(); i++)
            this.tableau[i-1] = this.tableau [i];
        this.taille--;
    }

    public void extendArray(){
        int newArrayInt [] = new int[this.tableau.length + TAILLE_MAX];
        for (int i = 0; i < this.tableau.length ; i++) {
            newArrayInt[i] = this.tableau[i];
        }
        this.tableau = newArrayInt;
    }

    public int size(){
		return this.tableau.length;
	}
}