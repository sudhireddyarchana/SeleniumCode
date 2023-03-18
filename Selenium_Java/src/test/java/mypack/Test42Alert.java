package mypack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test42Alert {
	public static void main(String[] args)throws Exception {
		//open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        Thread.sleep(4000);
        //click on try it
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        Thread.sleep(4000);
        //switch to alert
        Alert a=driver.switchTo().alert();
        String x=a.getText();
        System.out.println(x);
        a.dismiss();
        Thread.sleep(5000);
        driver.close();
}
}