package combinedpractice;

import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.model.ConnectionType;
import org.openqa.selenium.devtools.v94.network.Network;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DevToolsSituation2HwConfiguration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open browser, launch site and close banner 
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				DevTools dt=driver.getDevTools();
				Command cmd1=Network.enable(Optional.empty(), Optional.empty(), Optional.empty());
				//Command cmd2=Network.emulateNetworkConditions(false, 200, 1000000, 2000000, Optional.of(ConnectionType.CELLULAR4G));
	}
}
