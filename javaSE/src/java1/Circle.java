package java1;

public class Circle implements Shape
{
private double radius;
public Circle(double radius)
{
	this.radius=radius;
}
public void draw()
{
	System.out.println("drawing a circle ......");
}
public double getArea()
{
	return PI*radius*radius;
}

}

