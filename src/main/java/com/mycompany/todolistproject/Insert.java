/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.todolistproject;


import java.awt.Color;
import java.text.SimpleDateFormat;  
import javax.swing.JOptionPane;

   
        
 
/**
 *
 * @author User
 */
public class Insert extends javax.swing.JFrame {

    /**
     * Creates new form Insert
     */
    public Insert() {
        initComponents();
        txtTask.setBackground(new Color(0,0,0,0));
        txtDescription.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTask = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        dateChooser = new com.toedter.calendar.JDateChooser();
        cmbPriority = new javax.swing.JComboBox<>();
        btnAddtask = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTask.setBorder(null);
        txtTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaskActionPerformed(evt);
            }
        });
        getContentPane().add(txtTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 121, 370, 50));

        txtDescription.setBorder(null);
        txtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionActionPerformed(evt);
            }
        });
        getContentPane().add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 370, 80));
        getContentPane().add(dateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 360, 30));

        cmbPriority.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cmbPriority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Priority 1", "Priority 2", "Priority 3" }));
        cmbPriority.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPriorityActionPerformed(evt);
            }
        });
        getContentPane().add(cmbPriority, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        btnAddtask.setBackground(new java.awt.Color(204, 204, 255));
        btnAddtask.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddtask.setText("Add task ");
        btnAddtask.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddtask.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddtask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddtaskActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddtask, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 130, 50));

        btnClear.setBackground(new java.awt.Color(204, 204, 255));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 130, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("TO DO LIST");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Success is a series of  little achievements");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Description");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 140, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 110, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Priority");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 110, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Task");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 110, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\TodoListProject\\src\\insert.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtTask.setText("");
        txtDescription.setText("");
        dateChooser.cleanup();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddtaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddtaskActionPerformed

        if (txtTask.getText().equals("")){
            JOptionPane.showMessageDialog(this," Task cannot be empty");
        }
        else if(dateChooser.getDate()==null){
            JOptionPane.showMessageDialog(this,"Please enter the date");
        }
        try{
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String d1= formatter.format(dateChooser.getDate());

            TodoList.AddDataToTable(new Object[]{
                txtTask.getText(),
                txtDescription.getText(),
                d1,
                cmbPriority.getSelectedItem().toString()
            });
            this.dispose();}
        catch(Exception e){
            
        }
    }//GEN-LAST:event_btnAddtaskActionPerformed

    private void cmbPriorityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPriorityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPriorityActionPerformed

    private void txtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptionActionPerformed

    private void txtTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaskActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaskActionPerformed

    public static void update(String t1,String t2){
        txtTask.setText(t1);
        txtDescription.setText(t2);
    }
    
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
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Insert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAddtask;
    private javax.swing.JButton btnClear;
    private javax.swing.JComboBox<String> cmbPriority;
    private static com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private static javax.swing.JTextField txtDescription;
    private static javax.swing.JTextField txtTask;
    // End of variables declaration//GEN-END:variables
}
