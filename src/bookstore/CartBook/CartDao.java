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
    public Cart searchCart (String user) {
        Cart cart = new Cart();
        MongoCollection <Document> cartCollection = db.getCollection("cart");
        Document findCart = new Document("user",user);
        MongoCursor <Document> cursor = cartCollection.find(findCart).iterator();
        
        try {
            while ( cursor.hasNext() ) {
                Document doc = cursor.next();
                String bookName = doc.getString("bookname");
                String num = doc.getString("num");
                String price = doc.getString("price");
                cart.addBookName(bookName);
                cart.addNum(num);
                cart.addPrice(price);
                
            }
        } 
        finally {}  
        return cart;
    }
    
    public void deleteBook (String bookName,String num,String price) {
         MongoCollection <Document> cartCollection = db.getCollection("cart");
         Document findBook = new Document("bookname",bookName).append("num", num).append("price", price);
         cartCollection.findOneAndDelete(findBook);
    }
    
    public void addAddress(Address address,String user) {       
        MongoCollection<Document> addressCol = db.getCollection("address");
        Document findAddress = new Document("user",user);
        Document insert = new Document("user",user).append("houseNum", address.getHouseNum()).append("villageNo", address.getVillageNo())
                .append("subDistrict", address.getSubDistrict()).append("district", address.getDistrict()).append("province", address.getProvince())
                .append("postcode", address.getPostcode()).append("tel", address.getTel());
        MongoCursor<Document> cursor = addressCol.find(findAddress).iterator();
        
        if ( cursor.hasNext() ) {
            addressCol.findOneAndDelete(findAddress);
            addressCol.insertOne(insert);
        }
        else {
            addressCol.insertOne(insert);
        }     
    }
    
    public Address setAddress (String user) {
        Address address = new Address();
        MongoCollection<Document> addressCollection = db.getCollection("address");
        Document findAddress = new Document("user",user);
        MongoCursor<Document> cursor = addressCollection.find(findAddress).iterator();
        try {
            while ( cursor.hasNext() ) {
                Document doc = cursor.next();
                String houseNum = doc.getString("houseNum");
                String villageNo = doc.getString("villageNo");
                String subDistrict = doc.getString("subDistrict");
                String district = doc.getString("district");
                String province = doc.getString("province");
                String postcode = doc.getString("postcode");
                String tel = doc.getString("tel");
                address.setHouseNum(houseNum);
                address.setVillageNo(villageNo);
                address.setSubDistrict(subDistrict);
                address.setDistrict(district);
                address.setProvince(province);
                address.setPostcode(postcode);
                address.setTel(tel);
            }
        } 
        finally {}     
        return address;
    }
}
