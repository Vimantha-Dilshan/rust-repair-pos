/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIModels;
import DatabaseConnnectivity.DBConnection;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Vimantha_Dilshan
 */
public class Suppliers extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Suppliers() {
        initComponents();
    }
    
    ResultSet rs;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSupplierID = new javax.swing.JTextField();
        txtSupplierName = new javax.swing.JTextField();
        txtSupplierAddress = new javax.swing.JTextField();
        txtSupplierEmail = new javax.swing.JTextField();
        txtSupplierTelephone = new javax.swing.JTextField();
        btnSuppliersUPDATE = new javax.swing.JButton();
        btnSuppliersREMOVE = new javax.swing.JButton();
        btnSuppliersADD = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtAmountPay = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 96, 128));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("RustREPAIR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(11, 11, 11))
        );

        jPanel2.setBackground(new java.awt.Color(242, 242, 242));

        jLabel2.setFont(new java.awt.Font("Prototype", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 96, 128));
        jLabel2.setText("SUPPLIERS MANAGEMENT");

        jLabel3.setFont(new java.awt.Font("Abel", 0, 18)); // NOI18N
        jLabel3.setText("Supplier Name");

        jLabel4.setFont(new java.awt.Font("Abel", 0, 18)); // NOI18N
        jLabel4.setText("Supplier ID");

        jLabel5.setFont(new java.awt.Font("Abel", 0, 18)); // NOI18N
        jLabel5.setText("Address");

        jLabel6.setFont(new java.awt.Font("Abel", 0, 18)); // NOI18N
        jLabel6.setText("Telephone");

        jLabel7.setFont(new java.awt.Font("Abel", 0, 18)); // NOI18N
        jLabel7.setText("Email");

        txtSupplierID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSupplierIDActionPerformed(evt);
            }
        });
        txtSupplierID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSupplierIDKeyPressed(evt);
            }
        });

        txtSupplierName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSupplierNameActionPerformed(evt);
            }
        });

        txtSupplierAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSupplierAddressActionPerformed(evt);
            }
        });

        txtSupplierEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSupplierEmailActionPerformed(evt);
            }
        });

        txtSupplierTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSupplierTelephoneActionPerformed(evt);
            }
        });

        btnSuppliersUPDATE.setBackground(new java.awt.Color(0, 102, 102));
        btnSuppliersUPDATE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSuppliersUPDATE.setForeground(new java.awt.Color(204, 204, 204));
        btnSuppliersUPDATE.setText("UPDATE");
        btnSuppliersUPDATE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSuppliersUPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuppliersUPDATEActionPerformed(evt);
            }
        });

        btnSuppliersREMOVE.setBackground(new java.awt.Color(169, 4, 53));
        btnSuppliersREMOVE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSuppliersREMOVE.setForeground(new java.awt.Color(204, 204, 204));
        btnSuppliersREMOVE.setText("REMOVE");
        btnSuppliersREMOVE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSuppliersREMOVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuppliersREMOVEActionPerformed(evt);
            }
        });

        btnSuppliersADD.setBackground(new java.awt.Color(8, 110, 52));
        btnSuppliersADD.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSuppliersADD.setForeground(new java.awt.Color(204, 204, 204));
        btnSuppliersADD.setText("ADD");
        btnSuppliersADD.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSuppliersADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuppliersADDActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(0, 51, 102));
        btnHome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(204, 204, 204));
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel8.setFont(new java.awt.Font("Abel", 0, 18)); // NOI18N
        jLabel8.setText("Payable");

        txtAmountPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountPayActionPerformed(evt);
            }
        });
        txtAmountPay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAmountPayKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSupplierID, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSupplierAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtSupplierTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSupplierEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnSuppliersUPDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSuppliersREMOVE, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnSuppliersADD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtAmountPay, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(116, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(566, 566, 566)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(566, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSupplierID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(txtAmountPay, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtSupplierAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSuppliersUPDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSuppliersREMOVE, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSupplierEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuppliersADD, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSupplierTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(btnHome)
                .addGap(35, 35, 35))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(149, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSupplierNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSupplierNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSupplierNameActionPerformed

    private void txtSupplierAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSupplierAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSupplierAddressActionPerformed

    private void txtSupplierEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSupplierEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSupplierEmailActionPerformed

    private void txtSupplierTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSupplierTelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSupplierTelephoneActionPerformed

    private void btnSuppliersUPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuppliersUPDATEActionPerformed
        // UPDATE Button (Suppliers UI)
        try {
            String SupplierID = txtSupplierID.getText().trim();
            String SupplierName = txtSupplierName.getText().trim();
            String SupplierAddress = txtSupplierAddress.getText().trim();
            String SupplierEmail = txtSupplierEmail.getText().trim();
            String SupplierTelephone = txtSupplierTelephone.getText().trim();
            double AmountPay = Double.parseDouble (txtAmountPay.getText().trim());

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rustrepairpos", "root", "");
            
            if (con != null) {
                Statement s = con.createStatement();
                s.executeUpdate ("Update Suppliers set SupplierName='"+SupplierName+"',SupplierAddress='"+SupplierAddress+"',SupplierEmail='"+SupplierEmail+"',SupplierTelephone='"+SupplierTelephone+"',AmountPay='"+AmountPay+"' where SupplierID='"+SupplierID+"'");
                JOptionPane.showMessageDialog(null, "If you enter valid Supplier ID, Update is Succesful...");
                
                txtSupplierID.setText("");
                txtSupplierName.setText("");
                txtSupplierAddress.setText("");
                txtSupplierEmail.setText("");
                txtSupplierTelephone.setText("");
                txtAmountPay.setText("");
                
            } else {
                JOptionPane.showMessageDialog(rootPane, "ERROR: Connection is NULL");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSuppliersUPDATEActionPerformed

    private void btnSuppliersREMOVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuppliersREMOVEActionPerformed
        // REMOVE Button (Suppliers UI)
        try {
            String SupplierID = txtSupplierID.getText().trim();
            String SupplierName = txtSupplierName.getText().trim();
            String SupplierAddress = txtSupplierAddress.getText().trim();
            String SupplierEmail = txtSupplierEmail.getText().trim();
            String SupplierTelephone = txtSupplierTelephone.getText().trim();
            double AmountPay = Double.parseDouble (txtAmountPay.getText().trim());

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rustrepairpos", "root", "");
            
            if (con != null) {
                Statement s = con.createStatement();
                s.executeUpdate ("delete from Suppliers where SupplierID='"+SupplierID+"'");
                JOptionPane.showMessageDialog(null, "Removed Succesfully...");
                
                txtSupplierID.setText("");
                txtSupplierName.setText("");
                txtSupplierAddress.setText("");
                txtSupplierEmail.setText("");
                txtSupplierTelephone.setText("");
                txtAmountPay.setText("");
                
            } else {
                JOptionPane.showMessageDialog(rootPane, "ERROR: Connection is NULL");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSuppliersREMOVEActionPerformed

    private void txtSupplierIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSupplierIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSupplierIDActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        this.setVisible (false);
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnSuppliersADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuppliersADDActionPerformed
        // ADD Button (Suppliers UI)
        try {
            String SupplierID = txtSupplierID.getText().trim();
            String SupplierName = txtSupplierName.getText().trim();
            String SupplierAddress = txtSupplierAddress.getText().trim();
            String SupplierEmail = txtSupplierEmail.getText().trim();
            String SupplierTelephone = txtSupplierTelephone.getText().trim();
            double AmountPay = Double.parseDouble (txtAmountPay.getText().trim());

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rustrepairpos", "root", "");
            
            if (con != null) {
                Statement s = con.createStatement();
                s.executeUpdate ("insert into Suppliers values ('"+SupplierID+"','"+SupplierName+"','"+SupplierAddress+"','"+SupplierEmail+"','"+SupplierTelephone+"','"+AmountPay+"')");
                JOptionPane.showMessageDialog(null, "Added Succesfully...");
                
                txtSupplierID.setText("");
                txtSupplierName.setText("");
                txtSupplierAddress.setText("");
                txtSupplierEmail.setText("");
                txtSupplierTelephone.setText("");
                txtAmountPay.setText("");
                
            } else {
                JOptionPane.showMessageDialog(rootPane, "ERROR: Connection is NULL");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSuppliersADDActionPerformed

    private void txtSupplierIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSupplierIDKeyPressed
        // Press Enter Key
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String SupplierID = txtSupplierID.getText();
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rustrepairpos", "root", "");
                PreparedStatement pst = con.prepareStatement ("select * from Suppliers where SupplierID = ?");
                
                pst.setString(1, SupplierID);
                rs = pst.executeQuery();
                
                if (rs.next() == true) {
                    String SupplierName = rs.getString("SupplierName");
                    String SupplierAddress = rs.getString("SupplierAddress");
                    String SupplierEmail = rs.getString("SupplierEmail");
                    String SupplierTelephone = rs.getString("SupplierTelephone");
                    double AmountPay = rs.getDouble("AmountPay");
                    
                    String Amount=String.valueOf(AmountPay);

                    txtSupplierName.setText(SupplierName.trim());
                    txtSupplierAddress.setText(SupplierAddress.trim());
                    txtSupplierEmail.setText(SupplierEmail.trim());
                    txtSupplierTelephone.setText(SupplierTelephone.trim());
                    txtAmountPay.setText(Amount.trim());
                    
                }
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(RestorationJobs.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(RestorationJobs.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_txtSupplierIDKeyPressed

    private void txtAmountPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountPayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountPayActionPerformed

    private void txtAmountPayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountPayKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountPayKeyPressed

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
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Suppliers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSuppliersADD;
    private javax.swing.JButton btnSuppliersREMOVE;
    private javax.swing.JButton btnSuppliersUPDATE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtAmountPay;
    private javax.swing.JTextField txtSupplierAddress;
    private javax.swing.JTextField txtSupplierEmail;
    private javax.swing.JTextField txtSupplierID;
    private javax.swing.JTextField txtSupplierName;
    private javax.swing.JTextField txtSupplierTelephone;
    // End of variables declaration//GEN-END:variables
}
