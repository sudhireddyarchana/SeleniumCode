package combinedpractice;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DevToolsSituation8GeoLocation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		DevTools dt=driver.getDevTools();
		driver.get("https://www.google.com");
		dt.createSession();
		Map<String,Object> m=new HashMap<String,Object>();
		m.put("lattitude", 27.1751);
		m.put("longitude", 78.0421);
		m.put("accuracy", 1);
		driver.executeCdpCommand("Emulation.setGeolocationOverride", m);
	}

}
