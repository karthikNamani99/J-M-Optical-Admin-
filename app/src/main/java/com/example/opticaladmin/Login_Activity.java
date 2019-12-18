package com.example.opticaladmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login_Activity extends AppCompatActivity {

    Button btn_login;
    EditText edt_email,edt_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);

        btn_login=(Button)findViewById(R.id.btn_login);
        edt_email=(EditText)findViewById(R.id.edt_admin_emailid);
        edt_password=(EditText)findViewById(R.id.edt_password);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginBtn=new Intent(getApplicationContext(),Main_Activity.class);
                loginBtn.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(loginBtn);
            }
        });


    }
}
