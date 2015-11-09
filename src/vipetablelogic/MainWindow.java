/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vipetablelogic;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Set;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author johnson_849323
 */
public class MainWindow extends javax.swing.JFrame {

    int[] sectors = new int[600];
    Directory dir = new Directory(new ArrayList<>(), new int[600]);
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        updateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addDialog = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        newName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        newSize = new javax.swing.JTextField();
        dialog_add = new javax.swing.JButton();
        dialog_cancel = new javax.swing.JButton();
        jMenuItem3 = new javax.swing.JMenuItem();
        editDialog = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        dialog_newName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dialog_newSize = new javax.swing.JTextField();
        editDialog_edit = new javax.swing.JButton();
        editDialog_cancel = new javax.swing.JButton();
        grid = new GridPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        add = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        takenLabel = new javax.swing.JLabel();
        leftLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        Open = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        saveAs = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        addDialog.setMinimumSize(new java.awt.Dimension(280, 170));
        addDialog.setResizable(false);

        jLabel1.setText("File Name");

        jLabel2.setText("File Size");

        dialog_add.setText("Add");
        dialog_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dialog_addActionPerformed(evt);
            }
        });

        dialog_cancel.setText("Cancel");
        dialog_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dialog_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addDialogLayout = new javax.swing.GroupLayout(addDialog.getContentPane());
        addDialog.getContentPane().setLayout(addDialogLayout);
        addDialogLayout.setHorizontalGroup(
            addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addDialogLayout.createSequentialGroup()
                        .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(44, 44, 44)
                        .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newName)
                            .addGroup(addDialogLayout.createSequentialGroup()
                                .addComponent(newSize, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 93, Short.MAX_VALUE))))
                    .addGroup(addDialogLayout.createSequentialGroup()
                        .addComponent(dialog_add)
                        .addGap(18, 18, 18)
                        .addComponent(dialog_cancel)))
                .addContainerGap())
        );
        addDialogLayout.setVerticalGroup(
            addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDialogLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(newName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(newSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dialog_add)
                    .addComponent(dialog_cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuItem3.setText("jMenuItem3");

        editDialog.setMinimumSize(new java.awt.Dimension(280, 170));
        editDialog.setResizable(false);

        jLabel3.setText("New File Name:");

        dialog_newName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dialog_newNameActionPerformed(evt);
            }
        });

        jLabel4.setText("New Size:");

        dialog_newSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dialog_newSizeActionPerformed(evt);
            }
        });

        editDialog_edit.setText("Edit");
        editDialog_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDialog_editActionPerformed(evt);
            }
        });

        editDialog_cancel.setText("Cancel");
        editDialog_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDialog_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editDialogLayout = new javax.swing.GroupLayout(editDialog.getContentPane());
        editDialog.getContentPane().setLayout(editDialogLayout);
        editDialogLayout.setHorizontalGroup(
            editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editDialogLayout.createSequentialGroup()
                .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editDialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(editDialogLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dialog_newName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(editDialogLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dialog_newSize))))
                    .addGroup(editDialogLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(editDialog_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editDialog_cancel)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        editDialogLayout.setVerticalGroup(
            editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editDialogLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dialog_newName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dialog_newSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editDialog_edit)
                    .addComponent(editDialog_cancel))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        grid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout gridLayout = new javax.swing.GroupLayout(grid);
        grid.setLayout(gridLayout);
        gridLayout.setHorizontalGroup(
            gridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );
        gridLayout.setVerticalGroup(
            gridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "File Name", "Color", "ID", "Size"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
        }

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel6.setText("Space Taken :");

        jLabel7.setText("Space Available :");

        jLabel8.setText("Total Space: 600");

        jMenu1.setText("File");

        jMenuItem1.setText("New");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        Open.setText("open");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        jMenu1.add(Open);

        jMenuItem4.setText("Save");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        saveAs.setText("Save As");
        saveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsActionPerformed(evt);
            }
        });
        jMenu1.add(saveAs);

        jMenuItem6.setText("Close");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(add)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edit))
                                    .addComponent(delete)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(leftLabel)
                                    .addComponent(takenLabel))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(grid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add)
                            .addComponent(edit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(takenLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(leftLabel))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    File savedFile;
    
    //Updates Table with information from directory dir object
    public void updateTable() {
        DefaultTableModel tab = (DefaultTableModel) table.getModel(); //Creates table to edit
        while (tab.getRowCount() > 0)
            tab.removeRow(0);
        ArrayList<VipeFile> temp = dir.getFiles(); //Gets edited files to change table based off of
        int sum = 0;
        
        for (int i = 0; i < temp.size(); i++) {
           
            Object[] content = {temp.get(i).getFileName(), temp.get(i).getSectorColor(), 
                new Integer(temp.get(i).getFileID()), new Integer(temp.get(i).getFileSize())}; //Gets information from files ArrayList and adds to Array
            tab.addRow(content); //Adds the array to the table
            sum += temp.get(i).getFileSize(); //Calculates the sum for the labels
        }
        
        takenLabel.setText("" + sum); //Updates the labels
        leftLabel.setText((600 - sum) + "");
        
    }
    //Updates gridpanel with sectors filled from directory dir object
    public void updateGraph() {
        GridPanel gp = (GridPanel) grid;
        
        gp.updateGrid(dir.getSectors()); //Calls to the GridPanel and sends the updated sectors
    }
    
    //Add button pressed to show Add Dialog
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        addDialog.setVisible(true);    
    }//GEN-LAST:event_addActionPerformed

    //If cancel is pressed in the Add Dialog
    private void dialog_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dialog_cancelActionPerformed
        addDialog.setVisible(false);
        addDialog.dispose();
    }//GEN-LAST:event_dialog_cancelActionPerformed

    //If the Add button is pressed in the Add Dialog
    private void dialog_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dialog_addActionPerformed
        if (new Integer(leftLabel.getText()) < new Integer(newSize.getText()) || new Integer(newSize.getText()) <= 0) {
            JOptionPane.showMessageDialog(this, "Invalid Entry"); 
            return;
        }
        try {
            int newID = getNextID(); //Generates new ID
            Color col = getColor(newID); //Generates new Color

            dir.addFile(new VipeFile(new Integer(newSize.getText()), newName.getText(), col, newID)); //Creates new file under the Directory class


            updateTable(); //Updates the table
            updateGraph(); //Updates the gridpanel graphic

            addDialog.setVisible(false); //Closes out dialog box
            addDialog.dispose();

            newSize.setText(""); //Clears text in the dialog box after use
            newName.setText("");   
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid Entry"); 
        }
    }//GEN-LAST:event_dialog_addActionPerformed

    //When the delete button is pressed to delete file
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        dir.deleteFile((int) table.getModel().getValueAt(table.getSelectedRow(), 2)); //Deletes the file by dedecting the file selected
 
        updateGraph(); //Updates table and gridpanel
        updateTable();
    }//GEN-LAST:event_deleteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //New File
        dir.setFiles(new ArrayList<VipeFile>());
        dir.setSectors(new int[600]);
        
        updateGraph();
        updateTable();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        //Saves file
        try {
                if (savedFile == null) {
                    saveAsActionPerformed(evt);
                }
                
                File file = savedFile; //Creates file object to write to
                
                
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(dir); //Writes the file information
            }
            
            catch (IOException e) {
                JOptionPane.showMessageDialog(this, e.toString());

            }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    //If save as button is pressed under file then open a filer chooser to choose where to save the file
    private void saveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsActionPerformed
        JFileChooser jfc = new JFileChooser();
        
        if(jfc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) { //Opens the dialog box if the select to choose a file location
            try {
                File file = jfc.getSelectedFile(); //Creates file object to write to
                savedFile = file;
                
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(dir); //Writes the file information
            }
            
            catch (IOException e) {
                JOptionPane.showMessageDialog(this, e.toString());

            }
        }
    }//GEN-LAST:event_saveAsActionPerformed

    //If open button is pressed under file then open a file chooser to choose where to save the file
    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        JFileChooser jfc = new JFileChooser(); 
        
        if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { //Opens the dialog box if the select to choose a file location
            try {
                File file = jfc.getSelectedFile(); //Creates file object to write to
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream cis = new ObjectInputStream(fis); //Reads the file information
                
                try {
                    dir = (Directory)cis.readObject(); //After taking information updates directory
                    updateGraph(); //Updates gridpanel and table based on information
                    updateTable();
                    
                }
                catch (ClassNotFoundException es) {
                   JOptionPane.showMessageDialog(this, es.toString()); 
                   JOptionPane.showMessageDialog(this, "Invalid Entry"); 
                }
            }
            catch (IOException e) {
                 JOptionPane.showMessageDialog(this, e.toString());
            }
        }
    }//GEN-LAST:event_OpenActionPerformed

    //If Edit button is pressed open edit Dialog
    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        editDialog.setVisible(true);    
    }//GEN-LAST:event_editActionPerformed

    private void dialog_newNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dialog_newNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dialog_newNameActionPerformed

    private void dialog_newSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dialog_newSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dialog_newSizeActionPerformed

    //If the edit button is pressed in the edit dialog to edit whatever parameters are entered
    private void editDialog_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDialog_editActionPerformed
        if (new Integer(leftLabel.getText()) < new Integer(dialog_newSize.getText()) || new Integer(dialog_newSize.getText()) <= 0) {
            JOptionPane.showMessageDialog(this, "Invalid Entry"); 
            return;
        }
        try {
            int newID = (int) table.getModel().getValueAt(table.getSelectedRow(), 2); //Gets Id from selected row on the table
            dir.editFile(newID, new Integer(dialog_newSize.getText()), dialog_newName.getText()); //Edits file based on what is entered on the parameters

            updateTable(); //Updates table
            updateGraph(); //Updates graph

            editDialog.setVisible(false); //Closes dialog after finished
            editDialog.dispose();

            dialog_newSize.setText(""); //Clears textboxes after dialog is finsihed
            dialog_newName.setText("");
        }
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid Entry"); 
        }
    }//GEN-LAST:event_editDialog_editActionPerformed

    //If cancel button is pressed in edit dialog close the edit dialog
    private void editDialog_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDialog_cancelActionPerformed
        editDialog.setVisible(false);
        editDialog.dispose();
    }//GEN-LAST:event_editDialog_cancelActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    //Generate an ID for new Files
    private int getNextID() {
        int max = 0;
        for (int i = 0; i < dir.files.size(); i++) { //Finds highest ID
            if (max < dir.files.get(i).getFileID()) {
                max = dir.files.get(i).getFileID();
            }
        }
        return max + 1; //Makes new ID higher the biggest ID
    }
    /**
     * @param args the command line arguments
     */
    
    //Generate color for new Files
    private Color getColor(int id) {
        Color color = Color.red;
        
        switch (id) { //Generates color based on modulus of 6
            case 1 : 
                color = Color.red;
                break;
            case 2 : 
                color = Color.green;
                break;
            case 3 : color = Color.blue; break;
            case 4 : color = Color.yellow; break;
            case 5 : color = Color.magenta; break;
            case 6 : color = Color.orange; break;
            default: color = Color.white;
        }
        
        return color;
    }
    
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Open;
    private javax.swing.JButton add;
    private javax.swing.JDialog addDialog;
    private javax.swing.JButton delete;
    private javax.swing.JButton dialog_add;
    private javax.swing.JButton dialog_cancel;
    private javax.swing.JTextField dialog_newName;
    private javax.swing.JTextField dialog_newSize;
    private javax.swing.JButton edit;
    private javax.swing.JDialog editDialog;
    private javax.swing.JButton editDialog_cancel;
    private javax.swing.JButton editDialog_edit;
    private javax.swing.JPanel grid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel leftLabel;
    private javax.swing.JTextField newName;
    private javax.swing.JTextField newSize;
    private javax.swing.JMenuItem saveAs;
    private javax.swing.JTable table;
    private javax.swing.JLabel takenLabel;
    // End of variables declaration//GEN-END:variables
}
