package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testmail10 {

	public static void main(String[] args)throws Exception {
		//open browser
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				//launch site
				driver.get("https://www.gmail.com");
				//do login
				driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("seleniumpracticework@gmail.com");
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				Thread.sleep(7000);
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("bubby1828");
				Thread.sleep(4000);
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				Thread.sleep(5000);
				//click on compose
				driver.findElement(By.xpath("//div[text()='Compose']")).click();
				Thread.sleep(3000);
				//fill fields
				driver.findElement(By.xpath("//*[@name='to']")).sendKeys("sudhireddyarchana@gmail.com");
				driver.findElement(By.xpath("//*[@name='subjectbox']")).sendKeys("selenium");
				driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("hi archana,\nhow is your health,\ntake care");
				driver.findElement(By.xpath("//div[text()='Send']")).click();
				Thread.sleep(5000);
				//logout
				driver.findElement(By.xpath("(//a[starts-with(@aria-label,'Google')])[2]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//div[text()='Sign out']")).click();
				Thread.sleep(5000);
				//close site
				driver.close();
	}

}
