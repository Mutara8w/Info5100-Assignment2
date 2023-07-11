package model.supplier;

import java.util.ArrayList;
import model.productmgnt.ProductCatalog;
import model.productmgnt.ProductSummary;
import model.productmgnt.ProductsReport;

public class Supplier {
    
    String name;
    ProductCatalog productcatalog;
    ProductsReport productsreport;
    
    public Supplier(String n){
        name = n;
        productcatalog = new ProductCatalog("software");  
    }
    
    public ProductsReport prepareProductsReport(){
        productsreport = productcatalog.generatProductPerformanceReport();
        return productsreport;
    }
    
    public ArrayList<ProductSummary> getProductsAlwaysAboveTarget(){  
        if(productsreport==null) productsreport = prepareProductsReport();
       return productsreport.getProductsAlwaysAboveTarget();
    }
    
    public String getName(){
        return name;
    }
    
    public ProductCatalog getProductCatalog(){
        return productcatalog;
    }
    
    //add supplier product ..
    //update supplier product ...
    
    @Override
    public String toString(){
       return name;  
   }
}
