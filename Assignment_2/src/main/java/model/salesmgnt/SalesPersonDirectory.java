package model.salesmgnt;

import model.business.Business;
import java.util.ArrayList;
import java.util.HashMap;
import model.personnel.Person;

public class SalesPersonDirectory {

    Business business;
    ArrayList<SalesPersonProfile> salespersonlist;
    HashMap<SalesPersonProfile, Integer> rankRecord = new HashMap<SalesPersonProfile, Integer>();

    public SalesPersonDirectory(Business d) {
        business = d;
        salespersonlist = new ArrayList();
    }

    public SalesPersonProfile newSalesPersonProfile(Person p, String name) {
        SalesPersonProfile sp = new SalesPersonProfile(p, name);
        salespersonlist.add(sp);
        return sp;
    }

    public SalesPersonProfile findSalesPerson(String id) {
        for (SalesPersonProfile sp : salespersonlist) {
            if (sp.isMatch(id)) {
                return sp;
            }
        }
        return null;
    }
    
    public void populateRankRecord(){
        rankRecord.clear();
        for(SalesPersonProfile spp : salespersonlist){
            int rank = getRank(spp);
            rankRecord.put(spp, rank);
        }
    }
    
    public int getRank(SalesPersonProfile spp){
        int rankCount = 1;
        for(SalesPersonProfile sp : salespersonlist){
            if(sp.getCurrentSales() > spp.getCurrentSales()){
                rankCount = rankCount + 1;
            }
        }
        return rankCount;
    }
    
    public int getRankForSalesPerson(SalesPersonProfile spp){
        for(SalesPersonProfile sp : rankRecord.keySet()){
            if(sp.getName().equals(spp.getName())){
                return rankRecord.get(sp);
            }
        }
        return 0;
    }
    
    public ArrayList<SalesPersonProfile> getSalespersonlist(){
        return salespersonlist;
    }
    
    public HashMap<SalesPersonProfile, Integer> getRankRecord(){
        return rankRecord;
    }

}
