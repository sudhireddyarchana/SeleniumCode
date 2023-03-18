package runner;

public class Test1 {
	public int x;
	public int y;
	public int method(int x,int y)
	{
		
		return x+y;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       Test1 t1= new Test1();
       System.out.println(t1.x);
       int x= t1.method(5, 10);
       System.out.println(x); 
      
	}

}
