package combinedpractice;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorsituation11PageZooming {

	public static void main(String[] args)
	throws Exception{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.executeScript("document.body.style.zoom='200%';");
		Thread.sleep(5000);
		driver.executeScript("document.body.style.zoom='100%';");
		
	}

}
