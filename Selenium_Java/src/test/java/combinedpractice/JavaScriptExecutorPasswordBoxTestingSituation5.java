package combinedpractice;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorPasswordBoxTestingSituation5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Password of your choice");
		String s=sc.nextLine();
		sc.close();
		driver.get("https://www.facebook.com/");
		WebElement e=driver.findElement(By.xpath("//input[@type='password']"));
		e.sendKeys(s);
		driver.executeScript("arguments[0].setAttribute('type','text')", e);
		String y=e.getAttribute("value");
		if(s.equals(y))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Falied");
		}
	}

}
