public class TestTableauDynamique2
{
	public static void main(String[] args)
	{
		TableauDynamique2 tableau = new TableauDynamique2();

		tableau.add(5);
		tableau.add(15);
		tableau.add(35);

		System.out.println("Avant ajout");
		System.out.println(tableau);

		System.out.println("Ajout de 9 à la position 1");
		tableau.add(1, 9);
		System.out.println(tableau);

		System.out.println("Ajout de 19 à la première position");
		tableau.add(0, 19);
		System.out.println(tableau);

		System.out.println("Ajout de 14 à la dernière position");
		tableau.add(tableau.length()-1, 14);
		System.out.println(tableau);

		System.out.println("Ajout de 11 à la fin du tableau");
		tableau.add(tableau.length(), 14);
		System.out.println(tableau);
	}
}