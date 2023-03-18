package mypack;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test85Js5
{
public static void main(String[] args)throws Exception
{
   //take input from the keyboard
	Scanner sc= new Scanner(System.in);
	System.out.println("enter your password");
	String x=sc.nextLine();
	sc.close();
	//Open browser and Launch site
	WebDriverManager.chromedriver().setup();    
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	//Step-1:locate password element and enter a value
	WebElement e=driver.findElement(By.name("pass"));
	e.sendKeys(x);
	//step-2:change password type to text to get visibility of an element
	driver.executeScript("arguments[0].setAttribute('type','text');", e);
	//step-3:get that visible value
	String y=e.getAttribute("value");
	//step-4:compare both values
	if(x.equals(y))
		{
			System.out.println("test is passed");
		}
		else
		{
			System.out.println("test is failed");
		}
	//close site
	driver.close();
	
}
}
