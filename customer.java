/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author yangxiaoan
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame; 
import javax.swing.JScrollPane; 
import javax.swing.JTable; 
import javax.swing.table.DefaultTableModel;
public class customer extends javax.swing.JFrame {

    /**
     * Creates new form customer
     */
    private static connection c = connection.getInstance();
    private String cid;
    public customer(String cid) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.cid = cid;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jTextField1.setBackground(new java.awt.Color(204, 204, 255));
        jTextField1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 153, 255));
        jTextField1.setText("Welcome!");
        jTextField1.setActionCommand("<未设置>");
        jTextField1.setBorder(null);

        jButton1.setText("MyOrder");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton7.setText("My Information");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton7))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTextField2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 153, 255));
        jTextField2.setText("Let's check what's new today:");
        jTextField2.setBorder(null);

        jButton2.setText("Artist");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Artwork");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Upcoming events");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("Art Gallery");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 153, 255));
        jTextField3.setText("No idea yet? Check out our :");
        jTextField3.setBorder(null);

        jButton6.setText("Most Popular Event");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jTextField4.setText("—");
        jTextField4.setBorder(null);
        jTextField4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jTextField5.setText("X");
        jTextField5.setBorder(null);
        jTextField5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/image folder/Webp.net-resizeimage (1).jpg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/image folder/Webp.net-resizeimage.jpg"))); // NOI18N

        jTextField6.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 153, 255));
        jTextField6.setText("Price Range For Each Type of Artworks");
        jTextField6.setBorder(null);

        jButton8.setText("On-Sale ArtWork");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(99, 99, 99)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(464, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        try {
            // TODO add your handling code here:
            Statement stmt = c.conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT distinct b.Event_name, count(*)\n" +
"from customer c, buy_ticket_name b\n" +
"where c.cid=b.cid\n" +
"group by b.Event_name\n" +
"having count(*)>= ALL(select Count(*)\n" +
"                      from customer c, buy_ticket_name b\n" +
"                      where c.cid=b.cid\n" +
"                      group by b.Event_name);");
//            int count=0;
//            while(rs.next()){
//                count++;
//            }   
            String[] columnNames = {"Event Name", "#Visitor"}; 
            rs.last();
            int count = rs.getRow();
            String[][] a = new String[count][2]; 
            rs.beforeFirst();
            int i =0; 
        while(rs.next()){
              a[i][0] =rs.getString("Event_name");
              a[i][1] =rs.getString("count(*)");
              i++;
            }
        // Initializing the JTable 
          JTable j; 
          JFrame f; 
          f = new JFrame();
          f.setTitle("Most Popular Event");
          j = new JTable(a, columnNames);
          j.setBounds(30, 40, 200, 300); 

        // adding it to JScrollPane 
        JScrollPane sp = new JScrollPane(j); 
        f.add(sp); 
        // Frame Size 
        f.setSize(500, 200); 
        // Frame Visible = true
        f.setLocationRelativeTo(null);
        f.setVisible(true); 
        } catch (SQLException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        // TODO add your handling code here:
        login a = new login();
        a.setVisible(true);
        a.pack();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        Statement stmt;
        try {
            stmt = c.conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from artist;");
            String[] columnNames = {"artist_id", "first_name", "last_name"}; 
            rs.last();
            int count = rs.getRow();
            String[][] a = new String[count][3]; 
            rs.beforeFirst();
            int i =0; 
        while(rs.next()){
              a[i][0] =rs.getString("artist_id");
              a[i][1] =rs.getString("first_name");
              a[i][2] =rs.getString("last_name");
              i++;
            }
        // Initializing the JTable 
          JTable j; 
          JFrame f; 
          f = new JFrame();
          f.setTitle("Artist");
          j = new JTable(a, columnNames);
          j.setBounds(30, 40, 200, 300); 

        // adding it to JScrollPane 
        JScrollPane sp = new JScrollPane(j); 
        f.add(sp); 
        // Frame Size 
        f.setSize(500, 200); 
        // Frame Visible = true
        f.setLocationRelativeTo(null);
        f.setVisible(true); 
            
        } catch (SQLException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        Statement stmt;
        try {
            stmt = c.conn.createStatement();
            ResultSet rs = stmt.executeQuery("select an.a_name,an.a_type,a.first_name\n" +
"from artwork_name an, artist a\n" +
"where an.artist_id=a.artist_id;");
            String[] columnNames = {"artwork_name", "artwork_type", "created by"}; 
            rs.last();
            int count = rs.getRow();
            String[][] a = new String[count][3]; 
            rs.beforeFirst();
            int i =0; 
        while(rs.next()){
              a[i][0] =rs.getString("a_name");
              a[i][1] =rs.getString("a_type");
              a[i][2] =rs.getString("first_name");
              i++;
            }
        // Initializing the JTable 
          JTable j; 
          JFrame f; 
          f = new JFrame();
          f.setTitle("ArtWork on show");
          j = new JTable(a, columnNames);
          j.setBounds(30, 40, 200, 300); 

        // adding it to JScrollPane 
        JScrollPane sp = new JScrollPane(j); 
        f.add(sp); 
        // Frame Size 
        f.setSize(500, 200); 
        // Frame Visible = true
        f.setLocationRelativeTo(null);
        f.setVisible(true); 
            
        } catch (SQLException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        Statement stmt;
        try {
            stmt = c.conn.createStatement();
            ResultSet rs = stmt.executeQuery("select event_name, start_date,end_date,address from manage_event_locate;");
            String[] columnNames = {"event_name", "start_date", "end_date","address"}; 
            rs.last();
            int count = rs.getRow();
            String[][] a = new String[count][4]; 
            rs.beforeFirst();
            int i =0; 
        while(rs.next()){
              a[i][0] =rs.getString("event_name");
              a[i][1] =rs.getString("start_date");
              a[i][2] =rs.getString("end_date");
              a[i][3] =rs.getString("address");
              i++;
            }
        // Initializing the JTable 
          JTable j; 
          JFrame f; 
          f = new JFrame();
          f.setTitle("Upcoming Event");
          j = new JTable(a, columnNames);
          j.setBounds(30, 40, 200, 300); 

        // adding it to JScrollPane 
        JScrollPane sp = new JScrollPane(j); 
        f.add(sp); 
        // Frame Size 
        f.setSize(500, 200); 
        // Frame Visible = true
        f.setLocationRelativeTo(null);
        f.setVisible(true); 
            
        } catch (SQLException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        Statement stmt;
        try {
            stmt = c.conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from artGallery;");
            String[] columnNames = {"gallery_name", "address", "phone"}; 
            rs.last();
            int count = rs.getRow();
            String[][] a = new String[count][3]; 
            rs.beforeFirst();
            int i =0; 
        while(rs.next()){
              a[i][0] =rs.getString("gallery_name");
              a[i][1] =rs.getString("address");
              a[i][2] =rs.getString("phone");
              i++;
            }
        // Initializing the JTable 
          JTable j; 
          JFrame f; 
          f = new JFrame();
          f.setTitle("Art Gallery");
          j = new JTable(a, columnNames);
          j.setBounds(30, 40, 200, 300); 

        // adding it to JScrollPane 
        JScrollPane sp = new JScrollPane(j); 
        f.add(sp); 
        // Frame Size 
        f.setSize(500, 200); 
        // Frame Visible = true
        f.setLocationRelativeTo(null);
        f.setVisible(true); 
            
        } catch (SQLException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        Statement stmt;
        try {
            stmt = c.conn.createStatement();
            ResultSet rs = stmt.executeQuery("select s.art_type, min(s.price),max(s.price)\n" +
"from saleArtwork s\n" +
"where s.a_status = 'On Sell'\n" +
"group by s.art_type;");
            String[] columnNames = {"artwork_type", "price from", "to"}; 
            rs.last();
            int count = rs.getRow();
            String[][] a = new String[count][3]; 
            rs.beforeFirst();
            int i =0; 
        while(rs.next()){
              a[i][0] =rs.getString("art_type");
              a[i][1] =rs.getString("min(s.price)");
              a[i][2] =rs.getString("max(s.price)");
              i++;
            }
        // Initializing the JTable 
          JTable j; 
          JFrame f; 
          f = new JFrame();
          f.setTitle("price range for each type of artwork");
          j = new JTable(a, columnNames);
          j.setBounds(30, 40, 200, 300); 

        // adding it to JScrollPane 
        JScrollPane sp = new JScrollPane(j); 
        f.add(sp); 
        // Frame Size 
        f.setSize(500, 200); 
        // Frame Visible = true
        f.setLocationRelativeTo(null);
        f.setVisible(true); 
            
        } catch (SQLException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        OrderHistoryCus rgf = new OrderHistoryCus(this.cid);
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        try {
            // TODO add your handling code here:
            CustomerInformation cim = new CustomerInformation(this.cid);
            cim.setVisible(true);
            cim.pack();
            cim.setLocationRelativeTo(null);
            cim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (SQLException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton7MouseClicked

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

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
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer("abc").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
