/**
 * ProcessBankCredit
 */
public class ProcessBankCredit extends Thread{
    private BankAcount bankAccount;
    private int montant;

    public ProcessBankCredit(BankAcount bankAccount,int montant){
        this.bankAccount = bankAccount;
        this.montant = montant;
    }

    @Override
    public synchronized void run() {
        bankAccount.crediter(montant);
    }

}