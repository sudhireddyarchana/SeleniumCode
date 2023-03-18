package runner;

import java1.Student2;
import java1.Student3;

public class TestStudent2Service {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Student3 s=new Student3();
		Student2 st=new Student2(10,"asdf");
		s.update(st);
		System.out.println("Student3 value after updateis: "+st.getSname());
	}
     
	}


