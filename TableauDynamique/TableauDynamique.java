public class TableauDynamique
{
	private int taille;
	private int tableau[];
	private static final int TAILLE_MAX = 50;

	public TableauDynamique()
	{
		this.taille = 0;
		this.tableau = new int[TAILLE_MAX];
	}

	public boolean add(int value)
	{
		if (taille < TAILLE_MAX)
		{
			this.tableau[taille] = value;
			taille++;
			return true;
		}

		return false;
	}

	public int get(int index)
	{
		return this.tableau[index];
	}

	public int set(int index, int value)
	{
		return this.tableau[index] = value;
	}

	public void remove(int index)
	{
		for (int i = index + 1; i < this.taille; i++)
		{
			this.tableau[i-1] = this.tableau[i];
		}

		this.taille--;
	}

	public int length()
	{
		return this.taille;
	}
}