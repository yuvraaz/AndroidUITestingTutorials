package com.allodel.mockitotestingandroid;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity implements LoginContract.View{

    private EditText emalInput;
    private EditText passwordInput;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
        emalInput = findViewById(R.id.et_email);
        passwordInput = findViewById(R.id.et_password);
        login = findViewById(R.id.btn_login);
    }

    @Override
    public void disableLoginButton() {
        login.setClickable(false);
    }

    @Override
    public void enableLoginButton() {
        login.setClickable(true);

    }

    @Override
    public void displayErrorValidation() {

        Toast.makeText(this, "Failed",Toast.LENGTH_LONG).show();

    }

    @Override
    public void displaySuccessMessage() {
        Toast.makeText(this, "Success",Toast.LENGTH_LONG).show();

    }




    @Override
    public String getEmail() {
        return emalInput.getText().toString();
    }

    @Override
    public String getPassword() {
        return passwordInput.getText().toString();
    }
}
