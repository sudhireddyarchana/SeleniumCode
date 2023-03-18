package combinedpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorSituation16RangeSlider {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rangeslider.js.org/");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("(//div[contains(@class,'rangeslider')])[3]"));
		driver.executeScript("$(arguments[0]).val(100).change();", e);
		Thread.sleep(5000);
		Actions a=new Actions(driver);
		//a.dra
	}

}
