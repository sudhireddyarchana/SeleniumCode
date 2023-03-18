package combinedpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementGetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		    RemoteWebDriver driver =new ChromeDriver();
		    driver.get("https://www.google.com");
		    WebElement e=driver.findElement(By.name("q"));
		   String x= e.getAttribute("type");
		   System.out.println("Attribute type is :"+x);

	}

}
