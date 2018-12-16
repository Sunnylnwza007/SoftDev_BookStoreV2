/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.Detail;

import bookstore.Book.Book;
import bookstore.Database.User;
import javax.swing.JOptionPane;

/**
 *
 * @author Nitipon Chingthong
 */
public class detailBookService {
    public void setProductDetail(String idBook) {
        detailBookDAO detail = new detailBookDAO();
        detail.getBookByProduct(idBook);   
    }
    
    public void addToCart (String user, String bookName, String num, String price) {
        if ( checkLogin() && checkBookAmount(num) ) {
            detailBookDAO detail = new detailBookDAO();
            detail.setToCartDB(user ,bookName, num, price);
            JOptionPane.showMessageDialog(null, "add complete!!" ); 
        }     
    }
    
    public Boolean checkBookAmount (String num){
        if ( Integer.parseInt(num) > Integer.parseInt(Book.getAmount()) ) {
              JOptionPane.showMessageDialog(null, "Product is not enough." ); 
              return false;
        }
        else {
               if ( Integer.parseInt(num) <= 0  || num instanceof String) {
                   JOptionPane.showMessageDialog(null, "Please input the number." ); 
                   return false;
               }
               else {
                   return true;
               }          
        }
    }
    
    public Boolean checkOutOfStock() {
        if ( Integer.parseInt(Book.getAmount() ) <= 0 ) {
                JOptionPane.showMessageDialog(null, "Out of stock!!" ); 
                return false; 
        }
        else {
            return true;
        }
    }
    
     public Boolean checkLogin() {
        if ( User.getStatus() == false ) {
            JOptionPane.showMessageDialog(null, "Please, Login" );
            return false;
        }
        else {
            return checkOutOfStock();
        }
    }
}
