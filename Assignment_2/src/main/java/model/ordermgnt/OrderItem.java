package model.ordermgnt;

import model.productmgnt.Product;

public class OrderItem {
    
    Product selectedproduct;   
    int actualPrice;
    int quantity;

    public OrderItem(Product p, int paidprice, int q) {
        selectedproduct = p;
        quantity = q;
        actualPrice = paidprice;
    }

    public int getOrderItemTotal() {
        return actualPrice * quantity;
    }

    //Calculate what the price gain would have been if products were sold at target price
    public int getOrderItemTargetTotal() {
        return selectedproduct.getTargetPrice() * quantity;
    }

    //Returns positive if seller is making higher margin than target
    //Returns negative if seller is making lower margin than target
    //Otherwise zero meaning neutral
    public int calculatePricePerformance() {
        return (actualPrice - selectedproduct.getTargetPrice()) * quantity;
    }

    public boolean isActualAboveTarget() {
        if (actualPrice > selectedproduct.getTargetPrice()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isActualBelowTarget() {
        if (actualPrice < selectedproduct.getTargetPrice()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isActualATTarget() {
        if (actualPrice == selectedproduct.getTargetPrice()) {
            return true;
        } else {
            return false;
        }
    }

    public Product getSelectedProduct() {
        return selectedproduct;
    }

    public int getActualPrice() {
        return actualPrice;
    }

    public int getQuantity() {
        return quantity;
    }
    
    @Override
    public String toString(){
        return selectedproduct.getName();
    }
    
}
