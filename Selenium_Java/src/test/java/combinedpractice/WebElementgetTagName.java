package combinedpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementgetTagName {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
	    RemoteWebDriver driver =new ChromeDriver();
	    driver.get("https://www.google.com");
	    WebElement e=driver.findElement(By.name("q"));
	    String x=e.getTagName();
	    System.out.println("tagname is: "+x);
	    String a=e.getAccessibleName();
	    System.out.println("remembering name: "+a);
	    String b=e.getAriaRole();
	    System.out.println("remembering type: "+b);
	    String c=e.getDomAttribute(x);
	    System.out.println("dom attribute is: "+c);
	    String d=e.getDomProperty(x);
	    System.out.println("dom property is: "+d);

	}

}
