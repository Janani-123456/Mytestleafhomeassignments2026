package selenium_automation.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LeaftapHomeAssignment {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1:Open Webdriver
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(opt);

		// Step 2 : Load URL
		driver.get("http://leaftaps.com/opentaps/");
		// Step 3 :Maximize the browser
		driver.manage().window().maximize();
		// Step 4 : Enter the Username
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		// Step 5 : Enter the Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Step 6 : Click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		// Step 7 :Click on link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Step 8: Click on the "Accounts" tab.
		driver.findElement(By.linkText("Accounts")).click();
		// Step 9 Click on the "Create Account" button.
		driver.findElement(By.linkText("Create Account")).click();
		// Step 10 Enter an account name.
		driver.findElement(By.id("accountName")).sendKeys("Testleaf");
		// Step 11 Enter a description as "Selenium Automation Tester."
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		// Step 12 Select "ComputerSoftware" as the industry.
		WebElement industry1 = driver.findElement(By.name("industryEnumId"));
		Select dropdown1 = new Select(industry1);
		dropdown1.selectByIndex(3);

		// Step 13Select "S-Corporation" as ownership using SelectByVisibleText.
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select dropdown2 = new Select(ownership);
		dropdown2.selectByVisibleText("S-Corporation");

		// Step 14 Select "Employee" as the source using SelectByValue.
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select dropdown3 = new Select(source);
		dropdown3.selectByValue("LEAD_EMPLOYEE");

		// Step 15Select "eCommerce Site Internal Campaign" as the marketing campaign
		// using SelectByIndex.
		WebElement campaign = driver.findElement(By.id("marketingCampaignId"));
		Select dropdown4 = new Select(campaign);
		dropdown4.selectByIndex(6);

		// Step 16 Select "Texas" as the state/province using SelectByValue.
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dropdown5 = new Select(state);
		dropdown5.selectByValue("TX");
		// Step 17: Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();
		// Step 18 Verify that the account name is displayed correctly.
		driver.findElement(By.id("accountName")).isDisplayed();
		// Step 19 Close the browser window
		driver.close();

	}

}
