package pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class GooglePageExplicit
{
RemoteWebDriver driver;
FluentWait<RemoteWebDriver> wait;
//locators(properties)
@FindBy(name="q")
private WebElement searchbox;
//constructor method
public GooglePageExplicit(RemoteWebDriver driver,FluentWait<RemoteWebDriver> wait)
{
	PageFactory.initElements(driver, this);
	this.driver=driver;
	this.wait=wait;
}
//general methods
public void fillSearchbox(String x)
{
	wait.until(ExpectedConditions.visibilityOf(searchbox)).sendKeys("abdul kalam");
}
}