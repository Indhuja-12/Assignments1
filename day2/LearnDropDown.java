
package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) 
	{

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();
		String leadPage = driver.getTitle();
		System.out.println(leadPage);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Indhuja");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Anandarajan");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop1=new Select(source);
		drop1.selectByVisibleText("Employee");
		WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drop2=new Select(marketing);
		drop2.selectByIndex(1);
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drop3=new Select(industry);
		drop3.selectByValue("IND_SOFTWARE");
		WebElement currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select drop4=new Select(currency);
		drop4.selectByIndex(2);
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("India");
		driver.findElement(By.name("submitButton")).click();
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(firstName);
		String lastName = driver.findElement(By.id("viewLead_lastName_sp")).getText();
		System.out.println(lastName);
		if(firstName.contains("Indhuja"))
				{
					System.out.println("The Lead is created");
				}
		else
				{
					System.out.println("The Lead is not created");
					
				}
		String resultingPage = driver.getTitle();
		System.out.println( resultingPage);
	}
}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				