/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.CartBook;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class Cart {
    ArrayList <String> bookName = new ArrayList<String>();
    ArrayList <String> num = new ArrayList<String>();
    ArrayList <String> price = new ArrayList<String>();
    
     public void addBookName (String bookname) {
         this.bookName.add(bookname);
     }
     
     public void addNum (String num) {
         this.num.add(num);
     }
     
     public void addPrice(String price) {
        this.price.add(price);
     }
     
     public String getBookName (int i) {
         return bookName.get(i);
     }
     
      public String getNum (int i) {
         return num.get(i);
     }
      
      public String getPrice (int i) {
         return price.get(i);
     }
     
     public int count() {
         return bookName.size();
     }
     
     public void delList (int i) {
         bookName.remove(i);
         num.remove(i);
         price.remove(i);
     }
        
    }
