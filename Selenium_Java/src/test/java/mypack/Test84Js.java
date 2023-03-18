package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test84Js
{

	public static void main(String[] args) throws Exception
	{
		//Open browser and Launch site
		WebDriverManager.chromedriver().setup();    
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//locate element via SWD-java
		WebElement e=driver.findElement(By.name("q"));
		//change:1-disable element and then disable
		driver.executeScript("arguments[0].disabled=true;", e);
		Thread.sleep(3000);
		driver.executeScript("arguments[0].disabled=false;", e);
		Thread.sleep(3000);
		//change-2:change attribute of an element
		driver.executeScript("arguments[0].setAttribute('type','checkbox');", e);
		Thread.sleep(3000);
		//change-3:remove an element
		WebElement e1=driver.findElement(By.xpath("//*[@aria-label='Search by voice']"));
		driver.executeScript("arguments[0].remove();", e1);
		Thread.sleep(3000);
		//change-4: add new plain text element
				WebElement e3=driver.findElement(By.xpath("//input[@name='q']/parent::div"));
				driver.executeScript(
						"var para=document.createElement('p');"
						+"var tn=document.createTextNode('Hi GOOGLE');"
						+ "para.appendChild(tn); "
						+ "arguments[0].appendChild(para);",e3);
				Thread.sleep(5000); 
		//close site
				driver.close();
}
}