package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test79RelativeBy {
	public static void main(String[] args)throws Exception {
		//open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		//locate and operate password textbox by using username nd login 
		WebElement uid=driver.findElement(By.id("email"));
		WebElement login=driver.findElement(By.name("login"));
		RelativeBy rb=RelativeLocator.with(By.tagName("input"));
		driver.findElement(rb.below(uid).above(login)).sendKeys("bubby");
		

}
}