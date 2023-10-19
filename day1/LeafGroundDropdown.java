package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGroundDropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement automationTool = driver.findElement(By.className("ui-selectonemenu"));
		Select drop1=new Select(automationTool);
		drop1.selectByVisibleText("Puppeteer");
        driver.findElement(By.id("j_idt87:country_label")).click();
        driver.findElement(By.id("j_idt87:country_3")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(" //label[@id='j_idt87:city_label']")).click();
        driver.findElement(By.xpath("//li[text()='Chennai']")).click();
        //driver.findElement(By.className("ui-autocomplete-input-token")).click();
        driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();
        driver.findElement(By.xpath("//li[@data-item-value='Appium']")).click();
        driver.findElement(By.xpath("//label[text()='Select Language']")).click();
        driver.findElement(By.xpath("//li[text()='Tamil']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[text()='Select Values']")).click();
        driver.findElement(By.xpath("//li[text()='இரண்டு']")).click();
        
        
		
	
	}

}
