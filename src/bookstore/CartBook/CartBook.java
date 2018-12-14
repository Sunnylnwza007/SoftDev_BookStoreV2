/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.CartBook;
import bookstore.Database.User;
import bookstore.Database.User;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author N A T M A N
 */
public class CartBook extends javax.swing.JFrame {

    Cart c;
    DefaultTableModel dtm;
    Address ad = new Address();

    /**
     * Creates new form CartBook
     */
    public CartBook() {
        initComponents();
        this.setSize(1000, 540);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        sum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mo = new javax.swing.JTextField();
        houseNum = new javax.swing.JTextField();
        tumbon = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        aumper = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        provide = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        postcode = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tel = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setText("ราคาทั้งหมด");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(710, 400, 80, 20);

        sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumActionPerformed(evt);
            }
        });
        getContentPane().add(sum);
        sum.setBounds(790, 390, 100, 30);

        jLabel2.setText("บาท");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(910, 400, 41, 16);

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(890, 450, 80, 40);

        jButton3.setText("Save Address");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(460, 450, 160, 40);

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(800, 450, 80, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/ตะกร้า.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1000, 110);

        table.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ชื่อหนังสือ", "จำนวน", "ราคา"
            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 130, 940, 240);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setText("ที่อยู่จัดส่ง");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 380, 80, 21);

        jLabel5.setText("หมู่");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 470, 20, 16);

        jLabel6.setText("บ้านเลขที่");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 410, 60, 16);

        jLabel7.setText("ตำบล");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 440, 40, 16);

        mo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moActionPerformed(evt);
            }
        });
        getContentPane().add(mo);
        mo.setBounds(110, 470, 120, 24);
        getContentPane().add(houseNum);
        houseNum.setBounds(110, 410, 120, 24);
        getContentPane().add(tumbon);
        tumbon.setBounds(110, 440, 120, 24);

        jLabel8.setText("อำเภอ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(260, 410, 40, 16);
        getContentPane().add(aumper);
        aumper.setBounds(310, 410, 120, 24);

        jLabel9.setText("จังหวัด");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(260, 440, 40, 16);
        getContentPane().add(provide);
        provide.setBounds(310, 440, 120, 24);

        jLabel10.setText("ไปรษณีย์");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(250, 470, 60, 16);
        getContentPane().add(postcode);
        postcode.setBounds(310, 470, 120, 24);

        jLabel11.setText("เบอร์");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(450, 410, 40, 16);
        getContentPane().add(tel);
        tel.setBounds(490, 410, 120, 24);

        jButton5.setText("Buy");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(710, 450, 80, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sumActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void moActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        CartService cs = new CartService();
        c = cs.searchCart(User.getName());
        setTable();
        setSum();
        setAddress();

    }//GEN-LAST:event_formWindowOpened

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String bookName = table.getValueAt(table.getSelectedRow(), 0).toString();
        String num = table.getValueAt(table.getSelectedRow(), 1).toString();
        String price = table.getValueAt(table.getSelectedRow(), 2).toString();
        CartService cs = new CartService();
        cs.deleteBook(bookName, num, price);
        c.delList(table.getSelectedRow());
        setTable();
        setSum();
        JOptionPane.showMessageDialog(null, "ลบข้อมูลเรียบร้อย");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        ad.setHouseNum(houseNum.getText());
        ad.setMo(mo.getText());
        ad.setTumbon(tumbon.getText());
        ad.setAumper(aumper.getText());
        ad.setProvide(provide.getText());
        ad.setPostcode(postcode.getText());
        ad.setTel(tel.getText());
        CartService cs = new CartService();
        cs.addAddress(ad, User.getName());
        JOptionPane.showMessageDialog(null, "บันทึกข้อมูลเรียบร้อย");

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(CartBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CartBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CartBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CartBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CartBook().setVisible(true);
            }
        });
    }

    public void setTable() {
        System.out.println(c.getBookName(0));
        System.out.println(c.getNum(0));
        System.out.println(c.getPrice(0));
        String[] tblHead = {"Book Name", "Qty", "Peice"};
        dtm = new DefaultTableModel(tblHead, 0);
        for (int i = 0; i < c.count(); i++) {
            String[] item = {c.getBookName(i), c.getNum(i), c.getPrice(i)};
            dtm.addRow(item);
        }
        table.setModel(dtm);

    }

    public void setSum() {
        int sumPrice = 0;
        for (int count = 0; count < dtm.getRowCount(); count++) {
            int num = Integer.parseInt(dtm.getValueAt(count, 1).toString());
            int price = Integer.parseInt(dtm.getValueAt(count, 2).toString());
            sumPrice += num * price;
        }
        sum.setText(String.valueOf(sumPrice));

    }

    public void setAddress() {
        CartService cs = new CartService();
        ad = cs.setAddress(User.getName());
        houseNum.setText(ad.getHouseNum());
        mo.setText(ad.getMo());
        tumbon.setText(ad.getTumbon());
        aumper.setText(ad.getAumper());
        provide.setText(ad.getProvide());
        postcode.setText(ad.getPostcode());
        tel.setText(ad.getTel());

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aumper;
    private javax.swing.JTextField houseNum;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mo;
    private javax.swing.JTextField postcode;
    private javax.swing.JTextField provide;
    private javax.swing.JTextField sum;
    private javax.swing.JTable table;
    private javax.swing.JTextField tel;
    private javax.swing.JTextField tumbon;
    // End of variables declaration//GEN-END:variables
}
