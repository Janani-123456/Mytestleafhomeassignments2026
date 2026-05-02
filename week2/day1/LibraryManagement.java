package selenium_automation.week2.day1;

public class LibraryManagement {
    // Calling both the methods from different class - Library
    public static void main(String[] args) {
        Library managebook = new Library();// Object created as managebook
        // Called both methods using object
        managebook.addBook("Secret Seven");
        managebook.issueBook();
    }
}
