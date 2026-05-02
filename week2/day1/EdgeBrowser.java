package selenium_automation.week2.day1;

public class EdgeBrowser {
    public static void main(String[] args) {
        Browser Options = new Browser();
        Options.launchBrowser("Chrome");
        Options.loadUrl();
    }
}
