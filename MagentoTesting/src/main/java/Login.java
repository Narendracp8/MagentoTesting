

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	By emailid=By.xpath("//input[@id='email']");
	By pwd=By.xpath("//input[@id='pass']");
	By login=By.xpath("//button[@id='send2']");
	
	
	public void typeEmail() {
		driver.findElement(emailid).sendKeys("kundansinghmahisour@gmail.com");
		
	}
	public void typePassword() {
		driver.findElement(pwd).sendKeys("Welcome@123");
	}
	public void clickOnLogin() {
		
		driver.findElement(login).click();
		
	}

}
