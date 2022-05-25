package com.chegg.burgers;

import java.text.DecimalFormat;

public class InsuranceClaim {

	private double insuredAmount;

	private double claimAmount;

	private int claimId;

	boolean approved; // for approve or reject the claim by desk verification

	// constructor

	public InsuranceClaim(double insuredAmount, double claimAmount, int claimId) {

		this.insuredAmount = insuredAmount;

		this.claimAmount = claimAmount;

		this.claimId = claimId;

		new Approval().deskVerify();

	}

	@Override
	public String toString() {
		
		// Student needs to complete the missing lines of code
		String result = "Claim Amount: " + String.format("%.2f", claimAmount) + " for Claim Id: " + this.claimId;
		if (approved) {
			result = result + " has been approved";
		} else {
			result = result + " has not been approved";
		}
		return result;
	}
	class Approval {
		/*
		 * Complete the deskVerify() method given below. If the claim amount does not
		 * exceed the insured amount, it can be approved; otherwise, it is not approved.
		 * To change the instance variable ‘approved’ accordingly.
		 * 
		 */
		void deskVerify() {

			// Student needs to complete the missing lines of code
			if (claimAmount <= insuredAmount) {
				approved = true;
			} else {
				approved = false;
			}
		}
	}

	public static void main(String[] args) {

		/*
		 * Student needs to complete the missing lines of code
		 * 
		 * write code to create an InsuranceClaim object with parameters such that the
		 * output
		 * 
		 * “Claim Amount: 4500.00 for Claim Id: 1001 has not been approved” is produced.
		 * 
		 */
		InsuranceClaim myCalim = new InsuranceClaim(4000, 4500, 1001);

		System.out.println(myCalim);

		/*
		 * Student needs to complete the missing lines of code
		 * 
		 * write code to create an InsuranceClaim object with parameters such that the
		 * output
		 * 
		 * “Claim Amount: 4500.00 for Claim Id: 1002 has been approved” is produced.
		 * 
		 */

		InsuranceClaim yourCalim = new InsuranceClaim(6000,4500,1002);

		System.out.println(yourCalim);

	}
}