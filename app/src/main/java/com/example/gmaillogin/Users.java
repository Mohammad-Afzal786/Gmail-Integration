package com.example.gmaillogin;

public class Users {
    String UserProfilePic,UserName, UserId;

    public Users(String userProfilePic, String userName, String userId) {
        UserProfilePic = userProfilePic;
        UserName = userName;
        UserId = userId;
    }

    public Users() {

    }

    public String getUserProfilePic() {
        return UserProfilePic;
    }

    public void setUserProfilePic(String userProfilePic) {
        UserProfilePic = userProfilePic;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }
}
