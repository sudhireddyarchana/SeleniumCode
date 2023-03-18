package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test86Js6
{
	public static void main(String[] args) throws Exception
	{
		//open browser and launch site(SWD)
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/dropdown.html"); 
		Thread.sleep(5000);
		//Locate hidden element and get text by using swd
		WebElement he=driver.findElement(By.xpath("(//div[text()='Gender']/following-sibling::div/div)[1]"));
		String x=he.getText();
		System.out.println(x);//get text method return null to hidden element
		//Locate hidden element and get text by (Using JavaScript)
		String y= (String) driver.executeScript("return(arguments[0].textContent);", he);
		System.out.println(y);
		//close site
		driver.close();
}
}