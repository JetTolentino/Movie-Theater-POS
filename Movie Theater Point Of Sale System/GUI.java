import java.awt.EventQueue;
import javax.swing.*; 
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.sql.*;
public class GUI {

	
	static JFrame frame;
	private JLayeredPane layeredPane;
    static  JPanel panel;
	private Movie movie1,movie2,movie3,movie4;
	private String sched[]= {"12:00pm-2:00pm","2:30pm-3:30pm","4:00pm-6:30pm","7:00pm-9:00pm"};
    private int seatNum,total,totalSeats;
    private ButtonGroup btn;
    private JLabel MovieLabel, SeatLabel,ScheduleLabel, TicketLabel,PriceLabel,TotalLabel;
    private String[] selectedItem;
    private ArrayList<String> seat;
    private JButton btnDone,btnOrder;
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 681, 417);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		btn= new ButtonGroup();
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 11, 645, 356);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		panel = new JPanel();
		layeredPane.add(panel, "name_16547739187100");
		panel.setLayout(null);
		
		
		movie1=new Movie();
		movie1.setTitle("JOKER");
		movie1.setPrice(200);
		movie2=new Movie();
		movie2.setTitle("ZOMBIELAND : DOUBLE TAP");
		movie2.setPrice(190);
		movie3=new Movie();
		movie3.setTitle("TERMINATOR : DARK FATE");
		movie3.setPrice(250);
		movie4=new Movie();
		movie4.setTitle("Doctor Strange");
		movie4.setPrice(170);
		
		JRadioButton rb1 = new JRadioButton(movie1.getTitle());
		rb1.setBounds(18, 24, 131, 23);
		panel.add(rb1);
		btn.add(rb1);
		
		JRadioButton rb2 = new JRadioButton(movie2.getTitle());
		rb2.setBounds(18, 50, 109, 23);
		panel.add(rb2);
		btn.add(rb2);
		
		JRadioButton rb3 = new JRadioButton(movie3.getTitle());
		rb3.setBounds(18, 76, 109, 23);
		panel.add(rb3);
		btn.add(rb3);
		
		JRadioButton rb4 = new JRadioButton(movie4.getTitle());
		rb4.setBounds(18, 102, 140, 23);
		panel.add(rb4);
		btn.add(rb4);
		
		SpinnerNumberModel model1 = new SpinnerNumberModel(1, 1, 30, 1);
		JSpinner spinner = new JSpinner(model1);
		spinner.setEditor(new JSpinner.DefaultEditor(spinner));
		spinner.setBounds(182, 37, 46, 48);
		panel.add(spinner);
		
		JLabel lblSeats = new JLabel("Seats");
		lblSeats.setBounds(182, 11, 60, 18);
		panel.add(lblSeats);
		
		
		JComboBox comboBox = new JComboBox(sched);
		comboBox.setBounds(18, 169, 150, 18);
		panel.add(comboBox);
		
		String cb=(String) comboBox.getSelectedItem();
		
		JButton btnChooseSeats = new JButton("Choose Seats");                           //CHOOSE SEAT
		btnChooseSeats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				seatNum=(Integer) spinner.getValue();
				totalSeats=seatNum;
			if(rb1.isSelected() )
			{
				if(comboBox.getSelectedItem().toString()== "12:00pm-2:00pm")
				{
					
					movie1.getSchedule1().getSeatGroup().getSeats();
					movie1.getSchedule1().getSeatGroup().setSeatNum(seatNum);
					
					
				}
				
				else if(comboBox.getSelectedItem().toString() == "2:30pm-3:30pm")
				{
					movie1.getSchedule2().getSeatGroup().setSeatNum(seatNum);
					movie1.getSchedule2().getSeatGroup().getSeats();
					
				}
				
				else if(comboBox.getSelectedItem().toString() == "4:00pm-6:30pm")
				{
					movie1.getSchedule3().getSeatGroup().setSeatNum(seatNum);
					movie1.getSchedule3().getSeatGroup().getSeats();
					
				}
				
				else if(comboBox.getSelectedItem().toString() == "7:00pm-9:00pm")
				{
					movie1.getSchedule4().getSeatGroup().setSeatNum(seatNum);
					movie1.getSchedule4().getSeatGroup().getSeats();

				}
				
			}
			
			else if(rb2.isSelected())
			{
				if(comboBox.getSelectedItem().toString()== "12:00pm-2:00pm")
				{
					movie2.getSchedule1().getSeatGroup().setSeatNum(seatNum);
					movie2.getSchedule1().getSeatGroup().getSeats();
				}
				
				else if(comboBox.getSelectedItem().toString() == "2:30pm-3:30pm")
				{
					movie2.getSchedule2().getSeatGroup().setSeatNum(seatNum);
					movie2.getSchedule2().getSeatGroup().getSeats();

				}
				
				else if(comboBox.getSelectedItem().toString() == "4:00pm-6:30pm")
				{
					movie2.getSchedule3().getSeatGroup().setSeatNum(seatNum);
					movie2.getSchedule3().getSeatGroup().getSeats();

				}
				
				else if(comboBox.getSelectedItem().toString() == "7:00pm-9:00pm")
				{
					movie2.getSchedule4().getSeatGroup().setSeatNum(seatNum);
					movie2.getSchedule4().getSeatGroup().getSeats();

				}
			}
			
			else if(rb3.isSelected())
			{
				if(comboBox.getSelectedItem().toString()== "12:00pm-2:00pm")
				{
					movie3.getSchedule1().getSeatGroup().setSeatNum(seatNum);
					movie3.getSchedule1().getSeatGroup().getSeats();

				}
				
				else if(comboBox.getSelectedItem().toString() == "2:30pm-3:30pm")
				{
					movie3.getSchedule2().getSeatGroup().setSeatNum(seatNum);
					movie3.getSchedule2().getSeatGroup().getSeats();

				}
				
				else if(comboBox.getSelectedItem().toString() == "4:00pm-6:30pm")
				{
					movie3.getSchedule3().getSeatGroup().setSeatNum(seatNum);
					movie3.getSchedule3().getSeatGroup().getSeats();

				}
				
				else if(comboBox.getSelectedItem().toString() == "7:00pm-9:00pm")
				{
					movie3.getSchedule4().getSeatGroup().setSeatNum(seatNum);
					movie3.getSchedule4().getSeatGroup().getSeats();

				}
				
			}
			
			else if(rb4.isSelected())
			{
				if(comboBox.getSelectedItem().toString()== "12:00pm-2:00pm")
				{
					movie4.getSchedule1().getSeatGroup().setSeatNum(seatNum);
					movie4.getSchedule1().getSeatGroup().getSeats();

				}
				
				else if(comboBox.getSelectedItem().toString() == "2:30pm-3:30pm")
				{
					movie4.getSchedule2().getSeatGroup().setSeatNum(seatNum);
					movie4.getSchedule2().getSeatGroup().getSeats();

				}
				
				else if(comboBox.getSelectedItem().toString() == "4:00pm-6:30pm")
				{
					movie4.getSchedule3().getSeatGroup().setSeatNum(seatNum);
					movie4.getSchedule3().getSeatGroup().getSeats();

				}
				
				else if(comboBox.getSelectedItem().toString() == "7:00pm-9:00pm")
				{
					movie4.getSchedule4().getSeatGroup().setSeatNum(seatNum);
					movie4.getSchedule4().getSeatGroup().getSeats();

				}
				
			}
			
				
			}
		});
		btnChooseSeats.setBounds(12, 213, 115, 23);
		panel.add(btnChooseSeats);
		JButton btnDone = new JButton("Done");     //DONE update Display
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			
			{
				if(rb1.isSelected())
				{
						
					if(comboBox.getSelectedItem().toString()== "12:00pm-2:00pm")
					{
						MovieLabel.setText(movie1.getTitle());
						PriceLabel.setText(movie1.getPrice());
						SeatLabel.setText(movie1.getSchedule1().getSeatGroup().getSeatArrangement());
						TotalLabel.setText(getTotal(totalSeats,movie1.getPriceInt()));
						seat=movie1.getSchedule1().getSeatGroup().getSeatArray();
					}
					
					else if(comboBox.getSelectedItem().toString()== "2:30pm-3:30pm")
					{
						MovieLabel.setText(movie1.getTitle());
						PriceLabel.setText(movie1.getPrice());
						SeatLabel.setText(movie1.getSchedule2().getSeatGroup().getSeatArrangement());
						TotalLabel.setText(getTotal(totalSeats,movie1.getPriceInt()));
						seat=movie1.getSchedule2().getSeatGroup().getSeatArray();
					}
					
					else if(comboBox.getSelectedItem().toString()== "4:00pm-6:30pm")
					{
						MovieLabel.setText(movie1.getTitle());
						PriceLabel.setText(movie1.getPrice());
						SeatLabel.setText(movie1.getSchedule3().getSeatGroup().getSeatArrangement());
						TotalLabel.setText(getTotal(totalSeats,movie1.getPriceInt()));
						seat=movie1.getSchedule3().getSeatGroup().getSeatArray();
					}
					
					else if(comboBox.getSelectedItem().toString()== "7:00pm-9:00pm")
					{
						MovieLabel.setText(movie1.getTitle());
						PriceLabel.setText(movie1.getPrice());
						SeatLabel.setText(movie1.getSchedule4().getSeatGroup().getSeatArrangement());
						TotalLabel.setText(getTotal(totalSeats,movie1.getPriceInt()));
						seat=movie1.getSchedule4().getSeatGroup().getSeatArray();
					}
						 
				} // end of rb1
				
				else if(rb2.isSelected())
				{
					if(comboBox.getSelectedItem().toString()== "12:00pm-2:00pm")
					{
						MovieLabel.setText(movie2.getTitle());
						PriceLabel.setText(movie2.getPrice());
						SeatLabel.setText(movie2.getSchedule1().getSeatGroup().getSeatArrangement());
						TotalLabel.setText(getTotal(totalSeats,movie2.getPriceInt()));
						seat=movie2.getSchedule1().getSeatGroup().getSeatArray();
					}
					
					else if(comboBox.getSelectedItem().toString()== "2:30pm-3:30pm")
					{
						MovieLabel.setText(movie2.getTitle());
						PriceLabel.setText(movie2.getPrice());
						SeatLabel.setText(movie2.getSchedule2().getSeatGroup().getSeatArrangement());
						TotalLabel.setText(getTotal(totalSeats,movie2.getPriceInt()));
						seat=movie2.getSchedule2().getSeatGroup().getSeatArray();
					}
					
					else if(comboBox.getSelectedItem().toString()== "4:00pm-6:30pm")
					{
						MovieLabel.setText(movie2.getTitle());
						PriceLabel.setText(movie2.getPrice());
						SeatLabel.setText(movie2.getSchedule3().getSeatGroup().getSeatArrangement());
						TotalLabel.setText(getTotal(totalSeats,movie2.getPriceInt()));
						seat=movie2.getSchedule3().getSeatGroup().getSeatArray();
					}
					
					else if(comboBox.getSelectedItem().toString()== "7:00pm-9:00pm")
					{
						MovieLabel.setText(movie2.getTitle());
						PriceLabel.setText(movie2.getPrice());
						SeatLabel.setText(movie2.getSchedule4().getSeatGroup().getSeatArrangement());
						TotalLabel.setText(getTotal(totalSeats,movie2.getPriceInt()));
						seat=movie2.getSchedule4().getSeatGroup().getSeatArray();
					}
				}
				
				else if(rb3.isSelected())
				{
					if(comboBox.getSelectedItem().toString()== "12:00pm-2:00pm")
					{
						MovieLabel.setText(movie3.getTitle());
						PriceLabel.setText(movie3.getPrice());
						SeatLabel.setText(movie3.getSchedule1().getSeatGroup().getSeatArrangement());
						TotalLabel.setText(getTotal(totalSeats,movie3.getPriceInt()));
						seat=movie3.getSchedule1().getSeatGroup().getSeatArray();
					}
					
					else if(comboBox.getSelectedItem().toString()== "2:30pm-3:30pm")
					{
						MovieLabel.setText(movie3.getTitle());
						PriceLabel.setText(movie3.getPrice());
						SeatLabel.setText(movie3.getSchedule2().getSeatGroup().getSeatArrangement());
						TotalLabel.setText(getTotal(totalSeats,movie3.getPriceInt()));
						seat=movie3.getSchedule2().getSeatGroup().getSeatArray();
					}
					
					else if(comboBox.getSelectedItem().toString()== "4:00pm-6:30pm")
					{
						MovieLabel.setText(movie3.getTitle());
						PriceLabel.setText(movie3.getPrice());
						SeatLabel.setText(movie3.getSchedule3().getSeatGroup().getSeatArrangement());
						TotalLabel.setText(getTotal(totalSeats,movie3.getPriceInt()));
						seat=movie3.getSchedule3().getSeatGroup().getSeatArray();
					}
					
					else if(comboBox.getSelectedItem().toString()== "7:00pm-9:00pm")
					{
						MovieLabel.setText(movie3.getTitle());
						PriceLabel.setText(movie3.getPrice());
						SeatLabel.setText(movie3.getSchedule4().getSeatGroup().getSeatArrangement());
						TotalLabel.setText(getTotal(totalSeats,movie3.getPriceInt()));
						seat=movie3.getSchedule4().getSeatGroup().getSeatArray();
					}
				}
				
				else if(rb4.isSelected())
				{
					if(comboBox.getSelectedItem().toString()== "12:00pm-2:00pm")
					{
						MovieLabel.setText(movie4.getTitle());
						PriceLabel.setText(movie4.getPrice());
						SeatLabel.setText(movie4.getSchedule1().getSeatGroup().getSeatArrangement());
						TotalLabel.setText(getTotal(totalSeats,movie4.getPriceInt()));
						seat=movie4.getSchedule1().getSeatGroup().getSeatArray();
					}
					
					else if(comboBox.getSelectedItem().toString()== "2:30pm-3:30pm")
					{
						MovieLabel.setText(movie4.getTitle());
						PriceLabel.setText(movie4.getPrice());
						SeatLabel.setText(movie4.getSchedule2().getSeatGroup().getSeatArrangement());
						TotalLabel.setText(getTotal(totalSeats,movie4.getPriceInt()));
						seat=movie4.getSchedule2().getSeatGroup().getSeatArray();
					}
					
					else if(comboBox.getSelectedItem().toString()== "4:00pm-6:30pm")
					{
						MovieLabel.setText(movie4.getTitle());
						PriceLabel.setText(movie4.getPrice());
						SeatLabel.setText(movie4.getSchedule3().getSeatGroup().getSeatArrangement());
						TotalLabel.setText(getTotal(totalSeats,movie4.getPriceInt()));
						seat=movie4.getSchedule3().getSeatGroup().getSeatArray();
					}
					
					else if(comboBox.getSelectedItem().toString()== "7:00pm-9:00pm")
					{
						MovieLabel.setText(movie4.getTitle());
						PriceLabel.setText(movie4.getPrice());
						SeatLabel.setText(movie4.getSchedule4().getSeatGroup().getSeatArrangement());
						TotalLabel.setText(getTotal(totalSeats,movie4.getPriceInt()));
						seat=movie4.getSchedule4().getSeatGroup().getSeatArray();
					}
				}
				seatNum=(Integer) spinner.getValue();                                //SEATNUM JLABEL  AND TICKETLABEL
				TicketLabel.setText(getSeatNum());   
				ScheduleLabel.setText(cb);
				

			}
		});
		btnDone.setBounds(137, 213, 89, 23);
		panel.add(btnDone);
		
		JLabel lblSchedule = new JLabel("Schedule");
		lblSchedule.setBounds(22, 143, 46, 14);
		panel.add(lblSchedule);
		
		JLabel lblMovie = new JLabel("Movie:");
		lblMovie.setBounds(306, 24, 46, 14);
		panel.add(lblMovie);
		
		JLabel lblPrice = new JLabel("Price: ");
		lblPrice.setBounds(306, 50, 46, 14);
		panel.add(lblPrice);
		
		JLabel lblTickets = new JLabel("Seats:");
		lblTickets.setBounds(306, 76, 46, 14);
		panel.add(lblTickets);
		
		JLabel lblSchedule_1 = new JLabel("Schedule:");
		lblSchedule_1.setBounds(306, 102, 76, 14);
		panel.add(lblSchedule_1);
		
		JLabel lblSeats_1 = new JLabel("Tickets:");
		lblSeats_1.setBounds(306, 131, 46, 14);
		panel.add(lblSeats_1);
		
		MovieLabel = new JLabel("");
		MovieLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		MovieLabel.setBounds(365, 24, 193, 14);
		panel.add(MovieLabel);
		
		PriceLabel = new JLabel("");
		PriceLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		PriceLabel.setBounds(455, 50, 103, 14);
		panel.add(PriceLabel);
		
		TicketLabel = new JLabel();
		TicketLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		TicketLabel.setBounds(362, 131, 196, 14);
		panel.add(TicketLabel);
		
		ScheduleLabel = new JLabel();
		ScheduleLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		ScheduleLabel.setBounds(365, 102, 193, 14);
		panel.add(ScheduleLabel);
		
		SeatLabel = new JLabel();
		SeatLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		SeatLabel.setBounds(365, 76, 193, 14);
		panel.add(SeatLabel);
		
		btnOrder = new JButton("Order");
		btnOrder.setBounds(239, 213, 89, 23);
		panel.add(btnOrder);
		btnOrder.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)                                       //ORDER BUTTON
	        {
	        	
	        	
	        	if(rb1.isSelected())
				{
						
					if(comboBox.getSelectedItem().toString()== "12:00pm-2:00pm")
					{
						for(int i=0; i<seat.size();i++)
						{
						
						   Order ord=new Order(movie1.getTitle(), movie1.getSchedule1().getTime(),movie1.getPrice(),seat.get(i));
						   ord.addToDatabase();
						}
					}
					
					else if(comboBox.getSelectedItem().toString()== "2:30pm-3:30pm")
					{
						for(int i=0; i<seat.size();i++)
						{
							Order ord=new Order(movie1.getTitle(), movie1.getSchedule2().getTime(),movie1.getPrice(),seat.get(i));
							ord.addToDatabase();
						}
					}
					
					else if(comboBox.getSelectedItem().toString()== "4:00pm-6:30pm")
					{
						for(int i=0; i<seat.size();i++)
						{
							Order ord=new Order(movie1.getTitle(), movie1.getSchedule3().getTime(),movie1.getPrice(),seat.get(i));
							ord.addToDatabase();
						}
					}
					
					else if(comboBox.getSelectedItem().toString()== "7:00pm-9:00pm")
					{
						for(int i=0; i<seat.size();i++)
						{
							Order ord=new Order(movie1.getTitle(), movie1.getSchedule4().getTime(),movie1.getPrice(),seat.get(i));
							ord.addToDatabase();
						}
					}
						 
				} // end of rb1
				
				else if(rb2.isSelected())
				{
					if(comboBox.getSelectedItem().toString()== "12:00pm-2:00pm")
					{
						for(int i=0; i<seat.size();i++)
						{
							Order ord=new Order(movie2.getTitle(), movie2.getSchedule1().getTime(),movie2.getPrice(),seat.get(i));
							ord.addToDatabase();
						}
					}
					
					else if(comboBox.getSelectedItem().toString()== "2:30pm-3:30pm")
					{
						for(int i=0; i<seat.size();i++)
						{
							Order ord=new Order(movie2.getTitle(), movie2.getSchedule2().getTime(),movie2.getPrice(),seat.get(i));
							ord.addToDatabase();
						}
					}
					
					else if(comboBox.getSelectedItem().toString()== "4:00pm-6:30pm")
					{
						for(int i=0; i<seat.size();i++)
						{
							Order ord=new Order(movie2.getTitle(), movie2.getSchedule3().getTime(),movie2.getPrice(),seat.get(i));
							ord.addToDatabase();
						}
					}
					
					else if(comboBox.getSelectedItem().toString()== "7:00pm-9:00pm")
					{
						for(int i=0; i<seat.size();i++)
						{
							Order ord=new Order(movie2.getTitle(), movie2.getSchedule4().getTime(),movie2.getPrice(),seat.get(i));
							ord.addToDatabase();
						}
					}
				}
				
				else if(rb3.isSelected())
				{
					if(comboBox.getSelectedItem().toString()== "12:00pm-2:00pm")
					{
						for(int i=0; i<seat.size();i++)
						{
							Order ord=new Order(movie3.getTitle(), movie3.getSchedule1().getTime(),movie3.getPrice(),seat.get(i));
							ord.addToDatabase();
						}
					}
					
					else if(comboBox.getSelectedItem().toString()== "2:30pm-3:30pm")
					{
						for(int i=0; i<seat.size();i++)
						{
							Order ord=new Order(movie3.getTitle(), movie3.getSchedule2().getTime(),movie3.getPrice(),seat.get(i));
							ord.addToDatabase();
						}
					}
					
					else if(comboBox.getSelectedItem().toString()== "4:00pm-6:30pm")
					{
						for(int i=0; i<seat.size();i++)
						{
							Order ord=new Order(movie3.getTitle(), movie3.getSchedule3().getTime(),movie3.getPrice(),seat.get(i));
							ord.addToDatabase();
						}
					}
					
					else if(comboBox.getSelectedItem().toString()== "7:00pm-9:00pm")
					{
						for(int i=0; i<seat.size();i++)
						{
							Order ord=new Order(movie3.getTitle(), movie3.getSchedule4().getTime(),movie3.getPrice(),seat.get(i));
							ord.addToDatabase();
						}
					}
				}
				
				else if(rb4.isSelected())
				{
					if(comboBox.getSelectedItem().toString()== "12:00pm-2:00pm")
					{
						for(int i=0; i<seat.size();i++)
						{
							Order ord=new Order(movie4.getTitle(), movie4.getSchedule1().getTime(),movie4.getPrice(),seat.get(i));
							ord.addToDatabase();
						}
					}
					
					else if(comboBox.getSelectedItem().toString()== "2:30pm-3:30pm")
					{
						for(int i=0; i<seat.size();i++)
						{
							Order ord=new Order(movie4.getTitle(), movie4.getSchedule2().getTime(),movie4.getPrice(),seat.get(i));
							ord.addToDatabase();
						}
					}
					
					else if(comboBox.getSelectedItem().toString()== "4:00pm-6:30pm")
					{
						for(int i=0; i<seat.size();i++)
						{
							Order ord=new Order(movie4.getTitle(), movie4.getSchedule3().getTime(),movie4.getPrice(),seat.get(i));
							ord.addToDatabase();
						}
					}
					
					else if(comboBox.getSelectedItem().toString()== "7:00pm-9:00pm")
					{
						for(int i=0; i<seat.size();i++)
						{
							Order ord=new Order(movie4.getTitle(), movie4.getSchedule4().getTime(),movie4.getPrice(),seat.get(i));
							ord.addToDatabase();
						}
					}
				}
	            
	             	
	            	
	            }});
		
		
		JButton btnNewOrder = new JButton("New Order");
		btnNewOrder.setBounds(338, 213, 100, 23);
		panel.add(btnNewOrder);
		btnNewOrder.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)                                       //New Order
	        {
	        	
	        	MovieLabel.setText("");
	            SeatLabel.setText("");	
	            ScheduleLabel.setText("");
	            TicketLabel.setText("");
	            PriceLabel.setText("");
	            TotalLabel.setText("");
	            spinner.setValue(1);
	           
	            }});
		
		
		
		JLabel lblTotal = new JLabel("TOTAL: ");
		lblTotal.setBounds(306, 171, 46, 14);
		panel.add(lblTotal);
		
		TotalLabel = new JLabel("");
		TotalLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		TotalLabel.setBounds(365, 171, 193, 16);
		panel.add(TotalLabel);
		
	}
	
	public String getSeatNum()
	{
		return Integer.toString(seatNum);
	}
	
	public String getTotal(int x,int y)
	{
		String total;
		int calc;
	    calc=x*y;
	    total= Integer.toString(calc);
	    return total;
	}
}
