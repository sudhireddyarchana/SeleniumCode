package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test77facebook {

	public static void main(String[] args)throws Exception {
		//open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		//do login
		driver.findElement(By.cssSelector("#email")).sendKeys("6301894398");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("bubby1828");
		driver.findElement(By.cssSelector("button[type='submit']")).submit();

}
}