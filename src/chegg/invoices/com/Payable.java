package chegg.invoices.com;

//Payable interface that extends Comparable interface
public interface Payable extends Comparable<Payable>{
	
	//public abstract method getPaymentAmount
	double getPaymentAmount();

}
