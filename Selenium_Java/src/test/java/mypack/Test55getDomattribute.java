package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test55getDomattribute {
	public static void main(String[] args)throws Exception {
		//open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch site
		driver.navigate().to("https://www.google.com");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.name("q"));
		System.out.println(e.getAttribute("maxlength"));//html attribute
		System.out.println(e.getAttribute("ClientHeight"));//html property
		//get attribute value only
		System.out.println(e.getDomAttribute("maxlength"));
		//get dom property only
		System.out.println(e.getDomProperty("ClientHeight"));
		//close site
		driver.close();

}
}