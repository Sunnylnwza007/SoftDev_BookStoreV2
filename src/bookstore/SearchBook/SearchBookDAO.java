/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.SearchBook;

import bookstore.Book.Book;
import static bookstore.Database.UserDAO.db;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author N A T M A N
 */
public class SearchBookDAO {
    public static MongoClientURI uri  = new MongoClientURI("mongodb://user01:user01@ds145563.mlab.com:45563/book_shop"); 
    public static MongoClient client = new MongoClient(uri);
    public static MongoDatabase db = client.getDatabase(uri.getDatabase());
    
    static ArrayList<String> listOfBook = new ArrayList<>();
    
    public static void getBookById(int i){
        
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
        } finally {}
    }
    
    public static int getBookByName(String txt){
        int count = 0;
        listOfBook.clear();
        
        MongoCollection<Document> room = db.getCollection("book");

        MongoCursor<Document> cursor = room.find().iterator();
         try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                String name = doc.getString("name");
                
                if (name.contains(txt)){
                String book_id = doc.getString("book_id");       
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
        
                listOfBook.add(book_id+ "/" + name + "/" + price);
                
                count++;
                }
       
            }
        }finally {}

         return count;
    }
    
    public static int getBookByWriter(String txt){
        int count = 0;
        listOfBook.clear();
        
        MongoCollection<Document> room = db.getCollection("book");
        
        MongoCursor<Document> cursor = room.find().iterator();
         try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                String writer = doc.getString("writer");
                
                if (writer.contains(txt)){
                String book_id = doc.getString("book_id");
                String name = doc.getString("name");
                String price = doc.getString("price");  
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
                
                listOfBook.add(book_id+ "/" + name + "/" + price);
                
                count++;
                }
       
            }
        } finally {}

         
         return count;
    }
    
}
