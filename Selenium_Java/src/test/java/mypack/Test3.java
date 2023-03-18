package mypack;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the browser name");
		String br=sc.nextLine();
		sc.close();
	
		if(br.equals("chrome"))
		{
			//it downloads the corresponding driver
			WebDriverManager.chromedriver().setup();
			RemoteWebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		else if(br.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			RemoteWebDriver driver=new EdgeDriver();
			driver.close();
			
		}
		else {
			System.out.println("wrong browser name");
		}
	}

}
