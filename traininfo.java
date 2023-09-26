package trainbooking;

public class traininfo {

	
  	private int trainno ;
	 private int capacity ;
	private boolean sleeper ;
	private String s1;
	private String s2;

	
	traininfo(int n,int c,boolean b,String s,String s0){
		this.trainno=n;
		this.capacity=c; 
		this.sleeper =b;
		this.s1=s;
		this.s2=s0;
	
	}
		
	 public int getcapacity()	 {
		   return capacity ;
		}
	 
	 public void setcapacity(int n)
	 {
		 capacity=n;
	 
		}
		
	 public boolean getsleeper()	 {
		   return sleeper ;
		}
	 
	 public void setsleeper(boolean n)
	 {
		 sleeper=n;
	 
		 
		}
		
	 public  int gettrainno()	 {
		   return trainno ;
		}
	 
	 public void settrainno(int n)
	 {
		 trainno=n;
	 
		}
	 public int getfromto1() {
		 if(s1=="chennaitosalem(1)")
		 {
			 return 1 ;
		 }else 
			 return 0;
		 
	 }
	 public int getfromto2() {
		 if(s2=="salemtochennai(2)")
		 {
			 return 1 ;
		 }else 
			 return 0;
		 
	 }
	
	
	 
	 
	 public void displayinfo()
	 {
		 System.out.println("trainno   "+trainno+"   capacity    "+capacity+"   sleeper: "+sleeper+ "  fromto1 :"+s1  );
	 }


}
