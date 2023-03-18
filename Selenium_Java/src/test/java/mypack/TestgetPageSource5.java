package mypack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestgetPageSource5 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//get pagesource of the current active browser
        String x=driver.getPageSource();
        if(x.contains("html")) {
        	System.out.println("page is designed with html code");
        }
        else {
        	System.out.println("page is not designed with html code");
        }
        if(x.contains("svg")) {
        	System.out.println("page is designed with svg");
        	
        }else
        {
        	System.out.println("page is not designed with svg");
        }
	}

}
