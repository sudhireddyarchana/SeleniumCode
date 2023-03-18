package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClear27 {

	public static void main(String[] args)throws Exception {
		//open browser(operation)
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https:www.gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("seleniumpracticework@gmail.com");
		Thread.sleep(5000);
		//clear data to an element
		driver.findElement(By.name("identifier")).clear();
		Thread.sleep(5000);
		//close site
		driver.close();
		
		

	}

}
