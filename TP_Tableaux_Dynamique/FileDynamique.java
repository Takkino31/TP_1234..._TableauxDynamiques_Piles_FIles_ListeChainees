public class FileDynamique {
    // FIFO

    private int in,out,taille;
	private int [] intQueue;
    private static final int TAILLE_BLOC = 5;

    public FileDynamique(){
        this.intQueue = new int [TAILLE_BLOC];
        this.in = this.taille = 0 ;
        this.out = -1;
    }

    public void enfiler(int value){
        // if (taille  == intQueue.length) {
        //     extendArray();
        // }
        // // Calcul de Position à enfiler
        // out = out + intQueue.length;
        // // Enfilement
        // this.intQueue[out]= value;
        // taille++;
    }

    public void defiler(){
        in = this.intQueue[in];
        // this.intQueue[taille] = value;

        // in = (in+1)
        this.taille++;
    }


    public int length(){
        return this.taille;
    }

    public void extendArray(){
        int newArrayInt [] = new int[this.intQueue.length + TAILLE_BLOC];
        for (int i = 0; i < this.intQueue.length ; i++) {
            newArrayInt[i] = this.intQueue[i];
        }
        this.intQueue = newArrayInt;
        in = 0;
        out = this.taille -1;
    }
}
