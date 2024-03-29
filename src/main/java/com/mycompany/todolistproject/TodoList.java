/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.todolistproject;


import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author User
 */
public class TodoList extends javax.swing.JFrame {

    /**
     * Creates new form TodoList
     */
    public TodoList() {
        initComponents();
        jTable1.setAutoCreateRowSorter(true);
       
        
        ((DefaultTableCellRenderer)jTable1.getDefaultRenderer(Object.class)).setBackground(new Color(0,0,0,0));
        jScrollPane1.setBackground(new Color(0,0,0,0));
        jScrollPane1.setOpaque(false);
         jScrollPane1.getViewport().setOpaque(false);
        jTable1.setShowGrid(true);
         jTable1.setGridColor(Color.black);  
          
    }
    
    
   
   
public static void AddDataToTable(Object[] dataRow){
   DefaultTableModel table1=(DefaultTableModel)jTable1.getModel();
   table1.addRow(dataRow);
    
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddnewtask1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnMarkasdone = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnDeleteAll = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAddNew = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();

        btnAddnewtask1.setBackground(new java.awt.Color(255, 102, 102));
        btnAddnewtask1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddnewtask1.setText("Add new task ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setName("TodoList"); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 785, 685, -1));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(204, 255, 204));
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"dddd", "ddd", "45", "1"},
                {"22", "33", "44", "2"},
                {"e", "r", "34", "4"},
                {"4", "r", "4", null}
            },
            new String [] {
                "Task", "Description", "Date", "Priority"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setRowHeight(45);
        jTable1.setRowMargin(4);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(25);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(1).setMinWidth(30);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(2).setMinWidth(10);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(5);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 710, 510));

        btnMarkasdone.setBackground(new java.awt.Color(204, 204, 255));
        btnMarkasdone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMarkasdone.setText("Mark as done");
        btnMarkasdone.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMarkasdone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMarkasdone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarkasdoneActionPerformed(evt);
            }
        });
        getContentPane().add(btnMarkasdone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 110, 50));

        btnRemove.setBackground(new java.awt.Color(204, 204, 255));
        btnRemove.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRemove.setText("Remove task");
        btnRemove.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 110, 50));

        btnDeleteAll.setBackground(new java.awt.Color(204, 204, 255));
        btnDeleteAll.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeleteAll.setText("Delete all");
        btnDeleteAll.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeleteAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAllActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 110, 50));

        btnUpdate.setBackground(new java.awt.Color(204, 204, 255));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setText("Update ");
        btnUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 110, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Success is a series of  little achievements");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("TO DO LIST");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\TodoListProject\\src\\todo.png")); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnAddNew.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 70, 70));

        btnHelp.setText("help");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        getContentPane().add(btnHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 50, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAllActionPerformed
        DefaultTableModel table = (DefaultTableModel)jTable1.getModel();
        if (table.getRowCount()==0){
            JOptionPane.showMessageDialog(this, "your task list is empty");
        }
        else if(table.getRowCount()!=0) {
            int value= JOptionPane.showConfirmDialog(this, " Are sure you want to delete all tasks?");

            if(value==0){

                table.setRowCount(0);
                JOptionPane.showMessageDialog(this, "Successfully deleted");}}
    }//GEN-LAST:event_btnDeleteAllActionPerformed

    private void btnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewActionPerformed
        Insert insert= new Insert();
        insert.setVisible(true);
        insert.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAddNewActionPerformed

    private void btnMarkasdoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkasdoneActionPerformed
      DefaultTableModel table = (DefaultTableModel)jTable1.getModel();
        try{
            String task=table.getValueAt(jTable1.getSelectedRow(), 0).toString();
            JOptionPane.showMessageDialog(this, " You completed "+task+ " successfully!");
            table.removeRow(jTable1.getSelectedRow());}
        catch(HeadlessException e){
            JOptionPane.showMessageDialog(this,"Please select a task");}
    }//GEN-LAST:event_btnMarkasdoneActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        DefaultTableModel table1=(DefaultTableModel)jTable1.getModel();
        if (jTable1.getSelectedRowCount()==1){
            JOptionPane.showMessageDialog(this, "Task is deleted");
            table1.removeRow(jTable1.getSelectedRow());

        }
        else if(jTable1.getRowCount()==0){
            JOptionPane.showMessageDialog(this, "Your task list is empty");
        }
        else if (jTable1.getSelectedRowCount()==0){
            JOptionPane.showMessageDialog(this, "Please select a row");
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        DefaultTableModel table= (DefaultTableModel)jTable1.getModel();
        int selectedRowCount = jTable1.getSelectedRowCount();
        if(selectedRowCount==0){
            JOptionPane.showMessageDialog(this, "Please select a task");
        }
        else {
            if(selectedRowCount==1){
                Insert insert=new Insert();
                insert.setVisible(true);
                insert.setLocationRelativeTo(null);

                String task=table.getValueAt(jTable1.getSelectedRow(), 0).toString();
                String description=table.getValueAt(jTable1.getSelectedRow(),1).toString();
                  
                
              
                

                Insert.update(task, description);
                table.removeRow(jTable1.getSelectedRow());
            }
            else{
                JOptionPane.showMessageDialog(this, "Please select one task"); }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
       JOptionPane.showMessageDialog(this, """
                                           *Add task- Click on + sign 
                                           *Delete Task- Select one task and delete it
                                           *Update Task- Select one task and update it
                                           *Delete All- Delete  all tasks and clear your task list
                                            
                                           click the table headers to sort the columns""");
    }//GEN-LAST:event_btnHelpActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    
      //jTable1.setSelectionBackground(Color.WHITE);
      
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(TodoList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TodoList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TodoList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TodoList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TodoList().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNew;
    private javax.swing.JButton btnAddnewtask1;
    private javax.swing.JButton btnDeleteAll;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnMarkasdone;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
