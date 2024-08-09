// DatabaseConnectionManager Class (without Singleton)
class DatabaseConnectionManager {
    public DatabaseConnectionManager() {
        // Code to establish a database connection
        System.out.println("Database connection established");
    }

    public void executeQuery(String query) {
        System.out.println("Executing query: " + query);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Create multiple instances of DatabaseConnectionManager
        DatabaseConnectionManager connection1 = new DatabaseConnectionManager();
        connection1.executeQuery("SELECT * FROM users");

        DatabaseConnectionManager connection2 = new DatabaseConnectionManager();
        connection2.executeQuery("SELECT * FROM orders");
    }
}
