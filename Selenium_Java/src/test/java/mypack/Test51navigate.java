package mypack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test51navigate {
	public static void main(String[] args)throws Exception {
		//open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch site
		long st=System.currentTimeMillis();
		driver.get("https://www.google.com");//wait and get pagesource
		long et=System.currentTimeMillis();
		System.out.println(et-st);
		Thread.sleep(5000);//only wait for converting page
		
	}
}
