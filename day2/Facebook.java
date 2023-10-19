package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) 
		
	
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[text()='Allow all cookies']")).click();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("indhu");
		driver.findElement(By.name("lastname")).sendKeys("anand");
		driver.findElement(By.name("reg_email__")).sendKeys("123456789");
		driver.findElement(By.name("reg_passwd__")).sendKeys("123");
		WebElement date = driver.findElement(By.id("day"));
		Select drop1=new Select(date);
		drop1.selectByVisibleText("1");
		WebElement month = driver.findElement(By.id("month"));
		Select drop2=new Select(month);
		drop2.selectByVisibleText("Jun");
		WebElement year = driver.findElement(By.id("year"));
		Select drop3=new Select(year);
		drop3.selectByVisibleText("2000");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
	}
	}
//Step 1: Download and set the path 
//Step 2: Launch the chromebrowser
//Step 3: Load the URL https://en-gb.facebook.com/
//Step 4: Maximise the window
//Step 5: Add implicit wait
//Step 6: Click on Create New Account button
//Step 7: Enter the first name
//Step 8: Enter the last name
//Step 9: Enter the mobile number
//Step 10: Enterthe password
//Step 11: Handle all the three drop downs
//Step 12: Select the radio button "Female" 
        // ( A normal click will do for this step) 