package model.marketingmgnt;

import java.util.ArrayList;
import model.ordermgnt.Order;
import model.personnel.Person;
import model.personnel.Profile;

public class MarketingPersonProfile extends Profile {
    
    Person person;
    ArrayList<Order> salesorders;

    public MarketingPersonProfile(Person p) {
        super(p);
        person = p;
        salesorders = new ArrayList();
    }
    
    public void addSalesOrder(Order o){
        salesorders.add(o);
    }
    
    @Override
    public String getRole(){
        return "Marketing";
    }
}
