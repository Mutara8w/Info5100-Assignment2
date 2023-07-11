/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.business.Business;
import model.customermgnt.CustomerDirectory;
import model.customermgnt.CustomerProfile;
import model.marketingmgnt.MarketingPersonDirectory;
import model.marketingmgnt.MarketingPersonProfile;
import model.marketmodel.Channel;
import model.marketmodel.ChannelCatalog;
import model.marketmodel.Market;
import model.marketmodel.MarketCatalog;
import model.marketmodel.MarketChannelAssignment;
import model.marketmodel.MarketChannelComboCatalog;
import model.marketmodel.SolutionOffer;
import model.marketmodel.SolutionOfferCatalog;
import model.ordermgnt.MasterOrderList;
import model.ordermgnt.Order;
import model.ordermgnt.OrderItem;
import model.personnel.Person;
import model.personnel.PersonDirectory;
import model.productmgnt.Product;
import model.productmgnt.ProductCatalog;
import model.productmgnt.ProductSummary;
import model.salesmgnt.SalesPersonDirectory;
import model.salesmgnt.SalesPersonProfile;
import model.solutionorders.MasterSolutionOrderList;
import model.solutionorders.SolutionOrder;
import model.supplier.Supplier;
import model.supplier.SupplierDirectory;
import model.useraccountmgnt.UserAccount;
import model.useraccountmgnt.UserAccountDirectory;

class ConfigureABusiness {

    static Business initialize() {
        Business business = new Business("Xerox");

// Create Persons
        PersonDirectory persondirectory = business.getPersonDirectory();
        
        // Create sales person (Business Side)        
        Person xeroxsalesperson001 = persondirectory.newPerson("Xerox sales");
        SalesPersonDirectory salespersondirectory = business.getSalesPersonDirectory();
        SalesPersonProfile salespersonprofile = salespersondirectory.newSalesPersonProfile(xeroxsalesperson001, "Libby");
        
        // Create marketing person (Business Side)   
        Person xeroxmarketingperson001 = persondirectory.newPerson("Xerox marketing");
        MarketingPersonDirectory marketingpersondirectory = business.getMarketingPersonDirectory();
        MarketingPersonProfile marketingpersonprofile0 = marketingpersondirectory.newMarketingPersonProfile(xeroxmarketingperson001);
        
        // Create admin person (Business Side) 
        Person xeroxadminperson001 = persondirectory.newPerson("Xerox admin");
//      EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
//      EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(xeroxadminperson001);

        // Create customer person (Customer Side) 
        Person person005 = persondirectory.newPerson("Dell");
        Person person006 = persondirectory.newPerson("Microsoft");
        Person person007 = persondirectory.newPerson("Google");
        Person person008 = persondirectory.newPerson("JP Morgan");
        Person person009 = persondirectory.newPerson("State street");

        CustomerDirectory customedirectory = business.getCustomerDirectory();
        CustomerProfile customerprofile1 = customedirectory.newCustomerProfile(person005);
        CustomerProfile customerprofile2 = customedirectory.newCustomerProfile(person006);
        CustomerProfile customerprofile3 = customedirectory.newCustomerProfile(person007);
        CustomerProfile customerprofile4 = customedirectory.newCustomerProfile(person008);
        CustomerProfile customerprofile5 = customedirectory.newCustomerProfile(person009);

// Create User accounts
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        UserAccount ua1 = uadirectory.newUserAccount(salespersonprofile, "Sales", "XXXX");
        UserAccount ua2 = uadirectory.newUserAccount(marketingpersonprofile0, "Marketing", "XXXX");
//      UserAccount ua3 = uadirectory.newUserAccount(employeeprofile0, "Admin", "XXXX");
           
// Create Suppliers
        SupplierDirectory suplierdirectory = business.getSupplierDirectory();

        Supplier supplier1 = suplierdirectory.newSupplier("Lenovo");
        ProductCatalog productcatalog = supplier1.getProductCatalog();
        Product products1p1 = productcatalog.newProduct("Scanner 3  1", 2000, 16500, 10000);
        Product products1p2 = productcatalog.newProduct("Scanner 4", 10000, 25000, 16500);
        Product products1p3 = productcatalog.newProduct("Printer 2", 22000, 40000, 36500);
        Product products1p4 = productcatalog.newProduct("Photocopier 2 ", 30000, 70000, 50000);
        Product products1p5 = productcatalog.newProduct("Scanner  5", 19000, 36500, 25000);
        Product products1p6 = productcatalog.newProduct("Scanner 6", 90000, 125000, 105000);
        Product products1p7 = productcatalog.newProduct("Printer 3", 22000, 60000, 36500);
        Product products1p8 = productcatalog.newProduct("Photocopier 3", 30000, 70000, 50000);

        Supplier supplier2 = suplierdirectory.newSupplier("Epson");
        ProductCatalog productcatalog2 = supplier2.getProductCatalog();
        Product products2p1 = productcatalog2.newProduct("Scanner 13  1", 12000, 26000, 18500);
        Product products2p2 = productcatalog2.newProduct("Scanner 14", 90000, 165000, 125000);
        Product products2p3 = productcatalog2.newProduct("Color Printer 112", 422000, 540000, 495000);
        Product products2p4 = productcatalog2.newProduct("Photocopier 922 ", 430000, 890000, 550000);
        Product products2p5 = productcatalog2.newProduct("Low toner Scanner  102", 195000, 500100, 365102);
        Product products2p6 = productcatalog2.newProduct("Speedy color Scanner 611", 900000, 125000, 1650000);
        Product products2p7 = productcatalog2.newProduct("Premier Printer 300", 322000, 470000, 736500);
        Product products2p8 = productcatalog2.newProduct("Color Photocopier 500", 350000, 580000, 780000);

// Create Orders、OrderItems
        MasterOrderList masterorderlist = business.getMasterOrderList();
        Order order1 = masterorderlist.newOrder(customerprofile4, salespersonprofile);
        OrderItem oi1 = order1.newOrderItem(products1p1, 18000, 1);
        OrderItem oi2 = order1.newOrderItem(products1p2, 19500, 4);
        OrderItem oi3 = order1.newOrderItem(products1p3, 36500, 10);
        OrderItem oi4 = order1.newOrderItem(products1p4, 50000, 1);
        OrderItem oi5 = order1.newOrderItem(products1p5, 25000, 3);
        OrderItem oi6 = order1.newOrderItem(products1p6, 105000, 2);
        OrderItem oi7 = order1.newOrderItem(products1p7, 36500, 3);
        OrderItem oi8 = order1.newOrderItem(products1p8, 50000, 2);

        Order order2 = masterorderlist.newOrder(customerprofile4, salespersonprofile);
        OrderItem oi9 = order2.newOrderItem(products1p1, 17000, 1);
        OrderItem oi10 = order2.newOrderItem(products1p2, 9500, 4);
        OrderItem oi11 = order2.newOrderItem(products1p3, 29500, 10);
        OrderItem oi12 = order2.newOrderItem(products1p4, 30000, 1);
        OrderItem oi13 = order2.newOrderItem(products1p5, 2000, 3);
        OrderItem oi14 = order2.newOrderItem(products1p6, 95000, 2);
        OrderItem oi15 = order2.newOrderItem(products1p7, 26500, 3);
        OrderItem oi16 = order2.newOrderItem(products1p8, 40000, 2);

        Order order3 = masterorderlist.newOrder(customerprofile4, salespersonprofile);
        OrderItem oi17 = order3.newOrderItem(products1p1, 19000, 1);
        OrderItem oi18 = order3.newOrderItem(products1p2, 10500, 4);
        OrderItem oi19 = order3.newOrderItem(products1p3, 20500, 10);
        OrderItem oi20 = order3.newOrderItem(products1p4, 40000, 1);
        OrderItem oi21 = order3.newOrderItem(products1p5, 4000, 3);
        OrderItem oi22 = order3.newOrderItem(products1p6, 105000, 2);
        OrderItem oi23 = order3.newOrderItem(products1p7, 36500, 3);
        OrderItem oi24 = order3.newOrderItem(products1p8, 550000, 1);

// Create Product Summary
        ProductSummary ps = new ProductSummary(products1p8);

        System.out.println("Stats==========================");
        System.out.println("Sales Volume:  " + ps.getSalesRevenues());
        System.out.println("Profit Margin:  " + ps.getProductPricePerformance());
        System.out.println("Frequency above target:  " + ps.getNumberAboveTarget());
        System.out.println("Frequency Below:  " + ps.getNumberBelowTarget());

        MarketCatalog mc = business.getMarketCatalog();
        ChannelCatalog cc = business.getChannelCatalog();
        MarketChannelComboCatalog mccc = business.getMarketChannelComboCatalog();

        return business;
    }

//-------------------------------------------------------------------------------------------
//以下為重複的不確定可不可以刪
    static Business initializeMarkets() {
        Business business = new Business("Xerox");

// Create Persons
        PersonDirectory persondirectory = business.getPersonDirectory();
// person representing sales organization        
        Person xeroxsalesperson001 = persondirectory.newPerson("Xerox sales");
        Person xeroxmarketingperson001 = persondirectory.newPerson("Xerox marketing");

// Create Customers
        CustomerDirectory customedirectory = business.getCustomerDirectory();
        CustomerProfile customerprofile1
                = customedirectory.newCustomerProfile(xeroxsalesperson001);

// Create Sales people
        SalesPersonDirectory salespersondirectory = business.getSalesPersonDirectory();
        SalesPersonProfile salespersonprofile = salespersondirectory.newSalesPersonProfile(xeroxsalesperson001, "Libby");

        // Create Marketing people
        MarketingPersonDirectory marketingpersondirectory = business.getMarketingPersonDirectory();
        MarketingPersonProfile marketingpersonprofile0 = marketingpersondirectory.newMarketingPersonProfile(xeroxmarketingperson001);

        SupplierDirectory suplierdirectory = business.getSupplierDirectory();

        Supplier supplier1 = suplierdirectory.newSupplier("Lenovo");
        ProductCatalog productcatalog = supplier1.getProductCatalog();
        Product products1p1 = productcatalog.newProduct("Scanner 3  1", 2000, 16500, 10000);
        Product products1p2 = productcatalog.newProduct("Scanner 4", 10000, 25000, 16500);
        Product products1p3 = productcatalog.newProduct("Printer 2", 22000, 40000, 36500);
        Product products1p4 = productcatalog.newProduct("Photocopier 2 ", 30000, 70000, 50000);
        Product products1p5 = productcatalog.newProduct("Scanner  5", 19000, 36500, 25000);
        Product products1p6 = productcatalog.newProduct("Scanner 6", 90000, 125000, 105000);
        Product products1p7 = productcatalog.newProduct("Printer 3", 22000, 60000, 36500);
        Product products1p8 = productcatalog.newProduct("Photocopier 3", 30000, 70000, 50000);

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

//-------------------------------------------------------------------------------------------
// Define Markets、Solutions、Channels

        // Create Markets
        MarketCatalog mc = business.getMarketCatalog();
        Market teenmarket = mc.newMarket("Teenagers");
        Market teenmarket2 = mc.newMarket("College Grads");

        // Create Channels
        ChannelCatalog channelCatalog = business.getChannelCatalog();
        Channel tvchannel = channelCatalog.newChannel("tv");
        Channel webchannel = channelCatalog.newChannel("web");

        teenmarket.addValidChannel(webchannel);
        teenmarket.addValidChannel(tvchannel);

        // Create MarketChannelAssignment 市場與傳播渠道的組合搭配
        MarketChannelComboCatalog mccc = business.getMarketChannelComboCatalog();
        MarketChannelAssignment tvchannelteenmarket = mccc.newMarketChannelCombo(teenmarket, tvchannel);
        MarketChannelAssignment webchannelteenmarket = mccc.newMarketChannelCombo(teenmarket, webchannel);

        // Create SolutionsOffers 為不同市場、傳播渠道、商品所提供的行銷方案
        SolutionOfferCatalog solutionoffercatalog = business.getSolutionOfferCatalog();
        SolutionOffer solutiontvteen = solutionoffercatalog.newSolutionOffer(tvchannelteenmarket);
        solutiontvteen.addProduct(products2p2);
        solutiontvteen.addProduct(products2p1);
        solutiontvteen.setTotalPrice(1000);

        SolutionOffer solutionwebteen = solutionoffercatalog.newSolutionOffer(webchannelteenmarket);
        solutionwebteen.addProduct(products2p2);
        solutionwebteen.addProduct(products2p1);
        solutionwebteen.setTotalPrice(500);
        
        // Create SolutionOrderList (SolutionOffer , MarketingChannelAssignment)
        MasterSolutionOrderList msol = business.getMasterSolutionOrderList();
        SolutionOrder so = msol.newSolutionOrder(solutiontvteen, tvchannelteenmarket);
        SolutionOrder so2 = msol.newSolutionOrder(solutionwebteen, webchannelteenmarket);
        
        msol.getRevenueByMarketChannelCombo(tvchannelteenmarket);
        msol.getRevenueByChannel(tvchannel);

        return business;
    }
}
