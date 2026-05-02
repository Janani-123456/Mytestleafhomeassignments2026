package selenium_automation.week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        // Step1:Launch the Browser
        // ChromeBrowser - ChromeDriver
        ChromeDriver driver = new ChromeDriver();

        // Step 2: Load URL using get
        driver.get("https://www.facebook.com");

        // Step 3 :Maximize the browser
        driver.manage().window().maximize();

    }
}
