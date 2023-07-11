package model.productmgnt;

import java.util.ArrayList;

public class ProductCatalog {

    String type;
    ArrayList<Product> products;

    public ProductCatalog(String n) {
        type = n;
        products = new ArrayList();
    }
    
    public ProductCatalog() {
        type = "unknown";
        products = new ArrayList();
    }
    
    public Product newProduct(int fp, int cp, int tp) {
        Product p = new Product(fp, cp, tp);
        products.add(p);
        return p;
    }
    
    public Product newProduct(String n, int fp, int cp, int tp) {
        Product p = new Product(n,fp, cp, tp);
        products.add(p);
        return p;
    }

    public ProductsReport generatProductPerformanceReport() {
        ProductsReport productsreport = new ProductsReport();
        for (Product p : products) {
            ProductSummary ps = new ProductSummary(p);
            productsreport.addProductSummary(ps);
        }
        return productsreport;
    }

    public ArrayList<Product> getProductList(){
        return products;
    }

}
