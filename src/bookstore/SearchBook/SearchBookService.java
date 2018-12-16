/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.SearchBook;

import bookstore.Book.Book;



/**
 *
 * @author KIATS
 */
public class SearchBookService {
    
    public static void getBook (int i) {
        SearchBookDAO.getBookById(i);
    };
    
    public static String getListOfBook (int i) {
        return SearchBookDAO.listOfBook.get(i);
    }
    
    public static int getBookName (String type, String txt) {
        if ( type.equals("name") ) {
            return SearchBookDAO.getBookByName(txt);
        }
        else if ( type.equals("writer") ) {
            return SearchBookDAO.getBookByWriter(txt);
        }
        else {
            return 0;
        }
        
    }
    
    public static void resetInformation() {
        Book.id = ""; 
        Book.name = ""; 
        Book.publisher = "";
        Book.writer = ""; 
        Book.type = "";
        Book.price = ""; 
        Book.writenum = ""; 
        Book.writeyear = ""; 
        Book.page = "";
        Book.amount = "";
        Book.ISBN = "";
    }
    
    
    
    
}
