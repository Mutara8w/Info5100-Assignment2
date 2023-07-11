package model.useraccountmgnt;

import model.personnel.Profile;

public class UserAccount {
    
    Profile profile; //如果沒有設Profile這個Class就會很麻煩
    String username;
    String password;
    
    public UserAccount (Profile profile, String un, String pw){
        username = un;
        password = pw;
        this.profile = profile;
    }

    public String getPersonId(){
        return profile.getPerson().getPersonId();
    }

    public boolean isMatch(String id){
        if(getPersonId().equals(id)) return true;
        return false;
    }
    
    //驗證有沒有此用戶，確認username跟password正確
    public boolean IsValidUser(String un, String pw){
        if (username.equalsIgnoreCase(un) && password.equals(pw)) return true;
        else return false;
    }
    
    public String getRole(){
        return profile.getRole();
    }
        
    public Profile getAssociatedPersonProfile(){
        return profile;
        }    
        
}
