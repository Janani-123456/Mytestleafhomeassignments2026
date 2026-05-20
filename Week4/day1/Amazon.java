package learnpolymorphism.Week4.day1;

public class Amazon extends CanaraBank {

    @Override
    public void cashOnDelivery() {
        System.out.println("Unimplemented method 'cashOnDelivery'");
    }

    @Override
    public void upiPayments() {
        System.out.println("Unimplemented method 'upiPayments'");
    }

    @Override
    public void cardPayments() {
        System.out.println("Unimplemented method 'cardPayments'");
    }

    @Override
    public void internetBanking() {
        System.out.println("Unimplemented method 'internetBanking'");
    }

    @Override
    public void recordPaymentDetails() {
        System.out.println("Unimplemented method 'recordPaymentDetails'");
    }

    public static void main(String[] args) {
        Amazon bankingdetails = new Amazon();
        bankingdetails.cashOnDelivery();
        bankingdetails.upiPayments();
        bankingdetails.cardPayments();
        bankingdetails.internetBanking();
        bankingdetails.recordPaymentDetails();

    }
}
