package model.marketmodel;

import java.util.ArrayList;

public class ChannelCatalog {
    
    ArrayList<Channel> channellist;
    
    public ChannelCatalog(){
        channellist = new ArrayList();
    }
    
    public Channel newChannel(String type){
        Channel c = new Channel(type);
        channellist.add(c);
        return c;
    }
    
    public Channel findChannel(String type){
        for( Channel c: channellist ){
            if (c.getChannelType().equalsIgnoreCase(type)) return c;
        }
        return null;
    }  
}
