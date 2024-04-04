/**
 * Bank
 */
public class Bank {

    public static void main(String[] args) {
        
        // Création de trois comptes bancaires
        BankAcount compteBancaire1 = new BankAcount("Yaya", "VAR", "9440", 1000000);
        // BankAcount compteBancaire2 = new BankAcount("Moussa", "DIOUF", "9441", 1000000);
        // BankAcount compteBancaire3 = new BankAcount("Absa", "THIAM", "9442", 1000000);

       // Création de threads pour les opérations de crédit et de débit sur chaque compte
       ProcessBankCredit creditThread1 = new ProcessBankCredit(compteBancaire1, 2000);
       ProcessBankDebit debitThread1 = new ProcessBankDebit(compteBancaire1, 3000);


       ProcessBankCredit creditThread2 = new ProcessBankCredit(compteBancaire1, 5000);
       ProcessBankDebit debitThread2 = new ProcessBankDebit(compteBancaire1, 7000);

    //    ProcessBankCredit creditThread2 = new ProcessBankCredit(compteBancaire2, 5000);
    //    ProcessBankDebit debitThread2 = new ProcessBankDebit(compteBancaire2, 7000);


    //    ProcessBankCredit creditThread3 = new ProcessBankCredit(compteBancaire3, 1000);
    //    ProcessBankDebit debitThread3 = new ProcessBankDebit(compteBancaire3, 2000);

       // Lancement des threads
       creditThread1.start();
       debitThread1.start();

       creditThread2.start();
       debitThread2.start();

    //    creditThread3.start();
    //    debitThread3.start();

       // Attendre que tous les threads se terminent
       try {
        creditThread1.join();
        debitThread1.join();

        creditThread2.join();
        debitThread2.join();

        // creditThread3.join();
        // debitThread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Afficher les soldes finaux
        System.out.println(compteBancaire1);
        // System.out.println(compteBancaire2);
        // System.out.println(compteBancaire3);

    }
}