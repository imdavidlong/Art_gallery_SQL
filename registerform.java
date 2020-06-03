/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author yangxiaoan
 */
public class registerform extends javax.swing.JFrame {

    /**
     * Creates new form registerform
     */
    
    private connection c;
    
    public registerform() {
        initComponents();
        c = connection.getInstance();
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
        jTextField1_username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2_password = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3_firstName = new javax.swing.JTextField();
        jTextField4_phoneNumber = new javax.swing.JTextField();
        jTextField5_lastName = new javax.swing.JTextField();
        jButton1_signup = new javax.swing.JButton();
        jButton1_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Username");

        jTextField1_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_usernameActionPerformed(evt);
            }
        });

        jLabel2.setText("Password");

        jLabel3.setText("Please fill out the following information");

        jLabel4.setText("Last Name");

        jLabel5.setText("First Name");

        jLabel6.setText("Phone Numaber");

        jTextField3_firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3_firstNameActionPerformed(evt);
            }
        });

        jTextField4_phoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4_phoneNumberActionPerformed(evt);
            }
        });

        jTextField5_lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5_lastNameActionPerformed(evt);
            }
        });

        jButton1_signup.setText("Sign Up");
        jButton1_signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1_signupMouseClicked(evt);
            }
        });
        jButton1_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_signupActionPerformed(evt);
            }
        });

        jButton1_back.setText("Back");
        jButton1_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1_backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1_username)
                            .addComponent(jTextField2_password, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(jTextField3_firstName, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(jTextField4_phoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(jTextField5_lastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton1_back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1_signup)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField5_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField3_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addComponent(jTextField4_phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_signup)
                    .addComponent(jButton1_back))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_usernameActionPerformed

    private void jButton1_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_signupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_signupActionPerformed

    private void jTextField5_lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5_lastNameActionPerformed

    private void jTextField4_phoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4_phoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4_phoneNumberActionPerformed

    private void jTextField3_firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3_firstNameActionPerformed

    private void jButton1_signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_signupMouseClicked
        // TODO add your handling code here:
        
        try {
            Statement stmt = connection.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT cid FROM customer"); 
            System.out.println("line:195: " + jTextField1_username.getText());//testing       
            while(rs.next()) {
                System.out.println("line:196: " + rs.getString("cid"));//testing
                System.out.println(jTextField1_username.getText().equals(rs.getString("cid")));//testing 
                if(jTextField1_username.getText().equals(rs.getString("cid"))){
                    JOptionPane.showMessageDialog(this, "Sorry,customer already exist.\nPlease Log in.");//wrong clause
                    return;
                }
            }
            
            String username = jTextField1_username.getText();
            String password = jTextField2_password.getText();
            String lastName = jTextField5_lastName.getText();
            String firstName= jTextField3_firstName.getText();
            String phoneNumber = jTextField4_phoneNumber.getText();
            
            stmt.executeUpdate("INSERT INTO customer VALUES ('"+username+"', '"+password+"', '"+lastName+"', '"+firstName+"', '"+phoneNumber+"')");
            JOptionPane.showMessageDialog(this, "Account create success.");
            this.dispose();
            
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1_signupMouseClicked

    private void jButton1_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_backMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1_backMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_back;
    private javax.swing.JButton jButton1_signup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1_username;
    private javax.swing.JTextField jTextField2_password;
    private javax.swing.JTextField jTextField3_firstName;
    private javax.swing.JTextField jTextField4_phoneNumber;
    private javax.swing.JTextField jTextField5_lastName;
    // End of variables declaration//GEN-END:variables
}
