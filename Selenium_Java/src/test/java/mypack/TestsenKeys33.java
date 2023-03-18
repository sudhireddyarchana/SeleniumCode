package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestsenKeys33 {
	public static void main(String[] args)throws Exception {
		//open browser
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				//Launch site 
				driver.get("http://www.gmail.com");
				Thread.sleep(5000); 
				//"ElementNotInteractableException" get when we try to filla hidden element
				driver.findElement(By.name("hiddenPassword")).sendKeys("bubby");
				driver.close();
			}

}
