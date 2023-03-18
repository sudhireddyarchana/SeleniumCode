package mypack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestgetTitle12 {

	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.worldometers.info/world-population");
		Thread.sleep(5000);
		//get title of the page
		String x=driver.getTitle();
		System.out.println(x);
		//close site
		driver.close();
	}

}
