package combinedpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementgetText {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    RemoteWebDriver driver =new ChromeDriver();
	    driver.get("https://www.google.com");
	   WebElement e= driver.findElement(By.xpath("(//a[@class='gb_d'])[1]"));
	   Thread.sleep(5000);
	  String x= e.getText();
	  System.out.println("Text of an element: "+x);


	}

}
