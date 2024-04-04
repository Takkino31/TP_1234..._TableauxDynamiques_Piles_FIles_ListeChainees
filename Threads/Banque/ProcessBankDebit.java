/**
 * ProcessBankDebit
 */
public class ProcessBankDebit extends Thread {

    private BankAcount bankAccount;
    private int montant;

    public ProcessBankDebit(BankAcount bankAccount, int montant) {
        this.bankAccount = bankAccount;
        this.montant = montant;
    }

    @Override
    public synchronized void run() {
        bankAccount.debiter(montant);
    }
}