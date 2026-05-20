package learnpolymorphism.Week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {

	public static void main(String[] args) {

		// Initialize ChromeDriver
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(opt);

		// Load URL
		driver.get("http://leaftaps.com/opentaps/control/login");

		// Maximize browser
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Enter username
		driver.findElement(By.id("username")).sendKeys("DemoCSR");

		// Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click Login
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click Contacts
		driver.findElement(By.linkText("Contacts")).click();

		// Click Merge Contacts
		driver.findElement(By.linkText("Merge Contacts")).click();

		// Store parent window
		String parentWindow = driver.getWindowHandle();

		// Click From Contact widget
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();

		// Get all windows
		Set<String> allWindows = driver.getWindowHandles();

		// Convert Set to List
		List<String> windowsList = new ArrayList<String>(allWindows);

		// Switch to child window
		driver.switchTo().window(windowsList.get(1));

		// Click first resulting contact
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();

		// Switch back to parent window
		driver.switchTo().window(parentWindow);

		// Click To Contact widget
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

		// Get all windows again
		Set<String> allWindows2 = driver.getWindowHandles();

		// Convert to List
		List<String> windowsList2 = new ArrayList<String>(allWindows2);

		// Switch to second child window
		driver.switchTo().window(windowsList2.get(1));

		// Click second resulting contact
		driver.findElement(By.xpath("(//a[@class='linktext'])[2]")).click();

		// Switch back to parent window
		driver.switchTo().window(parentWindow);

		// Click Merge button
		driver.findElement(By.linkText("Merge")).click();

		// Handle alert
		Alert contacts = driver.switchTo().alert();

		// Accept alert
		contacts.accept();

		// Verify title
		System.out.println("The title of the page is: " + driver.getTitle());

		// Close browser
		driver.quit();
	}
}