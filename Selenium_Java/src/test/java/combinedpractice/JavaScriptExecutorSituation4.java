package combinedpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorSituation4
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.name("q"));
		//Disable located element
		driver.executeScript("arguments[0].disabled=true;", e);
		Thread.sleep(5000);
		driver.executeScript("arguments[0].disabled=false;", e);
		Thread.sleep(5000);
		driver.executeScript("arguments[0].setAttribute('type','checkbox');", e);
		WebElement e1=driver.findElement(By.xpath("//img[@alt='Google']"));
		Thread.sleep(5000);
		driver.executeScript("arguments[0].remove();", e1);
		Thread.sleep(5000);
	}

}
