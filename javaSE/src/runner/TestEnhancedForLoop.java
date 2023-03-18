package runner;

import java1.EnhancedForLoop;

public class TestEnhancedForLoop {

	public static void main(String[] args) 
	{
		EnhancedForLoop ef= new EnhancedForLoop();
		int[] value= {12,3,8,6};
		ef.retrievePrimitivesFromArray(value);
		String[] names= {"archana","bubby"};
		ef.retrieveReferenceFromArray(names);

	}

}
