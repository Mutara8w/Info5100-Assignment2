package model.personnel;


import model.business.Business;
import java.util.ArrayList;

public class EmployeeDirectory {

    Business business;
    ArrayList<EmployeeProfile> employeelist;

    public EmployeeDirectory(Business d) {
        business = d;
        employeelist = new ArrayList();
    }

    public EmployeeProfile newEmployeeProfile(Person p) {
        EmployeeProfile sp = new EmployeeProfile(p);
        employeelist.add(sp);
        return sp;
    }

    public EmployeeProfile findEmployee(String id) {
        for (EmployeeProfile sp : employeelist) {
            if (sp.isMatch(id)) {
                return sp;
            }
        }
        return null; 
    }
    
}
