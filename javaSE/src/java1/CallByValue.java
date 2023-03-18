package java1;

public class CallByValue 
{
/* int eid;
 String ename;
 public int setEid(int x)
 {
	 this.eid=x;
	 System.out.println("Eid value here is:" +x);
	 x=10;
	 System.out.println("Eid in original method is: "+x);
	 return x; 
 }*/
 public void callByValue(int y)
 {
	 
	System.out.println("Public method execution started: "); 
	y=y+10;
	System.out.println("The value of x in general method is: " +y);

 }
	public static void main(String[] args) 
	{
		// Call By value example
		int x=10;
		CallByValue cby=new CallByValue();
		cby.callByValue(x);
		//int res=cby.setEid(20);
		//System.out.println("Eid in main method is: "+res);
		System.out.println("The x value in main method is: "+x);

	}

}
