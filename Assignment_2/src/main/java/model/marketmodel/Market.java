package model.marketmodel;

import java.util.ArrayList;

public class Market {

    String name;
    ArrayList<Channel> validchannels;
    ArrayList<String> characteristics; //A way to describe in plain language what is that group
    ArrayList<Market> submarkets;
    int size;

    public Market(String m) {
        name = m;
        characteristics = new ArrayList();
        submarkets = new ArrayList();
        validchannels = new ArrayList();
    }

    public void addCharactersitic(String c) {
        characteristics.add(c);
    }

    public void addValidChannel(Channel c) {
        validchannels.add(c);
    }
}
