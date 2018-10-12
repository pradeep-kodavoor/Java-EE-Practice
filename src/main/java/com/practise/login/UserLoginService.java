package com.practise.login;

public class UserLoginService {

    Boolean isValidUser(String userName,String password) {
        return userName.equalsIgnoreCase("Pradeep") && password.equalsIgnoreCase("dummy");
    }
}
