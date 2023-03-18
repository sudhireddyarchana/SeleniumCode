package pageclass;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage 
{
//locators(properties)
	@FindBy(name="q") private WebElement searchbox;
	@FindBy(xpath="//div[@aria-label='Search by voice']")
	private WebElement mic;
	@FindBy(xpath="//*")
	private List<WebElement> all;
	@FindBy(linkText="Gmail")
	private WebElement mylink1;
	@FindBy(linkText="Gmail")
	@CacheLookup
	private WebElement mylink2;
	//constructer method
	public GooglePage (RemoteWebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	//general methods
	public void fillSearchbox(String x)
	{
		searchbox.sendKeys(x);
	}
	public void clickMic() {
		mic.click();
	}
	public int getAllElementsCount()
	{
		return(all.size());
	}
	public long getTimeWithoutCacheLookup()
	{
	long x=System.currentTimeMillis();
	for(int i=1;i<=1000;i++)
	{
		mylink1.getText();}
		long y=System.currentTimeMillis();
		return(y-x);
	}
	public long getTimeWithCacheLookup()
	{
	long x=System.currentTimeMillis();
	for(int i=1;i<=1000;i++)
	{
		mylink2.getText();}
		long y=System.currentTimeMillis();
		return(y-x);
	}
}
