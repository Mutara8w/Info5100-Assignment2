package model.productmgnt;

public class ProductSummary {

    Product subjectproduct;
    int numberofsalesabovetarget;
    int numberofsalesbelowtarget;
    int productpriceperformance; //total profit above target
    int acutalsalesvolume;
    int rank; //will be done later

    public ProductSummary(Product p) {
        subjectproduct = p;
        numberofsalesabovetarget = p.getNumberOfProductSalesAboveTarget();
        productpriceperformance = p.getOrderPricePerformance();
        acutalsalesvolume = p.getSalesVolume();
        numberofsalesbelowtarget = p.getNumberOfProductSalesBelowTarget();
    }

    public int getSalesRevenues() {
        return acutalsalesvolume;
    }

    public int getNumberAboveTarget() {
        return numberofsalesabovetarget;
    }

    public int getProductPricePerformance() {
        return productpriceperformance;
    }

    public int getNumberBelowTarget() {
        return numberofsalesbelowtarget;
    }

    public boolean isProductAlwaysAboveTarget() {
        return false; // to be implemented
    }
}
