/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.Bill;

import bookstore.CartBook.Address;
import bookstore.CartBook.CartService;
import bookstore.Database.User;
import static bookstore.Database.UserDAO.db;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.bson.Document;
import static org.omg.CORBA.AnySeqHelper.insert;

public class BillDao {
    
    ArrayList<String> bookName = new ArrayList<String>();
    ArrayList<String> num = new ArrayList<String>();
    ArrayList<String> price = new ArrayList<String>();
    
    //public static MongoClientURI uri  = new MongoClientURI("mongodb://user01:user01@ds145563.mlab.com:45563/book_shop"); 
    //public static MongoClient client = new MongoClient(uri);
    //public static MongoDatabase db = client.getDatabase(uri.getDatabase());
    
    public  int getCountAllBook(){

        MongoCollection<Document> bill = db.getCollection("bill");
        Document findUser = new Document();
        MongoCursor<Document> cursor = bill.find(findUser).iterator();
        int count = 0;
         try {
            while (cursor.hasNext()) {
              cursor.next();
                    count++;
       
            }
        } finally {}
         return count;
    }
    
     public void addBill(ArrayList<String> bookName, ArrayList<String> num, ArrayList<String> price,int total){
        
         System.out.print("HI");
        this.bookName = bookName;
        this.num = num;
        this.price = price;
        
        MongoCollection<Document>  billCol = db.getCollection("bill");
        int idNumber = getBillId();
        Document insert = new Document("id",idNumber+"").append("bookname", bookName).append("num", num).append("price", price);
        
        billCol.insertOne(insert);      
        
  
    }
     public int getBillId(){
          MongoCollection<Document>  billCol = db.getCollection("bill");
          int idNumber = getCountAllBook()+1;
          
          return idNumber;
     }
        
     public void deleteCart(){
         MongoCollection<Document>  cartCollection = db.getCollection("cart");
         CartService cartService = new CartService();
         String user = User.getName();
         Document findBook = new Document("user",user);
         cartCollection.deleteMany(findBook);
     }
}
