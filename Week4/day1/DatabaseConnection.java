package learnpolymorphism.Week4.day1;
// Create an interface DatabseConnection
public interface DatabaseConnection {
    //abstract methods
    public void connect();
    public void disconnect();
    public void  executeUpdate();
}
