package model.marketmodel;

public class Channel {
    
    String channeltype; //tv, internet, mobile app...
    
    public Channel(String t){
        channeltype = t;
    }
    
    public boolean isMatch(String t){
        if(channeltype.equalsIgnoreCase(t)){
            return true;
        }
        return false;
    }
    
    public String getChannelType( ){
        return channeltype;
    }
}
