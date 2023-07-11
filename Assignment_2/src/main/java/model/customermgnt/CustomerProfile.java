package model.customermgnt;

import java.util.ArrayList;
import model.marketmodel.Market;
import model.ordermgnt.Order;
import model.personnel.Person;
import model.personnel.Profile;

public class CustomerProfile extends Profile {

    ArrayList<Order> orders;
    ArrayList<Market> markets;
    Person person;

    public CustomerProfile(Person p) {
        super(p);
        person = p;
        orders = new ArrayList();
    }
    
    // For each order in the customer order list
    // Calculate the order price performance and add it to the sum
    public int getTotalPricePerformance() {
        int sum = 0;
        for(Order o : orders){
            sum = sum + o.getOrderPricePerformance();
        }
        return sum;
    }

    //For each order in the customer order list 
    //Calculate if the order is positive
    //If yes then add 1 
    public int getNumberOfOrdersAboveToTalTarget() {
        int sum = 0;
        for (Order o : orders) {
            if (o.isOrderAboveTotalTarget() == true) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    //For each order in the customer order list 
    //Calculate if order is negative
    //If yes then add 1
    public int getNumberOfOrdersBelowTotalTarget() {
        int sum = 0;
        for (Order o : orders) {
            if (o.isOrderAboveTotalTarget() == false) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    public boolean isMatch(String id) {
        if(person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public void addCustomerOrder(Order o) {
        orders.add(o);
    }

    public String getCustomerId() {
        return person.getPersonId();
    }

    public Person getPerson() {
        return person;
    }
    
    @Override
    public String getRole(){
        return "Sales";
    }
    
    @Override
    public String toString() {
        return person.getPersonId();
    }
}
