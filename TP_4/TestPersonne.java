class TestPersonne {
    public static void main (String[] args){
        Personne p1 = new Personne();
        Personne p2 = new Personne("Dede","War");
        Personne p3 = new Personne("Yaya","War",90);
        Personne p4 = new Personne("Mariama","Diop",22,"hot");
        Personne p5 = new Personne("Seynabou","Cisse",11,"jiguen");
        Personne p6 = new Personne("Yaya","War",12,"goor yalla");
        
        System.out.println("Personne 1" + p1.toString());
        System.out.println("Personne 2" + p2.toString());
        System.out.println("Personne 3" + p3.toString());
        System.out.println("Personne 4" + p4.toString());
        System.out.println("Personne 5" + p5.toString());
        System.out.println("Personne 6" + p6.toString());
    }
}