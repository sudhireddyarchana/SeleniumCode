package mypack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ManageTimeoutsImplicitlyWait
{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//launch site
		driver.get("https://www.google.com");
		WebElement e=driver.findElement(By.name("q"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		e.sendKeys("surya kumar yadav");
	
}
}