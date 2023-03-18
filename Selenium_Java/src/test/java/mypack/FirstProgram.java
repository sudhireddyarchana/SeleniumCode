package mypack;

import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstProgram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.opera.driver", "src\\test\\resources\\operadriver_win64\\operadriver.exe");
		//RemoteWebDriver driver=new ChromeDriver();
		WebDriverManager.operadriver().browserVersion("90.0.4480.54").setup();
		RemoteWebDriver driver=new OperaDriver();
		driver.get("https://www.gmail.com/");

	}

}
