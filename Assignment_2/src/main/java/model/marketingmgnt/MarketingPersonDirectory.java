package model.marketingmgnt;

import model.business.Business;
import java.util.ArrayList;
import model.personnel.Person;

public class MarketingPersonDirectory {

    Business business;
    ArrayList<MarketingPersonProfile> marketingpersonlist;

    public MarketingPersonDirectory(Business b) {
        business = b;
        marketingpersonlist = new ArrayList();
    }

    public MarketingPersonProfile newMarketingPersonProfile(Person p) {
        MarketingPersonProfile sp = new MarketingPersonProfile(p);
        marketingpersonlist.add(sp);
        return sp;
    }

    public MarketingPersonProfile findMarketingPerson(String id) {
        for (MarketingPersonProfile sp : marketingpersonlist) {
            if (sp.isMatch(id)) {
                return sp;
            }
        }
        return null;
    }
}
