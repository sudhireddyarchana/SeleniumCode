package mypack;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ManageCookies {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.google.com");
		WebElement e=driver.findElement(By.name("q"));
		e.sendKeys("SuryaKumarYadav");
		Set<Cookie> s=driver.manage().getCookies();
		List<Cookie> l= new ArrayList<Cookie>(s);
		System.out.println(l);
		for(Cookie c:l)
		{
			if(c.isHttpOnly())
			{
				if(c.getName().equalsIgnoreCase("session-id")||c.getName().contains("SID"))
				{
					System.out.println(c.getName()+"is HttpOnlySessionCookie");
				}else if(c.getName().equalsIgnoreCase("session-id-time"))
				{
					System.out.println(c.getName()+"is Httponlypersistentcookie");
				}
				else
				{
					System.out.println(c.getName()+"is pure HttpOnlyCookie");
				}
			}
			if(c.isSecure())
			{
				if(c.getName().equalsIgnoreCase("session-id")||c.getName().contains("SID"))
				{
					System.out.println(c.getName()+"is secured session cookie");
				}else if(c.getName().equalsIgnoreCase("session-id-time"))
				{
				System.out.println(c.getName()+"is Secure PersistantCookie");	
				}
				else
				{
					System.out.println(c.getName()+"is Pure SecurecokkieOnly");
				}
			}
			else if(c.getDomain().contains("google.co.in"))
			{
				System.out.println(c.getName()+"is SameSiteCookieonly");
			}
			else if(c.getDomain().contains("google.com"))
			{
				System.out.println(c.getName()+"is SuperCookieOnly");
			}
			else
			{
				System.out.println(c.getName()+"is ThirdPartyCookie and its come from" +c.getDomain());
			}

		}
	}

}
