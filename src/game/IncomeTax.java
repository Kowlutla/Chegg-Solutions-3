package game;

public class IncomeTax {
	
	double income;//to hold the income value
	
	//Constructor that initializes the income with provided value
	public IncomeTax(double income) {
		this.income=income;
	}
	
	//Method to return tax for 
	public double getIncomeTax() {
		
		//if income is less than $50000 
		if(this.income<=50000){
			return this.income*0.01;
		}
		//if income is over $50000 up to $75000 
		if(this.income<=75000) {
			return 500+(this.income-50000)*0.02;
		}
		
		//if income is over $75000 up to $100000 
		if(this.income<=100000) {
			return 500+500+(this.income-75000)*0.03;
		}
		
		//if income is over $100000 up to $250000 
		if(this.income<=250000) {
			return 500+500+750+(this.income-100000)*0.04;
		}
		
		//if income is over $250000 up to $500000 
		if(this.income<=500000) {
			return 500+500+750+6000+(this.income-250000)*0.05;
		}
		//if income is over $500000
		return 500+500+750+6000+7500+(this.income-500000)*0.06;
		
	}
}
