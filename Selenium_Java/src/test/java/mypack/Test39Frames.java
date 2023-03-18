package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test39Frames {

	public static void main(String[] args)throws Exception {
		//open chrome browser
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver();
				//Launch site
				driver.get("https://chercher.tech/practice/frames");
				Thread.sleep(5000);
				//switch to frame
				driver.switchTo().frame(1);
				driver.findElement(By.xpath("//select[@id='animals']")).click();
				Thread.sleep(5000);
				driver.close();

	}

}
