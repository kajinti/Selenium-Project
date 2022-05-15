import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class waitTest {
	private WebDriver driver;
	private String baseUrl;

	@BeforeMethod
	public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
	driver = new ChromeDriver();
	baseUrl = "http://www.google.com";
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void testUntitled() throws Exception {
	driver.get(baseUrl);
	driver.findElement(By.name("q")).sendKeys("Selenium WebDriver Interview questions");
	driver.findElement(By.name("btnK")).click();
	//List<WebElement> list = driver.findElements(By.className("_Rm"));
	//System.out.println(list.size());

	}

	@AfterMethod
	public void tearDown() throws Exception {
	driver.quit();
	}

}
