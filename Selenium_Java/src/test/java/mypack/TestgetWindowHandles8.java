package mypack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestgetWindowHandles8 {

	public static void main(String[] args)throws Exception
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.w3schools.com/tags/tag_input.asp");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Try')]")).click();
		Set<String> x=driver.getWindowHandles();
		System.out.println(x);
		driver.quit();
		
	}

}
