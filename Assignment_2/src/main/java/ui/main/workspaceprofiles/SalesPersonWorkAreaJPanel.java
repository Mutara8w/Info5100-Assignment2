package ui.main.workspaceprofiles;

import javax.swing.JOptionPane;
import model.business.Business;
import model.customermgnt.CustomerProfile;
import javax.swing.JPanel;
import model.salesmgnt.SalesPersonProfile;
import ui.main.workspaceprofiles.ordermgnt.ManageSalesPersonOrders;
import ui.main.workspaceprofiles.ordermgnt.ProcessOrder;
import ui.main.workspaceprofiles.ordermgnt.ReviewCommission;

public class SalesPersonWorkAreaJPanel extends javax.swing.JPanel {

    javax.swing.JPanel CardSequencePanel;
    Business business;
    SalesPersonProfile salesperson;

    /**
     * Creates new form UnitRiskWorkArea
     * @param b
     * @param spp
     * @param clp
     */

    public SalesPersonWorkAreaJPanel(Business b, SalesPersonProfile spp, JPanel clp) {
        business = b;
        CardSequencePanel = clp;
        salesperson = spp;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnServeCustomers = new javax.swing.JButton();
        btnManageProfile = new javax.swing.JButton();
        btnReviewOrderHistory = new javax.swing.JButton();
        btnReviewCommission = new javax.swing.JButton();
        btnPerformanceReports = new javax.swing.JButton();
        customerNameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setForeground(new java.awt.Color(51, 51, 51));

        btnServeCustomers.setBackground(new java.awt.Color(102, 153, 255));
        btnServeCustomers.setFont(getFont());
        btnServeCustomers.setForeground(new java.awt.Color(255, 255, 255));
        btnServeCustomers.setText("Serve Customers");
        btnServeCustomers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnServeCustomers.setMaximumSize(new java.awt.Dimension(200, 40));
        btnServeCustomers.setMinimumSize(new java.awt.Dimension(20, 23));
        btnServeCustomers.setPreferredSize(new java.awt.Dimension(240, 30));
        btnServeCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServeCustomersIdentifyResourceAssetsActionPerformed(evt);
            }
        });

        btnManageProfile.setBackground(new java.awt.Color(102, 153, 255));
        btnManageProfile.setFont(getFont());
        btnManageProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnManageProfile.setText("Manage Profile");
        btnManageProfile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageProfile.setMaximumSize(new java.awt.Dimension(200, 40));
        btnManageProfile.setMinimumSize(new java.awt.Dimension(20, 20));
        btnManageProfile.setPreferredSize(new java.awt.Dimension(240, 25));
        btnManageProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProfileActionPerformed(evt);
            }
        });

        btnReviewOrderHistory.setBackground(new java.awt.Color(102, 153, 255));
        btnReviewOrderHistory.setFont(getFont());
        btnReviewOrderHistory.setForeground(new java.awt.Color(255, 255, 255));
        btnReviewOrderHistory.setText("Review Order Status History");
        btnReviewOrderHistory.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReviewOrderHistory.setMaximumSize(new java.awt.Dimension(200, 40));
        btnReviewOrderHistory.setMinimumSize(new java.awt.Dimension(20, 20));
        btnReviewOrderHistory.setPreferredSize(new java.awt.Dimension(240, 25));
        btnReviewOrderHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReviewOrderHistoryActionPerformed(evt);
            }
        });

        btnReviewCommission.setBackground(new java.awt.Color(102, 153, 255));
        btnReviewCommission.setFont(getFont());
        btnReviewCommission.setForeground(new java.awt.Color(255, 255, 255));
        btnReviewCommission.setText("Review Sales & Commission");
        btnReviewCommission.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReviewCommission.setMaximumSize(new java.awt.Dimension(200, 40));
        btnReviewCommission.setMinimumSize(new java.awt.Dimension(20, 20));
        btnReviewCommission.setPreferredSize(new java.awt.Dimension(240, 25));
        btnReviewCommission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReviewCommissionActionPerformed(evt);
            }
        });

        btnPerformanceReports.setBackground(new java.awt.Color(102, 153, 255));
        btnPerformanceReports.setFont(getFont());
        btnPerformanceReports.setForeground(new java.awt.Color(255, 255, 255));
        btnPerformanceReports.setText("Performance Reports");
        btnPerformanceReports.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPerformanceReports.setMaximumSize(new java.awt.Dimension(200, 40));
        btnPerformanceReports.setMinimumSize(new java.awt.Dimension(20, 20));
        btnPerformanceReports.setPreferredSize(new java.awt.Dimension(240, 25));
        btnPerformanceReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerformanceReportsActionPerformed(evt);
            }
        });

        jLabel1.setText("Customer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customerNameTextField)
                    .addComponent(btnServeCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(btnManageProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReviewOrderHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnReviewCommission, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPerformanceReports, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(365, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnManageProfile, btnPerformanceReports, btnReviewCommission, btnReviewOrderHistory, btnServeCustomers});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnServeCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReviewOrderHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReviewCommission, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPerformanceReports, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(320, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnServeCustomersIdentifyResourceAssetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServeCustomersIdentifyResourceAssetsActionPerformed
        
        String customername = customerNameTextField.getText();
        if (customername.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter the name");
            return;
        }
        CustomerProfile selectedcustomer = business.getCustomerDirectory().findCustomer(customername);
        ProcessOrder aos = new ProcessOrder(business, selectedcustomer ,salesperson, CardSequencePanel);
        //ProcessOrder需要知道customer、salesperson是誰，所以要放入這兩個parameter

        CardSequencePanel.add("ManageVulns", aos);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_btnServeCustomersIdentifyResourceAssetsActionPerformed

    private void btnManageProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProfileActionPerformed
        // TODO add your handling code here:


//        ManageVulns aos = new  ManageVulns(businessunit, CardSequencePanel);
        // aos.setAgenda(businessunit.getRiskManagementAgenda());
//        CardSequencePanel.add("ManageVulns", aos);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

}//GEN-LAST:event_btnManageProfileActionPerformed

    private void btnReviewOrderHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReviewOrderHistoryActionPerformed
        // TODO add your handling code here:

        ManageSalesPersonOrders iet = new ManageSalesPersonOrders(business, CardSequencePanel);

        CardSequencePanel.add("FindResourceAsset", iet);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_btnReviewOrderHistoryActionPerformed

    private void btnReviewCommissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReviewCommissionActionPerformed

        CardSequencePanel.removeAll();
        ReviewCommission rc = new ReviewCommission(CardSequencePanel, business, salesperson);
        CardSequencePanel.add("ReviewCommission", rc);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
}//GEN-LAST:event_btnReviewCommissionActionPerformed

    private void btnPerformanceReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerformanceReportsActionPerformed
        // TODO add your handling code here:

        CardSequencePanel.removeAll();
//        ManageIncidents aos = new  ManageIncidents(businessunit, CardSequencePanel);
        // aos.setAgenda(businessunit.getRiskManagementAgenda());
//        CardSequencePanel.add("RiskAgendaObjectives", aos);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
}//GEN-LAST:event_btnPerformanceReportsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageProfile;
    private javax.swing.JButton btnPerformanceReports;
    private javax.swing.JButton btnReviewCommission;
    private javax.swing.JButton btnReviewOrderHistory;
    private javax.swing.JButton btnServeCustomers;
    private javax.swing.JTextField customerNameTextField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
