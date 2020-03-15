import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JButton;
public class SeatGroup {
	private JPanel Seats;
	private JLayeredPane layeredPane;
	private int seatnum;
	private JButton btnFinish;	
	private JFrame frame;
	private ArrayList<String> seat;
	private String seatArrangement= "";
	private JButton btnA1,btnA2,btnA3,btnA4,btnA5,btnA6,btnA7,btnA8;
	private JButton btnB1,btnB2,btnB3,btnB4,btnB5,btnB6,btnB7,btnB8;
	private JButton btnC1,btnC2,btnC3,btnC4,btnC5,btnC6,btnC7,btnC8;
	private JButton btnD1,btnD2,btnD3,btnD4,btnD5,btnD6,btnD7,btnD8;
	private JButton btnE1,btnE2,btnE3,btnE4,btnE5,btnE6,btnE7,btnE8;
	public SeatGroup()
	{
		seat= new ArrayList<String>();
		frame = new JFrame();
		frame.setBounds(100, 100, 681, 417);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 11, 645, 356);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		frame.setVisible(false);
		
		
		Seats = new JPanel();
		layeredPane.add(Seats);
		Seats.setLayout(null);
		
		
	
		btnA1 = new JButton("A1");
		btnA1.setBounds(10, 281, 61, 44);
		Seats.add(btnA1);
		btnA1.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnA1 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnA1.setEnabled(false);  
	                  seat.add(btnA1.getText());
	                  update();     
	               }
	            }}});
		
		
		btnA2 = new JButton("A2");
		btnA2.setBounds(81, 281, 61, 44);
		Seats.add(btnA2);
		btnA2.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnA2 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	               {
	                  seatnum--;
	                  btnA2.setEnabled(false);  
	                  seat.add(btnA2.getText());
	                  update();     
	               }
	            }}});
		
		
		btnA3 = new JButton("A3");
		btnA3.setBounds(152, 281, 61, 44);
		Seats.add(btnA3);
		btnA3.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnA3 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnA3.setEnabled(false);  
	                  seat.add(btnA3.getText());
	                  update();     
	               }
	            }}});
		
		
		btnA4 = new JButton("A4");
		btnA4.setBounds(259, 281, 61, 44);
		Seats.add(btnA4);
		btnA4.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnA4 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnA4.setEnabled(false);  
	                  seat.add(btnA4.getText());
	                  update();     
	               }
	            }}});
		
		
		btnA5 = new JButton("A5");
		btnA5.setBounds(330, 281, 61, 44);
		Seats.add(btnA5);
		btnA5.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnA5 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnA5.setEnabled(false);  
	                  seat.add(btnA5.getText());
	                  update();     
	               }
	            }}});
		
		
		btnA6 = new JButton("A6");
		btnA6.setBounds(432, 281, 61, 44);
		Seats.add(btnA6);
		btnA6.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnA6 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnA6.setEnabled(false);  
	                  seat.add(btnA6.getText());
	                  update();     
	               }
	            }}});
		
		
		btnA7 = new JButton("A7");
		btnA7.setBounds(503, 281, 61, 44);
		Seats.add(btnA7);
		btnA7.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnA7 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnA7.setEnabled(false);  
	                  seat.add(btnA7.getText());
	                  update();     
	               }
	            }}});
		
		
		btnA8 = new JButton("A8");
		btnA8.setBounds(574, 281, 61, 44);
		Seats.add(btnA8);
		btnA8.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnA8 == (JButton)e.getSource())
	            {
	                 if(seatnum>0)
	                {
	                  seatnum--;
	                  btnA8.setEnabled(false);  
	                  seat.add(btnA8.getText());
	                  update();     
	               }
	            }}});
		
		
		btnB1 = new JButton("B1");
		btnB1.setBounds(10, 226, 61, 44);
		Seats.add(btnB1);
		btnB1.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnB1 == (JButton)e.getSource())
	            {
	                 if(seatnum>0)
	                {
	                  seatnum--;
	                  btnB1.setEnabled(false);  
	                  seat.add(btnB1.getText());
	                  update();     
	               }
	            }}});
		
		
		btnB2 = new JButton("B2");
		btnB2.setBounds(81, 226, 61, 44);
		Seats.add(btnB2);
		btnB2.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnB2 == (JButton)e.getSource())
	            {
	                  if(seatnum>0)
	                {
	                  seatnum--;
	                  btnB2.setEnabled(false);  
	                  seat.add(btnB2.getText());
	                  update();     
	               }
	            }}});
		
		
		btnB3 = new JButton("B3");
		btnB3.setBounds(152, 226, 61, 44);
		Seats.add(btnB3);
		btnB3.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnB3 == (JButton)e.getSource())
	            {
	                  if(seatnum>0)
	                {
	                  seatnum--;
	                  btnB3.setEnabled(false);  
	                  seat.add(btnB3.getText());
	                  update();     
	               }
	            }}});
		
		
		btnB4 = new JButton("B4");
		btnB4.setBounds(259, 226, 61, 44);
		Seats.add(btnB4);
		btnB4.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnB4 == (JButton)e.getSource())
	            {
	                  if(seatnum>0)
	                {
	                  seatnum--;
	                  btnB4.setEnabled(false);  
	                  seat.add(btnB4.getText());
	                  update();     
	               }
	            }}});
		
		
		btnB5 = new JButton("B5");
		btnB5.setBounds(330, 226, 61, 44);
		Seats.add(btnB5);
		btnB5.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnB5 == (JButton)e.getSource())
	            {
	                  if(seatnum>0)
	                {
	                  seatnum--;
	                  btnB5.setEnabled(false);  
	                  seat.add(btnB5.getText());
	                  update();     
	               }
	            }}});
		
		
	        btnB6 = new JButton("B6");
		btnB6.setBounds(432, 226, 61, 44);
		Seats.add(btnB6);
		btnB6.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnB6 == (JButton)e.getSource())
	            {
	                  if(seatnum>0)
	                {
	                  seatnum--;
	                  btnB6.setEnabled(false);  
	                  seat.add(btnB6.getText());
	                  update();     
	               }
	            }}});
		
		
		btnB7 = new JButton("B7");
		btnB7.setBounds(503, 226, 61, 44);
		Seats.add(btnB7);
		btnB7.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnB7 == (JButton)e.getSource())
	            {
	                  if(seatnum>0)
	                {
	                  seatnum--;
	                  btnB7.setEnabled(false);  
	                  seat.add(btnB7.getText());
	                  update();     
	               }
	            }}});
		
		
		btnB8 = new JButton("B8");
		btnB8.setBounds(574, 226, 61, 44);
		Seats.add(btnB8);
		btnB8.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnB8 == (JButton)e.getSource())
	            {
	                  if(seatnum>0)
	                {
	                  seatnum--;
	                  btnB8.setEnabled(false);  
	                  seat.add(btnB8.getText());
	                  update();     
	               }
	            }}});
		
		
		btnC1 = new JButton("C1");
		btnC1.setBounds(10, 171, 61, 44);
		Seats.add(btnC1);
		btnC1.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnC1 == (JButton)e.getSource())
	            {
	                  if(seatnum>0)
	                {
	                  seatnum--;
	                  btnC1.setEnabled(false);  
	                  seat.add(btnC1.getText());
	                  update();     
	               }
	            }}});
		
		
		btnC2 = new JButton("C2");
		btnC2.setBounds(81, 171, 61, 44);
		Seats.add(btnC2);
		btnC2.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnC2 == (JButton)e.getSource())
	            {
	                  if(seatnum>0)
	                {
	                  seatnum--;
	                  btnC2.setEnabled(false);  
	                  seat.add(btnC2.getText());
	                  update();     
	               }
	            }}});
		
		
		btnC3 = new JButton("C3");
		btnC3.setBounds(152, 171, 61, 44);
		Seats.add(btnC3);
		btnC3.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnC3 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnC3.setEnabled(false);  
	                  seat.add(btnC3.getText());
	                  update();     
	               }
	            }}});
		
		
		btnC4 = new JButton("C4");
		btnC4.setBounds(259, 171, 61, 44);
		Seats.add(btnC4);
		btnC4.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnC4 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnC4.setEnabled(false);  
	                  seat.add(btnC4.getText());
	                  update();     
	               }
	            }}});
		
		
		btnC5 = new JButton("C5");
		btnC5.setBounds(330, 171, 61, 44);
		Seats.add(btnC5);
		btnC5.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnC5 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnC5.setEnabled(false);  
	                  seat.add(btnC5.getText());
	                  update();     
	               }
	            }}});
		
		
		btnC6 = new JButton("C6");
		btnC6.setBounds(432, 171, 61, 44);
		Seats.add(btnC6);
		btnC6.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnC6 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnC6.setEnabled(false);  
	                  seat.add(btnC6.getText());
	                  update();     
	               }
	            }}});
		
		
		btnC7 = new JButton("C7");
		btnC7.setBounds(503, 171, 61, 44);
		Seats.add(btnC7);
		btnC7.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnC7 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnC7.setEnabled(false);  
	                  seat.add(btnC7.getText());
	                  update();     
	               }
	            }}});
		
		
		btnC8 = new JButton("C8");
		btnC8.setBounds(574, 171, 61, 44);
		Seats.add(btnC8);
		btnC8.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnC8 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnC8.setEnabled(false);  
	                  seat.add(btnC8.getText());
	                  update();     
	               }
	            }}});
		
		
		btnD1 = new JButton("D1");
		btnD1.setBounds(10, 116, 61, 44);
		Seats.add(btnD1);
		btnD1.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnD1 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnD1.setEnabled(false);  
	                  seat.add(btnD1.getText());
	                  update();     
	               }
	            }}});
		
		
		btnD2 = new JButton("D2");
		btnD2.setBounds(81, 116, 61, 44);
		Seats.add(btnD2);
		btnD2.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnD2 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnD2.setEnabled(false);  
	                  seat.add(btnD2.getText());
	                  update();     
	               }
	            }}});
		
		
		btnD3 = new JButton("D3");
		btnD3.setBounds(152, 116, 61, 44);
		Seats.add(btnD3);
		btnD3.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnD3 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnD3.setEnabled(false);  
	                  seat.add(btnD3.getText());
	                  update();     
	               }
	            }}});
		
		
		btnD4 = new JButton("D4");
		btnD4.setBounds(259, 116, 61, 44);
		Seats.add(btnD4);
		btnD4.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnD4 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnD4.setEnabled(false);  
	                  seat.add(btnD4.getText());
	                  update();     
	               }
	            }}});
		
		
		btnD5 = new JButton("D5");
		btnD5.setBounds(330, 116, 61, 44);
		Seats.add(btnD5);
		btnD5.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnD5 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnD5.setEnabled(false);  
	                  seat.add(btnD5.getText());
	                  update();     
	               }
	            }}});
		
		
		btnD6 = new JButton("D6");
		btnD6.setBounds(432, 116, 61, 44);
		Seats.add(btnD6);
		btnD6.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnD6 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnD6.setEnabled(false);  
	                  seat.add(btnD6.getText());
	                  update();     
	               }
	            }}});
		
		
		btnD7 = new JButton("D7");
		btnD7.setBounds(503, 116, 61, 44);
		Seats.add(btnD7);
		btnD7.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnD7 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnD7.setEnabled(false);  
	                  seat.add(btnD7.getText());
	                  update();     
	               }
	            }}});
		
		
	        btnD8 = new JButton("D8");
		btnD8.setBounds(574, 116, 61, 44);
		Seats.add(btnD8);
		btnD8.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnD8 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnD8.setEnabled(false);  
	                  seat.add(btnD8.getText());
	                  update();     
	               }
	            }}});
		
		
		btnE1 = new JButton("E1");
		btnE1.setBounds(10, 61, 61, 44);
		Seats.add(btnE1);
		btnE1.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnE1 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnE1.setEnabled(false);  
	                  seat.add(btnE1.getText());
	                  update();     
	               }
	            }}});
		
		
		btnE2 = new JButton("E2");
		btnE2.setBounds(81, 61, 61, 44);
		Seats.add(btnE2);
		btnE2.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnE2 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnE2.setEnabled(false);  
	                  seat.add(btnE2.getText());
	                  update();     
	               }
	            }}});
		
		
		btnE3 = new JButton("E3");
		btnE3.setBounds(152, 61, 61, 44);
		Seats.add(btnE3);
		btnE3.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnE3 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnE3.setEnabled(false);  
	                  seat.add(btnE3.getText());
	                  update();     
	               }
	            }}});
		
		
		btnE4 = new JButton("E4");
		btnE4.setBounds(259, 61, 61, 44);
		Seats.add(btnE4);
		btnE4.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnE4 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnE4.setEnabled(false);  
	                  seat.add(btnE4.getText());
	                  update();     
	               }
	            }}});
		
		
		btnE5 = new JButton("E5");
		btnE5.setBounds(330, 61, 61, 44);
		Seats.add(btnE5);
		btnE5.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnE5 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnE5.setEnabled(false);  
	                  seat.add(btnE5.getText());
	                  update();     
	               }
	            }}});
		
		
		btnE6 = new JButton("E6");
		btnE6.setBounds(432, 61, 61, 44);
		Seats.add(btnE6);
		btnE6.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnE6 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnE6.setEnabled(false);  
	                  seat.add(btnE6.getText());
	                  update();     
	               }
	            }}});
		
		
		btnE7 = new JButton("E7");
		btnE7.setBounds(503, 61, 61, 44);
		Seats.add(btnE7);
		btnE7.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnE7 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnE7.setEnabled(false);  
	                  seat.add(btnE7.getText());
	                  update();     
	               }
	            }}});
		
		
		btnE8 = new JButton("E8");
		btnE8.setBounds(574, 61, 61, 44);
		Seats.add(btnE8);
		btnE8.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            //If Button is clicked, make the button unclickable
	            if(btnE8 == (JButton)e.getSource())
	            {
	                if(seatnum>0)
	                {
	                  seatnum--;
	                  btnE8.setEnabled(false);  
	                  seat.add(btnE8.getText());
	                  update();     
	               }
	            }}});
		
		
	    btnFinish = new JButton("Finish");
		btnFinish.setBounds(546, 336, 89, 23);
		Seats.add(btnFinish);
		btnFinish.setEnabled(false);
		btnFinish.addActionListener(new ActionListener()                         //FINISH BUTTON
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	        	frame.setVisible(false);                                      
	        	btnFinish.setEnabled(false);
	        	seatArrangement="";
	        	
	            }});
		
		
		
	} //END OF CONSTRUCTOR
	
	private void update()
	{
		if(seatnum==0)
		{
	        btnFinish.setEnabled(true);
		}
	}
	
	public void getSeats()
	{
		
		frame.setVisible(true);
		seat.clear();
	}
	
	public void setSeatNum(int seatnum)
	{
		this.seatnum = seatnum;
	}
	
	public String getSeatArrangement()
	{
		
		for(int i=0;i<seat.size();i++)
		{
		seatArrangement = seatArrangement + seat.get(i);
		if(i<seat.size()-1)
		{
			seatArrangement= seatArrangement+",";
		}
		
		}	
	
		
		return seatArrangement;
		
	}
	
	public ArrayList<String> getSeatArray()
	{
		return seat;
	}
	
}
