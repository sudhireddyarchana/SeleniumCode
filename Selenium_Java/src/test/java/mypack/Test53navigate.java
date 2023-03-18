package mypack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test53navigate {
	public static void main(String[] args)throws Exception {
		//open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch site
		driver.navigate().to("https://www.google.com");
		Thread.sleep(5000);
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(5000);
        driver.navigate().back();//back to google
        Thread.sleep(5000);
        driver.navigate().forward();//forward to facebook
        Thread.sleep(5000);
        driver.navigate().refresh();//refresh the facebook page
        Thread.sleep(5000);
        driver.close();
}
}
