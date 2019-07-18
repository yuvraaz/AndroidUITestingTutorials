package com.allodel.mockitotestingandroid;

public interface LoginContract {

    interface View{

        void disableLoginButton();
        void enableLoginButton();
        void displayErrorValidation();
        void displaySuccessMessage();

        String getEmail();
        String getPassword();
    }

    interface Presenter{

        void doLogin(String email, String password);
        void emailPasswordInputTextChange(String email, String password);

    }


}
