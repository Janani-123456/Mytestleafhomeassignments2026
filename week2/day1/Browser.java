package selenium_automation.week2.day1;

public class Browser {
    // First method
    public String launchBrowser(String browserName) {
        System.out.println("Browser launched successfully");
        return browserName;
    }

    // Second Method
    public void loadUrl() {
        System.out.println("Application url loaded successfully");
    }

    // Main method
    public static void main(String[] args) {
        Browser Options = new Browser();
        Options.launchBrowser("Chrome");
        Options.loadUrl();
    }

}
