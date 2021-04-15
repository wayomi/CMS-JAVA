/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author wayomi
 */
public class POPDeposite_Record extends javax.swing.JFrame {

    /**
     * Creates new form POPDeposite_Record
     */
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
    
    public POPDeposite_Record() {
        initComponents();
        this.setLocationRelativeTo(this);
        con = DBConnect.connect();
        LoadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Heading = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_amt = new javax.swing.JTextField();
        jTextField_SalesPer = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Ref = new javax.swing.JTextArea();
        jButton_new = new javax.swing.JButton();
        jButton_save = new javax.swing.JButton();
        jButton_del = new javax.swing.JButton();
        jLabel_id = new javax.swing.JLabel();
        jDateChooser_Date = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_depositeRecord = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Heading.setBackground(new java.awt.Color(204, 153, 255));

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabel1.setText("CMS - Deposite record");

        javax.swing.GroupLayout HeadingLayout = new javax.swing.GroupLayout(Heading);
        Heading.setLayout(HeadingLayout);
        HeadingLayout.setHorizontalGroup(
            HeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeadingLayout.setVerticalGroup(
            HeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Amount");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Sales Person");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Date");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Reference");

        jTextArea_Ref.setColumns(20);
        jTextArea_Ref.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Ref);

        jButton_new.setForeground(new java.awt.Color(51, 0, 255));
        jButton_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-plus-20.png"))); // NOI18N
        jButton_new.setText("NEW");
        jButton_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_newActionPerformed(evt);
            }
        });

        jButton_save.setForeground(new java.awt.Color(51, 0, 255));
        jButton_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-save-20.png"))); // NOI18N
        jButton_save.setText("SAVE");
        jButton_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_saveActionPerformed(evt);
            }
        });

        jButton_del.setForeground(new java.awt.Color(51, 0, 255));
        jButton_del.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-delete-20.png"))); // NOI18N
        jButton_del.setText("DELETE");
        jButton_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_delActionPerformed(evt);
            }
        });

        jLabel_id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_id.setForeground(new java.awt.Color(153, 0, 153));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-reset-20.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_amt, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jDateChooser_Date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(56, 56, 56)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_SalesPer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addComponent(jLabel_id, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_new)
                        .addGap(26, 26, 26)
                        .addComponent(jButton_save)
                        .addGap(31, 31, 31)
                        .addComponent(jButton_del)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jTextField_amt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_SalesPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jDateChooser_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton_new)
                                .addComponent(jButton_save)
                                .addComponent(jButton_del)))))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTable_depositeRecord.setBackground(new java.awt.Color(204, 255, 204));
        jTable_depositeRecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_depositeRecord.setGridColor(new java.awt.Color(0, 204, 51));
        jTable_depositeRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_depositeRecordMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_depositeRecord);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void LoadTable()
    {
        try {
            
            String sql = "SELECT id AS '#', amt AS 'Amount', sales AS 'Sales By', date AS 'Date', ref AS 'Reference' "
                    + "FROM depositerec";
            
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            JTableHeader head = jTable_depositeRecord.getTableHeader();
            head.setForeground(Color.blue);            
            jTable_depositeRecord.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 14));
            jTable_depositeRecord.setModel(DbUtils.resultSetToTableModel(rs));
            jTable_depositeRecord.setShowGrid(true); 
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Deposite Record load table\n" + e);
        }
        
    }
    private void jButton_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_newActionPerformed
        try {
            String sql = "INSERT INTO depositerec(amt, sales, date,ref) "
                    + "VALUES (?,?,?,?)";
            
            PreparedStatement pst = con.prepareStatement(sql);
                                
            pst.setString(1, jTextField_amt.getText());
            pst.setString(2, jTextField_SalesPer.getText());
            String date = sdf.format(jDateChooser_Date.getDate());
            pst.setString(3,date);  
            
            pst.setString(4, jTextArea_Ref.getText());                 
            
            pst.executeUpdate();
          
            JOptionPane.showMessageDialog(null,"Inserted Successfully..!!");
            
            jTextArea_Ref.setText("");
            jTextField_SalesPer.setText("");
            jTextField_amt.setText("");
            jDateChooser_Date.setDate(null);
            
            LoadTable();
            
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Deposite Record new \n" + e);
        }
    }//GEN-LAST:event_jButton_newActionPerformed

    private void jButton_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_saveActionPerformed
        try {
            String sql = "UPDATE depositerec SET amt=?,"
                    + "sales=?,date=?,ref=? "
                    + "WHERE id=?";
            
            PreparedStatement pst = con.prepareStatement(sql);
                                
            pst.setString(1, jTextField_amt.getText());
            pst.setString(2, jTextField_SalesPer.getText());
            String date = sdf.format(jDateChooser_Date.getDate());
            pst.setString(3,date);  
            
            pst.setString(4, jTextArea_Ref.getText());  
            pst.setString(5, jLabel_id.getText());  
            
            pst.executeUpdate();
          
            JOptionPane.showMessageDialog(null,"Updated Successfully..!!");
            
            jTextArea_Ref.setText("");
            jTextField_SalesPer.setText("");
            jTextField_amt.setText("");
            jDateChooser_Date.setDate(null);
            jLabel_id.setText("");
            
            LoadTable();
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Deposite Record save \n" + e);
        }
    }//GEN-LAST:event_jButton_saveActionPerformed

    private void jTable_depositeRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_depositeRecordMouseClicked
        try {
            int i = jTable_depositeRecord.getSelectedRow();       
                        
            jLabel_id.setText(jTable_depositeRecord.getValueAt(i, 0).toString());
            jTextField_amt.setText(jTable_depositeRecord.getValueAt(i, 1).toString());   
            jTextField_SalesPer.setText(jTable_depositeRecord.getValueAt(i, 2).toString());
            jTextArea_Ref.setText(jTable_depositeRecord.getValueAt(i, 4).toString()); 
            String dateValue = jTable_depositeRecord.getValueAt(i, 3).toString(); // Your column Name
            java.util.Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(dateValue);
            //Date date1 =(Date) new SimpleDateFormat("yyyy-MM-dd").jTable_depositeRecord.getValueAt(i,3));
            jDateChooser_Date.setDate(date1);                      
             
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Deposite Record table click \n" + e);
        }
    }//GEN-LAST:event_jTable_depositeRecordMouseClicked

    private void jButton_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_delActionPerformed
        try {
            String sql = "DELETE FROM depositerec  "
                    + "WHERE id = ? ";
            
            pst = con.prepareStatement(sql);
            pst.setString(1, jLabel_id.getText());  
            
            pst.execute();
          
            JOptionPane.showMessageDialog(null,"Deleted Successfully..!!");
            
            jTextArea_Ref.setText("");
            jTextField_SalesPer.setText("");
            jTextField_amt.setText("");
            jDateChooser_Date.setDate(null);
            jLabel_id.setText("");
            
            LoadTable();
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Deposite Record del \n" + e);
        }
    }//GEN-LAST:event_jButton_delActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            jTextArea_Ref.setText("");
            jTextField_SalesPer.setText("");
            jTextField_amt.setText("");
            jDateChooser_Date.setDate(null);
            jLabel_id.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(POPDeposite_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POPDeposite_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POPDeposite_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POPDeposite_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POPDeposite_Record().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Heading;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_del;
    private javax.swing.JButton jButton_new;
    private javax.swing.JButton jButton_save;
    private com.toedter.calendar.JDateChooser jDateChooser_Date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_id;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_depositeRecord;
    private javax.swing.JTextArea jTextArea_Ref;
    private javax.swing.JTextField jTextField_SalesPer;
    private javax.swing.JTextField jTextField_amt;
    // End of variables declaration//GEN-END:variables
}
