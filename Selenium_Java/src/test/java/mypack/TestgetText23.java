package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestgetText23 {

	public static void main(String[] args)throws Exception {
		//open browser(operation)
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver();
				//Launch site(operation)
				driver.get("https://semantic-ui.com/modules/dropdown.html");
				Thread.sleep(5000);
				//3. Get text of hidden element(developed with paired tag and it has some text)
				WebElement e=driver.findElement(By.xpath(
						                        "(//div[text()='Gender'])[1]/following::div[3]"));
				String x=e.getText();
				System.out.println(x);
				//get value using JavaScript
				String y=(String) driver.executeScript("return(arguments[0].textContent);",e);
				System.out.println(y); 
				//close site
				driver.close();

	}

}
