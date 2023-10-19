package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTaps {

	public static void main(String[] args) 
	{
		//Launch the ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//Maximise the window
		driver.manage().window().maximize();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//find the element and enter the userName
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//find the element and enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//find the element and click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//verification
		//to get the title of the webpage
		String title = driver.getTitle();
		//print the statement
		System.out.println(title);
		//find the element and click on the CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		//to get the title of the webpage
		String leadPage = driver.getTitle();
		//print the statement
		System.out.println(leadPage);
		//click on the leads button
		driver.findElement(By.linkText("Leads")).click();
		//find the element and click on the create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//find the element and enter the company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		//find the element and enter the Forename
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Indhuja");
		//find the element and enter the Lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Anandarajan");
		//find the element and click on submit button
		driver.findElement(By.name("submitButton")).click();
		//verification 
		//to retrive the text from dom page
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
		
				
		
		
	}

}
