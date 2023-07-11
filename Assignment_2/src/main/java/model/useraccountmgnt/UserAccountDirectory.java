package model.useraccountmgnt;

import model.personnel.*;
import java.util.ArrayList;

public class UserAccountDirectory {

    ArrayList<UserAccount> useraccountlist;

    public UserAccountDirectory() {
        useraccountlist = new ArrayList();
    }

    public UserAccount newUserAccount(Profile p, String un, String pw) {
        UserAccount ua = new UserAccount(p, un, pw);
        useraccountlist.add(ua);
        return ua;
    }

    public UserAccount findUserAccount(String id) {
        for (UserAccount ua : useraccountlist) {
            if (ua.isMatch(id)) {
                return ua;
            }
        }
        return null; 
    }

    //根據username跟password確認有沒有這個用戶
    public UserAccount AuthenticateUser(String un, String pw) {
        for (UserAccount ua : useraccountlist) {
            if (ua.IsValidUser(un, pw)) {
                return ua;
            }
        }
        return null;
    }
}
