package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestgetLocation17 {
		public static void main(String[] args)throws Exception {
			//open browser
			WebDriverManager.chromedriver().setup();
			RemoteWebDriver driver=new ChromeDriver();
			//Launch site 
			driver.get("https://www.gmail.com");
			Thread.sleep(5000);
			//trying to get size,location of hidden password
			WebElement e=driver.findElement(By.xpath("//input[@name='hiddenPassword']"));
			//get size
			int w=e.getSize().getWidth();
			int h=e.getSize().getHeight();
			//get location
			System.out.println(w+" "+h);
			//get rectangle(location+size)
			int x=e.getLocation().getX();
			int y=e.getLocation().getY();
			System.out.println(x+" "+y);
			int w1=e.getRect().getWidth();
			int h1=e.getRect().getHeight();
			int x1=e.getRect().getX();
			int y1=e.getRect().getY();
			System.out.println(w1+" "+h1+" "+x1+" "+y1);
			driver.close();

	}

}
