package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test54 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch site
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_submit");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.id("fname")).sendKeys("bubby");
		driver.findElement(By.id("lname")).sendKeys("sudineni");
        driver.findElement(By.xpath("//input[@type='submit']")).submit();
	}

}
