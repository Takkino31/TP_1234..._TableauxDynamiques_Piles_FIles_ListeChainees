public class Personne
{
	private String nom, prenom, sexe;
	private int age;

	public Personne() {}

	public Personne(String nom, String prenom)
	{
		this(nom, prenom, 0, null);
		// this.prenom = prenom;
		// this.nom = nom;
	}

	public Personne(String nom, String prenom, int age)
	{
		this(nom, prenom, age, null);
		// this.prenom = prenom;
		// this.nom = nom;
		// this.setAge(age);
	}

	public Personne(String nom, String prenom, int age, String sexe)
	{
		this.prenom = prenom;
		this.nom = nom;
		this.setAge(age);
		this.setSexe(sexe);
	}

	public Personne(Personne p)
	{
		this(p.nom, p.prenom, p.age, p.sexe);
		// this.prenom = p.prenom;
		// this.nom = p.nom;
		// this.setAge(p.age);
		// this.setSexe(p.sexe);
	}

	public String getNom()
	{
		return this.nom;
	}

	public String getPrenom()
	{
		return this.prenom;
	}

	public int getAge()
	{
		return this.age;
	}

	public String getSexe()
	{
		return this.sexe;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}

	public void setAge(int age)
	{
		if (age >= 0 && age <= 130) {
			this.age = age;
		}
	}

	public void setSexe(String sexe)
	{
		if (sexe == null || sexe.equals("MASCULIN") || sexe.equals("FEMININ")) {
			this.sexe = sexe;
		}
	}

	public String toString()
	{
		String description = "";
		description += "Prénom : " + this.prenom + "\n";
		description += "Nom    : " + this.nom + "\n";
		description += "Age    : " + this.age + "\n";
		description += "Sexe   : " + this.sexe;

		return description;
	}
}