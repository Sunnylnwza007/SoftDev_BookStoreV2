/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.CartBook;

/**
 *
 * @author dell
 */
public class CartService {
    public Cart searchCart(String user){
        CartDao cd = new CartDao();
        return cd.searchCart(user);
    }
    
    public void deleteBook(String bookName,String num,String price){
        CartDao cd = new CartDao();
        cd.deleteBook(bookName,num,price);
    }
    
    public void addAddress(Address ad,String user){
        CartDao cd = new CartDao();
        cd.addAddress(ad,user);
    }
    

    public Address setAddress(String user) {
       CartDao cd = new CartDao();
       return cd.setAddress(user);
    }

}
