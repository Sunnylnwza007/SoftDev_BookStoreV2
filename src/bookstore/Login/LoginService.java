/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.Login;

import bookstore.Database.UserDAO;

/**
 *
 * @author KIATS
 */
public class LoginService {
   
    public static String username , password , usertype;

    public static String checkUser(String username ,  String password){
        usertype = UserDAO.checkUser(username, password);
        return usertype;
    }
    
}
