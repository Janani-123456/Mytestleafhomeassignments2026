package learnstring.week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

        public static void main(String[] args) {

                // Launch browser
                // Step 1:Open Webdriver
                ChromeOptions opt = new ChromeOptions();
                opt.addArguments("guest");

                ChromeDriver driver = new ChromeDriver(opt);

                // Load URL
                driver.get("http://leaftaps.com/opentaps/");

                // Maximize browser
                driver.manage().window().maximize();

                // Implicit wait
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

                // Enter username
                driver.findElement(By.id("username")).sendKeys("DemoCSR");

                // Enter password
                driver.findElement(By.id("password")).sendKeys("crmsfa");

                // Click Login button
                driver.findElement(By.className("decorativeSubmit")).click();

                // Click CRM/SFA link
                driver.findElement(By.linkText("CRM/SFA")).click();

                // Click Leads
                driver.findElement(By.linkText("Leads")).click();

                // Click Create Lead
                driver.findElement(By.linkText("Create Lead")).click();

                // Enter Company Name using XPath
                driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");

                // Enter First Name using XPath
                driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Jana");

                // Enter Last Name using XPath
                driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Arun");

                // Enter First Name(Local)
                driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Janu");

                // Enter Department
                driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");

                // Enter Description
                driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Automation Testing");

                // Enter Email
                driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testingqa@gmail.com");

                // Select State/Province as New York
                WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

                Select dropdown = new Select(state);

                dropdown.selectByVisibleText("New York");

                // Click Create button
                driver.findElement(By.name("submitButton")).click();

                // Click Edit button
                driver.findElement(By.linkText("Edit")).click();

                // Clear Description field
                driver.findElement(By.id("updateLeadForm_description")).clear();

                // Fill Important Note
                driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Lead details updated successfully");

                // Click Update button
                driver.findElement(By.xpath("//input[@value='Update']")).click();

                // Get page title
                String title = driver.getTitle();

                System.out.println("Page Title is: " + title);

                // Close browser
                driver.quit();
        }
}