package model.marketmodel;

import java.util.ArrayList;

public class SolutionOfferCatalog {

    ArrayList<SolutionOffer> solutionoffers;

    public SolutionOfferCatalog() {
        solutionoffers = new ArrayList();
    }
    
    public SolutionOffer newSolutionOffer(MarketChannelAssignment mca){
        SolutionOffer so = new SolutionOffer(mca);
        solutionoffers.add(so);
        return so;
    }
    
    //Get all solution offers that match the m/c combination
    public ArrayList<SolutionOffer> findSolutionsForMarketChannelCombo(MarketChannelAssignment mcc) {
        ArrayList<SolutionOffer> foundsolutions = new ArrayList();
        for (SolutionOffer so : solutionoffers) {
            if (so.isSolutionOfferMatchMarketChannel(mcc) == true) {
                foundsolutions.add(so);
            }
            //find all solution offers available in the market/channel combin
        }
        return foundsolutions;
    }

}
