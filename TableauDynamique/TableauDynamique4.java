public class TableauDynamique4
{
	private int taille;
	private Object tableau[];
	private static final int TAILLE_BLOC = 5;

	public TableauDynamique4()
	{
		this.taille = 0;
		this.tableau = new Object[TAILLE_BLOC];
	}

	public void add(Object value)
	{
		if (this.taille == this.tableau.length)
		{
			this.etendreTableau();
		}

		this.tableau[this.taille] = value;
		this.taille++;
	}

	public void add(int index, Object value)
	{
		if (this.taille == this.tableau.length)
		{
			this.etendreTableau();
		}

		this.taille++;

		for (int i = this.taille - 2; i >= index; i--)
		{
			this.tableau[i+1] = this.tableau[i];
		}
		this.tableau[index] = value;
	}

	public Object get(int index)
	{
		return this.tableau[index];
	}

	public void set(int index, Object value)
	{
		this.tableau[index] = value;
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

	public void etendreTableau()
	{
		// créer un nouveau tableau de taille = tableau.length + TAILLE_BLOC
		Object newTableau[] = new Object[this.tableau.length + TAILLE_BLOC];

		// copier toutes les valeurs de l'ancien tableau dans le nouveau
		for (int i = 0; i < this.tableau.length; i++)
		{
			newTableau[i] = this.tableau[i];
		}

		// Faire pointer l'ancien tableau dans le nouveau
		this.tableau = newTableau;
	}

	// renvoie l'espace occupé par le tableau en mémoire
	public int size()
	{
		return this.tableau.length;
	}
}