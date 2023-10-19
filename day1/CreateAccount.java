package week2.day1;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Debit Limited Account");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("groupNameLocal")).sendKeys("Nags");
		driver.findElement(By.id("officeSiteName")).sendKeys("Raks");
		driver.findElement(By.id("annualRevenue")).sendKeys("450000");
		WebElement Industry = driver.findElement(By.name("industryEnumId"));
		Select drop1=new Select(Industry);
		drop1.selectByVisibleText("Computer Software");
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select drop2=new Select(ownership);
		drop2.selectByIndex(4);
		WebElement Source = driver.findElement(By.name("dataSourceId"));
		Select drop3=new Select(Source);
		drop3.selectByValue("LEAD_EMPLOYEE");
		WebElement marketing = driver.findElement(By.name("marketingCampaignId"));
		Select drop4=new Select(marketing);
		drop4.selectByIndex(6);
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select drop5=new Select(state);
		drop5.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
		
	}
}
/* 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		   
		   2. Enter UserName and Password Using Id Locator
		   
		   3. Click on Login Button using Class Locator
		   
		   4. Click on CRM/SFA Link
		   
		   5. Click on Accounts Button
		   
		   6. Click on Create Account
		    
		   7. Enter AccountName Field Using Xpath Locator value as Debit Limited Account
		   
		   8. Enter DEscriptiion as "Selenium Automation Tester"
		   
		   9. Enter LocalName Field Using Xpath Locator
		   
		   10. Enter SiteName Field Using Xpath Locator
		   
		   11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
		   
		   12. Select Industry as ComputerSoftware
		   
		   13. Select OwnerShip as S-Corporation using SelectByVisibletext
		   
		   14. Select Source as Employee using SelectByValue
		   
		   15. Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
		   
		   16. Select State/Province as Texas using SelectByValue 
		   
		   17. Click on Create Account using Xpath Locator*/		