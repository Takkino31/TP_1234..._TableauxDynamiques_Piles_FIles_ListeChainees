class Complexe {
    private double partieReelle;
    private double partieImaginaire;

    Complexe(){}

    Complexe(double partieReelle,double partieImaginaire){
        this.partieReelle = partieReelle;
        this.partieImaginaire = partieImaginaire;
    }

    Complexe(Complexe complexe){
        this.partieReelle = complexe.partieReelle;
        this.partieImaginaire = complexe.partieImaginaire;
    }

    public double getPartieReelle(){
        return this.partieReelle;
    }

    public void setPartieReelle(int partieReelle){
        this.partieReelle = partieReelle;
    }

    public double getPartieImaginaire(){
        return this.partieReelle;
    }

    public void setPartieImaginaire(int partieImaginaire){
        this.partieImaginaire = partieImaginaire;
    }

    
}