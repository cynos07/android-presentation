package kr.studygram.utils.database;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import kr.studygram.utils.config.SecureConfig;
import org.bson.Document;

/**
 * Created by production on 2017-04-06.
 */
public enum Database {
    INSTANCE;
//    private String DB_ID = get id from SecureConfig
//    priate String DB_PASSWORD = get password from SecureConfig
//    private String DB_NAME = get dbname from SecureConfig
    private String DB_URL = "mongodb://"+ DB_ID+":"+DB_PASSWORD+"@studygram-shard-00-00-csfwe.mongodb.net:27017,studygram-shard-00-01-csfwe.mongodb.net:27017,studygram-shard-00-02-csfwe.mongodb.net:27017/"+DB_NAME+"?ssl=true&replicaSet=studygram-shard-0&authSource=admin";

    private MongoClientURI uri;
    private MongoClient mongoClient;
    private MongoDatabase mongoDatabase;
    private MongoCollection<Document> collection;
    private Document doc;

    Database()
    {
        //initialized uri member with DB_URL
        //intialize mongoClient with uri
        //You have to log that info Database object initialized ( use Logger )
    }

    public void insert(String collection, Document doc)
    {
        insert("studygram", collection, doc);
    }

    public void insert(String database, String collection, Document doc)
    {
        //We have to initialize mongoDatabase, collection
        //something insert doc to collection
    }
}