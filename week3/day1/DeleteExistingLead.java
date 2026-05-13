package learnstring.week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteExistingLead {
    public static void main(String[] args) throws InterruptedException {
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
        // Step 8: Click on the "Leads" tab.
        driver.findElement(By.linkText("Leads")).click();
        // Step 9 Click on the "Find leads" button.
        driver.findElement(By.linkText("Find Leads")).click();
        // Click Phone tab
        driver.findElement(By.xpath("//span[text()='Phone']")).click();

        // Enter phone number
        driver.findElement(By.name("phoneNumber")).sendKeys("99");

        // Click Find Leads button
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

        // Wait for results to load
        Thread.sleep(2000);

        // Capture first lead ID
        WebElement firstLead = driver.findElement(
                By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));

        String leadId = firstLead.getText();

        System.out.println("Captured Lead ID: " + leadId);

        // Click first resulting lead
        firstLead.click();

        // Click Delete button
        //driver.findElement(By.linkText("Delete")).click();
        // Click Find Leads again
        driver.findElement(By.linkText("Find Leads")).click();

        // Enter captured lead ID
        driver.findElement(By.name("id")).sendKeys(leadId);

        // Click Find Leads
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

        // Wait for search results
        Thread.sleep(2000);

        // Verify deletion message
        String message = driver.findElement(By.className("x-paging-info")).getText();

        if (message.equals("No records to display")) {
            System.out.println("Lead deleted successfully");
        } else {
            System.out.println("Lead deletion failed");
        }

        // Close browser
        driver.quit();

    }
}
