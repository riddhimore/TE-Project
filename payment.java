/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sairam
 */
public class payment extends javax.swing.JFrame {
     int n1,n2,n3,n4,n6,n7,n8,n5;
    /**
     * Creates new form payment
     */
    public payment() {
        initComponents();
        
        jLabel4.setVisible(false);
        
        
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        //jTextField5.setVisible(false);
       // jTextField7.setVisible(false);
        //jTextField8.setVisible(false);
        
        jCheckBox1.setVisible(false);
        jCheckBox4.setVisible(false);
        //jCheckBox5.setVisible(false);
        //jCheckBox6.setVisible(false);
        //jCheckBox7.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jTextField6 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Enter your payment details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Select fees type:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 56, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 130, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Payment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 136, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 114, 40));

        jCheckBox2.setText("BackLog fees");
        jCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox2MouseClicked(evt);
            }
        });
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jCheckBox3.setText("Regular fees");
        jCheckBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox3MouseClicked(evt);
            }
        });
        getContentPane().add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 130, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Total amount");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Select your subjects:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jCheckBox1.setText("Semester 1");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        jCheckBox4.setText("Semester 2");
        jCheckBox4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox4MouseClicked(evt);
            }
        });
        getContentPane().add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 60, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 60, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            account t3=new account(n5);
            
             // TODO add your handling code here:
            
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","riddhi","password");
                
                PreparedStatement ps=con.prepareStatement("insert into payment values(?,?);");
                
                int c1 = Integer.parseInt(jTextField1.getText());
               // int c2 = Integer.parseInt(jTextField2.getText());
                //int c3 = Integer.parseInt(jTextField3.getText());
                //int c4 = Integer.parseInt(jTextField4.getText());
                int c5 = Integer.parseInt(jTextField6.getText());
                
                
                ps.setInt(1,c1);
                //ps.setInt(2,c2);
                //ps.setInt(3,c3);
                //ps.setInt(4,c4);
                ps.setInt(2,c5);
                                
                
                ps.executeUpdate();
                
                jTextField1.setText("");
                //jTextField2.setText("");
                //jTextField3.setText("");
                //jTextField4.setText("");
                jTextField6.setText("");
                
                JOptionPane.showMessageDialog(null, "Submit");
                payment.this.setVisible(false);
                t3.setVisible(true);       
            
            }
            catch(ClassNotFoundException | SQLException | NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Field is Empty");
                payment.this.setVisible(true);
            }
            //System.out.println("Submit");
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox3MouseClicked
        // TODO add your handling code here:
        if(jCheckBox3.isSelected())
        {
            jTextField1.setText("1105");
            n1=1105;
            n5=n1+n2;
            jTextField6.setText(String.valueOf(n5));     
        }
        if(jCheckBox3.isSelected()==false)
        {
            jTextField1.setText("");
            n1=0;
            n5=n1+n2;
            jTextField6.setText(String.valueOf(n5)); 
        }
    }//GEN-LAST:event_jCheckBox3MouseClicked

    private void jCheckBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox2MouseClicked
        // TODO add your handling code here:
        if(jCheckBox2.isSelected())
        {
            jLabel4.setVisible(true);
        
        
            jTextField3.setVisible(true);
            jTextField4.setVisible(true);
          //  jTextField5.setVisible(true);
            //jTextField7.setVisible(true);
            //jTextField8.setVisible(true);
            
            jCheckBox1.setVisible(true);
            jCheckBox4.setVisible(true);
            //jCheckBox5.setVisible(true);
            //jCheckBox6.setVisible(true);
            //jCheckBox7.setVisible(true);
            //jTextField2.setText("625");
            //n2=625;
            //n5=n1+n2;
            //jTextField6.setText(String.valueOf(n5));
            //System.out.println(n2);
        }
        if(jCheckBox2.isSelected()==false)
        {
        jLabel4.setVisible(false);
        
        
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        //jTextField5.setVisible(false);
        //jTextField7.setVisible(false);
        //jTextField8.setVisible(false);
        
        jCheckBox1.setVisible(false);
        jCheckBox4.setVisible(false);
        //jCheckBox5.setVisible(false);
        //jCheckBox6.setVisible(false);
        //jCheckBox7.setVisible(false);
    
        }
        if(jCheckBox3.isSelected())
        {
            jTextField1.setText("1105");
            n1=1105;
            n5=n1+n2;
            jTextField6.setText(String.valueOf(n5));     
        }
        if(jCheckBox3.isSelected()==false)
        {
            jTextField1.setText("");
            n1=0;
            n5=n1+n2;
            jTextField6.setText(String.valueOf(n5)); 
        }
        /*if(jCheckBox2.isSelected()==false)
        {
             jTextField2.setText("");
            n2=0;
            n5=n1+n2;
            jTextField6.setText(String.valueOf(n5)); 
        }*/
    }//GEN-LAST:event_jCheckBox2MouseClicked

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        // TODO add your handling code here:
        if(jCheckBox1.isSelected())
        {
            jTextField3.setText("200");
            n3=200;
            n5=n1+n3;
            jTextField6.setText(String.valueOf(n5));     
        }
        if(jCheckBox1.isSelected()==false)
        {
            jTextField3.setText("");
            int n1=0;
            n5=n1+n3;
            jTextField6.setText(String.valueOf(n5)); 
        }
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void jCheckBox4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox4MouseClicked
        // TODO add your handling code here:
        if(jCheckBox4.isSelected())
        {
            jTextField4.setText("200");
            n4=200;
            n5=n1+n3+n4;
            jTextField6.setText(String.valueOf(n5));     
        }
        if(jCheckBox4.isSelected()==false)
        {
            jTextField4.setText("");
            int n4 = 0,n3=0;
            n5=n1+n3+n4;
            jTextField6.setText(String.valueOf(n5)); 
        }
    }//GEN-LAST:event_jCheckBox4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws Exception {
        /*
         * Set the Nimbus lo=ok and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new payment().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
