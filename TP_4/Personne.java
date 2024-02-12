class Personne {
    public String nom,prenom, sexe;
    public int age;
    
    public Personne (){
        this.nom = "name";
        this.prenom = "firstname";
        this.age = 0;
        this.sexe = "MAN";
    }

    public Personne (String nom,String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne (String nom, String prenom,int age){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public Personne (String nom, String prenom,int age,String sexe){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
    }

    public Personne (Personne personne){
        this.nom = personne.nom;
        this.prenom = personne.prenom;
        this.age = personne.age;
        this.sexe = personne.sexe;
    }

    // Overriding toString() method of String class
    @Override
    public String toString (){
        return "Je m'appelle "+ this.nom+ " "+ this.prenom+" . J'ai "
                + this.age + "ans  et je suis de sexe " + this.sexe + " .";
    }
}