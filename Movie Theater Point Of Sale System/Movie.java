
public class Movie  {

	private String title;
	private int price;
	private Schedule sched1;
	private Schedule sched2;
	private Schedule sched3;
	private Schedule sched4;
	
	
	public Movie()
	{
		
		sched1= new Schedule();
		sched1.setSchedule("12:00pm-2:00pm");
		sched2= new Schedule(); 
		sched2.setSchedule("2:30pm-3:30pm");
		sched3= new Schedule(); 
		sched3.setSchedule("4:00pm-6:30pm");
		sched4= new Schedule(); 
		sched4.setSchedule("7:00pm-9:00pm");
	}

	public String getTitle() {
		return title;
	}
	public String getPrice()
	{
		
		return Integer.toString(price);
	}

	public void setTitle(String title)
	{
		this.title=title;	
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	public Schedule getSchedule1()
	{
		return sched1;
	}
	
	public Schedule getSchedule2()
	{
		return sched2;
	}
	
	public Schedule getSchedule3()
	{
		return sched3;
	}
	
	public Schedule getSchedule4()
	{
		return sched4;
	}
	
	public int getPriceInt()
	{
		return price;
	}
}
