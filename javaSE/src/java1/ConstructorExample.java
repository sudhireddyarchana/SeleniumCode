package java1;

public class ConstructorExample
{

		// TODO Auto-generated method stub
		public int studentId;
		public String studentName;
		public ConstructorExample(int sid, String sname)
		{
			this.studentId=sid;
			this.studentName=sname;
		}
		public void method()
		{
			System.out.println(studentId+ "," +studentName);
		}

	
     public static void main(String[] args)
     {
    	 ConstructorExample ce=new ConstructorExample(10,"Archana");
    	 ce.method();
    	 ConstructorExample ce1=new ConstructorExample(20, "Arun");
    	 ce1.method();
    	 System.out.println("Student Id is "+ce1.studentId);
    	 System.out.println("Student name is "+ce1.studentName);
    	 
     }

}
