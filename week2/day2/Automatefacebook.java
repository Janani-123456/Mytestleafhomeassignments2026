package selenium_automation.week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Automatefacebook {
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Step 1:Open Webdriver
		ChromeDriver driver = new ChromeDriver();
		// Step 2 : Load URL
		driver.get("https://en-gb.facebook.com/");
		// Step 3 :Maximize the browser
		driver.manage().window().maximize();
		// Step 4 :wait
		driver.wait(2000);
		// Step 5 : Click on the Create new account button.
		driver.findElement(By.linkText("")).click();
		// Step 6 : Enter the First name.
		driver.findElement(By.id("firstname")).sendKeys("jana");
		// Step 7 : Enter the Surname.
		driver.findElement(By.id("surname")).sendKeys("ravi");
		// Step 8 : Enter the Mobile number or email address.
		driver.findElement(By.id("mobilenumber")).sendKeys("8889995556");
		// Step 9 : Enter the New password.
		driver.findElement(By.id("password")).sendKeys("itsmypassword");

		// Step 10 : Handle all three dropdowns in Date of birth
		WebElement date = driver.findElement(By.id("date"));
		Select dropdown1 = new Select(date);
		dropdown1.selectByIndex(2);

		WebElement month = driver.findElement(By.id("month"));
		Select dropdown2 = new Select(month);
		dropdown2.selectByIndex(2);

		WebElement year = driver.findElement(By.id("year"));
		Select dropdown3 = new Select(year);
		dropdown3.selectByIndex(2);
		// Step 11 : Select the radio button in Gender.
		driver.findElement(By.cssSelector("male")).click();
	}
}
