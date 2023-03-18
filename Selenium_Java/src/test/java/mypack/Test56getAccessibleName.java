package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test56getAccessibleName {
	public static void main(String[] args)throws Exception {
		//open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch site
		driver.get("https://www.gmail.com");
		WebElement e=driver.findElement(By.name("identifier"));
		String s=e.getAccessibleName();
		System.out.println(s);
		String y=e.getAriaRole();
		System.out.println(y);
		//close
		driver.close();
		

}
}