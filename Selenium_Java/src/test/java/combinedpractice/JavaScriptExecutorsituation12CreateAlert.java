package combinedpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorsituation12CreateAlert {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.executeScript("window.alert('Launching google site');");
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		driver.get("https://www.google.com");
		driver.executeScript("window.alert('entering text in search');");
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.name("q")).sendKeys("abdul kalam sir");
		

	}

}
