package combinedpractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v95.security.Security;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DevToolsSituation5ssl {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		DevTools dt=driver.getDevTools();
		driver.get("https://expired.badssl.com/");

		Thread.sleep(5000);
		Command cmd1=Security.enable();
		Command cmd2=Security.setIgnoreCertificateErrors(true);
		dt.send(cmd1);
		dt.send(cmd2);
		driver.get("https://expired.badssl.com/");
		

	}

}
