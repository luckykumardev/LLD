class DatabaseConnectionManager {
    // Declare the instance variable
    private static DatabaseConnectionManager instance;

    // Private constructor to prevent instantiation
    private DatabaseConnectionManager() {
        System.out.println("Database connection established");
    }

    // Public method to provide access to the instance, synchronized for thread safety
    public static synchronized DatabaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    public void executeQuery(String query) {
        System.out.println("Executing query: " + query);
    }
}