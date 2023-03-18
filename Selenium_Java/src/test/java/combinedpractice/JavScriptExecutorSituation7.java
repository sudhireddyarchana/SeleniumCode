package combinedpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavScriptExecutorSituation7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement e=driver.findElement(By.id("SIvCob"));
		String x=(String)driver.executeScript("return(arguments[0].childNodes[1].textContent)", e);
		
		System.out.println("Value is "+x);
	}

}
