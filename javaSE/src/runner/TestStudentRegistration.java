package runner;

import java1.Product;
import java1.Student;
import java1.StudentRegistraionService;

public class TestStudentRegistration {

	public static void main(String[] args) {
	StudentRegistraionService srs = new StudentRegistraionService();
	//create an object to student class
	 Student student= new Student();
	 student.setStudentId(10004);
	 student.setStudentName("ArchanaReddy");
	 //create an object to product class
	 Product product= new Product();
	 product.setProductId(2004);
	 product.setProductName("iphone");
	 //call class type mathod by passing that class object as argument
	 srs.register(student);
	 srs.save(product);
	 
	 
	}

}
