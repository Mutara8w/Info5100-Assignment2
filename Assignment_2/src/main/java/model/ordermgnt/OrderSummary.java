package model.ordermgnt;

public class OrderSummary {
    
    Order subjectorder;
    int salesvolume;
    boolean totalabovetarget;
    int orderpriceperformance;
    int numberofOrderitemsabovetarget;
    int numberofOrdeitemsbelowtarget;
    
    public OrderSummary(Order o){
        subjectorder = o;
        salesvolume = o.getOrderTotal();
        totalabovetarget = o.isOrderAboveTotalTarget();
        orderpriceperformance = o.getOrderPricePerformance();
        numberofOrderitemsabovetarget = o.getNumberOfOrderItemsAboveTarget();
        //numberofOrdeitemsbelowtarget = o.getNumberOfOrderItemsBelowTarget();
    }

    public Order getSubjectOrder(){
        return subjectorder;
    }

    public int getOrderProfit(){
        return orderpriceperformance;
    }

}
