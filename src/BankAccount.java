
public class BankAccount {
	
		private String accountName;
		private double initialBalance;
		
		public BankAccount(String accountName, double initialBalance) {
			this.accountName=accountName;
			this.initialBalance=initialBalance;
		}
		
		public String toString() {
			return accountName+"\t"+initialBalance;
		}
		
		
		

}
