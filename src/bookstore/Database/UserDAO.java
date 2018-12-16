/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.Database;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.bson.Document;

/**
 *
 * @author KIATS
 */
public class UserDAO {
    
    public static MongoClientURI uri  = new MongoClientURI("mongodb://user01:user01@ds145563.mlab.com:45563/book_shop"); 
    public static MongoClient client = new MongoClient(uri);
    public static MongoDatabase db = client.getDatabase(uri.getDatabase());
    
    public static String checkUser(String username , String password){
        String usertype = "";
        MongoCollection <Document> room = db.getCollection("user");
        Document findUser = new Document("username",username).append("password", password);
        MongoCursor <Document> cursor = room.find(findUser).iterator();
        
         try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                usertype = doc.getString("usertype");            
       
            }
        } 
         finally {}
         return usertype;
    }
    
   
    
}
