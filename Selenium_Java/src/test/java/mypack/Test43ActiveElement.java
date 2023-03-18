package mypack;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test43ActiveElement {
	public static void main(String[] args)throws Exception {
		//open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
       //fill an active element emailid
		driver.switchTo().activeElement().sendKeys("seleniumpracticework@gmail.com",Keys.TAB);
		Thread.sleep(3000);
		//fill next active element password
		driver.switchTo().activeElement().sendKeys("bubby1828",Keys.TAB,Keys.TAB);
		Thread.sleep(3000);
		driver.close();
}
}