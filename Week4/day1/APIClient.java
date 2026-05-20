package learnpolymorphism.Week4.day1;

//Classname
public class APIClient {
    // Create a method with one argument
    public void sendRequest(String endpoint) {
        System.out.println("Endpoint is " + endpoint);
    }

    // Create a same method with three arguments
    public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
        System.out.println("Endpoint is " + endpoint );
        System.out.println("requestBody is " + requestBody );
        System.out.println("requestStatus is " + requestStatus );
    }

    // main methods using object
    public static void main(String[] args) {
        APIClient client = new APIClient();
        // Call first overloaded method
        client.sendRequest("https://platform.testleaf.com/#/");
        // Call second overloaded method
        client.sendRequest("https://platform.testleaf.com/#/", "json structure", true);

    }
}
