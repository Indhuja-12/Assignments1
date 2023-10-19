package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("chellas");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anand");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Civa");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop1=new Select(source);
		drop1.selectByVisibleText("Employee");
		WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drop2=new Select(marketing);
		drop2.selectByIndex(1);
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drop3=new Select(ownership);
		drop3.selectByVisibleText("S-Corporation");
		/*WebElement country = driver.findElement(By.className("inputBox"));
		Select drop4=new Select(country);
		drop3.selectByVisibleText("India");*/
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		

		

	}

}
/* Assignment 1:Create Lead
1. Launch URL "http://leaftaps.com/opentaps/control/login"

2. Enter UserName and Password Using Id Locator

3. Click on Login Button using Class Locator

4. Click on CRM/SFA Link

5. Click on Leads Button

6. Click on create Lead Button

7. Enter CompanyName using id Locator

8. Enter FirstName using id Locator

9. Enter LastName using id Locator

10. Select value as Employee in Source Using SelectbyVisible text

11. Select value as Pay Per Click Advertising in MarketingCampaignId Using SelectbyValue


13. Select value as Corporation in OwnerShip field Using SelectbyIndex

14. Select value as India in Country Field Using SelectbyVisibletext
 
15. Click on create Lead Button Using name Locator

16. Get the Title of the resulting Page*/