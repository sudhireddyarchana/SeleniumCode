package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test24 {

	public static void main(String[] args)throws Exception {

		//open browser(operation)
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//Launch site(operation)
		driver.get("https://www.worldometers.info/world-population/");
		Thread.sleep(5000);
		//locate parent element
        WebElement e=driver.findElement(By.xpath("//span[@rel='current_population']"));
      //4. Get text of a parent element along with text of all child elements
      		//using getText() method(it is a better way when child elements text is dynamic)
        String x= driver.findElement(By.xpath("//span[@rel='current_population']")).getText();
        System.out.println(x);
      //5. locate parent, but get text of specific child element(3rdchild) using JavaScript
      		String y=(String) driver.executeScript(
      				      "return(arguments[0].childNodes[3].textContent);",e);
      		System.out.println(y);
      		//If we want parent element text only if exists, we use 0 as index in above code
      		//close site
      		driver.close();
      		
	}

}
