package model.ordermgnt;

import java.util.ArrayList;
import java.util.Arrays;
import model.customermgnt.CustomerProfile;
import model.marketmodel.MarketChannelAssignment;
import model.productmgnt.Product;
import model.salesmgnt.SalesPersonProfile;

public class Order {

    ArrayList<OrderItem> orderitems;
    CustomerProfile customer;
    SalesPersonProfile salesperson;
    MarketChannelAssignment mca;
    String status;
    String date = "N/A";
    double commissionForThisOrder = 0.0; //Only when the order is submitted will this value be assigned
    
    public Order(CustomerProfile cp) {
        orderitems = new ArrayList();
        customer = cp;
        customer.addCustomerOrder(this); //Link the order to the customer
        salesperson = null;
        status = "In Process";
    }
    
    public Order(CustomerProfile cp, SalesPersonProfile ep) {
        orderitems = new ArrayList();
        customer = cp;
        salesperson = ep;
        status = "In Process";
        customer.addCustomerOrder(this); //Link the order to the customer
        salesperson.addSalesOrder(this); //Link the order to the sales person
    }
    
    public OrderItem newOrderItem(Product p, int actualprice, int q) {
        OrderItem oi = new OrderItem(p, actualprice, q);
        orderitems.add(oi);
        return oi;
    }
    
    public int getOrderTotal() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            sum = sum + oi.getOrderItemTotal();
        }
        return sum;
    }
    
    public int getOrderTotalTargetPrice(){
        int sum = 0;
        for(OrderItem oi : orderitems){
            sum = sum + (oi.getSelectedProduct().getTargetPrice())*(oi.getQuantity());
        }
        return sum;
    }

    public int getOrderPricePerformance() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            sum = sum + oi.calculatePricePerformance(); //positive or negative       
        }
        return sum;
    }

    public int getNumberOfOrderItemsAboveTarget() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            if (oi.isActualAboveTarget() == true) {
                sum = sum + 1;
            }
        }
        return sum;
    }
    
    //Sum all the items' target
    //Compare it to the total of the order 
    public boolean isOrderAboveTotalTarget(){
        int sum = 0;
        for (OrderItem oi: orderitems){
            sum = sum + oi.getOrderItemTargetTotal();
        }
        if(getOrderTotal() > sum) {return true;}
        else {return false;}
    }
    
    public void CancelOrder(){
        status = "Cancelled";
        for(OrderItem oi : orderitems){
            oi.getSelectedProduct().getOrderitems().remove(oi);
        }
    }
    
    public void Submit(String orderDate, double commission, double sales, double commissionForThisOrder){
        status = "Submitted";
        date = orderDate;
        salesperson.updateCommission(commission);
        salesperson.addSales(sales);
        this.commissionForThisOrder = commissionForThisOrder;
        for(OrderItem oi : orderitems){
            oi.getSelectedProduct().getOrderitems().add(oi);
        }
    }
    
    
    public String getMonth(){
        String segments[] = date.split("/");
        String document = segments[segments.length-2];
        if(document.equals("01")){
            return "January";
        }
        if(document.equals("02")){
            return "Febuary";
        }
        if(document.equals("03")){
            return "March";
        }
        if(document.equals("04")){
            return "April";
        }
        if(document.equals("05")){
            return "May";
        }
        if(document.equals("06")){
            return "June";
        }

        return null;
    }
    
    public String getDate(){
        return date;
    }
    
    public void setDate(String date){
        this.date = date;
    }
    
    public ArrayList<OrderItem> getOrderitems(){
        return orderitems;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
