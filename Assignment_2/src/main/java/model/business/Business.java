package model.business;

import model.marketingmgnt.MarketingPersonDirectory;
import java.util.ArrayList;
import model.customermgnt.CustomerDirectory;
import model.marketmodel.ChannelCatalog;
import model.marketmodel.MarketCatalog;
import model.marketmodel.MarketChannelComboCatalog;
import model.marketmodel.SolutionOfferCatalog;
import model.ordermgnt.MasterOrderList;
import model.personnel.PersonDirectory;
import model.productmgnt.ProductSummary;
import model.productmgnt.ProductsReport;
import model.salesmgnt.SalesPersonDirectory;
import model.solutionorders.MasterSolutionOrderList;
import model.supplier.Supplier;
import model.supplier.SupplierDirectory;
import model.useraccountmgnt.UserAccountDirectory;

public class Business {

    String name;
    PersonDirectory persondirectory;
    MasterOrderList masterorderlist;
    SupplierDirectory suppliers;
    MarketCatalog marketcatalog;
    ChannelCatalog channelcatalog;
    MarketChannelComboCatalog marketChannelComboCatalog;
    SolutionOfferCatalog solutionoffercatalog;
    CustomerDirectory customerdirectory;
    SalesPersonDirectory salespersondirectory;
    UserAccountDirectory useraccountdirectory;
    MarketingPersonDirectory marketingpersondirectory;
    MasterSolutionOrderList mastersolutionorderlist;
    //EmployeeDirectory employeedirectory;

    public Business(String n) {
        name = n;
        masterorderlist = new MasterOrderList();
        suppliers = new SupplierDirectory();
        persondirectory = new PersonDirectory();
        customerdirectory = new CustomerDirectory(this);
        salespersondirectory = new SalesPersonDirectory(this);
        useraccountdirectory = new UserAccountDirectory();
        marketingpersondirectory = new MarketingPersonDirectory(this);
        marketcatalog = new MarketCatalog();
        channelcatalog = new ChannelCatalog();
        marketChannelComboCatalog = new MarketChannelComboCatalog();
        //MarketChannelAssignment mca2 = marketChannelComboCatalog.newMarketChannelCombo(market, c);
        solutionoffercatalog = new SolutionOfferCatalog();
        mastersolutionorderlist  = new MasterSolutionOrderList();
    }
    
    // 輸入Supplier ID就能產生該Supplier的Performance Report
    public ProductsReport getSupplierPerformanceReport(String n) {
        Supplier supplier = suppliers.findSupplier(n);
        if (supplier == null) {
            return null;
        }
        return supplier.prepareProductsReport();
    }

    // 輸入Supplier ID就能找出該Supplier所有高於目標價格的Product Summary
    public ArrayList<ProductSummary> getSupplierProductsAlwaysAboveTarget(String n) {
        ProductsReport productsreport = getSupplierPerformanceReport(n);
        return productsreport.getProductsAlwaysAboveTarget();
    }

    // 輸入Supplier ID就能找出該Supplier高於目標價格的Product有幾個
    public int getHowManySupplierProductsAlwaysAboveTarget(String n) {
        ProductsReport productsreport = getSupplierPerformanceReport(n);
        int i = productsreport.getProductsAlwaysAboveTarget().size();
        return i;
    }
  
    public int getSalesVolume() {
        return masterorderlist.getSalesVolume();
    }

    public PersonDirectory getPersonDirectory() {
        return persondirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return useraccountdirectory;
    }

    public MarketingPersonDirectory getMarketingPersonDirectory() {
        return marketingpersondirectory;
    }

    public SupplierDirectory getSupplierDirectory() {
        return suppliers;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerdirectory;
    }

    public SalesPersonDirectory getSalesPersonDirectory() {
        return salespersondirectory;
    }

    public MasterOrderList getMasterOrderList() {
        return masterorderlist;
    }

    public MarketCatalog getMarketCatalog() {
        return marketcatalog;
    }

    public ChannelCatalog getChannelCatalog() {
        return channelcatalog;
    }
    public SolutionOfferCatalog getSolutionOfferCatalog(){
        return solutionoffercatalog;
    }
    public MarketChannelComboCatalog getMarketChannelComboCatalog() {

        return marketChannelComboCatalog;
    }
    public MasterSolutionOrderList getMasterSolutionOrderList(){
        return mastersolutionorderlist;
    }
}
