package combinedpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementgetSizeLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    RemoteWebDriver driver =new ChromeDriver();
	    driver.get("https://www.google.com");
	    WebElement e= driver.findElement(By.name("q"));
	    Dimension d= e.getSize();
	    System.out.println(d);
	    int x= d.getWidth();
	    System.out.println("Width of an element: "+x);
	    int y=d.getHeight();
	    System.out.println("Height of an element is: "+y);
	    Point p=e.getLocation();
	    int w=p.getX();
	    System.out.println("x coordinate: "+w);
	    int v=p.getY();
	    System.out.println("y coordinate: "+v);
	    Rectangle r=e.getRect();
	    System.out.println("R value is: "+r);
	    int a= r.getWidth();
	    System.out.println("Width of an element is: "+a);
	    int b=r.getHeight();
	    System.out.println("Height of an element is: "+b);
	    int c=r.getX();
	    System.out.println("x coordinate: "+c);
	    int f=r.getY();
	    System.out.println("y coordinate: "+f);
	    
	    

	}

}
