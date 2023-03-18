package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test26getAttribute {
	public static void main(String[] args) throws Exception
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//Launch site(operation)
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		//Locate element
		WebElement e=driver.findElement(By.xpath("//button[text()='Forgot email?']"));
		//get attribute type for given element
		String x=e.getAttribute("jsname");
		System.out.println(x);
		//get cssproperty for given element
		String y=e.getCssValue("color");
		System.out.println(y);
		//close
		driver.close();

}}
