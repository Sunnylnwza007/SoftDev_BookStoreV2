/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.SearchBook;

import bookstore.Book.Book;
import bookstore.Book.BookDAO;
import bookstore.Book.BookService;
import bookstore.Detail.detailBook;
import bookstore.Main;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
/**
 *
 * @author N A T M A N
 */
public class SearchBook extends javax.swing.JFrame {
    
    public static String txtSearch = "";
    public static int countBook = 0, numPage = 1, pageCount = 0;
    public static int book1 = 0 , book2 = 0, book3 = 0, book4 = 0, book5 = 0, book6 = 0, book7 = 0, book8 = 0;

    /**
     * Creates new form SearchBook
     */
    public SearchBook() {
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

        searchBack = new javax.swing.JButton();
        imgBook4 = new javax.swing.JLabel();
        imgBook3 = new javax.swing.JLabel();
        imgBook2 = new javax.swing.JLabel();
        imgBook1 = new javax.swing.JLabel();
        nameBook4 = new javax.swing.JLabel();
        priceBook4 = new javax.swing.JLabel();
        priceBook3 = new javax.swing.JLabel();
        nameBook3 = new javax.swing.JLabel();
        nameBook2 = new javax.swing.JLabel();
        priceBook2 = new javax.swing.JLabel();
        priceBook1 = new javax.swing.JLabel();
        nameBook1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        imgBook8 = new javax.swing.JLabel();
        imgBook7 = new javax.swing.JLabel();
        imgBook6 = new javax.swing.JLabel();
        imgBook5 = new javax.swing.JLabel();
        nameBook8 = new javax.swing.JLabel();
        priceBook8 = new javax.swing.JLabel();
        priceBook7 = new javax.swing.JLabel();
        nameBook7 = new javax.swing.JLabel();
        nameBook6 = new javax.swing.JLabel();
        priceBook6 = new javax.swing.JLabel();
        priceBook5 = new javax.swing.JLabel();
        nameBook5 = new javax.swing.JLabel();
        nextPage = new javax.swing.JLabel();
        backPage = new javax.swing.JLabel();
        pageNum = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        searchBack.setText("ย้อนกลับ");
        searchBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBackActionPerformed(evt);
            }
        });
        getContentPane().add(searchBack);
        searchBack.setBounds(1080, 640, 100, 40);

        imgBook4.setBackground(new java.awt.Color(0, 0, 0));
        imgBook4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/Book/5.jpg"))); // NOI18N
        imgBook4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgBook4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgBook4MouseClicked(evt);
            }
        });
        getContentPane().add(imgBook4);
        imgBook4.setBounds(960, 180, 120, 160);

        imgBook3.setBackground(new java.awt.Color(0, 0, 0));
        imgBook3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/Book/9.jpg"))); // NOI18N
        imgBook3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgBook3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgBook3MouseClicked(evt);
            }
        });
        getContentPane().add(imgBook3);
        imgBook3.setBounds(690, 180, 120, 160);

        imgBook2.setBackground(new java.awt.Color(0, 0, 0));
        imgBook2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/Book/3.jpg"))); // NOI18N
        imgBook2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgBook2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgBook2MouseClicked(evt);
            }
        });
        getContentPane().add(imgBook2);
        imgBook2.setBounds(400, 180, 120, 160);

        imgBook1.setBackground(new java.awt.Color(0, 0, 0));
        imgBook1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/Book/12.jpg"))); // NOI18N
        imgBook1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgBook1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgBook1MouseClicked(evt);
            }
        });
        getContentPane().add(imgBook1);
        imgBook1.setBounds(110, 180, 120, 160);

        nameBook4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nameBook4.setText("ไม่พบข้อมูล");
        getContentPane().add(nameBook4);
        nameBook4.setBounds(960, 350, 170, 19);

        priceBook4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        priceBook4.setText("ไม่พบข้อมูล");
        getContentPane().add(priceBook4);
        priceBook4.setBounds(960, 370, 120, 19);

        priceBook3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        priceBook3.setText("ไม่พบข้อมูล");
        getContentPane().add(priceBook3);
        priceBook3.setBounds(690, 370, 120, 19);

        nameBook3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nameBook3.setText("ไม่พบข้อมูล");
        getContentPane().add(nameBook3);
        nameBook3.setBounds(690, 350, 170, 19);

        nameBook2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nameBook2.setText("ไม่พบข้อมูล");
        getContentPane().add(nameBook2);
        nameBook2.setBounds(400, 350, 170, 19);

        priceBook2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        priceBook2.setText("ไม่พบข้อมูล");
        getContentPane().add(priceBook2);
        priceBook2.setBounds(400, 370, 120, 19);

        priceBook1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        priceBook1.setText("ไม่พบข้อมูล");
        getContentPane().add(priceBook1);
        priceBook1.setBounds(110, 370, 120, 19);

        nameBook1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nameBook1.setText("ไม่พบข้อมูล");
        getContentPane().add(nameBook1);
        nameBook1.setBounds(110, 350, 170, 19);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/ไฟล์_001.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 130);

        imgBook8.setBackground(new java.awt.Color(0, 0, 0));
        imgBook8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/Book/5.jpg"))); // NOI18N
        imgBook8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(imgBook8);
        imgBook8.setBounds(960, 410, 120, 160);

        imgBook7.setBackground(new java.awt.Color(0, 0, 0));
        imgBook7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/Book/9.jpg"))); // NOI18N
        imgBook7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(imgBook7);
        imgBook7.setBounds(690, 410, 120, 160);

        imgBook6.setBackground(new java.awt.Color(0, 0, 0));
        imgBook6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/Book/3.jpg"))); // NOI18N
        imgBook6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(imgBook6);
        imgBook6.setBounds(400, 410, 120, 160);

        imgBook5.setBackground(new java.awt.Color(0, 0, 0));
        imgBook5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/Book/12.jpg"))); // NOI18N
        imgBook5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(imgBook5);
        imgBook5.setBounds(110, 410, 120, 160);

        nameBook8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nameBook8.setText("ไม่พบข้อมูล");
        getContentPane().add(nameBook8);
        nameBook8.setBounds(960, 580, 170, 19);

        priceBook8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        priceBook8.setText("ไม่พบข้อมูล");
        getContentPane().add(priceBook8);
        priceBook8.setBounds(960, 600, 120, 19);

        priceBook7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        priceBook7.setText("ไม่พบข้อมูล");
        getContentPane().add(priceBook7);
        priceBook7.setBounds(690, 600, 120, 19);

        nameBook7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nameBook7.setText("ไม่พบข้อมูล");
        getContentPane().add(nameBook7);
        nameBook7.setBounds(690, 580, 170, 19);

        nameBook6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nameBook6.setText("ไม่พบข้อมูล");
        getContentPane().add(nameBook6);
        nameBook6.setBounds(400, 580, 170, 19);

        priceBook6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        priceBook6.setText("ไม่พบข้อมูล");
        getContentPane().add(priceBook6);
        priceBook6.setBounds(400, 600, 120, 19);

        priceBook5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        priceBook5.setText("ไม่พบข้อมูล");
        getContentPane().add(priceBook5);
        priceBook5.setBounds(110, 600, 120, 19);

        nameBook5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nameBook5.setText("ไม่พบข้อมูล");
        getContentPane().add(nameBook5);
        nameBook5.setBounds(110, 580, 170, 19);

        nextPage.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nextPage.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nextPage.setText("> > > >");
        nextPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextPageMouseClicked(evt);
            }
        });
        getContentPane().add(nextPage);
        nextPage.setBounds(610, 640, 50, 30);

        backPage.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        backPage.setText("< < < <");
        backPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backPageMouseClicked(evt);
            }
        });
        getContentPane().add(backPage);
        backPage.setBounds(510, 640, 50, 30);

        pageNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageNum.setText("1");
        getContentPane().add(pageNum);
        pageNum.setBounds(560, 650, 50, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBackActionPerformed
        Main main = new Main();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_searchBackActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        this.setSize(1200, 700);
        this.setLocationRelativeTo(null);
      
        
        
    }//GEN-LAST:event_formWindowOpened

    private void imgBook1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgBook1MouseClicked
        detailBook detailBook = new detailBook();
        detailBook.openProductDetailUI(Integer.toString(book1));
    }//GEN-LAST:event_imgBook1MouseClicked

    private void nextPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextPageMouseClicked
        pageNum.setText((Integer.parseInt(pageNum.getText())+1)+"");
        numPage++;
        showBook();
    }//GEN-LAST:event_nextPageMouseClicked

    private void backPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backPageMouseClicked
        pageNum.setText((Integer.parseInt(pageNum.getText())-1)+""); 
        numPage--;
        showBook();
    }//GEN-LAST:event_backPageMouseClicked

    private void imgBook2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgBook2MouseClicked
        detailBook detailBook = new detailBook();
        detailBook.openProductDetailUI(Integer.toString(book2));        // TODO add your handling code here:
    }//GEN-LAST:event_imgBook2MouseClicked

    private void imgBook3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgBook3MouseClicked
        detailBook detailBook = new detailBook();
        detailBook.openProductDetailUI(Integer.toString(book3));
    }//GEN-LAST:event_imgBook3MouseClicked

    private void imgBook4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgBook4MouseClicked
        detailBook detailBook = new detailBook();
        detailBook.openProductDetailUI(Integer.toString(book4));
    }//GEN-LAST:event_imgBook4MouseClicked

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
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backPage;
    private javax.swing.JLabel imgBook1;
    private javax.swing.JLabel imgBook2;
    private javax.swing.JLabel imgBook3;
    private javax.swing.JLabel imgBook4;
    private javax.swing.JLabel imgBook5;
    private javax.swing.JLabel imgBook6;
    private javax.swing.JLabel imgBook7;
    private javax.swing.JLabel imgBook8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nameBook1;
    private javax.swing.JLabel nameBook2;
    private javax.swing.JLabel nameBook3;
    private javax.swing.JLabel nameBook4;
    private javax.swing.JLabel nameBook5;
    private javax.swing.JLabel nameBook6;
    private javax.swing.JLabel nameBook7;
    private javax.swing.JLabel nameBook8;
    private javax.swing.JLabel nextPage;
    private javax.swing.JLabel pageNum;
    private javax.swing.JLabel priceBook1;
    private javax.swing.JLabel priceBook2;
    private javax.swing.JLabel priceBook3;
    private javax.swing.JLabel priceBook4;
    private javax.swing.JLabel priceBook5;
    private javax.swing.JLabel priceBook6;
    private javax.swing.JLabel priceBook7;
    private javax.swing.JLabel priceBook8;
    private javax.swing.JButton searchBack;
    // End of variables declaration//GEN-END:variables

    
   public void setTxtSearch(String type, String txt) {
       
       countBook = SearchBookService.getBookName(type, txt);
       
       if (countBook%2 == 0){
           pageCount = countBook/8;
       }else{
           pageCount = (countBook/8)+1;
       }
       
       showBook();
   }
   
   void showBook(){
       
       setBookImgToFalse();     
       
       for (int i = 1+((numPage-1)*8) ; i <= countBook ; i++){
       
       String bookDetail = SearchBookService.getListOfBook(i-1);
       String[] book = bookDetail.split("/");
       String id = book[0];
       String name = book[1];
       String price = book[2];
       
       System.out.println("bookDetail = " + bookDetail);
       
       ImageIcon icon = new ImageIcon(".\\src\\Pic\\Book\\" + id + ".jpg");
       Image scaleImage = icon.getImage().getScaledInstance(116, 171, Image.SCALE_DEFAULT);    
           
       if (i == 1+((numPage-1)*8)){    
       imgBook1.setVisible(true);
       nameBook1.setVisible(true);
       priceBook1.setVisible(true);    
           
       imgBook1.setIcon(new javax.swing.ImageIcon(scaleImage));
       nameBook1.setText(name);
       priceBook1.setText("ราคา : " + price);
       book1 = Integer.parseInt(id);
       }else if (i == 2+((numPage-1)*8)){
       imgBook2.setVisible(true);
       nameBook2.setVisible(true);
       priceBook2.setVisible(true);            
       
       imgBook2.setIcon(new javax.swing.ImageIcon(scaleImage));
       nameBook2.setText(name);
       priceBook2.setText("ราคา : " + price);
       book2 = Integer.parseInt(id);
       }else if (i == 3+((numPage-1)*8)){
       imgBook3.setVisible(true);
       nameBook3.setVisible(true);
       priceBook3.setVisible(true); 
       
       imgBook3.setIcon(new javax.swing.ImageIcon(scaleImage));
       nameBook3.setText(name);
       priceBook3.setText("ราคา : " + price);
       book3 = Integer.parseInt(id);
       }else if (i == 4+((numPage-1)*8)){
       imgBook4.setVisible(true);
       nameBook4.setVisible(true);
       priceBook4.setVisible(true); 
       
       imgBook4.setIcon(new javax.swing.ImageIcon(scaleImage));
       nameBook4.setText(name);
       priceBook4.setText("ราคา : " + price);
       book4 = Integer.parseInt(id);
       }else if (i == 5+((numPage-1)*8)){
       imgBook5.setVisible(true);
       nameBook5.setVisible(true);
       priceBook5.setVisible(true); 
       
       imgBook5.setIcon(new javax.swing.ImageIcon(scaleImage));
       nameBook5.setText(name);
       priceBook5.setText("ราคา : " + price);
       book5 = Integer.parseInt(id);
       }else if (i == 6+((numPage-1)*8)){
       imgBook6.setVisible(true);
       nameBook6.setVisible(true);
       priceBook6.setVisible(true); 
       
       imgBook6.setIcon(new javax.swing.ImageIcon(scaleImage));
       nameBook6.setText(name);
       priceBook6.setText("ราคา : " + price);
       book6 = Integer.parseInt(id);
       }else if (i == 7+((numPage-1)*8)){
       imgBook7.setVisible(true);
       nameBook7.setVisible(true);
       priceBook7.setVisible(true); 
       
       imgBook7.setIcon(new javax.swing.ImageIcon(scaleImage));
       nameBook7.setText(name);
       priceBook7.setText("ราคา : " + price);
       book7 = Integer.parseInt(id);
       }else if (i == 8+((numPage-1)*8)){
       imgBook8.setVisible(true);
       nameBook8.setVisible(true);
       priceBook8.setVisible(true); 
       
       imgBook8.setIcon(new javax.swing.ImageIcon(scaleImage));
       nameBook8.setText(name);
       priceBook8.setText("ราคา : " + price);
       book8 = Integer.parseInt(id);
       break;
       }
       }
   }
   
   void setBookImgToFalse(){
       imgBook1.setVisible(false);
       nameBook1.setVisible(false);
       priceBook1.setVisible(false);
       
       imgBook2.setVisible(false);
       nameBook2.setVisible(false);
       priceBook2.setVisible(false);
       
       imgBook3.setVisible(false);
       nameBook3.setVisible(false);
       priceBook3.setVisible(false);
       
       imgBook4.setVisible(false);
       nameBook4.setVisible(false);
       priceBook4.setVisible(false);
       
       imgBook5.setVisible(false);
       nameBook5.setVisible(false);
       priceBook5.setVisible(false);
       
       imgBook6.setVisible(false);
       nameBook6.setVisible(false);
       priceBook6.setVisible(false);
       
       imgBook7.setVisible(false);
       nameBook7.setVisible(false);
       priceBook7.setVisible(false);
       
       imgBook8.setVisible(false);
       nameBook8.setVisible(false);
       priceBook8.setVisible(false);
       
       if (numPage+1 <= pageCount){
           nextPage.setVisible(true);
       }else{
           nextPage.setVisible(false);
       }
       
       if (numPage-1 >= 1){
           backPage.setVisible(true);
       }else{
           backPage.setVisible(false);
       }
   }

}
