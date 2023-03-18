package combinedpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorSituation13CleanBrowserHistory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("abdul kalam quotes");
		driver.executeScript("history.go(0);");
		Set<Cookie> s=driver.manage().getCookies();
		List<Cookie> l=new ArrayList<Cookie>(s);
		for(Cookie list:l)
		{
			System.out.println(list.getName());
		}
	}

}
