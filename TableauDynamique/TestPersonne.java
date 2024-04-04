public class TestPersonne
{
	public static void main(String[] args)
	{
		Personne p1 = new Personne();
		Personne p2 = new Personne("Diop", "Ousmane");
		Personne p3 = new Personne("Ndiaye", "Fatou", 20);
		Personne p4 = new Personne("Fall", "Angela", 21, "FEMININ");
		Personne p5 = new Personne(p4);

		System.out.println("Informations sur la personne P1");
		System.out.println(p1);
		System.out.println("Informations sur la personne P2");
		System.out.println(p2);
		System.out.println("Informations sur la personne P3");
		System.out.println(p3);
		System.out.println("Informations sur la personne P4");
		System.out.println(p4);
		System.out.println("Informations sur la personne P5");
		System.out.println(p5);
	}
}