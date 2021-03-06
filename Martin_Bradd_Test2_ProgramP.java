/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADVJavaProgramming.newpackage;

/**
 *
 * @author Bradd
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Martin_Bradd_Test2_ProgramP extends javax.swing.JFrame {

    /**
     * Creates new form Martin_Bradd_Test2_ProgramP
     */
    public Martin_Bradd_Test2_ProgramP() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBoxCustName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBoxNumDay = new javax.swing.JTextField();
        txtBoxLP = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnAddCar3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstBox1 = new javax.swing.JTextArea();
        btnRead = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtBoxSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtBoxCustName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("License Plate:");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Customer Name:");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Number of Days:");
        jLabel3.setToolTipText("");

        txtBoxNumDay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtBoxLP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSave.setText("Save to File");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnAddCar3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddCar3.setText("Add Car");
        btnAddCar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCar3ActionPerformed(evt);
            }
        });

        lstBox1.setColumns(20);
        lstBox1.setRows(5);
        jScrollPane1.setViewportView(lstBox1);

        btnRead.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRead.setText("Read to Program");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Search Key:");
        jLabel4.setToolTipText("");

        txtBoxSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnAddCar3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRead, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(63, 63, 63)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBoxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBoxNumDay, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBoxCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBoxLP, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(425, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBoxLP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBoxCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBoxNumDay, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBoxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnRead, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnAddCar3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    List<String> list = new ArrayList<String>();
    
    public static int linearSearch(List<String> data, String searchKey) {
        Iterator<String> it = data.iterator();
        while (it.hasNext()) {
            if (it.next().equals(searchKey)) {
                JOptionPane.showMessageDialog(null, "Found!");
                
            }
        }
        return -1;
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        File filename = new File("C:\\Users\\Bradd\\Desktop\\ExamFile.txt");
        
        try {
            FileWriter fw = new FileWriter(filename);
            Writer  output = new BufferedWriter(fw);
            int sz = list.size();
            for (int i = 0; i < sz; i++) {
                output.write(list.get(i).toString() + "\n");
            }
            output.close();
        }
            catch (IOException e) {
                    System.out.println("File not created.");
                  }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnAddCar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCar3ActionPerformed
        // TODO add your handling code here:
        
        String LP = txtBoxLP.getText();
        String custName = txtBoxCustName.getText();
        int Days = Integer.parseInt(txtBoxNumDay.getText());
        
        String[] info = {LP, custName, Integer.toString(Days)};
        
        for (String color : info)
        {
            list.add(color);
        } 
        
    }//GEN-LAST:event_btnAddCar3ActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        // TODO add your handling code here:
        
        String line = null;
        
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File filename = chooser.getSelectedFile();
        
        try {
            
            String LP = "";
            String custName = "";
            int Days = 0;
            
            BufferedReader  input = new BufferedReader(new FileReader(filename));
            
            if (!input.ready()) {
                throw new IOException();
            }
            while ((line = input.readLine()) != null) {
                String tmp[] = line.split("\t");
                LP = tmp[0];
                String[] info2 = {LP, custName, Integer.toString(Days)};
                for (String color : info2)
        {
            list.add(color);
        } 
                System.out.printf(LP, custName, Days);
            }
            input.close();
        }
            catch (IOException e) {
                    System.out.println(e);
                  }

        for (int i=0;i< list.size();i++) {
            lstBox1.append(list.get(i).toString());
            lstBox1.append("\n");
        }
        
    }//GEN-LAST:event_btnReadActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        
        
        String searchValue = txtBoxSearch.getText();
        
        
        linearSearch(list, searchValue);
        
        
        
        
        
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(Martin_Bradd_Test2_ProgramP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Martin_Bradd_Test2_ProgramP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Martin_Bradd_Test2_ProgramP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Martin_Bradd_Test2_ProgramP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Martin_Bradd_Test2_ProgramP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCar3;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea lstBox1;
    private javax.swing.JTextField txtBoxCustName;
    private javax.swing.JTextField txtBoxLP;
    private javax.swing.JTextField txtBoxNumDay;
    private javax.swing.JTextField txtBoxSearch;
    // End of variables declaration//GEN-END:variables
}
