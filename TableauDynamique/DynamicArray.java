import java.util.ArrayList;

public class DynamicArray
{
	public static void main(String[] args)
	{
		ArrayList<Integer> tableau = new ArrayList<Integer>();

		System.out.println("Taille du tableau : " + tableau.size());

		System.out.println("Ajout de 5 au tableau");
		tableau.add(5);
		System.out.println("Taille du tableau : " + tableau.size());

		System.out.println("Ajout de 15 au tableau");
		tableau.add(15);
		System.out.println("Taille du tableau : " + tableau.size());
		
		System.out.println("Ajout de 35 au tableau");
		tableau.add(35);
		System.out.println("Taille du tableau : " + tableau.size());

		System.out.println("Contenu du tableau");
		System.out.println(tableau);

		System.out.println("Ajout de 9 à la position 1");
		tableau.add(1, 9);
		System.out.println(tableau);
		System.out.println("Taille du tableau : " + tableau.size());

		System.out.println("Ajout de 19 à la première position");
		tableau.add(0, 19);
		System.out.println(tableau);
		System.out.println("Taille du tableau : " + tableau.size());
	}
}