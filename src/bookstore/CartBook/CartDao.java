/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.CartBook;
import static bookstore.Database.UserDAO.db;
import com.mongodb.DBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import java.util.HashMap;
import java.util.Map;
import org.bson.Document;
/**
 *
 * @author dell
 */
public class CartDao {
    public Cart searchCart(String user){
        Cart c = new Cart();
        MongoCollection<Document> cart = db.getCollection("cart");
        Document findCart = new Document("user",user);
        MongoCursor<Document> cursor = cart.find(findCart).iterator();
        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                String bookName = doc.getString("bookname");
                String num = doc.getString("num");
                String price = doc.getString("price");
                c.addBookName(bookName);
                c.addNum(num);
                c.addPrice(price);
                
            }
        } finally {}
        
        return c;
    }
    
    public void deleteBook(String bookName,String num,String price){
         MongoCollection<Document> cart = db.getCollection("cart");
         Document findBook = new Document("bookname",bookName).append("num", num).append("price", price);
         cart.findOneAndDelete(findBook);
    }
    
    public void addAddress(Address ad,String user){
        MongoCollection<Document> addressCol = db.getCollection("address");
        Document findAddress = new Document("user",user);
        Document insert = new Document("user",user).append("housenum", ad.getHouseNum()).append("mo", ad.getMo())
                .append("tumbon", ad.getTumbon()).append("aumper", ad.getAumper()).append("provide", ad.getProvide())
                .append("postcode", ad.getPostcode()).append("tel", ad.getTel());
        MongoCursor<Document> cursor = addressCol.find(findAddress).iterator();
        if (cursor.hasNext()){
            addressCol.findOneAndDelete(findAddress);
            addressCol.insertOne(insert);
        }else{
            addressCol.insertOne(insert);
        }
        
    }
    
    public Address setAddress(String user){
        Address ad = new Address();
        MongoCollection<Document> address = db.getCollection("address");
        Document findAddress = new Document("user",user);
        MongoCursor<Document> cursor = address.find(findAddress).iterator();
        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                String houseNum = doc.getString("housenum");
                String mo = doc.getString("mo");
                String tumbon = doc.getString("tumbon");
                String aumper = doc.getString("aumper");
                String provide = doc.getString("provide");
                String postcode = doc.getString("postcode");
                String tel = doc.getString("tel");
                ad.setHouseNum(houseNum);
                ad.setMo(mo);
                ad.setTumbon(tumbon);
                ad.setAumper(aumper);
                ad.setProvide(provide);
                ad.setPostcode(postcode);
                ad.setTel(tel);
            }
        } finally {}
        
        return ad;
    }
}
