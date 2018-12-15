/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import bookstore.Book.Book;
import bookstore.Book.BookDAO;
import bookstore.Detail.detailBook;
import bookstore.Book.BookService;
import bookstore.CartBook.CartBook;
import bookstore.Database.User;
import bookstore.Register.Register;
import bookstore.Login.LoginService;
import bookstore.SearchBook.SearchBook;
import bookstore.SearchBook.SearchBookService;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import java.awt.Image;
import javax.swing.ImageIcon;
import org.bson.Document;

/**
 *
 * @author dell
 */
public class Main extends javax.swing.JFrame {

    static int timesec = 0;
    public static MongoClientURI uri  = new MongoClientURI("mongodb://user01:user01@ds145563.mlab.com:45563/book_shop"); 
    public static MongoClient client = new MongoClient(uri);
    public static MongoDatabase db = client.getDatabase(uri.getDatabase());

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SearchBox = new javax.swing.JComboBox<>();
        SearchField = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        SearchBut = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        P8 = new javax.swing.JLabel();
        P7 = new javax.swing.JLabel();
        P6 = new javax.swing.JLabel();
        P5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Banner = new javax.swing.JLabel();
        ABook = new javax.swing.JLabel();
        N8 = new javax.swing.JLabel();
        M8 = new javax.swing.JLabel();
        M7 = new javax.swing.JLabel();
        N7 = new javax.swing.JLabel();
        N6 = new javax.swing.JLabel();
        M6 = new javax.swing.JLabel();
        M5 = new javax.swing.JLabel();
        N5 = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        register = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        passText = new javax.swing.JLabel();
        userText = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        passField = new javax.swing.JTextField();
        statusText = new javax.swing.JLabel();
        Banner1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Cloud", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ค้นหา");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 0, 40, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(210, 0, 80, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/cartW.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(1070, 0, 50, 30);

        SearchBox.setBackground(new java.awt.Color(153, 153, 153));
        SearchBox.setFont(new java.awt.Font("Cloud", 1, 14)); // NOI18N
        SearchBox.setForeground(new java.awt.Color(255, 255, 255));
        SearchBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Writer" }));
        SearchBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SearchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBoxActionPerformed(evt);
            }
        });
        jPanel1.add(SearchBox);
        SearchBox.setBounds(90, 0, 120, 30);

        SearchField.setFont(new java.awt.Font("Cloud", 1, 14)); // NOI18N
        SearchField.setForeground(new java.awt.Color(153, 153, 153));
        SearchField.setText("-พิมพ์เพื่อค้นหา-");
        SearchField.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        SearchField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchFieldMouseClicked(evt);
            }
        });
        jPanel1.add(SearchField);
        SearchField.setBounds(310, 0, 560, 30);

        jTextField3.setFont(new java.awt.Font("Cloud", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(153, 153, 153));
        jTextField3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jTextField3.setEnabled(false);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(290, 0, 30, 30);

        SearchBut.setBackground(new java.awt.Color(255, 0, 0));
        SearchBut.setFont(new java.awt.Font("Cloud", 1, 14)); // NOI18N
        SearchBut.setText("ค้นหา");
        SearchBut.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        SearchBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButActionPerformed(evt);
            }
        });
        jPanel1.add(SearchBut);
        SearchBut.setBounds(910, 0, 110, 30);

        jTextField5.setFont(new java.awt.Font("Cloud", 0, 14)); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jTextField5.setEnabled(false);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(860, 0, 30, 30);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1050, 0, 50, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 110, 1220, 30);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/Pro1.PNG"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(970, 350, 210, 220);

        P8.setBackground(new java.awt.Color(0, 0, 0));
        P8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/Book/5.jpg"))); // NOI18N
        P8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showProductDetail4(evt);
            }
        });
        getContentPane().add(P8);
        P8.setBounds(690, 460, 120, 160);

        P7.setBackground(new java.awt.Color(0, 0, 0));
        P7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/Book/9.jpg"))); // NOI18N
        P7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showProductDetail3(evt);
            }
        });
        getContentPane().add(P7);
        P7.setBounds(480, 460, 120, 160);

        P6.setBackground(new java.awt.Color(0, 0, 0));
        P6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/Book/3.jpg"))); // NOI18N
        P6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showProductDetail2(evt);
            }
        });
        getContentPane().add(P6);
        P6.setBounds(270, 460, 120, 160);

        P5.setBackground(new java.awt.Color(0, 0, 0));
        P5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/Book/12.jpg"))); // NOI18N
        P5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showProductDetail1(evt);
            }
        });
        getContentPane().add(P5);
        P5.setBounds(60, 460, 120, 160);

        jLabel7.setFont(new java.awt.Font("Cloud Light", 1, 18)); // NOI18N
        jLabel7.setText("หนังสือแนะนำ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 420, 230, 30);

        Banner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/NewBook.jpg"))); // NOI18N
        getContentPane().add(Banner);
        Banner.setBounds(60, 150, 790, 270);

        ABook.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ABook.setForeground(new java.awt.Color(255, 0, 0));
        ABook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ABook.setText("ดูรายการสินค้าเพิ่มเติม >>");
        ABook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ABookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ABookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ABookMouseExited(evt);
            }
        });
        getContentPane().add(ABook);
        ABook.setBounds(720, 430, 200, 20);

        N8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        N8.setText("ไม่พบข้อมูล");
        getContentPane().add(N8);
        N8.setBounds(690, 640, 170, 19);

        M8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        M8.setText("ไม่พบข้อมูล");
        getContentPane().add(M8);
        M8.setBounds(690, 670, 120, 19);

        M7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        M7.setText("ไม่พบข้อมูล");
        getContentPane().add(M7);
        M7.setBounds(480, 670, 120, 19);

        N7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        N7.setText("ไม่พบข้อมูล");
        getContentPane().add(N7);
        N7.setBounds(480, 640, 170, 19);

        N6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        N6.setText("ไม่พบข้อมูล");
        getContentPane().add(N6);
        N6.setBounds(270, 640, 170, 19);

        M6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        M6.setText("ไม่พบข้อมูล");
        getContentPane().add(M6);
        M6.setBounds(270, 670, 120, 19);

        M5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        M5.setText("ไม่พบข้อมูล");
        getContentPane().add(M5);
        M5.setBounds(60, 670, 120, 19);

        N5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        N5.setText("ไม่พบข้อมูล");
        getContentPane().add(N5);
        N5.setBounds(60, 640, 170, 19);

        login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login.setText("Login");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(1130, 16, 70, 20);

        register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        register.setText("Register");
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
        });
        getContentPane().add(register);
        register.setBounds(1130, 46, 70, 20);

        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(1130, 76, 70, 20);

        passText.setText("Password");
        getContentPane().add(passText);
        passText.setBounds(920, 50, 58, 44);

        userText.setText("Username");
        getContentPane().add(userText);
        userText.setBounds(920, 20, 59, 44);

        userField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFieldActionPerformed(evt);
            }
        });
        getContentPane().add(userField);
        userField.setBounds(990, 30, 126, 24);
        getContentPane().add(passField);
        passField.setBounds(990, 60, 126, 24);

        statusText.setBackground(new java.awt.Color(255, 255, 255));
        statusText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(statusText);
        statusText.setBounds(900, 10, 240, 90);
        getContentPane().add(Banner1);
        Banner1.setBounds(70, 110, 790, 290);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/Deal 20-80.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(990, 190, 170, 170);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/Freetran.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(960, 570, 220, 70);

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("ติดต่อสอบถาม 0 2826 8753 4");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(1010, 640, 160, 16);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/Document 9.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 110, 90);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchBoxActionPerformed

    private void SearchFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchFieldMouseClicked
        SearchField.setText("");
    }//GEN-LAST:event_SearchFieldMouseClicked

    private void SearchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButActionPerformed
        int countBook = SearchBookService.getBookName(SearchBox.getSelectedItem().toString().toLowerCase(), SearchField.getText());
        
        if (countBook != 0){
        SearchBookService.resetInformation();
        SearchBook searchBook = new SearchBook();
        System.out.println(SearchBox.getSelectedItem().toString());
        searchBook.setTxtSearch(SearchBox.getSelectedItem().toString().toLowerCase(), SearchField.getText());
        
        searchBook.setVisible(true);
        this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Mai Jer Book Na Ja");
        }
    }//GEN-LAST:event_SearchButActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void ABookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ABookMouseClicked

    }//GEN-LAST:event_ABookMouseClicked

    private void ABookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ABookMouseEntered
        ABook.setText("<HTML><U>ดูรายการสินค้าเพิ่มเติม >></U></HTML>");
    }//GEN-LAST:event_ABookMouseEntered

    private void ABookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ABookMouseExited
        ABook.setText("ดูรายการสินค้าเพิ่มเติม >>");
    }//GEN-LAST:event_ABookMouseExited

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        String check = " ";
        check = LoginService.checkUser(userField.getText(), passField.getText());
        if (check.equals("admin") || check.equals("user")) {
            System.out.println(check);
            setUser(check);
            User.setStatus();
        } else {
            System.out.println("none");
        }
        JOptionPane.showMessageDialog(null, check);

    }//GEN-LAST:event_loginMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setSize(1200, 700);
        this.setLocationRelativeTo(null);
        time();
        showBook();
    }//GEN-LAST:event_formWindowOpened

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        System.exit(0);
    }//GEN-LAST:event_logoutMouseClicked

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
        Register register = new Register();
        register.setVisible(true);
        
    }//GEN-LAST:event_registerMouseClicked

    private void userFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showProductDetail1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showProductDetail1
        detailBook detailBook = new detailBook();
        detailBook.openProductDetailUI(P5.getText());
    }//GEN-LAST:event_showProductDetail1

    private void showProductDetail2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showProductDetail2
        detailBook detailBook = new detailBook();
        detailBook.openProductDetailUI(P6.getText());
    }//GEN-LAST:event_showProductDetail2

    private void showProductDetail3(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showProductDetail3
        detailBook detailBook = new detailBook();
        detailBook.openProductDetailUI(P7.getText());
    }//GEN-LAST:event_showProductDetail3

    private void showProductDetail4(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showProductDetail4
       detailBook detailBook = new detailBook();
        detailBook.openProductDetailUI(P8.getText());
    }//GEN-LAST:event_showProductDetail4

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        CartBook cart = new CartBook();
        if (User.getStatus()){
            cart.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Please Login");
        }
        
    }//GEN-LAST:event_jLabel4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ABook;
    private static javax.swing.JLabel Banner;
    private static javax.swing.JLabel Banner1;
    private javax.swing.JLabel M5;
    private javax.swing.JLabel M6;
    private javax.swing.JLabel M7;
    private javax.swing.JLabel M8;
    private javax.swing.JLabel N5;
    private javax.swing.JLabel N6;
    private javax.swing.JLabel N7;
    private javax.swing.JLabel N8;
    private javax.swing.JLabel P5;
    private javax.swing.JLabel P6;
    private javax.swing.JLabel P7;
    private javax.swing.JLabel P8;
    private javax.swing.JComboBox<String> SearchBox;
    private javax.swing.JButton SearchBut;
    private javax.swing.JTextField SearchField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel login;
    private javax.swing.JLabel logout;
    private javax.swing.JTextField passField;
    private javax.swing.JLabel passText;
    private javax.swing.JLabel register;
    private javax.swing.JLabel statusText;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel userText;
    // End of variables declaration//GEN-END:variables
    
    private void showProductDetail(String bookId){
    }
    
    void setUser(String check) {
        User.setUser(userField.getText(), passField.getText(), check);
        statusText.setText(check);
        statusText.setVisible(true);
        userText.setVisible(false);
        userField.setVisible(false);
        passText.setVisible(false);
        passField.setVisible(false);

    }

    void time() {
        java.util.Timer myTimer;
        myTimer = new java.util.Timer();

        myTimer.schedule(new TimerTask() {
            public void run() {
                showBanner();
            }
        }, 0, 6000);

    }

    void showBanner() {
        timesec++;
        if (timesec == 3) {
            Banner.setIcon(new javax.swing.ImageIcon(".\\src\\Pic\\Ban1.jpg"));
        } else if (timesec == 2) {
            Banner.setIcon(new javax.swing.ImageIcon(".\\src\\Pic\\Ban2.jpg"));
        } else {
            Banner.setIcon(new javax.swing.ImageIcon(".\\src\\Pic\\NewBook.jpg"));
        }

        if (timesec == 3) {
            timesec = 0;
        }
        System.out.println(timesec);
    }

    void showBook() {
        
        for (int i = 1 ; i < 5 ; i++){
            
        SearchBookService.getBook(i);
            
        if (i == 1){
           
        ImageIcon icon = new ImageIcon(".\\src\\Pic\\Book\\" + Book.getId() + ".jpg");
        Image scaleImage = icon.getImage().getScaledInstance(116, 171, Image.SCALE_DEFAULT);
        P5.setIcon(new javax.swing.ImageIcon(scaleImage));
        N5.setText(Book.getName());
        M5.setText("ราคา : " + Book.getPrice());
        }else if (i == 2){
        ImageIcon icon = new ImageIcon(".\\src\\Pic\\Book\\" + Book.getId() + ".jpg");
        Image scaleImage = icon.getImage().getScaledInstance(116, 171, Image.SCALE_DEFAULT);
        P6.setIcon(new javax.swing.ImageIcon(scaleImage));
        N6.setText(Book.getName());
        M6.setText("ราคา : " + Book.getPrice());
        }else if (i == 3){
        ImageIcon icon = new ImageIcon(".\\src\\Pic\\Book\\" + Book.getId() + ".jpg");
        Image scaleImage = icon.getImage().getScaledInstance(116, 171, Image.SCALE_DEFAULT);
        P7.setIcon(new javax.swing.ImageIcon(scaleImage)); 
        N7.setText(Book.getName());
        M7.setText("ราคา : " + Book.getPrice());
        }else if (i == 4){
        ImageIcon icon = new ImageIcon(".\\src\\Pic\\Book\\" + Book.getId() + ".jpg");
        Image scaleImage = icon.getImage().getScaledInstance(116, 171, Image.SCALE_DEFAULT);
        P8.setIcon(new javax.swing.ImageIcon(scaleImage));  
        N8.setText(Book.getName());
        M8.setText("ราคา : " + Book.getPrice());
        }

        }
    }

}
