package model.marketmodel;

import java.util.ArrayList;

public class MarketChannelComboCatalog {
    
    ArrayList<MarketChannelAssignment> mcalist ;
    
   public MarketChannelComboCatalog() { 
       mcalist = new ArrayList();
   }
   
   public MarketChannelAssignment newMarketChannelCombo(Market m, Channel c){
       MarketChannelAssignment mcc = new MarketChannelAssignment(m, c);
       mcalist.add(mcc);
       return mcc;
   }
   
   public MarketChannelAssignment finMarketChannelCombo(Market m, Channel c){ 
       for( MarketChannelAssignment mca: mcalist){
           if(mca.matches(m,c)) return mca;
       }
       return null; 
   }
}
