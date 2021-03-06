/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.Detail;

import bookstore.Book.Book;
import bookstore.Database.User;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author N A T M A N
 */
public class detailBook extends javax.swing.JFrame {

    /**
     * Creates new form detailBook
     */
    public detailBook() {
        initComponents();
        this.setSize(1000, 540);
    }
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) 
{
          this.setLocationRelativeTo(null);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addToCart = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        numOrderSpinner = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        imagelb = new javax.swing.JLabel();
        bookNamelb = new javax.swing.JLabel();
        publishYearlb = new javax.swing.JLabel();
        publisherlb = new javax.swing.JLabel();
        authorlb = new javax.swing.JLabel();
        typeBooklb = new javax.swing.JLabel();
        pricelb = new javax.swing.JLabel();
        amountlb = new javax.swing.JLabel();
        ISBNlb = new javax.swing.JLabel();
        numPagelb = new javax.swing.JLabel();
        writeNumlb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        setResizable(false);
        getContentPane().setLayout(null);

        addToCart.setText("add to cart");
        addToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartActionPerformed(evt);
            }
        });
        getContentPane().add(addToCart);
        addToCart.setBounds(720, 450, 110, 40);

        jButton2.setText("close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(860, 450, 100, 40);

        numOrderSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        getContentPane().add(numOrderSpinner);
        numOrderSpinner.setBounds(600, 450, 60, 30);

        jLabel1.setText("Publisher");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(390, 130, 90, 30);

        jLabel2.setText("Author");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(390, 180, 90, 30);

        jLabel3.setText("Type");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(390, 230, 90, 30);

        jLabel4.setText("Price");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(390, 280, 90, 30);

        jLabel5.setText("Status");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(390, 330, 90, 30);

        jLabel6.setText("Order number");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(480, 460, 100, 20);

        jLabel7.setText("ISBN");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(640, 130, 120, 30);

        jLabel8.setText("Number of pages");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(640, 180, 120, 30);

        jLabel9.setText("Print");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(640, 230, 120, 30);

        jLabel10.setText("Published year");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(640, 280, 120, 30);
        getContentPane().add(imagelb);
        imagelb.setBounds(70, 70, 270, 350);

        bookNamelb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bookNamelb.setForeground(new java.awt.Color(51, 51, 51));
        bookNamelb.setText("bookName");
        bookNamelb.setEnabled(false);
        getContentPane().add(bookNamelb);
        bookNamelb.setBounds(500, 40, 240, 50);

        publishYearlb.setText("1");
        getContentPane().add(publishYearlb);
        publishYearlb.setBounds(790, 290, 110, 20);

        publisherlb.setText("1");
        getContentPane().add(publisherlb);
        publisherlb.setBounds(500, 140, 100, 20);

        authorlb.setText("1");
        getContentPane().add(authorlb);
        authorlb.setBounds(500, 190, 100, 20);

        typeBooklb.setText("1");
        getContentPane().add(typeBooklb);
        typeBooklb.setBounds(500, 240, 100, 20);

        pricelb.setText("1");
        getContentPane().add(pricelb);
        pricelb.setBounds(500, 290, 100, 20);

        amountlb.setText("1");
        getContentPane().add(amountlb);
        amountlb.setBounds(500, 340, 100, 20);

        ISBNlb.setText("1");
        getContentPane().add(ISBNlb);
        ISBNlb.setBounds(790, 140, 110, 20);

        numPagelb.setText("1");
        getContentPane().add(numPagelb);
        numPagelb.setBounds(790, 190, 110, 20);

        writeNumlb.setText("1");
        getContentPane().add(writeNumlb);
        writeNumlb.setBounds(790, 240, 110, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartActionPerformed
        detailBookService detail = new detailBookService();
        
        String numOrder = numOrderSpinner.getValue().toString();
        detail.addToCart(User.getName() ,Book.getName(), numOrder, Book.getPrice());
                
    }//GEN-LAST:event_addToCartActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
     
    
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
            java.util.logging.Logger.getLogger(detailBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(detailBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(detailBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(detailBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new detailBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ISBNlb;
    private javax.swing.JButton addToCart;
    private javax.swing.JLabel amountlb;
    private javax.swing.JLabel authorlb;
    private javax.swing.JLabel bookNamelb;
    private javax.swing.JLabel imagelb;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner numOrderSpinner;
    private javax.swing.JLabel numPagelb;
    private javax.swing.JLabel pricelb;
    private javax.swing.JLabel publishYearlb;
    private javax.swing.JLabel publisherlb;
    private javax.swing.JLabel typeBooklb;
    private javax.swing.JLabel writeNumlb;
    // End of variables declaration//GEN-END:variables

    
    public void openProductDetailUI (String idBook) {
    
        detailBookService ds = new detailBookService();
        ds.setProductDetail(idBook);
        
        ImageIcon icon = new ImageIcon(".\\src\\Pic\\Book\\" + Book.getId() + ".jpg");
        Image scaleImage = icon.getImage().getScaledInstance(200, 250, Image.SCALE_DEFAULT);
        imagelb.setIcon(new javax.swing.ImageIcon(scaleImage));
        
        bookNamelb.setText(Book.getName());
        publisherlb.setText(Book.getPublisher());
        authorlb.setText(Book.getWriter());
        pricelb.setText(Book.getPrice());
        typeBooklb.setText(Book.getType());
        publishYearlb.setText(Book.getWriteyear());
        ISBNlb.setText(Book.getISBN());
        writeNumlb.setText(Book.getWritenum());
        numPagelb.setText(Book.getPage());
         
        if( Integer.parseInt(Book.getAmount()) > 0 ) {
             amountlb.setText("In stock");
        }
        else {
             amountlb.setText("Out of stock");
        }
         
         
         
        this.setVisible(true);
    }
}
