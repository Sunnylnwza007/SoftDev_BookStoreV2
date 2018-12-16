/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.AllBook;

import bookstore.Book.Book;
import bookstore.Book.BookDAO;
import java.util.ArrayList;

/**
 *
 * @author INDEX
 */

public class AllBookService {
    public static int numPage = 1;
    public static double pageEnd = setPageEnd();
    
    public static int setPageEnd(){
        int numEnd = 1;
        
        if ( getCountBook() / 8.0 > getCountBook() / 8 ) {
            numEnd = getCountBook() / 8 + 1;
        }
        else if ( getCountBook() / 8.0 == getCountBook() / 8 ) {
            numEnd = getCountBook() / 8;
        }
        return numEnd;
    }
    public static ArrayList <String> nameBook = new ArrayList<>();
    public static ArrayList <String> priceBook = new ArrayList<>(); 
    public static ArrayList <String> bookID = new ArrayList<>();
     
     
    
    public static void setPage(int countPage){
        
        if ( countPage == 1 ) {
           if( numPage == 1 ) {              
           }
           else {
               numPage--;
           }        
        }
        else {
            if (numPage == pageEnd ) {               
            }
            else {
                numPage++;
            }
        }
    }
    
    public static int getCountBook() {
        return BookDAO.getCountAllBook();
    }
    public static void setPageEnd (int pageEnd) {
        pageEnd = pageEnd;
    }
    public static int getPage(){
        return numPage;
    }
    
    public static String getNameBookById (int i) {
       return nameBook.get(i);
    }
    public static String getPriceBookById (int i) {
       return priceBook.get(i);
    }
    public static String getBookIDById (int i) {
       return bookID.get(i);
    }
    
    
    public static void setlistAllBook (int i) {
        BookDAO.getBookById(i);
        String name = Book.getName();
        
        nameBook.add(name);
        priceBook.add(Book.getPrice());
        bookID.add(Book.getId());
    
    }
   
    
}
