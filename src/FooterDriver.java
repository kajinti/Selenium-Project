import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.geeksforgeeks.org/conversion-of-array-to-arraylist-in-java/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver=driver.findElement(By.cssSelector(".footer-wrapper"));//Limiting WebDriver Scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement columndriver=footerdriver.findElement(By.xpath("//div[@class='footer-wrapper_links']/ul[2]"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//4- click on each link in the column and check if the pages are opening-in child tabs(Opens all links in New Tabs)
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
		}
		
		// Navigate to each child tab opened and grab the title.
		Set<String> abc=driver.getWindowHandles();//4
		Iterator<String> it=abc.iterator();
		
		while(it.hasNext())
		{
			
		   driver.switchTo().window(it.next());
		   System.out.println(driver.getTitle());
		
		}



	}

}
