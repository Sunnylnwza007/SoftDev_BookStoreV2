/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.Detail;

import bookstore.Book.Book;
import static bookstore.Database.UserDAO.db;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;

/**
 *
 * @author Nitipon Chingthong
 */
public class detailBookDAO {
     public void getBookByProduct(String i){
        
        MongoCollection<Document> book = db.getCollection("book");
        Document findBook = new Document("book_id",i);
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
                String writenum = doc.getString("writenum");
                String amount = doc.getString("amount");
                
                
                Book.setId(book_id);
                Book.setName(name);
                Book.setPrice(price);
                Book.setWriter(writer);
                Book.setPublisher(publisher);
                Book.setType(type);
                Book.setWriteyear(writeyear);
                Book.setPage(page);
                Book.setISBN(isbn);
                Book.setWritenum(writenum);
                Book.setAmount(amount);
           
       
            }
        } finally {}
    }
     
    public void setToCartDB(String user, String bookName, String num, String price){
        MongoCollection<Document> book = db.getCollection("cart");
        Document findCart = new Document("user",user);
        Document insert = new Document("user",user).append("bookname", bookName).append("num", num).append("price", price);
        
            book.insertOne(insert);
        
    }
}
