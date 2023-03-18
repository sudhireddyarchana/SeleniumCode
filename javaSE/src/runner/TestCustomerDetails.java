package runner;

import java1.CustomerDetails;

public class TestCustomerDetails {

	public static void main(String[] args)
	{
		CustomerDetails custd=new CustomerDetails();
		//call instance variables by using object
		int id=custd.Custid;
		System.out.println(id);
		String name=custd.custName;
		System.out.println(name);
		//call static methods by using class name
		String code=CustomerDetails.countryCode;
		System.out.println(code);
		int a=CustomerDetails.x;
		System.out.println(a);
		

	}

}
