package ui.main.workspaceprofiles.ordermgnt;

import java.awt.Color;
import java.awt.Component;
import model.business.Business;
import model.customermgnt.CustomerProfile;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import model.ordermgnt.MasterOrderList;
import model.ordermgnt.Order;
import model.ordermgnt.OrderItem;
import model.productmgnt.Product;
import model.productmgnt.ProductCatalog;
import model.productmgnt.ProductSummary;
import model.salesmgnt.SalesPersonProfile;
import model.supplier.Supplier;

public class ProcessOrder extends javax.swing.JPanel {

    JPanel CardSequencePanel;
    Business business;
    Supplier selectedsupplier;
    Product selectedproduct;
    Order currentOrder;
    CustomerProfile customer;
    MasterOrderList masterOrderList;
    SalesPersonProfile salesperson;
    double commissionForThisOrder = 0.0; //Not include special bonus
    double highPriceProductBonus = 0.0;
    double largeOrderBonus = 0.0;
    double highQuantityBonus = 0.0;
    double productPromotionBonus = 0.0;
    double thresholdBonus = 0.0;

    public ProcessOrder(Business bz, CustomerProfile cp, SalesPersonProfile spp, JPanel jp) {

        CardSequencePanel = jp;
        business = bz;
        customer = cp;
        salesperson = spp;
        masterOrderList = bz.getMasterOrderList();
        initComponents();

        currentOrder = masterOrderList.newOrder(customer, salesperson); //一到這個頁面就會先建立Order
        customerTextField.setText(customer.getCustomerId());
        txtCommission.setText(String.valueOf(salesperson.getComission()));
        txtSalesPerson.setText(salesperson.getName());
        txtCommissionBonusForThisOrder.setText("0.0");
        txtAdvance.setText(String.valueOf(salesperson.getAdvance()));
        initializeAndFreshTable();
    }

    private void initializeAndFreshTable() {

        cleanUpCombobox();
        cleanUpTable();

        //Reload suppliers to the combobox
        ArrayList<Supplier> supplierlist = business.getSupplierDirectory().getSuplierList();

        if (supplierlist.isEmpty()) {
            JOptionPane.showMessageDialog(this, "There is no supplier choosable right now");
            return;
        }

        for (Supplier s : supplierlist) {
            SuppliersComboBox.addItem(s.toString());
            SuppliersComboBox.setSelectedIndex(0);
        }
        refreshSupplierProductCatalogTable();  
    }

    public void cleanUpCombobox() {
        SuppliersComboBox.removeAllItems();
    }

    public void cleanUpTable() {
        int rowCount = SupplierCatalogTable.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) SupplierCatalogTable.getModel()).removeRow(i);
        }
    }

    public void cleanUpItemsTable() {
        int rc = OrderItemsTable.getRowCount();
        for (int i = rc - 1; i >= 0; i--) {
            ((DefaultTableModel) OrderItemsTable.getModel()).removeRow(i);
        }
    }

    public void refreshSupplierProductCatalogTable() {
        //clear supplier table
        int rc = SupplierCatalogTable.getRowCount();
        int i;
        for (i = rc - 1; i >= 0; i--) {
            ((DefaultTableModel) SupplierCatalogTable.getModel()).removeRow(i);
        }

        String suppliername = (String) SuppliersComboBox.getSelectedItem();

        selectedsupplier = business.getSupplierDirectory().findSupplier(suppliername);
        if (selectedsupplier == null) {
            return;
        }
        ProductCatalog pc = selectedsupplier.getProductCatalog();

        for (Product pt : pc.getProductList()) {

            Object[] row = new Object[5];
            row[0] = pt;
            row[1] = pt.getFloorPrice();
            row[2] = pt.getCeilingPrice();
            row[3] = pt.getTargetPrice();

            ((DefaultTableModel) SupplierCatalogTable.getModel()).addRow(row);
        }
        
//        for(int j =0 ; j<SupplierCatalogTable.getRowCount(); j++){
//
//            Product p = (Product) SupplierCatalogTable.getValueAt(j, 0);
//            if(p.isPromotion()){
//                SupplierCatalogTable;
//            }        
//            
//        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancel = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        SupplierCatalogTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        OrderItemsTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        SuppliersComboBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        customerTextField = new javax.swing.JTextField();
        txtCommission = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        productFrequencyBelowTargetTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        productFrequencyAboveTargetTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        productPricePerformanceTextField = new javax.swing.JTextField();
        productRevenueTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        productNameTextField = new javax.swing.JTextField();
        txtSalesPerson = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtActualPrice = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        btnRemove = new javax.swing.JButton();
        txtCommissionBonusForThisOrder = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtAdvance = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancel.setText("X Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 620, 120, 30));

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 580, 120, 30));

        jLabel1.setText("Suppliers");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 60, -1));

        SupplierCatalogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Floor", "Ceiling", "Target"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SupplierCatalogTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SupplierCatalogTableMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SupplierCatalogTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(SupplierCatalogTable);

        jScrollPane2.setViewportView(jScrollPane1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 600, 110));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Prepare Order");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 550, -1));

        jLabel8.setText("Product");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 20));

        OrderItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Actual price", "Quanity", "Item total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        OrderItemsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OrderItemsTableMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                OrderItemsTableMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(OrderItemsTable);

        jScrollPane3.setViewportView(jScrollPane4);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 600, 100));

        jLabel9.setText("Order Items");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 20));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductItemActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 90, 30));

        SuppliersComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuppliersComboBoxActionPerformed(evt);
            }
        });
        add(SuppliersComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 180, -1));

        jLabel10.setText("Customer");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 150, -1));

        customerTextField.setEditable(false);
        add(customerTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 140, -1));

        txtCommission.setEditable(false);
        txtCommission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommissionActionPerformed(evt);
            }
        });
        add(txtCommission, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 190, -1));

        jLabel11.setText("Accumulated Comission");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 150, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Business-wide Product Intelligence", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Frequency Below Target");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 150, -1));

        productFrequencyBelowTargetTextField.setEditable(false);
        jPanel1.add(productFrequencyBelowTargetTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 150, -1));

        jLabel4.setText("Frequency Above Target");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 150, -1));

        productFrequencyAboveTargetTextField.setEditable(false);
        jPanel1.add(productFrequencyAboveTargetTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 150, -1));

        jLabel7.setText("Marign around target");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 150, -1));

        productPricePerformanceTextField.setEditable(false);
        productPricePerformanceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productPricePerformanceTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(productPricePerformanceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 150, -1));

        productRevenueTextField.setEditable(false);
        productRevenueTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productRevenueTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(productRevenueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 150, -1));

        jLabel5.setText("Sales Revenues");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, -1));

        jLabel3.setText("Product name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 110, -1));

        productNameTextField.setEditable(false);
        productNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(productNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 150, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 600, 170));
        jPanel1.getAccessibleContext().setAccessibleName("Business -wide Product Intelligence");

        txtSalesPerson.setEditable(false);
        add(txtSalesPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 140, -1));

        jLabel12.setText("Sales Person");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 150, -1));

        txtActualPrice.setForeground(new java.awt.Color(153, 153, 153));
        txtActualPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtActualPrice.setText("Actual Price");
        txtActualPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtActualPriceMousePressed(evt);
            }
        });
        txtActualPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActualPriceActionPerformed(evt);
            }
        });
        add(txtActualPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 160, 30));

        txtQuantity.setForeground(new java.awt.Color(153, 153, 153));
        txtQuantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQuantity.setText("Quantity");
        txtQuantity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtQuantityMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtQuantityMousePressed(evt);
            }
        });
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 90, 30));

        txtDate.setForeground(new java.awt.Color(153, 153, 153));
        txtDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDate.setText("eg. 2023/01/01");
        txtDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDateMousePressed(evt);
            }
        });
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, 120, 30));

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 120, 30));

        txtCommissionBonusForThisOrder.setEditable(false);
        add(txtCommissionBonusForThisOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 210, -1));

        jLabel13.setText("Commission & Bonus For This Order");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        txtAdvance.setEditable(false);
        add(txtAdvance, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 150, -1));

        jLabel14.setText("Advance");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        jLabel15.setText("Enter Order Date");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed

        //按了cancel其實不會真的刪掉這個order object
        //只是把這個order的status備註為"Cancel"

        currentOrder.CancelOrder();
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        //雖然Order一開始被建立就已經被加進SalesPerson的orderlist
        //但到這裡才真正把這一筆訂單備註為"Submit"
        //但到這裡才真正把這一筆訂單的抽成加到SalesPerson的commission裡
        //但到這裡才真正把這一筆訂單的業績加到SalesPerson的sales裡
        //但到這裡才真正把這一筆訂單的orderitem加到product的orderItemList裡
        //但到這裡才真正把這一筆訂單能抵銷advance更新到SalesPerson的advance裡
        
        int rowCount = OrderItemsTable.getRowCount();
        if(rowCount <= 0){
            JOptionPane.showMessageDialog(this, "Order cart is empty, please add one item first");
            return;
        }
        if(txtDate.getText().equals("eg. 2023/01/01")){
            JOptionPane.showMessageDialog(this, "Required! Please manually enter the date to proceed");
            return;
        }
        
        String date = txtDate.getText();
        if(!date.matches("\\d{4}/\\d{2}/\\d{2}")){
            JOptionPane.showMessageDialog(this, "Please enter a valid date format eg. 2023/01/01");
            return;
        }
        
        int dialogResult = JOptionPane.showConfirmDialog(this, "Do you want to submit this order?", "Information", JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION){
            
            double commission = Double.parseDouble(txtCommission.getText());
        
            int salesInt = currentOrder.getOrderTotal();
            String salesString = String.valueOf(salesInt);
            double salesDouble = Double.parseDouble(salesString);
        
            String advanceString = txtAdvance.getText();
            double advanceDouble = Double.parseDouble(advanceString);
            salesperson.setAdvance(advanceDouble);

            String dateForThisOrder = txtDate.getText();
            currentOrder.setDate(dateForThisOrder);

            salesperson.updateBonusForHighPriceProduct(highPriceProductBonus);
            salesperson.updateBonusForHighQuantity(highQuantityBonus);
            salesperson.updateBonusForLargeOrder(largeOrderBonus);
            salesperson.updateBonusForProductPromotion(productPromotionBonus);
            salesperson.updateBonusForThreshold(thresholdBonus);

            currentOrder.Submit(date, commission, salesDouble, commissionForThisOrder);

            CardSequencePanel.remove(this);
            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
        }
        


      

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void SupplierCatalogTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierCatalogTableMousePressed

        ////Make sure user has selected a product
        int suppliertablesize = SupplierCatalogTable.getRowCount();
        int selectedrow = SupplierCatalogTable.getSelectionModel().getLeadSelectionIndex();

        if (selectedrow < 0 || selectedrow > suppliertablesize - 1) {
            return;
        }
        selectedproduct = (Product) SupplierCatalogTable.getValueAt(selectedrow, 0);
        if (selectedproduct == null) {
            return;
        }

        //Display the sales information for that product
        ProductSummary productsummary = new ProductSummary(selectedproduct);

        productNameTextField.setText(selectedproduct.toString());
        String revenues = String.valueOf(productsummary.getSalesRevenues());
        productRevenueTextField.setText(revenues);
        productFrequencyAboveTargetTextField.setText(String.valueOf(productsummary.getNumberAboveTarget()));
        productFrequencyBelowTargetTextField.setText(String.valueOf(productsummary.getNumberBelowTarget()));
        productPricePerformanceTextField.setText(String.valueOf(productsummary.getProductPricePerformance()));

    }//GEN-LAST:event_SupplierCatalogTableMousePressed

    private void productNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameTextFieldActionPerformed

    private void productRevenueTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productRevenueTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productRevenueTextFieldActionPerformed

    private void productPricePerformanceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productPricePerformanceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productPricePerformanceTextFieldActionPerformed

    private void SupplierCatalogTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierCatalogTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_SupplierCatalogTableMouseEntered

    private void OrderItemsTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderItemsTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderItemsTableMouseEntered

    private void OrderItemsTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderItemsTableMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderItemsTableMousePressed

    private void AddProductItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductItemActionPerformed

        //Make sure user has selected a product
        int suppliertablesize = SupplierCatalogTable.getRowCount();
        int selectedrow = SupplierCatalogTable.getSelectionModel().getLeadSelectionIndex();

        if (selectedrow < 0 || selectedrow > suppliertablesize - 1) {
            return;
        }

        selectedproduct = (Product) SupplierCatalogTable.getValueAt(selectedrow, 0);
        if (selectedproduct == null) {
            return;
        }

        //Make sure the user has input the "number", not other formats
        int actualPrice;
        int quantity;

        try {
            actualPrice = Integer.parseInt(txtActualPrice.getText());
            quantity = Integer.parseInt(txtQuantity.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please check the actual price & quantity format");
            return;
        }

        //Make sure the actualPrice is not lower than the floorPrice
        if (actualPrice < selectedproduct.getFloorPrice()) {
            JOptionPane.showMessageDialog(this, "The actual price should be higher than the floor price");
            return;
        }
        //Make sure the actualPrice is not higher than the floorPrice
        if (actualPrice > selectedproduct.getCeilingPrice()) {
            JOptionPane.showMessageDialog(this, "The actual price should be lower than the cieling price");
            return;
        }
        
        //Make sure the selected product is not repeatedly added
        for(OrderItem oi : currentOrder.getOrderitems()){
            if(oi.getSelectedProduct().getName().equals(selectedproduct.getName())){
                JOptionPane.showMessageDialog(this, "This product is already part of your order, if you wish to update the quantity, please remove the the item and add it again");
                return;
            }
        }

        //Create order items to put into the order
        OrderItem item = currentOrder.newOrderItem(selectedproduct, actualPrice, quantity);
        Object[] row = new Object[4];

        row[0] = item; //Return order item
        row[1] = String.valueOf(item.getActualPrice());
        row[2] = String.valueOf(item.getQuantity());
        row[3] = String.valueOf(item.getOrderItemTotal());

        ((DefaultTableModel) OrderItemsTable.getModel()).addRow(row);

        txtActualPrice.setText("");
        txtQuantity.setText("");
        updateCommission();
    }//GEN-LAST:event_AddProductItemActionPerformed

    private void SuppliersComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuppliersComboBoxActionPerformed

        refreshSupplierProductCatalogTable();
    }//GEN-LAST:event_SuppliersComboBoxActionPerformed

    private void txtCommissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommissionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommissionActionPerformed

    private void txtActualPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActualPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActualPriceActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed

    }//GEN-LAST:event_txtQuantityActionPerformed

    private void txtQuantityMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuantityMousePressed

        txtQuantity.setText("");
    }//GEN-LAST:event_txtQuantityMousePressed

    private void txtQuantityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuantityMouseClicked

    }//GEN-LAST:event_txtQuantityMouseClicked

    private void txtActualPriceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtActualPriceMousePressed

        txtActualPrice.setText("");
    }//GEN-LAST:event_txtActualPriceMousePressed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtDateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDateMousePressed

        txtDate.setText("");
    }//GEN-LAST:event_txtDateMousePressed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed

        int selectedRowIndex = OrderItemsTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select an order item");
            return;
        }
        OrderItem oi = (OrderItem) OrderItemsTable.getValueAt(selectedRowIndex, 0);
        currentOrder.getOrderitems().remove(oi);

        updateCommission();
        cleanUpItemsTable();
        refreshOrderItemsTable();

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void refreshOrderItemsTable() {
        DefaultTableModel model = (DefaultTableModel) OrderItemsTable.getModel();

        for (OrderItem oi : currentOrder.getOrderitems()) {

            Object[] row = new Object[4];
            row[0] = oi; //Return order item
            row[1] = String.valueOf(oi.getActualPrice());
            row[2] = String.valueOf(oi.getQuantity());
            row[3] = String.valueOf(oi.getOrderItemTotal());

            model.addRow(row);
        }
    }
    
    private void updateCommission(){

        // new bonus variables
        double bonusForHighPriceProduct = 0.0;
        double bonusForLargeOrder = 0.0;
        double bonusForHighQuantity = 0.0;
        double bonusForPromotionProduct = 0.0;
        double bonusForCommissionRateThresholds = 0.0;
        double totalBonus = 0.0;

        // check for special bonus conditions
        for (OrderItem item : currentOrder.getOrderitems()) {
            if (item.getSelectedProduct().getTargetPrice() > 30000) {
                bonusForHighPriceProduct += 500; // bonus for high price product
            }
            if (item.getQuantity() > 5) {
                bonusForHighQuantity += 200; // bonus for high quantity
            }
            if(item.getSelectedProduct().isPromotion()){
                bonusForPromotionProduct += (item.getQuantity() * item.getActualPrice()) * (item.getSelectedProduct().getPromotionCommissionRate());
            }
        }
        
        if (currentOrder.getOrderitems().size() > 5) {
            bonusForLargeOrder += 200; // bonus for large number of order items
        }
        
        for(Integer threshold : salesperson.getCommissionRateThresholds().keySet()){
            if(currentOrder.getOrderTotal() > threshold){
                bonusForCommissionRateThresholds = (currentOrder.getOrderTotal()) * (salesperson.getCommissionRateThresholds().get(threshold));
            }
        }
        
        highPriceProductBonus = bonusForHighPriceProduct;
        largeOrderBonus = bonusForLargeOrder;
        highQuantityBonus = bonusForHighQuantity;
        productPromotionBonus = bonusForPromotionProduct;
        thresholdBonus = bonusForCommissionRateThresholds;
        totalBonus = bonusForHighPriceProduct + bonusForLargeOrder + bonusForHighQuantity + bonusForPromotionProduct + bonusForCommissionRateThresholds;
        
        //Calculate commission for this order
        String totalActualPriceString = String.valueOf(currentOrder.getOrderTotal());
        double totalActualPrice = Double.parseDouble(totalActualPriceString);

        String totalTargetPriceString = String.valueOf(currentOrder.getOrderTotalTargetPrice());
        double totalTargetPrice = Double.parseDouble(totalTargetPriceString);

        String profitString = String.valueOf(currentOrder.getOrderPricePerformance());
        double profit = Double.parseDouble(profitString);
        
        //If the sales person has achieved the sales target
        if (salesperson.achieveSalesTarget()) {
            //If total actualPrice is higher than total targetPrice
            if (profit > 0.0) {
                //If the profit is higher than 30%
                if (profit > 0.3 * totalTargetPrice) {
                    commissionForThisOrder = 0.2 * totalActualPrice;
                } //If the profit is lower than 30%
                else if (profit <= 0.3 * totalTargetPrice) {
                    commissionForThisOrder = 0.1 * totalActualPrice;
                }
            } //If total actualPrice is less than total targetPrice
            else if (profit <= 0.0) {
                commissionForThisOrder = 0.05 * totalActualPrice;
            }
        } else { //If the sales person has not achieved the sales target
            //If total actualPrice is higher than total targetPrice
            if (profit > 0.0) {
                //If the profit is higher than 30%
                if (profit > 0.3 * totalTargetPrice) {
                    commissionForThisOrder = 0.03 * totalActualPrice;
                } //If the profit is lower than 30%
                else if (profit <= 0.3 * totalTargetPrice) {
                    commissionForThisOrder = 0.02 * totalActualPrice;
                }
            } //If total actualPrice is less than total targetPrice
            else if (profit <= 0.0) {
                commissionForThisOrder = 0.01 * totalActualPrice;
            }
        }
        
        // Deduct any advances or loans
        // set the text fields
        double advance = salesperson.getAdvance();
        double totalCommission = salesperson.getComission() + commissionForThisOrder + totalBonus;
        double updatedTotalCommission = totalCommission - advance;
        if(updatedTotalCommission <= 0.0){
            updatedTotalCommission = 0.0;
        }
        double updatedAdvance = advance - totalCommission;
        if(updatedAdvance <= 0.0){
            updatedAdvance = 0.0;
        }
        
        String updatedTotalCommissionString = String.valueOf(updatedTotalCommission);
        txtCommission.setText(updatedTotalCommissionString);
        String updatedAdvanceString = String.valueOf(updatedAdvance);
        txtAdvance.setText(updatedAdvanceString);
        
        double commissionAndBonus = totalBonus + commissionForThisOrder;
        String commissionAndBonusString = String.valueOf(commissionAndBonus);
        txtCommissionBonusForThisOrder.setText(commissionAndBonusString);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable OrderItemsTable;
    private javax.swing.JTable SupplierCatalogTable;
    private javax.swing.JComboBox<String> SuppliersComboBox;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JTextField customerTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField productFrequencyAboveTargetTextField;
    private javax.swing.JTextField productFrequencyBelowTargetTextField;
    private javax.swing.JTextField productNameTextField;
    private javax.swing.JTextField productPricePerformanceTextField;
    private javax.swing.JTextField productRevenueTextField;
    private javax.swing.JTextField txtActualPrice;
    private javax.swing.JTextField txtAdvance;
    private javax.swing.JTextField txtCommission;
    private javax.swing.JTextField txtCommissionBonusForThisOrder;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSalesPerson;
    // End of variables declaration//GEN-END:variables

}
