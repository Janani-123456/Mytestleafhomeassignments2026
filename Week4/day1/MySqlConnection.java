package learnpolymorphism.Week4.day1;

public  class MySqlConnection implements DatabaseConnection{

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

       public void executeQuery() {
        System.out.println("Unimplemented method 'executeQuery'");
    }


}
