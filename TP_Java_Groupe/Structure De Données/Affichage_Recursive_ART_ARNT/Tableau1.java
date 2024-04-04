import java.util.Scanner;

public class Tableau1{
  //saisie recursive d'un tableau et son affichage recursif
  public static void main(String[] args){
    int n; 
    int [] t;
    Scanner sc=new Scanner(System.in);
    System.out.println("Taille du tableau");
    n=sc.nextInt();
    int i=0;
    t=new int[n];
    saisie(sc,i,n,t);
    i=0;
    afficher(i,n,t);
        sc.close();
  }
  public static void saisie(Scanner sc,int i,int n,int []t){
    if(i>n-1)
    return;
    else
    {
      System.out.println("Element en position "+(i+1)+"?");
      t[i]=sc.nextInt();
      saisie(sc,i+1,n,t);
    }
  }
  public static void afficher(int i,int n,int []t){
    if(i>n-1)
    return;
    else
    {
      System.out.println("Element en position "+(i+1)+" : "+t[i]);
      afficher(i+1,n,t);
    }
  }
}