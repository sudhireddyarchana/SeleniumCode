package mypack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test52navigateTo {
	public static void main(String[] args)throws Exception {
		//open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch site
		long st=System.currentTimeMillis();
		driver.navigate().to("https://www.google.com");//no wait for pagesource
		long et=System.currentTimeMillis();
		System.out.println(et-st);
		Thread.sleep(5000);// wait for pagesorce loading converting page
		
	}

}
