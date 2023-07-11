package model.customermgnt;

import java.util.ArrayList;

public class CustomersReport {
    
    ArrayList<CustomerSummary> customerSummaries;
    
    public CustomersReport(){
        customerSummaries = new ArrayList();
    }
    
    public void addCustomerSummary(CustomerSummary cs){
        customerSummaries.add(cs);
    }
}
