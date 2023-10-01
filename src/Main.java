import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Main {
    public static void main( String[] args ) {
        // Attempting to call on a database in mongo, but everything is broken. :(
        String uri = "mongodb+srv://janetfu04:BDOO8476qnW0uZ9z>@cluster0.uzqaigu.mongodb.net/?retryWrites=true&w=majo" +
                "rity&appName=AtlasApp\n\n";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("sample_mflix");
            MongoCollection<Document> collection = database.getCollection("players");
            Document doc = collection.find(eq("playername", "John")).first();
            if (doc != null) {
                System.out.println(doc.toJson());
            } else {
                System.out.println("No matching documents found.");
            }
        }
    }
}