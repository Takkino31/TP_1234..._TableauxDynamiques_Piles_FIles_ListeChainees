import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * BankAcount
 */
public class BankAcount {

    private String prenom, nom, numeroCompte;
    private int solde = 0, decouvert;
    private final Lock lock;

    public BankAcount(String prenom, String nom, String numeroCompte, int decouvert) {
        this.prenom = prenom;
        this.nom = nom;
        this.numeroCompte = numeroCompte;
        this.decouvert = decouvert;
        this.lock = new ReentrantLock();
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public int getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(int decouvert) {
        this.decouvert = decouvert;
    }

    public Lock getLock() {
        return lock;
    }

    @Override
    public String toString() {
        return "Prenom NOM : " + getPrenom() + " " + getNom() + " SOLDE + " + getSolde();
    }

    public void crediter(int montant) {
        lock.lock();
        try {
            solde += montant;
            System.out.println("Crédit de " + montant + " effectué. Nouveau solde : " + solde);

        } finally {
            lock.unlock();
        }
    }

    public void debiter(int montant) {
        lock.lock();
        try {
            if (solde - montant >= -decouvert) {
                solde -= montant;
                System.out.println("Débit de " + montant + " effectué. Nouveau solde : " + solde);
            } else {
                System.out.println("Débit impossible : découvert dépassé.");
            }
        } finally {
            lock.unlock();
        }
    }
}