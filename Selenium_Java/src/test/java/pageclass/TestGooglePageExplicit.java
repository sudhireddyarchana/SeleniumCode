package pageclass;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGooglePageExplicit {

	public static void main(String[] args)throws Exception {
		//download chromedriver s/w  to work with chrome browser
		WebDriverManager.chromedriver().setup();
		//acecess chrome browser using driver s/w
		RemoteWebDriver driver=new ChromeDriver();
		//define wait object
		FluentWait<RemoteWebDriver> wait= new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(1000));
		//create object to page class
		GooglePageExplicit gpe = new GooglePageExplicit(driver,wait);
		//launch site
		driver.get("https://www.google.co.in");
		gpe.fillSearchbox("abdul kalam");
		Thread.sleep(5000);
		//close
		driver.close();
		

	}

}
