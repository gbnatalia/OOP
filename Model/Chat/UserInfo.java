package Model.Chat;

public class UserInfo {
    private String userName;
    private String userTelephone;
    private UStatus userStatus;

    public void setUserName(String userName) {this.userName = userName;}
    public String getUserName(){return userName;}

    public void setUserTelephone(String userTelephone) {this.userTelephone = userTelephone;}
    public String getUserTelephone(){return userTelephone;}

    public void setUserStatus(UStatus userStatus){this.userStatus = userStatus;}
    public UStatus getUserStatus(){return userStatus;}
}
