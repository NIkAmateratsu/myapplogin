package com.example.niks.myapplogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(username.getText().toString().equals("Admin") &&
                        password.getText().toString().equals("Password")){

                    Toast.makeText(getApplicationContext(),"LogIn done Successfully",Toast.LENGTH_LONG).show();
                    Intent oneIntent = new Intent(MainActivity.this, LoggedActivity.class);
                    startActivity(oneIntent);
                }
                else {
                    Toast.makeText(getApplicationContext(),"LogIn UnSuccessful",Toast.LENGTH_LONG).show();
                }
            }


        });
    }
}
