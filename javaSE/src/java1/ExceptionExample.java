package java1;

public class ExceptionExample 
{
public int exceptionExample(int firstNum,int secondNum)
{
	System.out.println("Method started: ");
	int result=0;
	try {
	 result=firstNum/secondNum;
	 System.out.println("Result in try block: "+result);
	return result;
	}
	catch(Exception e)
	{
		System.out.println("Exception found so catch block started executing: ");
		System.out.println("Result in catch block: "+result);
		return result;
	}
	//return result;
}
}
