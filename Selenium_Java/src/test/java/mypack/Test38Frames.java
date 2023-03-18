package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test38Frames{

	public static void main(String[] args)throws Exception {
		//open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://chercher.tech/practice/frames");
		Thread.sleep(5000);
		//switch to frame
		driver.switchTo().frame(0);
		WebElement e=driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input"));
		e.sendKeys("bhagavathgeetha");
		Thread.sleep(5000);
		//select checkbox in first outer frame
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		//back page 
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		//click the dropdown in 2nd outerframe
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//select[@id='animals']")).click();
		//close site
		driver.close();
		

	}

}
