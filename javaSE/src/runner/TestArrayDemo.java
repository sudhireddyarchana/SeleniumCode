package runner;

import java1.ArrayDemo;

public class TestArrayDemo {

	public static void main(String[] args)
	{
		ArrayDemo arr = new ArrayDemo();
		arr.printMessage(20);
		int[] empids= new int[3];
		empids[0]=101;
		empids[1]=102;
		empids[2]=103;
		arr.printArray(empids);
		
	}

}
