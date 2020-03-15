import java.sql.*;
public class Order {
	private String title;
	private String schedule;
	private String price;
	private String seatPos;
	
	
    public Order(String title,String schedule,String price, String seatPos)
    {
    	this.title= title;
    	this.schedule=schedule;
    	this.price=price;
    	this.seatPos=seatPos;
    	
    	
    }
    
   public void addToDatabase()
   {
	   try {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection mycon= DriverManager.getConnection("jdbc:mysql://localhost/movie?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
		   Statement myStat=mycon.createStatement();
		   
		   
		   
		   String sql="INSERT INTO myorders"
				      +"(Title, Schedule, SeatPosition)"
				   + "values" +"(" + getAll() + ")" ;
		   
		   myStat.executeUpdate(sql);
		   System.out.println("Added");
	   }catch(Exception e) 
	   {
		   e.printStackTrace();
	   }
   }
   
   public String getAll()
   {
	   String order = "'" + title +"'" + "," + "'"+ schedule+ "'"+ "," + "'"+ seatPos+ "'";
	   return order;
   }
}
