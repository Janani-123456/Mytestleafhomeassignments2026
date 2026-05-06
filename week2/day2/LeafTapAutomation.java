package selenium_automation.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LeafTapAutomation {
    public static void main(String[] args) {
        // Step1:Launch the Browser
        // ChromeBrowser - ChromeDriver
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("guest");

        ChromeDriver driver = new ChromeDriver(opt);

        // Step 2: Load URL using get
        driver.get(" https://leaftaps.com/opentaps/control/main");

        // Step 3 :Maximize the browser
        driver.manage().window().maximize();

        // Enter the username
        driver.findElement(By.id("username")).sendKeys("DemoCSR");

        // Enter the password
        driver.findElement(By.id("password")).sendKeys("crmsfa");

        // Click login button
        driver.findElement(By.className("decorativeSubmit")).click();

        // Click on CRM/SFA link
        driver.findElement(By.linkText("CRM/SFA")).click();

        // Click on Create lead
        driver.findElement(By.linkText("Create Lead")).click();

        // Enter the Company Name
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");

        // Enter the Forename
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jana");

        // Enter the Surname
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravi");

        // Select the dropdown
        WebElement sourceelement = driver.findElement(By.id("createLeadForm_industryEnumId"));

        // Select-Create an Object
        Select dropdown1 = new Select(sourceelement);
        // Use the method to sselectByIndex
        dropdown1.selectByIndex(2);

        // Click submit button
        driver.findElement(By.className("smallSubmit")).click();
    }
}
