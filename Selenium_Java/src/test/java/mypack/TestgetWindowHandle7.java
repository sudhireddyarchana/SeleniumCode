package mypack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestgetWindowHandle7 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//it gets the hadle id of the current window
		String x=driver.getWindowHandle();
		System.out.println(x);
		driver.close();

	}

}
