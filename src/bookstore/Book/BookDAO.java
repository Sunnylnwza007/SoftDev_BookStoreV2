/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.Book;

import static bookstore.Database.UserDAO.db;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import java.util.HashMap;
import java.util.Map;
import org.bson.Document;

/**
 *
 * @author dell
 */
public class BookDAO {
    
    public static void getBook(int i){
        
        String setOfBook = "";
        MongoCollection<Document> room = db.getCollection("book");
        Document findBook = new Document("book_id",Integer.toString(i));
        MongoCursor<Document> cursor = room.find(findBook).iterator();
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
                
                
                Book.setId(book_id);
                Book.setName(name);
                Book.setPrice(price);
                Book.setWriter(writer);
                Book.setPublisher(publisher);
                Book.setType(type);
                Book.setWriteyear(writeyear);
                Book.setPage(page);
                Book.setISBN(isbn);
           
       
            }
        } finally {}
    }
    
    
    
}
