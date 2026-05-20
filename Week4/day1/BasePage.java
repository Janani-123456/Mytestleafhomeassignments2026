package learnpolymorphism.Week4.day1;

//Super class
public class BasePage {
    public void findElement() {
        System.out.println("Element Found");
    }

    public void clickElement() {
        System.out.println("Element Clicked");
    }

    public void enterText() {
        System.out.println("Entered text");
    }

    public void performCommonTasks() {
        System.out.println("Base page common task performed");
    }
}

// Subclass
// Use the ‘extends’ keyword for inheritance.
class LoginPage extends BasePage {

    public void performCommonTasks() {
        super.performCommonTasks();
        System.out.println("Loginpage common task performed");
    }
//Method overriding
    public static void main(String[] args) {
        LoginPage website = new LoginPage();
        website.performCommonTasks();
    }
}