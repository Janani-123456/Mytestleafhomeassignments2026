package learnstring.week3.day2;

public class WebElement {
    public void click() {
        System.out.println("Element Clicked");
    }

    public void setText(String text) {
System.out.println("text"+text);
    }
}

// Subclass 1 - inheriting from the WebElement base class.
class Button extends WebElement {
    public void submit() {
        System.out.println("Element Submitted");
    }
}

// Subclass 2 - inheriting from the WebElement base class.
class TextField extends WebElement {
    public void getText() {
        System.out.println("Got text");
    }
}

// Develop a new class named CheckBoxButton that inherits from the Button
// subclass.
class CheckBoxButton extends Button {
    // In the CheckBoxButton class, introduce a method named clickCheckButton().
    public void clickCheckButton() {
System.out.println("Check box button clicked");
    }
}// Create another subclass named RadioButton, also inheriting from the Button
 // subclass.

class RadioButton extends Button {
    public void selectRadioButton() {
        System.out.println("RadioButton Selected");
    }
}

class CustomButton {

}
