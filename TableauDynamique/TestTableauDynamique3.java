public class TestTableauDynamique3
{
	public static void main(String[] args)
	{
		TableauDynamique3 tableau = new TableauDynamique3();

		System.out.println("Ajout de 5 au tableau");
		tableau.add(5);
		System.out.println("Taille du tableau en mémoire : " + tableau.size());

		System.out.println("Ajout de 15 au tableau");
		tableau.add(15);
		System.out.println("Taille du tableau en mémoire : " + tableau.size());

		System.out.println("Ajout de 35 au tableau");
		tableau.add(35);
		System.out.println("Taille du tableau en mémoire : " + tableau.size());

		System.out.println("Contenu du tableau");
		System.out.println(tableau);

		System.out.println("Ajout de 9 à la position 1");
		tableau.add(1, 9);
		System.out.println(tableau);
		System.out.println("Taille du tableau en mémoire : " + tableau.size());

		System.out.println("Ajout de 19 à la première position");
		tableau.add(0, 19);
		System.out.println(tableau);
		System.out.println("Taille du tableau en mémoire : " + tableau.size());

		System.out.println("Ajout de 14 à la dernière position");
		tableau.add(tableau.length()-1, 14);
		System.out.println(tableau);
		System.out.println("Taille du tableau en mémoire : " + tableau.size());

		System.out.println("Ajout de 11 à la fin du tableau");
		tableau.add(tableau.length(), 14);
		System.out.println(tableau);
		System.out.println("Taille du tableau en mémoire : " + tableau.size());
	}
}