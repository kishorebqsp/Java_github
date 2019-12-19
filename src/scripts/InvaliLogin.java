package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class InvaliLogin{
	
	@Test
	public void testInvaliLogin() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com");
		Reporter.log("1",true);
		Thread.sleep(3000);
		Reporter.log("2",true);
		driver.quit();
		
		}
}
