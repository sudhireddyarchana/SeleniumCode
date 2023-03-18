package combinedpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorSituation9PageScrolling
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.google.co.in/");	
		driver.findElement(By.name("q")).sendKeys("abdul kalam",Keys.ENTER);
		Actions a=new Actions(driver);
		a.sendKeys(Keys.END).perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.HOME).perform();
		Thread.sleep(5000);
		driver.executeScript("window.scrollBy(0,document.body.scrollHeight);");
		Thread.sleep(5000);
		driver.executeScript("window.scrollBy(0,-(document.body.scrollHeight));");
		Thread.sleep(5000);*/
		driver.get("https://www.facebook.com/");
		Dimension d= new Dimension(450,600);
		driver.manage().window().setSize(d);
		driver.executeScript("window.scrollBy(document.body.scrollWidth,0);");
		Thread.sleep(5000);
		driver.executeScript("window.scrollBy(-(document.body.scrollWidth),0);");
		Thread.sleep(5000);
	}

}
