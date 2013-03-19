package src.com.home.code;

public class HelperClass
{
	
	private InterFaceMethods day;
	
	
	public HelperClass(InterFaceMethods day)
	{
		this.day=day;
	}

	public final InterFaceMethods getDay()
	{
		return day;
	}

	public final void setDay(InterFaceMethods day)
	{
		this.day = day;
	}
	
	public void getTask()
	{
		day.printTask();
	}
	

}
