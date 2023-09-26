package trainbooking;
import java.util.* ;

public class bookingpage {
	
	

	public static void main(String[] args) {
		
		ArrayList<traininfo> trains= new ArrayList<traininfo>();
		 trains.add(new traininfo(10098,2,true,"chennaitosalem(1)","salemtochennai(2)"));	
		
		 trains.add(new traininfo(20098,2,true, "chennaitosalem(1)","salemtochennai(2)"));
		 trains.add(new traininfo(30098,2,true,"chennaitosalem(1)","salemtochennai(2)"));
		 for(traininfo b : trains) {
		    b.displayinfo();}
		 
	 ArrayList<booking> bookings = new  ArrayList<booking>();
		  
       Scanner scanner = new Scanner(System.in);
		
       int po =1;
		while(po==1)
		{   System.out.println();
			System.out.println("enter 1 for booking");
			int n=scanner.nextInt();
			
			if(n==1) {
				System.err.println("WWELCOME TO OUR PAGE");
				System.err.println(" HAVE A SAFE TRAVEL");
				booking book =new booking();
				
					if(book.isavailable(trains,bookings)) 
					{
					  System.out.println("your ticket was booked ,have a safe journey !!!");
					   bookings.add(book);
					}
					else
					{
						System.err.println("this train ticket was already full,so try another train !!!");
					}
				
				}
				
			  po=n;
		
		}
		
	
	}
		
}	

	
