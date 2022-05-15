import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Try {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		String email = "admin@yourstore.com";
		WebElement txtEmail=driver.findElement(By.id("Email"));
		txtEmail.clear();
		txtEmail.sendKeys(email);
		
		String password = "admin";
		WebElement txtPassword=driver.findElement(By.id("Password"));
		txtPassword.clear();
		txtPassword.sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		By lnkCustomers_menu = By.xpath("//a[@href='#']//p[contains(text(), 'Customers')]");
		driver.findElement(lnkCustomers_menu).click();
		Thread.sleep(3000); 
		
		By lnkCustomers_menuItem = By.xpath("//a[@href=\"/Admin/Customer/List\"]/p");
		driver.findElement(lnkCustomers_menuItem).click();
		Thread.sleep(3000);
		
		By btnAddnew = By.xpath("//a[@class='btn btn-primary']");
		driver.findElement(btnAddnew).click();
		Thread.sleep(2000);
		
		
		By txtEmail1 = By.xpath("//input[@id='Email']");
		driver.findElement(txtEmail1).sendKeys(email);
		
		By txtPassword1 = By.xpath("//input[@id='Password']");
		driver.findElement(txtPassword1).sendKeys(password);
		
		By txtFirstName = By.cssSelector("#FirstName");
		driver.findElement(txtFirstName).sendKeys("Nate");
		
		By txtLastName = By.cssSelector("#LastName");
		driver.findElement(txtLastName).sendKeys("Kamala");
		
		By rdMaleGender = By.id("Gender_Male");
		driver.findElement(rdMaleGender).click();
		
		//By txtDoB = By.cssSelector("#DateOfBirth");
				
		By txtCompanyName = By.xpath("//input[@id='Company']");
		driver.findElement(txtCompanyName).sendKeys("nopCommerce");
		
//		By lstitemAdministrators = By.xpath("//li[contains(text(), 'Administrators')]");
//		By lstitemRegistered = By.xpath("//li[contains(text(), 'Registered')]");
//		By lstitemGuests = By.xpath("//li[contains(text(), 'Guests')]");
//		By lstitemVendors = By.xpath("//li[contains(text(), 'Vendors')]");,
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);
		
		By txtcustomerRoles = By.cssSelector("#SelectedCustomerRoleIds");
		driver.findElement(txtcustomerRoles).click();
		
//		By lstitemRegistered = By.xpath("//li[contains(text(), 'Registered')]");
//		driver.findElement(lstitemRegistered).click();
		
		By btnSave = By.xpath("//button[@name='save']");
		driver.findElement(btnSave).click();
		
//		WebElement role = driver.findElement(txtcustomerRoles);
//		if(!role.equals("Vendors")) //If role is vendors should not delete Register as per
//		{
//			driver.findElement(By.xpath("lstitemVendors"));
//		}
//		
//		driver.findElement(txtcustomerRoles).click();
//		Thread.sleep(3000);
//		
//		WebElement listitem;
//		if(role.equals("Administrators"))
//		{
//			listitem = driver.findElement(lstitemAdministrators);
//		}
//		else if(role.equals("Guests"))
//		{
//			listitem = driver.findElement(lstitemGuests);
//		}
//		else if(role.equals("Registered"))
//		{
//			listitem = driver.findElement(lstitemRegistered);
//		}
//		else if(role.equals("Vendors"))
//		{
//			listitem = driver.findElement(lstitemVendors);
//		}
//		else 
//		{
//			listitem = driver.findElement(lstitemGuests);
//		}
		
		//By btnLogin = By.xpath("//button[@type='submit']");
		
//		
//		
		
//		
//		By drpmnrOfVendor = By.xpath("//Select[@name='VendorId']");
//		//By rdMaleGender = By.id("Gender_Male");
//		//By rdFemaleGender = By.cssSelector("#Gender_Female");
//		
//		
//		
//		
//		
//		By txtAdminContent = By.xpath("//textarea[@id='AdminComment']");
//		
//		By btnSave = By.xpath("//button[@name='save']");
//		
		//driver.close();
	}

}
