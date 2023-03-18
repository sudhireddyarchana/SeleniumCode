package combinedpractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v94.network.Network;
//import org.openqa.selenium.devtools.v106.network.Network;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DivToolsSituation3FilterPageSource {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//open browser, launch site and close banner 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		DevTools dt=driver.getDevTools();
		Command cmd1=Network.enable(Optional.empty(), Optional.empty(), Optional.empty());
		/*List<String> m=new ArrayList<String>();
		m.add("*.css");
		m.add("*.png");
		Command cmd2=Network.setBlockedURLs(m);
		dt.send(cmd1);
		dt.send(cmd2);
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);*/
		Map<Object,Object> m=new HashMap<Object,Object>();
		m.put("timezoneId", "GMT+11");
		Command cmd2=new Command("Emulation.setTimezoneOverride",m);
		dt.send(cmd1);
		dt.send(cmd2);
		driver.get("https://momentjs.com/");
		Thread.sleep(5000);
				
	}

}
