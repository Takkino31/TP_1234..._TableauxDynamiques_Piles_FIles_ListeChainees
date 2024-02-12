public class ConjugaisonIndicatif {
    private String verbe ; 
    static String [] pronoms = {"Je","tu","Il","Nous","Vous","Ils"};
    static String [] terminaisonPrésent = {"e","es","e","ons","ez","ent"};
    static String [] terminaisonPasse = {"ai","as","a","âmes", "âtes","èrent"};
    static String [] terminaisonImparfait = {"ais","ais","ait","ions","iez","aient"};
    static String [] terminaisonFutur = {"ai","as","a","ons","ez","ont"};

    ConjugaisonIndicatif(String verbe){
        if (verbe.endsWith("er")) {
            this.setVerbe(verbe);
        }
    }

    public String getVerbe(){
        return this.verbe;
    }

    public void setVerbe(String verbe){
        this.verbe  = verbe; 
    }

    public void present(){
        System.out.println("Verbe " + verbe + " au Présent de l\'indicatif" );
        String verbeTruncate = (this.getVerbe().substring(0, verbe.length()-2));
        for (int i = 0; i < pronoms.length; i++) {
            System.out.println(pronoms[i]+ " " + verbeTruncate + terminaisonPrésent[i]);
        }

        System.out.println("----- fin -----");
    }

    public void passe(){
        System.out.println("Verbe " + verbe + " au Passé de l\'indicatif" );
        String verbeTruncate = (this.getVerbe().substring(0, verbe.length()-2));
        for (int i = 0; i < pronoms.length; i++) {
            System.out.println(pronoms[i]+ " " + verbeTruncate + terminaisonPasse[i]);
        }

        System.out.println("----- fin -----");
    }


    public void futur(){
        System.out.println("Verbe " + verbe + " au Futur de l\'indicatif" );
        String verbeTruncate = (this.getVerbe().substring(0, verbe.length()-2));
        for (int i = 0; i < pronoms.length; i++) {
            System.out.println(pronoms[i]+ " " + verbeTruncate + terminaisonFutur[i]);
        }

        System.out.println("----- fin -----");
    }
    public void imparfait(){
        System.out.println("Verbe " + verbe + " au Imparfait de l\'indicatif" );
        String verbeTruncate = (this.getVerbe().substring(0, verbe.length()-2));
        for (int i = 0; i < pronoms.length; i++) {
            System.out.println(pronoms[i]+ " " + verbeTruncate + terminaisonImparfait[i]);
        }

        System.out.println("----- fin -----");
    }

}
