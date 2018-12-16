/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.Book;

import static bookstore.Database.UserDAO.db;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.HashMap;
import java.util.Map;
import org.bson.Document;

/**
 *
 * @author dell
 */
public class BookDAO {
    
    public static void getBookById (int i) {
        
        MongoCollection<Document> book = db.getCollection("book");
        Document findBook = new Document("book_id",Integer.toString(i));
        MongoCursor<Document> cursor = book.find(findBook).iterator();
        
         try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                
                String book_id = doc.getString("book_id");
                String name = doc.getString("name");
                String price = doc.getString("price");
                String writer = doc.getString("writer");
                String publisher = doc.getString("publisher");
                String type = doc.getString("doc_type");
                String writeyear = doc.getString("writeyear");
                String page = doc.getString("page");
                String isbn = doc.getString("isbn");
                String amount = doc.getString("amount");
                String writenum = doc.getString("writenum");
                
                Book.setId(book_id);
                Book.setName(name);
                Book.setPrice(price);
                Book.setWriter(writer);
                Book.setPublisher(publisher);
                Book.setType(type);
                Book.setWriteyear(writeyear);
                Book.setPage(page);
                Book.setISBN(isbn);
                Book.setAmount(amount);
                Book.setWritenum(writenum);
           
       
            }
        } 
         finally {}
         
    }
    public static MongoClientURI uri  = new MongoClientURI("mongodb://user01:user01@ds145563.mlab.com:45563/book_shop"); 
    public static MongoClient client = new MongoClient(uri);
    public static MongoDatabase db = client.getDatabase(uri.getDatabase());
    
    public static int getCountAllBook() {

        MongoCollection<Document> book = db.getCollection("book");
        Document findBook= new Document();
        MongoCursor<Document> cursor = book.find(findBook).iterator();
        int countAllBook = 0;
        
         try {
            while ( cursor.hasNext() ) {
              cursor.next();
                    countAllBook++;
       
            }
        } 
         finally {}
         return countAllBook;
    }
    
    
    
}
