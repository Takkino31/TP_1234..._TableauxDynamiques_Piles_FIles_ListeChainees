public class TestTableauDynamique
{
	public static void main(String[] args)
	{
		TableauDynamique tableau = new TableauDynamique();

		tableau.add(5);
		tableau.add(15);
		tableau.add(35);

		System.out.println("Avant suppression");

		for (int i = 0; i < tableau.length(); i++)
		{
			System.out.println("Elément N°" + (i+1) + " : " + tableau.get(i));
		}

		System.out.println("Après suppression");
		
		tableau.remove(1);

		for (int i = 0; i < tableau.length(); i++)
		{
			System.out.println("Elément N°" + (i+1) + " : " + tableau.get(i));
		}

		System.out.println("Après modification");
		
		tableau.set(1, 98);

		for (int i = 0; i < tableau.length(); i++)
		{
			System.out.println("Elément N°" + (i+1) + " : " + tableau.get(i));
		}
	}
}