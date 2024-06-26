/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginsystem;

import static loginsystem.Searching.*;

/**
 *
 * @author tangm
 */
public class RegistryGUI extends javax.swing.JFrame {
    
    RegistrySystem r = new RegistrySystem();
    /**
     * Creates new form RegistryGUI
     */
    public RegistryGUI() {
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

        lButton = new javax.swing.JButton();
        rUser = new javax.swing.JTextField();
        rPass = new javax.swing.JTextField();
        rLName = new javax.swing.JTextField();
        rFName = new javax.swing.JTextField();
        rEmail = new javax.swing.JTextField();
        rButton = new javax.swing.JButton();
        lUser = new javax.swing.JTextField();
        lPass = new javax.swing.JTextField();
        rLabel = new javax.swing.JLabel();
        lLabel = new javax.swing.JLabel();
        rLabel1 = new javax.swing.JLabel();
        rLabel2 = new javax.swing.JLabel();
        rLabel3 = new javax.swing.JLabel();
        rLabel4 = new javax.swing.JLabel();
        rLabel5 = new javax.swing.JLabel();
        rLabel6 = new javax.swing.JLabel();
        rLabel7 = new javax.swing.JLabel();
        aText = new javax.swing.JTextField();
        aSearch = new javax.swing.JButton();
        aLabel = new javax.swing.JLabel();
        aLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lButton.setText("Log In");
        lButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lButtonActionPerformed(evt);
            }
        });

        rUser.setText("Username");
        rUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rUserActionPerformed(evt);
            }
        });

        rPass.setText("Password");
        rPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPassActionPerformed(evt);
            }
        });

        rLName.setText("Last Name");
        rLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rLNameActionPerformed(evt);
            }
        });

        rFName.setText("First Name");
        rFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rFNameActionPerformed(evt);
            }
        });

        rEmail.setText("Email");
        rEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rEmailActionPerformed(evt);
            }
        });

        rButton.setText("Register");
        rButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonActionPerformed(evt);
            }
        });

        lUser.setText("User");

        lPass.setText("Pass");

        rLabel1.setText("Username:");

        rLabel2.setText("Password:");

        rLabel3.setText("First Name:");

        rLabel4.setText("Last Name:");

        rLabel5.setText("Email:");

        rLabel6.setText("Username:");

        rLabel7.setText("Password:");

        aText.setText("Code");
        aText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aTextActionPerformed(evt);
            }
        });

        aSearch.setText("Search");
        aSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aSearchActionPerformed(evt);
            }
        });

        aLabel.setText("Agent Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(aSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(rLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(aLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(aText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aLabel))
                        .addGap(40, 40, 40)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rLabel1)
                            .addComponent(rLabel3)
                            .addComponent(rLabel4)
                            .addComponent(rLabel5)
                            .addComponent(rLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(rEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rLabel6)
                                    .addComponent(rLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rLabel3)
                                    .addComponent(aSearch))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rLabel5)
                                    .addComponent(aLabel2))
                                .addGap(18, 18, 18)
                                .addComponent(rButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(aLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rLabel2))
                        .addGap(46, 46, 46)
                        .addComponent(lButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rLabel)
                            .addComponent(lLabel))))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rUserActionPerformed

    private void rPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rPassActionPerformed

    private void rLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rLNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rLNameActionPerformed

    private void rFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rFNameActionPerformed

    private void rEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rEmailActionPerformed

    private void rButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonActionPerformed
         // TODO add your handling code here:
         int i = r.register(rUser.getText(), rPass.getText(), rEmail.getText(),rLName.getText(),rFName.getText());
         if(i == 1){
             rLabel.setText("Username taken");
         } else if (i == 2){
             rLabel.setText("Character not allowed");
         } else if (i == 3){
             rLabel.setText("Bad Password");
         } else {
             rLabel.setText("Success");
         }
    }//GEN-LAST:event_rButtonActionPerformed

    private void lButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lButtonActionPerformed
        // TODO add your handling code here:
        if(r.login(lUser.getText(),lPass.getText())){
            lLabel.setText("Success");
        } else {
            lLabel.setText("Try Again");
        }
        //(false);
        //LoginFramr.msin(null);
        
    }//GEN-LAST:event_lButtonActionPerformed

    private void aTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aTextActionPerformed

    private void aSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aSearchActionPerformed
        // TODO add your handling code here:
        int i = binarySearch(aText.getText());
        if (i > -1){
            aLabel2.setText("Available");
        } else {
            aLabel2.setText("Not Available");
        }
    }//GEN-LAST:event_aSearchActionPerformed

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
            java.util.logging.Logger.getLogger(RegistryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistryGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aLabel;
    private javax.swing.JLabel aLabel2;
    private javax.swing.JButton aSearch;
    private javax.swing.JTextField aText;
    private javax.swing.JButton lButton;
    private javax.swing.JLabel lLabel;
    private javax.swing.JTextField lPass;
    private javax.swing.JTextField lUser;
    private javax.swing.JButton rButton;
    private javax.swing.JTextField rEmail;
    private javax.swing.JTextField rFName;
    private javax.swing.JTextField rLName;
    private javax.swing.JLabel rLabel;
    private javax.swing.JLabel rLabel1;
    private javax.swing.JLabel rLabel2;
    private javax.swing.JLabel rLabel3;
    private javax.swing.JLabel rLabel4;
    private javax.swing.JLabel rLabel5;
    private javax.swing.JLabel rLabel6;
    private javax.swing.JLabel rLabel7;
    private javax.swing.JTextField rPass;
    private javax.swing.JTextField rUser;
    // End of variables declaration//GEN-END:variables
}
