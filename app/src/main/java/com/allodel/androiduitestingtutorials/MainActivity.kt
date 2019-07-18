package com.allodel.androiduitestingtutorials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {


    private lateinit var emailAddress : EditText
    private lateinit var messageView : TextView
    private lateinit var passwrod: EditText
    private lateinit var login:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        emailAddress = findViewById(R.id.et_email)
        passwrod = findViewById(R.id.et_password)
        login = findViewById(R.id.btn_login)
        messageView = findViewById(R.id.tv_message)



    }


    fun dologin(v : View){

        emailAddress.setText("yuvraazkhattri@gmail.com")
        passwrod.setText("pppqqqppp")

        if(!emailAddress.text.isEmpty() && !passwrod.text.isEmpty()){
            messageView.setText(R.string.lbl_validation_success)


         }else{

            messageView.setText(R.string.lbl_validation_failed)

        }
    }
}
