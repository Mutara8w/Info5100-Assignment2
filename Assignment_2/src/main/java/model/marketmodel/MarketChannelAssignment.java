package model.marketmodel;

import model.solutionorders.SolutionOrder;
import java.util.ArrayList;

public class MarketChannelAssignment {

    Market market;
    Channel channel;
    int adbudget;
    ArrayList<SolutionOffer> solutionofferlist;
    ArrayList<SolutionOrder> solutionorderlist;

    public MarketChannelAssignment(Market m, Channel c) {
        market = m;
        channel = c;
        solutionofferlist = new ArrayList();
        solutionorderlist = new ArrayList();
    }
    
    public void addSolutionOffer(SolutionOffer soffer){
        solutionofferlist.add(soffer);
    }    
    
    public void addSolutionOrder(SolutionOrder so){
        solutionorderlist.add(so);
    }
    
    public int getRevenues(){
        int sum = 0;
        for(SolutionOrder so: solutionorderlist){
            sum = sum + so.getSolutionPrice();
        }
        return sum;
    }
    
    public boolean matches(Market m, Channel c) {
        if (market == m && channel == c) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isMarketMatch(Market m) {
        if (market == m) {
            return true;
        }
        return false;
    }
    
    
    public boolean isChannelMatch(Channel c) {
        if (channel == c) {
            return true;
        }
        return false;
    }

    public Market getMarket() {
        return market;
    }

    public Channel getChannel() {
        return channel;
    }

}
