package model.customermgnt;

import model.business.Business;
import model.personnel.Person;
import java.util.ArrayList;

public class CustomerDirectory {

    Business business;
    ArrayList<CustomerProfile> customerlist;

    public CustomerDirectory(Business b) {
        business = b;
        customerlist = new ArrayList();
    }

    public CustomerProfile newCustomerProfile(Person p) {
        CustomerProfile sp = new CustomerProfile(p);
        customerlist.add(sp);
        return sp;
    }

    public CustomerProfile findCustomer(String id) {
        for (CustomerProfile sp : customerlist) {
            if (sp.isMatch(id)) {
                return sp;
            }
        }
        return null;
    }
        
    public CustomersReport generatCustomerPerformanceReport(){
        CustomersReport customersreport = new CustomersReport();
        for(CustomerProfile cp: customerlist){    
            CustomerSummary cs = new CustomerSummary(cp);
            customersreport.addCustomerSummary(cs);
        }
        return customersreport; 
    } 
}
