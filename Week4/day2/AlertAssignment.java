package learnpolymorphism.Week4.day2;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		// Load the URL (https://www.leafground.com/alert.xhtml)
		driver.get("https://www.leafground.com/alert.xhtml");
		// Maximize the browser window
		driver.manage().window().maximize();
		//implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// driver.findElement(By.xpath("//h5[text()='Alert (Prompt
		// Dialog)']/following::span[text()='Show']")).click();
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		// Switch to the alert and type a message in the alert box.

		Alert Promptdialog = driver.switchTo().alert();
		Promptdialog.sendKeys("Testleaf prompt");
		// Retrieve the typed text from the alert and verify it.
		System.out.println("The text from the alert is : " + Promptdialog.getText());
		// Dismiss the alert.
		Promptdialog.dismiss();


	}

}
