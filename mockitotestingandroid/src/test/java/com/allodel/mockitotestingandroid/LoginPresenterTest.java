package com.allodel.mockitotestingandroid;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


public class LoginPresenterTest {


    //Need Mock of View
    @Mock
    private LoginContract.View loginView;

    //Need instance of login presenter
    private LoginContract.Presenter presenter;



    @Before
    public void setUp() {
        //Instantiate mockito
        MockitoAnnotations.initMocks(this);
        presenter = new LoginPresenter(loginView);
    }


    //For doing login

    @Test
    public void doLogin_NullInputs(){

        presenter.doLogin(null,null);
        Mockito.verify(loginView,Mockito.never()).displaySuccessMessage();

    }

    @Test
    public void doLogin_EmptyStringInputs(){
        presenter.doLogin("","");
        Mockito.verify(loginView,Mockito.never()).displaySuccessMessage();

    }

    @Test
    public void doLogin_NormalEmailAndPasswordStringInputs(){
        presenter.doLogin("youremail@gmail.com","pppqqqppp");
        Mockito.verify(loginView).displaySuccessMessage();
    }




    //These tests are for activating and deactivating login button.


    @Test
    public void EmptyEmailPasswordStringInputLoginButtonDisabled(){

        presenter.emailPasswordInputTextChange("","");
        Mockito.verify(loginView).disableLoginButton();


    }
    @Test
    public void NullEmailPasswordStringInputLoginButtonDisabled(){
        presenter.emailPasswordInputTextChange(null,null);
        Mockito.verify(loginView).disableLoginButton();
    }

    @Test
    public void NormalEmailPasswordStringInputLoginButtonEnabled(){

        presenter.emailPasswordInputTextChange("yuvraazkhattri@gmail.com","pppqqqpp");
         Mockito.verify(loginView).enableLoginButton();

    }

}