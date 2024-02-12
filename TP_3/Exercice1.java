import java.util.Scanner;

class Exercice1 {
    
    public static int [] t;
    public static void main(String[] args) {
        System.out.println("test");
        t = new int[5];
        saisir(t);

        // Affichage du contenu du tableau pour vérification
        System.out.println("Contenu du tableau :");
        for (int i = 0; i < t.length; i++) {
            System.out.println("Element "+ i + " : " +t[i]);
        }


        bubble(t);

        // Affichage du contenu du tableau pour vérification
        System.out.println("Contenu du tableau :");
        for (int i = 0; i < t.length; i++) {
            System.out.println("Element "+ i + " : " +t[i]);
        }

        System.err.println("La somme des élements du tableau est : " + somme(t));
        System.err.println("Le maximinum des élements du tableau est : " + maximum(t));
        System.err.println("Le minimum des élements du tableau est : " + minimum(t));
        System.err.println("L différence entre le maximum et le minimum des éléments du\n" + //
                         "tableau est : " + delta(t));


        int[] t1 = {8,2,1,98, 9};
        int[] t2 = {8,2,1,98, 10,8,12,99};

        System.err.println("Les tableaux sont equivalents : " + equivalence(t1,t2));

    }

    public static void saisir(int[] t){
        Scanner input = new Scanner(System.in);
        for (int index = 0; index < t.length; index++) {
            System.out.print("Entrez un nombre: ");
            int num = input.nextInt();
            t[index] = num;
        }
        input.close();
    }

    public static int somme(int[] t){
        int somme = 0;
        for (int element : t) {
            somme+= element;
        }
        return somme;
    }


    public static int maximum(int[] t){

        if (t.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide");
        }

        int max = t[0];

        for (int i = 1; i < t.length; i++) {
            if (t[i]> max) 
                max = t[i];
        }
        return max;
    }

      public static int minimum(int[] t){

        if (t.length == 0) {
            throw new IllegalArgumentException("Le tableau est vide");
        }

        int min = t[0];

        for (int i = 1; i < t.length; i++) {
            if (t[i]< min) 
                min = t[i];
        }
        return min;
    }

    public static int delta(int[] t){
        return maximum(t)-minimum(t);
    }

    public static void bubble (int[] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = i+1; j < t.length; j++) {
                if (t[i]>t[j]) {
                    int x = t[i];
                    t[i] = t[j];
                    t[j]= x ;
                }
            }
        }
    }

    public static boolean egalite(int[] t1, int[] t2){
        if ( t1.length != t2.length) return false;
        for (int i = 0; i < t2.length; i++) {
            if (t1[i] != t2[i]) {
                return false;
            }
        }
        return true;
    }

    // Verifie si le tableau contient des elements à l'index spécifié
    public static boolean isValidIndex(int[] arr, int index) {
        return index >= 0 && index < arr.length;
    }

    public static boolean equivalence(int[] t1, int[] t2){
        for (int i = 0; i < t1.length; i++) {
            if (isValidIndex(t2, i)) {
                if (t1[i]!= t2[i]) {
                    return false;
                }
            }
        }
        return true;
    }



}