package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClick37 {
	public static void main(String[] args)throws Exception {
		//open browser
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				//Launch site 
				driver.get("http://www.gmail.com");
				Thread.sleep(5000); 
				//"ElementNotInteractableException"will come when we click hidden element
				driver.findElement(By.name("hiddenPassword")).click();
				driver.close();
			}
}
