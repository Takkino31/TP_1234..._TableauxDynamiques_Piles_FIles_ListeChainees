public class TableauDynamique2
{
	private int taille;
	private int tableau[];
	private static final int TAILLE_MAX = 50;

	public TableauDynamique2()
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

	public boolean add(int index, int value)
	{
		if (taille < TAILLE_MAX)
		{
			this.taille++;

			for (int i = taille - 2; i >= index; i--)
			{
				this.tableau[i+1] = this.tableau[i];
			}
			this.tableau[index] = value;

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

	public String toString()
	{
		if (this.taille == 0)
		{
			return "[]";
		}

		String description = "[" + this.tableau[0];

		for (int i = 1; i < this.taille - 1; i++)
		{
			description += ", " + this.tableau[i];
		}

		if (tableau[0] == tableau[this.taille - 1])
		{
			description += "]";
		}
		else
		{
			description += ", " + this.tableau[this.taille - 1] + "]";
		}

		return description;
	}
}