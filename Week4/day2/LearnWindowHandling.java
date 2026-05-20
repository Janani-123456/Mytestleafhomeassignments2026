package learnpolymorphism.Week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnWindowHandling {
    public static void main(String[] args) throws InterruptedException {
        // Step 1 :Launch Browser
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("guest");

        ChromeDriver driver = new ChromeDriver(opt);

        // Step 2 : load URL
        driver.get("https://www.irctc.co.in/");
        // Step 3 : Maximize
        driver.manage().window().maximize();
        // Add an implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String parentWindow = driver.getWindowHandle();
        // Click on FLIGHTS link
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//span[@class='allcircle circleone']"));
        actions.scrollToElement(element).perform();

        // Get all window handles
        Set<String> alladdress = driver.getWindowHandles();
        List<String> alladdress1 = new ArrayList<String>(driver.getWindowHandles());
        // Capture and print title of new window
        String childtitle = driver.getTitle();
        System.out.println("Child Window Title: " + childtitle);

        // Switch back to parent window
        driver.switchTo().window(parentWindow);
        System.out.println("Parent Window Title: " + parentWindow);
        // Close only parent tab
        driver.close();
    }
}
