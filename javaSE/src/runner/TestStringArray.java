package runner;

import java1.StringArray;

public class TestStringArray {

	public static void main(String[] args)
	{
		StringArray sta= new StringArray();
		String[] sname= new String[2];
		sname[0]="archana";
		sname[1]="bubby";
		sta.studentNames(sname);
		System.out.println(sname.length);
		
	}

}
