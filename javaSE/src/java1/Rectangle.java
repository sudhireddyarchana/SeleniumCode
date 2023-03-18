package java1;
	public class Rectangle implements Shape
	{
		private double length;
		private double width;
	public Rectangle(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	public void draw()
	{
		System.out.println("draw a rectangle......");
	}
	public double getArea()
	{
		return length*width;
	}
}
