package model.ordermgnt;

import java.util.ArrayList;

public class MasterOrderReport {
    
    ArrayList<OrderSummary> ordersummarylist;
    
    public MasterOrderReport(){
        ordersummarylist = new ArrayList();
    }
    
    public void generateOrderReport(ArrayList<Order> orders){
        ArrayList<Order> orderlist = orders;
        OrderSummary ordersummary;
        for(Order order: orderlist){
            ordersummary = new OrderSummary(order);
            ordersummarylist.add(ordersummary);
        }         
    }
    
    public OrderSummary getTopProfitableOrder(){
        OrderSummary currenttoporder = null;
        for (OrderSummary os : ordersummarylist){
            if(currenttoporder == null)currenttoporder= os; 
            else 
                if(os.getOrderProfit()> currenttoporder.getOrderProfit()){
                currenttoporder = os;
            }
        }
        return currenttoporder;
    }
}

