package learnstring.week3.day2;

public class Elements extends Button {
public static void main(String[] args) {

        // Button object
        Button b = new Button();
        b.click();
        b.setText("Login");
        b.submit();

        System.out.println();

        // TextField object
        TextField tf = new TextField();
        tf.click();
        tf.setText("Username");
        tf.getText();

        System.out.println();

        // CheckBoxButton object
        CheckBoxButton cb = new CheckBoxButton();
        cb.click();
        cb.submit();
        cb.clickCheckButton();

        System.out.println();

        // RadioButton object
        RadioButton rb = new RadioButton();
        rb.click();
        rb.submit();
        rb.selectRadioButton();
    }
}

