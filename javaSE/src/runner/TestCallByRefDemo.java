package runner;

import java1.Student1;

public class TestCallByRefDemo {

				
			//caller method
			public static void main(String[] args) {
				TestCallByRefDemo tcrd = new TestCallByRefDemo();
				Student1 st = new Student1(101,"raja");
				tcrd.update(st);//method invoke/call/access
				System.out.println("After update:"+st.getSname());
			}
			
			
			//called method             //std = st
			public void update(Student1 std) {
				std.setSname("sekhar");
				System.out.println("Studnet Name from update:"+std.getSname());
			}
		}

	


