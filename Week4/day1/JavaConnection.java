package learnpolymorphism.Week4.day1;
//Implement the interface in a Concrete class.
public class JavaConnection extends MySqlConnection {

    @Override
    public void connect() {
        System.out.println("Unimplemented method 'connect");
    }

    @Override
    public void disconnect() {
        System.out.println("Unimplemented method 'disconnect'");
    }

    @Override
    public void executeUpdate() {
        System.out.println("Unimplemented method 'executeUpdate'");
    }

    public static void main(String[] args) {
        JavaConnection connection = new JavaConnection();
        connection.connect();
        connection.disconnect();
        connection.executeUpdate();
        connection.executeQuery();
    }
}
