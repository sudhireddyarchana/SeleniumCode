package mypack;

import java.io.File;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class Test48getScreenshotAs {
	 public static void main(String[] args)throws Exception {
			//open chrome browser
			WebDriverManager.chromedriver().setup();
			RemoteWebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
			wait.withTimeout(Duration.ofSeconds(20));
			wait.pollingEvery(Duration.ofMillis(1000));
			//Launch site
			driver.get("https://shop.polymer-project.org/");
			//wait.until(ExpectedConditions.titleIs("SHOP"));
			//take screenshot of full page
			AShot as=new AShot();
			ShootingStrategy shs=ShootingStrategies.viewportPasting(1000);
			Screenshot ss=as.shootingStrategy(shs).takeScreenshot(driver);
			File dest=new File("target\\fullpagess.png");
			ImageIO.write(ss.getImage(), "PNG", dest);
			driver.close();
			
			
			
	 }	

}
