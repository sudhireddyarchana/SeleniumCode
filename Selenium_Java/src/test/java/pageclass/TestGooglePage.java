package pageclass;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGooglePage {

	public static void main(String[] args) {
		//open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//create object to pageclass
		GooglePage gp= new GooglePage(driver);
		driver.get("https://www.google.co.in");
		gp.fillSearchbox("abdul kalam");
		gp.clickMic();
		//get text of link 1000 times
		long x=gp.getTimeWithoutCacheLookup();
		System.out.println("Time taken in seconds without cache"+ x);
		//get text of link 1000 times
		long y=gp.getTimeWithCacheLookup();
		System.out.println("Time taken in seconds with cache"+y);
		//close site
		driver.close();
	}

}
