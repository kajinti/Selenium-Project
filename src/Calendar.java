import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");

		// April 14
		driver.findElement(By.id("travel_date")).click();

		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText()
				.contains("May")) 
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}

		List<WebElement> dates = driver.findElements(By.className(".day"));

		// Grab common attribute//put into list and iterate

		int count = driver.findElements(By.cssSelector(".day")).size();

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.cssSelector(".day")).get(i).getText();
			if (text.equalsIgnoreCase("14")) {
				driver.findElements(By.cssSelector(".day")).get(i).click();
				break;
			}
		}

	}



}
