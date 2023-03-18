package java1;

public class Dummy
{
public int emp;
public String name;
public static String colname="JNTUH";
public void method1(int emp,String st)
{
	this.emp=emp;
	this.name=st;
	System.out.println(emp+ "," +name+ ","+colname);
}
public static void method2()
{
	colname="osmania";
	System.out.println(colname);
}
}
