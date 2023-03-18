package java1;

public class EnhancedForLoop 
{
public void retrievePrimitivesFromArray(int[] empids)
{
	for(int empid:empids)
	{
		System.out.println(empid);
	}
}
public void retrieveReferenceFromArray(String[] names)
{
	for(String name:names)
	{
		System.out.println(name);
	}
}
}
