package runner;

import java1.Circle;
import java1.Rectangle;
import java1.Shape;

public class TestInterface {

	public static void main(String[] args)
	{
		Shape s = new Circle(10.5); 
		s.draw();
		double carea = s.getArea();
		System.out.println("Circle Area:"+carea);
		System.out.println("----------------------");
		Rectangle s1 = new Rectangle(10.5,10.5);
		s.draw();
		double rarea = s1.getArea();
		System.out.println("Rectangle Area:"+rarea);
	}

	}


