package model.marketmodel;

import java.util.ArrayList;

public class MarketCatalog {

    ArrayList<Market> markets;

    public MarketCatalog() {
        markets = new ArrayList();
    }

    public Market newMarket(String m) {
        Market market = new Market(m);
        markets.add(market);
        return market;
    }

}
