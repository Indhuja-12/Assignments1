package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditLead {

	public static void main(String[] args) 
		{
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			String title = driver.getTitle();
			System.out.println(title);
			driver.findElement(By.linkText("CRM/SFA")).click();
			String leadPage = driver.getTitle();
			System.out.println(leadPage);
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.id("ext-gen248")).sendKeys("Indhuja");
			driver.findElement(By.id("ext-gen334")).click();
			//driver.findElement(By.linkText("Indhuja")).click();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//driver.findElement(By.className("x-grid3-cell-inner x-grid3-col-partyId")).click();
			driver.findElement(By.xpath("//a[text()='13606']")).click();
			driver.findElement(By.linkText("Edit")).click();
			driver.findElement(By.id("updateLeadForm_companyName")).clear();
			driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("speirs");
			driver.findElement(By.name("submitButton")).click();
			driver.close();
		}

}
