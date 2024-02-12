import java.util.Scanner;
class TP1{

    public static int sommeCarresImpairs(int taille){
        int somme =0,nbrImpair = 1;
        // int nbrImpair = 1;
        for (int i = 0; i < taille; i++) {
            somme += (nbrImpair)*(nbrImpair);
            nbrImpair+=2;
        }
        return somme;
    }


    public static int calcul(int x,int y, String op){
        int result = 0;
        switch (op){
            case "+":
                result = x+y;
                break;
            case "-":
                result = x+y;
                break;
            case "*":
                result= x*y;
                break;
            case "/":
                result= x/y;
                break;
            default:
                break;
        }
        return result;
    }


    public static int[] rankingStudents(int[] tab){
        int max =-1, min =21, sum = 0;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i]>max)
               max = tab[i];
            if(tab[i]< min)
                min = tab[i];
            sum+= tab[i];
        }
        int moy = sum/(tab.length);
        int [] tabResults = {moy,min,max};
        return tabResults;
    }


    public static int chooseNumber(int x){
        Scanner myObj = new Scanner(System.in);
        int guessNumber = -1;
        do {
            if(guessNumber < x) {
                System.out.println("Trop petit");
                System.out.println("Ecrire un nombre: ");
                guessNumber = myObj.nextInt();
                
            }else{
                System.out.println("Trop grand");
                System.out.println("Ecrire un nombre: ");
                guessNumber = myObj.nextInt();
            }
        }
        while (guessNumber != x);
        return 1;
    }


    public static void main(String[] args){
        System.out.println("Les args "+ args.length);
        // int tab [] = {12,11,12,13,16,20,15};
        // System.out.println("La somme des x+y= "+calcul(5,5,"*")) ;
        // tab = rankingStudents(tab);
        // System.out.println("La Moy est " + tab[0]) ;
        // System.out.println("Le min est "+  tab[1]) ;
        // System.out.println("Le max est "+  tab[2]) ;
        //chooseNumber(18);
    } 
}