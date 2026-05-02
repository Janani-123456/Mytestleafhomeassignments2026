package selenium_automation.week2.day1;

//Class Created 
public class Library {
    // First Method
    public String addBook(String bookTitle) {// String datatype near access modifier
        System.out.println("Book added successfully");
        return bookTitle;// Returns booktitle
    }

    // Second Method
    public void issueBook() {
        System.out.println("Book issued successfully");

    }

    // Main method
    public static void main(String[] args) {
        Library managebook = new Library();// Object created as managebook
        // Called both methods using object
        managebook.addBook("Secret Seven");
        managebook.issueBook();
    }
}
