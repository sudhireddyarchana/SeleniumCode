package runner;

public class CallByValue {
	
	public void method(int x,int y)
	{
		x=x+y;
		System.out.println("the value of x is:"+x);
	}

	public static void main(String[] args) {
		 CallByValue  cb=new  CallByValue ();
		 cb.method(10,40);
		int x=30;
		System.out.println("The value of x is:"+x);

	}

}
