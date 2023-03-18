package combinedpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorSituation10ElementScrolling {

	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stackoverflow.com/questions/38653910/actions-click-script-selenium");
		driver.findElement(By.xpath("//button[contains(@class,'accept')]")).click();
		WebElement e=driver.findElement(By.xpath("//pre[contains(@class,'block')][1]"));
		driver.executeScript("arguments[0].scrollIntoView();", e);
		driver.executeScript("var x=arguments[0].scrollHeight;arguments[0].scrollTop=x;", e);
		Thread.sleep(8000);
		//driver.executeScript("arguments[0].scrollTop=0;", e);
		//Thread.sleep(5000);
		Dimension d=new Dimension(500,500);
		driver.manage().window().setSize(d);
		driver.executeScript("var x=arguments[0].scrollWidth;arguments[0].scrollLeft=x;", e);
		Thread.sleep(5000);
		driver.executeScript("arguments[0].scrollLeft=0;", e);
		Thread.sleep(5000);
		
	}

}
