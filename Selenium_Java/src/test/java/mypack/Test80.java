package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test80 {
	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		//locate and operate google text box by using searchicon nd mic icon
		WebElement searchicon=driver.findElement(By.xpath("(//*[name()='svg'])[2]"));
		WebElement micicon=driver.findElement(By.xpath("(//*[name()='svg'])[4]"));
		RelativeBy rb= RelativeLocator.with(By.name("q"));//target element
		driver.findElement(rb.toRightOf(searchicon).toLeftOf(micicon)).sendKeys("kalam");
		driver.findElement(rb.near(By.xpath("(//*[name()='svg'])[2]"), 200)).sendKeys("kalam");;

}
}