package chegg.invoices.com;

public class Job {
	
	private int jobID;
	public Job(int jobID)
	{
		this.jobID=jobID;
	}
	
	public Job(Job job)
	{
		this.jobID=job.jobID;
	}

}
