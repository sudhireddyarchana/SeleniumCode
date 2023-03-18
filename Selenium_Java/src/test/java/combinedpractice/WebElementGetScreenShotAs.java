package combinedpractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementGetScreenShotAs {

	public static void main(String[] args) throws Exception
	{
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver =new ChromeDriver();
    driver.get("https://www.google.com");
    WebElement e=driver.findElement(By.xpath("//img[@alt='Google']"));
    Thread.sleep(3000);
    File f= new File("C:\\archana\\screenshot.png");
    File t=e.getScreenshotAs(OutputType.FILE);
    FileHandler.copy(t, f);
    
	}

}
