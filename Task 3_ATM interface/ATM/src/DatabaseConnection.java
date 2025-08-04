// DatabaseConnection.java
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class DatabaseConnection {
    private static MongoDatabase database;

    static {
        try {
            ConnectionString connString = new ConnectionString("mongodb://localhost:27017");
            MongoClientSettings settings = MongoClientSettings.builder()
                    .applyConnectionString(connString)
                    .build();

            MongoClient mongoClient = MongoClients.create(settings);
            database = mongoClient.getDatabase("atmDB");
            System.out.println("Connected to database: " + database.getName());
        } catch (Exception e) {
            System.err.println("Connection failed: " + e.getMessage());
        }
    }

    public static MongoDatabase getDatabase() {
        return database;
    }
}
