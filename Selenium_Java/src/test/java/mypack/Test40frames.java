package mypack;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test40frames {

	public static void main(String[] args)throws Exception {
		//open chrome browser
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver();
				//Launch site
				driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
				Thread.sleep(5000);
	            //switch to frame and click on the link
				driver.switchTo().frame("iframeResult");
				driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']")).click();
				Thread.sleep(5000);
			//switch to next window
				Set<String> s=driver.getWindowHandles();
				ArrayList<String> l=new ArrayList<String>(s);
				driver.switchTo().window(l.get(1));
				//login
				driver.findElement(By.linkText("Log in")).click();
				Thread.sleep(5000);
				driver.close();
				driver.switchTo().window(l.get(0));
				driver.findElement(By.partialLinkText("Get your")).click();
				Thread.sleep(5000);
				 s=driver.getWindowHandles();
				 l=new ArrayList<String>(s);
				driver.switchTo().window(l.get(1));
				driver.findElement(By.xpath("//span[text()='Log in']")).click();
				Thread.sleep(5000);
				driver.close();//2nd window tab only closed
				driver.switchTo().window(l.get(0));
				driver.close();
				
				

	}

}
