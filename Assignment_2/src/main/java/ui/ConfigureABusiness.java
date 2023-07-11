/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.HashMap;
import java.util.Map;
import model.marketingmgnt.MarketingPersonDirectory;
import model.marketingmgnt.MarketingPersonProfile;
import model.business.Business;
import model.customermgnt.CustomerDirectory;
import model.customermgnt.CustomerProfile;
import model.ordermgnt.MasterOrderList;
import model.ordermgnt.Order;
import model.ordermgnt.OrderItem;
import model.personnel.Person;
import model.personnel.PersonDirectory;
import model.productmgnt.Product;
import model.productmgnt.ProductCatalog;
import model.salesmgnt.SalesPersonDirectory;
import model.salesmgnt.SalesPersonProfile;
import model.supplier.Supplier;
import model.supplier.SupplierDirectory;
import model.useraccountmgnt.UserAccount;
import model.useraccountmgnt.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
class ConfigureABusiness {

    static Business initialize() {
        Business business = new Business("Xerox");
        SupplierDirectory suplierdirectory = business.getSupplierDirectory();

        Supplier supplier1 = suplierdirectory.newSupplier("Lenovo");
        ProductCatalog productcatalog = supplier1.getProductCatalog();
        Product products1p1 = productcatalog.newProduct("Scanner 3  1", 2000, 16500, 10000);
        products1p1.setPromotion(true); // This product is in promotion
        products1p1.setPromotionCommissionRate(0.15); // Set promotion commission rate to 15%

        Product products1p2 = productcatalog.newProduct("Scanner 4", 10000, 25000, 16500);
        products1p2.setPromotion(false); // This product is in promotion
        products1p2.setPromotionCommissionRate(0.00); // Set promotion commission rate to 15%

        Product products1p3 = productcatalog.newProduct("Printer 2", 22000, 40000, 36500);
        products1p3.setPromotion(false); // This product is in promotion
        products1p3.setPromotionCommissionRate(0.00); // Set promotion commission rate to 15%

        Product products1p4 = productcatalog.newProduct("Photocopier 2 ", 30000, 70000, 50000);
        products1p4.setPromotion(false); // This product is in promotion
        products1p4.setPromotionCommissionRate(0.00); // Set promotion commission rate to 15%

        Product products1p5 = productcatalog.newProduct("Scanner  5", 19000, 36500, 25000);
        products1p5.setPromotion(true); // This product is in promotion
        products1p5.setPromotionCommissionRate(0.15); // Set promotion commission rate to 15%

        Product products1p6 = productcatalog.newProduct("Scanner 6", 90000, 125000, 105000);
        products1p6.setPromotion(true); // This product is in promotion
        products1p6.setPromotionCommissionRate(0.15); // Set promotion commission rate to 15%

        Product products1p7 = productcatalog.newProduct("Printer 3", 22000, 60000, 36500);
        products1p7.setPromotion(true); // This product is in promotion
        products1p7.setPromotionCommissionRate(0.15); // Set promotion commission rate to 15%

        Product products1p8 = productcatalog.newProduct("Photocopier 3", 30000, 70000, 50000);
        products1p8.setPromotion(false); // This product is in promotion
        products1p8.setPromotionCommissionRate(0.00); // Set promotion commission rate to 15%

        //       SupplierDirectory suplierdirectory = business.getSupplierDirectory();
        Supplier supplier2 = suplierdirectory.newSupplier("Epson");
        productcatalog = supplier2.getProductCatalog();
        Product products2p1 = productcatalog.newProduct("Scanner 13  1", 12000, 26000, 18500);
        Product products2p2 = productcatalog.newProduct("Scanner 14", 90000, 165000, 125000);
        Product products2p3 = productcatalog.newProduct("Color Printer 112", 422000, 540000, 495000);
        Product products2p4 = productcatalog.newProduct("Photocopier 922 ", 430000, 890000, 550000);
        Product products2p5 = productcatalog.newProduct("Low toner Scanner  102", 195000, 500100, 365102);
        Product products2p6 = productcatalog.newProduct("Speedy color Scanner 611", 900000, 125000, 1650000);
        Product products2p7 = productcatalog.newProduct("Premier Printer 300", 322000, 470000, 736500);
        Product products2p8 = productcatalog.newProduct("Color Photocopier 500", 350000, 580000, 780000);
        // products2p1.

// Create Persons
        PersonDirectory persondirectory = business.getPersonDirectory();
// person representing sales organization        
        Person xeroxsalesperson001 = persondirectory.newPerson("Xerox sales");
        Person xeroxsalesperson002 = persondirectory.newPerson("Xerox sales2");
        Person xeroxsalesperson003 = persondirectory.newPerson("Xerox sales3");
        Person xeroxsalesperson004 = persondirectory.newPerson("Xerox sales4");
        Person xeroxsalesperson005 = persondirectory.newPerson("Xerox sales5");
        
        Person xeroxmarketingperson001 = persondirectory.newPerson("Xerox marketing");
        Person xeroxadminperson001 = persondirectory.newPerson("Xerox admin");

// Create person objects to represent customer organizations. 
        Person person005 = persondirectory.newPerson("Dell");
        Person person006 = persondirectory.newPerson("Microsoft");
        Person person007 = persondirectory.newPerson("Google");
        Person person008 = persondirectory.newPerson("JP Morgan");
        Person person009 = persondirectory.newPerson("State street"); //we use this as customer

// Create Customers
        CustomerDirectory customedirectory = business.getCustomerDirectory();
        CustomerProfile customerprofile1 = customedirectory.newCustomerProfile(person005);
        CustomerProfile customerprofile2 = customedirectory.newCustomerProfile(person006);
        CustomerProfile customerprofile3 = customedirectory.newCustomerProfile(person007);
        CustomerProfile customerprofile4 = customedirectory.newCustomerProfile(person008);
        CustomerProfile customerprofile5 = customedirectory.newCustomerProfile(person009);

// Create Sales people
        SalesPersonDirectory salespersondirectory = business.getSalesPersonDirectory();
        SalesPersonProfile salespersonprofile = salespersondirectory.newSalesPersonProfile(xeroxsalesperson001, "Libby");
        SalesPersonProfile salespersonprofile2 = salespersondirectory.newSalesPersonProfile(xeroxsalesperson002, "William");
        SalesPersonProfile salespersonprofile3 = salespersondirectory.newSalesPersonProfile(xeroxsalesperson003, "Mike");
        SalesPersonProfile salespersonprofile4 = salespersondirectory.newSalesPersonProfile(xeroxsalesperson004, "Amy");
        SalesPersonProfile salespersonprofile5 = salespersondirectory.newSalesPersonProfile(xeroxsalesperson005, "John");
        
        Map<Integer, Double> commissionRateThresholds = new HashMap<>();
        commissionRateThresholds.put(100000, 0.05); // Commission rate is 5% if total sales exceed $10,0000
        commissionRateThresholds.put(500000, 0.1);  // Commission rate is 10% if total sales exceed $50,0000
        
        salespersonprofile.setAdvance(5000);
        salespersonprofile2.setAdvance(5000);
        for(SalesPersonProfile spp : salespersondirectory.getSalespersonlist()){
            spp.setCommissionRateThresholds(commissionRateThresholds);
        }
       

// Create Marketing people
        MarketingPersonDirectory marketingpersondirectory = business.getMarketingPersonDirectory();
        MarketingPersonProfile marketingpersonprofile0 = marketingpersondirectory.newMarketingPersonProfile(xeroxmarketingperson001);

// Create Admins to manage the business
        //       EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
        //       EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(xeroxadminperson001);
// Create User accounts that link to specific profiles
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        UserAccount ua1 = uadirectory.newUserAccount(salespersonprofile, "Libby", "00000"); /// order products for one of the customers and performed by a sales person
        UserAccount ua2 = uadirectory.newUserAccount(salespersonprofile2, "William", "11111");
        UserAccount ua3 = uadirectory.newUserAccount(salespersonprofile3, "Mike", "22222");
        UserAccount ua4 = uadirectory.newUserAccount(salespersonprofile4, "Amy", "33333");
        UserAccount ua5 = uadirectory.newUserAccount(salespersonprofile5, "John", "44444");
        
        UserAccount ua6 = uadirectory.newUserAccount(marketingpersonprofile0, "Marketing", "XXXX"); /// order products for one of the customers and performed by a sales person
        //       UserAccount ua3 = uadirectory.newUserAccount(employeeprofile0, "Admin", "XXXX"); /// order products for one of the customers and performed by a sales person

// Process Orders on behalf of sales person and customer
// 這兩單只是單純為了讓模型裡有product的分析數據，所以沒有跟任何sales person連結
        MasterOrderList masterorderlist = business.getMasterOrderList();
        Order order1 = masterorderlist.newOrder(customerprofile4);
        order1.setDate("2023/05/01");
        OrderItem oi1 = order1.newOrderItem(products1p1, 18000, 1);
        OrderItem oi2 = order1.newOrderItem(products1p2, 19500, 4);
        OrderItem oi3 = order1.newOrderItem(products1p3, 36500, 10);
        OrderItem oi4 = order1.newOrderItem(products1p4, 50000, 1);
        OrderItem oi5 = order1.newOrderItem(products1p5, 25000, 3);
        OrderItem oi6 = order1.newOrderItem(products1p6, 105000, 2);
        OrderItem oi7 = order1.newOrderItem(products1p7, 36500, 3);
        OrderItem oi8 = order1.newOrderItem(products1p8, 50000, 2);
        for(OrderItem oi : order1.getOrderitems()){
            oi.getSelectedProduct().getOrderitems().add(oi);
        }

        Order order2 = masterorderlist.newOrder(customerprofile4);
        order2.setDate("2023/06/01");
        OrderItem oi112 = order2.newOrderItem(products1p1, 17000, 1);
        OrderItem oi12 = order2.newOrderItem(products1p2, 9500, 4);
        OrderItem oi13 = order2.newOrderItem(products1p3, 29500, 10);
        OrderItem oi14 = order2.newOrderItem(products1p4, 30000, 1);
        OrderItem oi15 = order2.newOrderItem(products1p5, 2000, 3);
        OrderItem oi16 = order2.newOrderItem(products1p6, 95000, 2);
        OrderItem oi17 = order2.newOrderItem(products1p7, 26500, 3);
        OrderItem oi18 = order2.newOrderItem(products1p8, 40000, 2);
        for(OrderItem oi : order2.getOrderitems()){
            oi.getSelectedProduct().getOrderitems().add(oi);
        }

        return business;

    }

}
