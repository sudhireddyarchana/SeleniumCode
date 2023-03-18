package mypack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test76gmail
{
	public static void main(String[] args)throws Exception {
		//open chrome browse
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch site
		driver.get("https://www.gmail.com");
		Thread.sleep(3000);
		//do login
		driver.findElement(By.id("identifierId")).sendKeys("seleniumpracticework12345@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("bubby1828");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[@aria-label='No thanks']")).click();
		//get count of all unread mails
		int amc=0;
		int umc=0;
		int rmc=0;
		while(true)//for pagination
		{
			//1.collect all mails in current page
			List<WebElement> mails=driver.findElements(By.xpath("(//table)[6]/tbody/tr"));
			//driver.findElement(By.xpath("//button[@aria-label='No thanks']")).click();
			amc=amc+mails.size();
			//2. goto each mail to check read/unread
			for(WebElement mail:mails)
			{
			WebElement e=mail.findElement(By.xpath("child::td[4]/div[1]"));
			String msg=(String) driver.executeScript("return(arguments[0].textContent);", e);
			
			if(msg.startsWith("unread"))
			{
				umc++;
				}
			else {
				 rmc++;
			}
			}
			//go to next page
			try
			{
			String temp=driver.findElement(By.xpath("//div[@aria-label='Older']")).getAttribute("aria-disabled");
			if(temp.equals("true"))
			{
			break;//terminate the loop
		    }
			}
			catch(Exception ex)
			{
			driver.findElement(By.xpath("//div[@aria-label='Older']")).click();
			Thread.sleep(5000);
			}
			}
			System.out.println("all mails count is:"+amc);
			System.out.println("unread mail count is:"+umc);
			System.out.println("read mail count is:"+rmc);
	       //close site
			driver.close();
				
}
}