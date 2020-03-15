
public class Schedule  {
   
	private String time;
	private SeatGroup seatgroup;
	
	
	public Schedule()
	{	
		
	    seatgroup= new SeatGroup(); 
		
	}
	
	public void setSchedule(String time)
	{
		this.time=time;
	}
	
	public String getTime()
	{
		return time;
	}
	
	public SeatGroup getSeatGroup()
	{
		return seatgroup;
	}
	
	
}
