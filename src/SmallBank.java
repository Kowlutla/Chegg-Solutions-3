

public class SmallBank{
    // instance variables
    private BankAccount account1;
    private BankAccount account2;
    /**
     * Constructor
     * @param accountName
     * @param initialBalance
     */
    public SmallBank(String accountName, double initialBalance){
        // Create BankAccount using accountName and initialBalance
        this.account1 = new BankAccount(accountName, initialBalance);
        // initialize account2 to null
        this.account2 = null;
    }
    /**
     * create a BankAccount and store it in account2
     * @param accountName
     * @param initialBalance
     */
    public void addSecondAccount(String accountName, double initialBalance){
        // Create BankAccount using accountName and initialBalance
        this.account2 = new BankAccount(accountName, initialBalance);
    }
    /**
     * prints out the details of the stored BankAccounts
     */
    public void printBankDetails(){
        System.out.println(account1.toString());
        // check whether account2 has BankAccount object assigned to it
        if(account2 != null){
            // if account2 has BankAccount object assigned to it print it
             System.out.println(account2.toString());
        }
    }
   
}