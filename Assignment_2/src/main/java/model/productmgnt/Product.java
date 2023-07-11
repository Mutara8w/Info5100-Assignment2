package model.productmgnt;

import java.util.ArrayList;
import model.ordermgnt.OrderItem;

public class Product {
    
    private String name;
    private int floorPrice;
    private int ceilingPrice;
    private int targetPrice;
    private boolean promotion; // is there a promotion?
    private double promotionCommissionRate; // the commission rate during promotion
    ArrayList<OrderItem> orderitems;
    
    public Product(int fp, int cp, int tp) {
        floorPrice = fp;
        ceilingPrice = cp;
        targetPrice = tp;
        orderitems = new ArrayList();
    }
        
    public Product(String n, int fp, int cp, int tp) {
        name = n;
        floorPrice = fp;
        ceilingPrice = cp;
        targetPrice = tp;
        orderitems = new ArrayList();
    }
    
    public Product updateProduct(int fp, int cp, int tp) {
        floorPrice = fp;
        ceilingPrice = cp;
        targetPrice = tp;
        return this; //returns itself
    }
    
    public int getTargetPrice(){
        return targetPrice;
    }
    
    public void addOrderItem(OrderItem oi){     
        orderitems.add(oi);
    }
    
    //Number of item sales above target 
    public int getNumberOfProductSalesAboveTarget(){
        int sum = 0;
        for (OrderItem oi: orderitems){
            if(oi.isActualAboveTarget() == true) sum = sum +1;
        }
        return sum;
    }
    
    //Number of item sales below target 
    public int getNumberOfProductSalesBelowTarget(){
        int sum = 0;
        for (OrderItem oi: orderitems){
            if(oi.isActualBelowTarget() == true) sum = sum +1;
        }
        return sum;
    }    
    
    public boolean isProductAlwaysAboveTarget(){
        for (OrderItem oi: orderitems){
            if(oi.isActualAboveTarget() == false) return false;
        }
        return true;
    }
    
    public int getOrderPricePerformance() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            sum = sum + oi.calculatePricePerformance(); //positive and negative values       
        }
        return sum;
    }
    
    public int getSalesVolume() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            sum = sum + oi.getOrderItemTotal();       
        }
        return sum;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public int getFloorPrice(){
        return floorPrice;
    }
    
    public int getCeilingPrice(){
        return ceilingPrice;
    }
    
    public ArrayList<OrderItem> getOrderitems(){
        return orderitems;
    }
    
    public boolean isPromotion() {
        return promotion;
    }

    public void setPromotion(boolean promotion) {
        this.promotion = promotion;
    }

    public double getPromotionCommissionRate() {
        return promotionCommissionRate;
    }

    public void setPromotionCommissionRate(double promotionCommissionRate) {
        this.promotionCommissionRate = promotionCommissionRate;
    }
    
    @Override
    public String toString(){
        return name;
    }

}
