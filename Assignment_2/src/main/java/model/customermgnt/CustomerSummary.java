package model.customermgnt;

import model.ordermgnt.Order;

/**
 *
 * @author kal bugrara
 */
public class CustomerSummary {
    
    CustomerProfile customerProfile;
    int ordertotal;
    
    public CustomerSummary(CustomerProfile customerProfile){
        this.customerProfile = customerProfile;
    }
    
    
}
