package com.allodel.mockitotestingandroid;

public class LoginPresenter implements LoginContract.Presenter {

    private LoginContract.View loginView;


    public LoginPresenter(LoginContract.View view) {
    this.loginView =view;
    }


    @Override
    public void doLogin(String email, String password) {

        if(email != null && !email.isEmpty() && password!=null && !password.isEmpty()){
            loginView.displaySuccessMessage();
        }else {
            loginView.displayErrorValidation();
        }

    }

    @Override
    public void emailPasswordInputTextChange(String email, String password) {
        if(email != null && !email.isEmpty() && password!=null && !password.isEmpty()){
            loginView.enableLoginButton();
        }else {
            loginView.disableLoginButton();

        }
    }

}
