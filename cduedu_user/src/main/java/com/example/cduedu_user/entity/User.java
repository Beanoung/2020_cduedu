package com.example.cduedu_user.entity;

public class User{
    private String UsersPhone;
    private String UsersName;
    private String UsersEmail;
    private String UsersPassword;
    private String UsersPopedom;
    private String UsersBan;

    public String getUsersPhone() {
        return UsersPhone;
    }

    public void setUsersPhone(String usersPhone) {
        UsersPhone = usersPhone;
    }

    public String getUsersName() {
        return UsersName;
    }

    public void setUsersName(String usersName) {
        UsersName = usersName;
    }

    public String getUsersEmail() {
        return UsersEmail;
    }

    public void setUsersEmail(String usersEmail) {
        UsersEmail = usersEmail;
    }

    public String getUsersPassword() {
        return UsersPassword;
    }

    public void setUsersPassword(String usersPassword) {
        UsersPassword = usersPassword;
    }

    public String getUsersPopedom() {
        return UsersPopedom;
    }

    public void setUsersPopedom(String usersPopedom) {
        UsersPopedom = usersPopedom;
    }

    public String getUsersBan() {
        return UsersBan;
    }

    public void setUsersBan(String usersBan) {
        UsersBan = usersBan;
    }

    @Override
    public String toString() {
        return "User{" +
                "UsersPhone=" + UsersPhone +
                ", UsersName='" + UsersName + '\'' +
                ", UsersEmail='" + UsersEmail + '\'' +
                ", UsersPassword='" + UsersPassword + '\'' +
                ", UsersPopedom='" + UsersPopedom + '\'' +
                ", UsersBan='" + UsersBan + '\'' +
                '}';
    }
}