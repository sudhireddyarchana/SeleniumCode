package runner;

import java1.CalculatorService;

public class TestCalculatorService {

	public static void main(String[] args)
	{
	CalculatorService calserv=new CalculatorService();
	int result=calserv.add(20, 50);//instance method calling by using object
	System.out.println(result);

	}

}
