import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	WebDriver driver;
	
	@Test
	public void f() {
		String baseUrl = "https://www.toolsqa.com/";
		System.out.println("Launching Google Chrome browser"); 
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gichaba\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	@BeforeMethod
	 public void beforeMethod() {
	 System.out.println("Starting Test On Chrome Browser");
	 }
	 
	 @AfterMethod
	 public void afterMethod() {
	 driver.close();
	 System.out.println("Finished Test On Chrome Browser");
	 }


}
