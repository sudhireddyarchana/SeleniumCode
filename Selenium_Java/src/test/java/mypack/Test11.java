package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test11 {

	public static void main(String[] args)throws Exception {
		//open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch site
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		//locate an element
		WebElement e=driver.findElement(By.name("q"));
		//operate element
		e.sendKeys("nagarjuna",Keys.ENTER);
		Thread.sleep(5000);
		//back to previous page
		driver.navigate().back();
		//again operate element
		e.sendKeys("abdulkalam");
		driver.close();
		

	}

}
