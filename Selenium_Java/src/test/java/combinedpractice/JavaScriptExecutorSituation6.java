package combinedpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorSituation6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		WebElement e=driver.findElement(By.xpath("(//div[text()='Gender'])[1]/following-sibling::div/div[text()='Male']"));
		String y=(String) driver.executeScript("return(arguments[0].textContent);", e);
		//String x=e.getText();
		System.out.println("Value "+y);
		
	}

}
