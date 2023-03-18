package java1;

public class StudentRegistraionService
{
public void register(Student st)
{
	int result=st.getStudentId();
	System.out.println(result);
	String name=st.getStudentName();
	System.out.println(name);
}
public void save(Product p)
{
	int pid=p.getProductId();
	System.out.println(pid);
	String pname=p.getProductName();
	System.out.println(pname);
}
}
