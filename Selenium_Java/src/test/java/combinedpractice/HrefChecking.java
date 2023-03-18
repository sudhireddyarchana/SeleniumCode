package combinedpractice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HrefChecking {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
    WebDriverManager.chromedriver().setup();
    RemoteWebDriver driver =new ChromeDriver();
    driver.get("https://www.gmail.com");
    List<WebElement> l=driver.findElements(By.xpath("//*"));
    int alllinks=0;
    int correctlinks=0;
    int brokenlinks=0;
    for(WebElement e:l)
    {
    	try {
    	String x=e.getAttribute("href");
    	if(x.startsWith("https")||x.startsWith("http"))
    	{
    		alllinks++;
    		URL u=new URL(x);
    		HttpURLConnection con=(HttpURLConnection) u.openConnection();
    		con.connect();
    		if(con.getResponseCode()==200)
    		{
    		correctlinks++;
    		//System.out.println("correctlinks: "+correctlinks);
    		}
    		else
    		{
    			brokenlinks++;
    			//System.out.println("brokenlinks: "+brokenlinks);
    		}
    	    }
    	
         	}
    	 catch(Exception ex)
    	{
    		// System.out.println("href is empty");
    	}
    	
    	
        }
         System.out.println("alllinks :"+alllinks);
         System.out.println("correctlinks :"+correctlinks);
         System.out.println("brokenlinks :"+brokenlinks);
    	
   
	}

}
