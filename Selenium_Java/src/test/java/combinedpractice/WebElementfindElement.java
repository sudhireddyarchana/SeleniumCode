package combinedpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementfindElement {

	public static void main(String[] args) throws Exception 
	{
	
	 WebDriverManager.chromedriver().setup();
	 RemoteWebDriver driver =new ChromeDriver();
	 driver.get("https://www.gmail.com");
	 driver.findElement(By.name("identifier")).sendKeys("emailforselenium2");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//span[text()='Next']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Cust@247",Keys.ENTER);
	 Thread.sleep(5000);
	 // driver.findElement(By.xpath("//span[text()='Next']")).click();
	  WebElement e=driver.findElement(By.xpath("(//table)[6]/tbody/tr[1]/td[4]/div[1]"));
      String x=(String) driver.executeScript("return(arguments[0].textContent)", e);
      System.out.println("text is :"+x);

	}

}
