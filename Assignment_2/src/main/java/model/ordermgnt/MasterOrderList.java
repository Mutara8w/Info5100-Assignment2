package model.ordermgnt;

import java.util.ArrayList;
import model.customermgnt.CustomerProfile;
import model.marketingmgnt.MarketingPersonProfile;
import model.salesmgnt.SalesPersonProfile;

public class MasterOrderList {
    
    ArrayList<Order> orders;
    MasterOrderReport masterorderreport;
    
    public MasterOrderList(){
        orders = new ArrayList();
    }
    
    public Order newOrder(CustomerProfile cp){
        Order o= new Order(cp);
        orders.add(o);
        return o;
    }
    
    public Order newOrder(CustomerProfile cp, SalesPersonProfile spp){
        Order o= new Order(cp, spp);
        orders.add(o);
        return o;
    }
    
    public MasterOrderReport generateMasterOrderReport(){
        masterorderreport = new MasterOrderReport();
        return masterorderreport;  
    }

    public int getSalesVolume(){
        int sum = 0;
        for(Order order: orders){
            sum = sum + order.getOrderTotal();
        }
        return sum;
    }

}
