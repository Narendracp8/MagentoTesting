

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class MagentoTest {
	
	@Test
	public  void LoginDemo() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		Welcome w = new Welcome(driver);
		w.clickOnMyAccount();
		Thread.sleep(5000);
		Login l = new Login(driver);
		l.typeEmail();
		l.typePassword();
		
		l.clickOnLogin();
		Home h = new Home(driver);
		h.clickOnLogout();
		
		driver.quit();

	}

}
