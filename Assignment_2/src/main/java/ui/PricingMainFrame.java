package ui;

import javax.swing.JOptionPane;
import model.marketingmgnt.MarketingPersonProfile;
import model.business.Business;
import javax.swing.JPanel;
import model.personnel.EmployeeProfile;
import model.personnel.Profile;
import model.salesmgnt.SalesPersonProfile;
import model.useraccountmgnt.UserAccount;
import model.useraccountmgnt.UserAccountDirectory;
import ui.main.workspaceprofiles.BusinessManagerWorkAreaJPanel;
import ui.main.workspaceprofiles.MarketingManagerWorkAreaJPanel1;
import ui.main.workspaceprofiles.SalesPersonWorkAreaJPanel;

public class PricingMainFrame extends javax.swing.JFrame {

    Business business;

    public PricingMainFrame() {
        initComponents();
        setSize(1024, 768);
        business = ConfigureABusiness.initialize();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitHomeArea = new javax.swing.JSplitPane();
        actionsidejpanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        UserNameTextField = new javax.swing.JTextField();
        PasswordTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CardSequencePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        actionsidejpanel.setBackground(new java.awt.Color(0, 153, 153));
        actionsidejpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 204));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        actionsidejpanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 70, 30));

        jLabel1.setText("User Name");
        actionsidejpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        UserNameTextField.setForeground(new java.awt.Color(153, 153, 153));
        UserNameTextField.setText("xxxxx");
        UserNameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UserNameTextFieldMousePressed(evt);
            }
        });
        UserNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameTextFieldActionPerformed(evt);
            }
        });
        actionsidejpanel.add(UserNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 130, -1));

        PasswordTextField.setForeground(new java.awt.Color(153, 153, 153));
        PasswordTextField.setText("88888");
        PasswordTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PasswordTextFieldMousePressed(evt);
            }
        });
        PasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTextFieldActionPerformed(evt);
            }
        });
        actionsidejpanel.add(PasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 130, -1));

        jLabel2.setText("Password");
        actionsidejpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 20));

        SplitHomeArea.setLeftComponent(actionsidejpanel);

        CardSequencePanel.setLayout(new java.awt.CardLayout());
        SplitHomeArea.setRightComponent(CardSequencePanel);

        getContentPane().add(SplitHomeArea, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed

        String un = UserNameTextField.getText();
        String pw = PasswordTextField.getText();

        UserAccountDirectory uad = business.getUserAccountDirectory();
        UserAccount useraccount = uad.AuthenticateUser(un, pw);
        if (useraccount == null) {
            JOptionPane.showMessageDialog(this, "No user account founded");
            return;
        }
        
    // 第一種寫法
        String r = useraccount.getRole();
        // if(r.equalsIgnoreCase("sales"))....
        
    // 第二種寫法
        Profile profile = useraccount.getAssociatedPersonProfile();
        
        if (profile instanceof SalesPersonProfile) { // Check if the object is an instance of a class, subclass, or interface
            
            SalesPersonProfile spp = (SalesPersonProfile) profile; //向下轉型
            SalesPersonWorkAreaJPanel salesworkarea = new SalesPersonWorkAreaJPanel(business, spp, CardSequencePanel);
            CardSequencePanel.removeAll();
            CardSequencePanel.add("Sales", salesworkarea);
            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
        
        }

        if (profile instanceof MarketingPersonProfile) {
            
            MarketingManagerWorkAreaJPanel1 marketingworkarea = new MarketingManagerWorkAreaJPanel1(business, CardSequencePanel);
            CardSequencePanel.removeAll();
            CardSequencePanel.add("Marketing", marketingworkarea);
            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

        }

        if (profile instanceof EmployeeProfile) {

            BusinessManagerWorkAreaJPanel bzmanagerworkarea = new BusinessManagerWorkAreaJPanel(business, CardSequencePanel);
            CardSequencePanel.removeAll();
            CardSequencePanel.add("Admin", bzmanagerworkarea);
            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

        }

    }//GEN-LAST:event_LoginButtonActionPerformed

    private void PasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTextFieldActionPerformed
        
    }//GEN-LAST:event_PasswordTextFieldActionPerformed

    private void UserNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameTextFieldActionPerformed
        
    }//GEN-LAST:event_UserNameTextFieldActionPerformed

    private void UserNameTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserNameTextFieldMousePressed
        UserNameTextField.setText("");
    }//GEN-LAST:event_UserNameTextFieldMousePressed

    private void PasswordTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordTextFieldMousePressed
        PasswordTextField.setText("");
    }//GEN-LAST:event_PasswordTextFieldMousePressed

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
            java.util.logging.Logger.getLogger(PricingMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PricingMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PricingMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PricingMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PricingMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardSequencePanel;
    private javax.swing.JTextField PasswordTextField;
    private javax.swing.JSplitPane SplitHomeArea;
    private javax.swing.JTextField UserNameTextField;
    private javax.swing.JPanel actionsidejpanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
