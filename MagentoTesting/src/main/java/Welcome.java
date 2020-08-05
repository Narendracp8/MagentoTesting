

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome {

	WebDriver driver;
	public Welcome(WebDriver driver)
	{
		this.driver=driver;
	}
	By myacc=By.xpath("//a[text()='My Account']");
	
	public void clickOnMyAccount()
	{
		driver.findElement(myacc).click();
	}

}
