
public class BillingApplication {
	
	public double computeBill(Double powerConsumption)
	{
		if(powerConsumption <= 160)
		{
			return powerConsumption*0.033;
		}
		else if(160< powerConsumption && powerConsumption<=300)
		{
			return 5.28+(powerConsumption-160)*0.072;
		}
		else if(300 < powerConsumption && powerConsumption<=500)
		{
			return 15.36+(powerConsumption-300)*0.086;
		}
		else
		{
			return 32.56+(powerConsumption-500)*0.114;
		}
	}

}
