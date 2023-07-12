/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.main.workspaceprofiles.ordermgnt;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.business.Business;
import model.salesmgnt.SalesPersonDirectory;
import model.salesmgnt.SalesPersonProfile;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class ReviewCommission extends javax.swing.JPanel {

    JPanel CardSequencePanel;
    Business business;
    SalesPersonProfile salesperson;
    
    public ReviewCommission(JPanel CardSequencePanel, Business business, SalesPersonProfile salesperson) {
        initComponents();
        this.CardSequencePanel = CardSequencePanel;
        this.business = business;
        this.salesperson = salesperson;
        txtSalesTarget.setText(String.valueOf(salesperson.getSalesTarget()));
        populateTable();
        lblChart.setText("No Chart To Show Now");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblSalesTarget = new javax.swing.JLabel();
        txtSalesTarget = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSalesAndCommission = new javax.swing.JTable();
        btnViewDetails = new javax.swing.JButton();
        txtHighQuantity = new javax.swing.JTextField();
        lblSalesRank1 = new javax.swing.JLabel();
        lblSalesRank2 = new javax.swing.JLabel();
        txtLargeOrders = new javax.swing.JTextField();
        lblSalesRank3 = new javax.swing.JLabel();
        txtSalesRank = new javax.swing.JTextField();
        lblSalesRank5 = new javax.swing.JLabel();
        txtProductPromotion = new javax.swing.JTextField();
        lblSalesRank6 = new javax.swing.JLabel();
        txtThreshold = new javax.swing.JTextField();
        lblSalesRank7 = new javax.swing.JLabel();
        txtHighPriceProducts = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblChart = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        lblTitle.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblTitle.setText("Review Sales Performance & Commission");

        lblSalesTarget.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblSalesTarget.setText("Sales Target:");

        txtSalesTarget.setEditable(false);

        tableSalesAndCommission.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sales Person Name", "Total Commission", "Current Sales", "Subtract Advance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableSalesAndCommission);

        btnViewDetails.setText("View Bonus Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        txtHighQuantity.setEditable(false);

        lblSalesRank1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblSalesRank1.setText("High Quantity: ");

        lblSalesRank2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblSalesRank2.setText("Large Orders:");

        txtLargeOrders.setEditable(false);

        lblSalesRank3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblSalesRank3.setForeground(new java.awt.Color(204, 0, 0));
        lblSalesRank3.setText("Sales Rank:");

        txtSalesRank.setEditable(false);

        lblSalesRank5.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblSalesRank5.setText("Product Promotion:");

        txtProductPromotion.setEditable(false);

        lblSalesRank6.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblSalesRank6.setText("Order Threshold:");

        txtThreshold.setEditable(false);

        lblSalesRank7.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblSalesRank7.setText("High Price Products:");

        txtHighPriceProducts.setEditable(false);

        lblChart.setForeground(new java.awt.Color(153, 153, 153));
        lblChart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblSalesTarget)
                            .addGap(18, 18, 18)
                            .addComponent(txtSalesTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblSalesRank2)
                                        .addComponent(lblSalesRank1))
                                    .addGap(57, 57, 57)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtLargeOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtHighQuantity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblSalesRank6)
                                    .addGap(43, 43, 43)
                                    .addComponent(txtThreshold, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblSalesRank7)
                                    .addGap(20, 20, 20)
                                    .addComponent(txtHighPriceProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblSalesRank5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtProductPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnViewDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblChart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblSalesRank3)
                                .addGap(74, 74, 74)
                                .addComponent(txtSalesRank, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(588, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtSalesRank, txtThreshold});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSalesTarget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSalesTarget))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewDetails)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHighQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSalesRank1))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSalesRank2)
                            .addComponent(txtLargeOrders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSalesRank5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtProductPromotion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHighPriceProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSalesRank7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtThreshold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSalesRank6)))
                    .addComponent(lblChart, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSalesRank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSalesRank3))
                .addGap(135, 135, 135))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        
        lblChart.setText("");
        
        int selectedRowCount = tableSalesAndCommission.getSelectedRow();
        if(selectedRowCount < 0){
            JOptionPane.showMessageDialog(this, "Please select a row from the table first");
            return;
        }
        
        SalesPersonProfile selectedSalesPerson = (SalesPersonProfile)tableSalesAndCommission.getValueAt(selectedRowCount, 0);
        
        txtHighQuantity.setText(String.valueOf(selectedSalesPerson.getBonusForHighQuantity()));
        txtLargeOrders.setText(String.valueOf(selectedSalesPerson.getBonusForLargeOrder()));
        txtHighPriceProducts.setText(String.valueOf(selectedSalesPerson.getBonusForHighPriceProduct()));
        txtProductPromotion.setText(String.valueOf(selectedSalesPerson.getBonusForProductPromotion()));
        txtThreshold.setText(String.valueOf(selectedSalesPerson.getBonusForThreshold()));
        
        //Initiate txtSalesRank
        SalesPersonDirectory spd = business.getSalesPersonDirectory();
        spd.populateRankRecord();
        int rank = spd.getRankForSalesPerson(selectedSalesPerson);
        if(rank == 0) return;
        String rankString = String.valueOf(rank);
        txtSalesRank.setText(rankString);
                
        if(selectedSalesPerson.getCurrentSales() == 0.0){
            txtSalesRank.setText("Not yet have an order");
        }
        
//        //Initiate txtBonusForTop3Sales
//        if(txtSalesRank.getText().equals("1")){
//            txtTop3Rank.setText("200.0");
//        } else if (txtSalesRank.getText().equals("2")){
//            txtTop3Rank.setText("100.0");
//        } else if (txtSalesRank.getText().equals("3")){
//            txtTop3Rank.setText("50.0");
//        } else {
//            txtTop3Rank.setText("0.0");
//        }
        
        createCommissionGrowthChart(selectedSalesPerson);
    }//GEN-LAST:event_btnViewDetailsActionPerformed
    
    public void populateTable(){
          
          DefaultTableModel model = (DefaultTableModel) tableSalesAndCommission.getModel();
          model.setRowCount(0);
          
          SalesPersonDirectory spd = business.getSalesPersonDirectory();
          
          for(SalesPersonProfile spp : spd.getSalespersonlist()){ 
                Object[] row = new Object[4];
                row[0] = spp;
                row[1] = spp.getComission();
                row[2] = spp.getCurrentSales();
                row[3] = spp.getAdvance();
                
                model.addRow(row);
          }
    }
    
    public void createCommissionGrowthChart(SalesPersonProfile spp) {
        
        //Create database
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        spp.generateSalesForEachMonth();
        double salesJanuary = spp.searchSalesForMonth("January");
        double salesFebuary = spp.searchSalesForMonth("Febuary");
        double salesMarch = spp.searchSalesForMonth("March");
        double salesApril = spp.searchSalesForMonth("April");
        double salesMay = spp.searchSalesForMonth("May");
        double salesJune = spp.searchSalesForMonth("June");
                
        dataset.addValue(salesJanuary, "Sales", "Jan");
        dataset.addValue(salesFebuary, "Sales", "Feb");
        dataset.addValue(salesMarch, "Sales", "Mar");
        dataset.addValue(salesApril, "Sales", "Apr");
        dataset.addValue(salesMay, "Sales", "May");
        dataset.addValue(salesJune, "Sales", "Jun");
        
        //Create JFreeChart object
        JFreeChart chart = ChartFactory.createLineChart(
                "Sales Performance", //Title
                "Month", //橫坐標
                "Sales",
                dataset,
                PlotOrientation.VERTICAL,
                false, //是否顯示圖例標示
                true, //是否顯示tooltips
                false); //是否支持超連結url
        
        
        //Display Chart
        //ChartFrame chartFrame = new ChartFrame("Test", chart);
        //chartFrame.pack();
        //chartFrame.setVisible(true);
        
        //Turn chart into image
        BufferedImage chartImage = chart.createBufferedImage(370, 270); 
        Image img = chartImage.getScaledInstance(370, 270, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(img);
        lblChart.setIcon(icon);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblChart;
    private javax.swing.JLabel lblSalesRank1;
    private javax.swing.JLabel lblSalesRank2;
    private javax.swing.JLabel lblSalesRank3;
    private javax.swing.JLabel lblSalesRank5;
    private javax.swing.JLabel lblSalesRank6;
    private javax.swing.JLabel lblSalesRank7;
    private javax.swing.JLabel lblSalesTarget;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tableSalesAndCommission;
    private javax.swing.JTextField txtHighPriceProducts;
    private javax.swing.JTextField txtHighQuantity;
    private javax.swing.JTextField txtLargeOrders;
    private javax.swing.JTextField txtProductPromotion;
    private javax.swing.JTextField txtSalesRank;
    private javax.swing.JTextField txtSalesTarget;
    private javax.swing.JTextField txtThreshold;
    // End of variables declaration//GEN-END:variables
}
