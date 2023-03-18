package combinedpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorToClickAnElement
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.cricbuzz.com/cricket-match/live-scores");
		//WebElement e=driver.findElement(By.xpath("(//a[@class='cb-nav-tab '])[1]"));
		//driver.executeScript("arguments[0].click();", e);
		//driver.executeScript("arguments[0].click();", e);
		driver.get("https://www.google.com/");
		//driver.executeScript("document.getElementsByName('q')[0].value='Abdul Kalam';");
		WebElement e=driver.findElement(By.name("q"));
		//driver.executeScript("arguments[0].style.background='red';", e);
		driver.executeScript("arguments[0].style.color='green';", e);
		driver.executeScript("arguments[0].value='abdul kalam';", e);
		driver.executeScript("arguments[0].style.border='5px blue dotted';", e);
	
	}

}
