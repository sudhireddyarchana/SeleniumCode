package mypack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testpopupwindow9 {

	public static void main(String[] args) 
	{
		//open browser
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver();
				//launch site
				/*sometimes while working with browser we may get popup window to avoid this we inject some code
				 * because swd not work with window based operations
				 */
				driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
				//driver.close();

	}

}
