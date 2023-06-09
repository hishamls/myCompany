/*
Log in Form
 */
package forms;

import myCompany.Tools;
import java.awt.event.KeyEvent;

/**
 *
 * @author hishamls
 */
public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrm
     */
    public frmLogin() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new controls.JMyTextBox(15);
        txtPass = new controls.JPasswordBox(15);
        jPanel2 = new javax.swing.JPanel();
        exitBtn = new controls.JMyButton();
        btnLogIn = new controls.JMyButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_new_acnt = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("User Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 252, -1, -1));

        jLabel3.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("PassWord");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 315, -1, -1));

        txtUser.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtUser.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(51, 0, 51));
        txtUser.setOpaque(false);
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 261, 216, -1));

        txtPass.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtPass.setFont(new java.awt.Font("Chilanka", 0, 14)); // NOI18N
        txtPass.setForeground(new java.awt.Color(51, 0, 51));
        txtPass.setOpaque(false);
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 315, 216, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0, 80));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 99, 261, 396));

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 535, -1, -1));

        btnLogIn.setText("Log in");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });
        btnLogIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLogInKeyPressed(evt);
            }
        });
        getContentPane().add(btnLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(878, 535, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 80));

        jLabel1.setFont(new java.awt.Font("Chilanka", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("Log In");

        lbl_new_acnt.setForeground(new java.awt.Color(255, 51, 153));
        lbl_new_acnt.setText("You havn't account? Creat now!");
        lbl_new_acnt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_new_acnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_new_acntMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel1)
                .addContainerGap(210, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_new_acnt, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(lbl_new_acnt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 99, 531, 396));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0, 80));

        jLabel5.setFont(new java.awt.Font("Chilanka", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("Log In");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel5)
                .addContainerGap(498, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 27, 819, 54));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forms/Witching Hour.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 999, 603));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
//        if (evt.getKeyCode== KeyEvent.VK_ENTER){// not here
//
//}     
//        btnLogInKeyPressed(new KeyEvent());
        String user = txtUser.getText();
        String pass = txtPass.getText();
        boolean isLoged = dp.Go.chekUserPass(user, pass);
        if (isLoged) {
            this.dispose();
            Tools.openForm(new frmMain());// We must creat an object to run class
            // even it is an anonmous object
        } else {
            Tools.msgBox("The user Name or Password is incorrect!");
            txtUser.setText("");
            txtPass.setText("");
            txtUser.requestFocus();
        }
        boolean isTxtEmpty= dp.Go.isEmpty(txtUser.getText(), txtPass.getText());
        boolean isIntEmpty= dp.Go.isEmpty(txtUser.getText(), txtPass.getText());
        
//        boolean isDigit= dp.Go.isDigit(txtUser.getText(), txtPass.getText());
//        boolean isText= dp.Go.isText(txtUser.getText(), txtPass.getText());

        if (isTxtEmpty || isIntEmpty) { //we can write isTxtEmpty == true ||...
            Tools.msgBox("One or more field is empty!");
        }
//        if (isDigit == false || isDigit == false) {
//            Tools.msgBox("No digits, only numbers please!");
//        }
    }//GEN-LAST:event_btnLogInActionPerformed

    private void btnLogInKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLogInKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
            String user = txtUser.getText();
        String pass = txtPass.getText();
        boolean isLoged = dp.Go.chekUserPass(user, pass);
        if (isLoged) {
            this.dispose();
            Tools.openForm(new frmMain());// We must creat an object to run class
            // even it is an anonmous object
        } else {
            Tools.msgBox("The user Name or Password is incorrect!");
            txtUser.setText("");
            txtPass.setText("");
            txtUser.requestFocus();
        }
}
    }//GEN-LAST:event_btnLogInKeyPressed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
         if (evt.getKeyCode()== KeyEvent.VK_ENTER){
            String user = txtUser.getText();
        String pass = txtPass.getText();
        boolean isLoged = dp.Go.chekUserPass(user, pass);
        if (isLoged) {
            this.dispose();
            Tools.openForm(new frmMain());// We must creat an object to run class
            // even it is an anonmous object
        } else {
            Tools.msgBox("The user Name or Password is incorrect!");
            txtUser.setText("");
            txtPass.setText("");
            txtUser.requestFocus();
        }
}
    }//GEN-LAST:event_txtPassKeyPressed

    private void lbl_new_acntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_new_acntMouseClicked
        this.dispose();
        Tools.openForm(new frm_New_account());
    }//GEN-LAST:event_lbl_new_acntMouseClicked

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private controls.JMyButton btnLogIn;
    private controls.JMyButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JLabel lbl_new_acnt;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
