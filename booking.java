package trainbooking;
import java.util.* ;
import java.text.*;

public class booking {
	 public String name ;
	  int trainno ;
	  Date date ;
	  int fromto ;
	  booking() {
		  Scanner sc = new  Scanner(System.in);
		  System.out.println("enter your name ");
		 
		  String n =sc.next();
		  name = n;
		  System.out.println("enter your train no : ");
			 
		  int a =sc.nextInt();
		  trainno=a;
		  System.out.println("enter your date in dd-mm-yyyy ");
		  String dat =sc.next();		  
		  SimpleDateFormat dateformat= new   SimpleDateFormat("dd-MM-yyyy");
		  
			try {
				date=dateformat.parse(dat);
			} catch (ParseException e) {
				
				e.printStackTrace();
			}
			System.out.println("enter your from and to :");
			int z= sc.nextInt();
			fromto=z;
			
			
			
	  }
	  
			public boolean isavailable(ArrayList<traininfo> trains,ArrayList<booking> bookings) {
				
				int capacity=0 ;
				int cap =0 ;
				for(traininfo b :trains)
				{
				
					if(b.gettrainno()==trainno) {
				          capacity=b.getcapacity() ;
				          }
					 
					
				}	
				int booked=0;
				
				for(booking c : bookings) {
					if(c.trainno==trainno && c.date.equals(date) ) {
						++cap;
						} 
					 
					}
				  
				return cap<capacity? true: false;
				  
				  
				
			}
			
			
			
			
			
			
			
	  }