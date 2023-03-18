package mypack;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test47manage {
	 public static void main(String[] args)throws Exception {
			//open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//Launch site
			driver.get("https://www.google.com");
			Thread.sleep(5000);
			driver.manage().window().maximize();//maximize the browser window
			Thread.sleep(3000);
			driver.manage().window().minimize();//minimize
			Thread.sleep(3000);
			//get size of the browser window
			Dimension d=driver.manage().window().getSize();
			System.out.println(d.getWidth());
			System.out.println(d.getHeight());
			Thread.sleep(5000);
			Dimension d1=new Dimension(200,200);//set size
			driver.manage().window().setSize(d1);
			Thread.sleep(5000);
			//get position
			Point p=driver.manage().window().getPosition();
			System.out.println(p.getX());
			System.out.println(p.getY());
			//set position
			Point p1=new Point(100,100);
			driver.manage().window().setPosition(p1);
			Thread.sleep(5000);
        
}
}
