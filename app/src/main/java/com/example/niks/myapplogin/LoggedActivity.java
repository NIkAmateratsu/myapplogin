package com.example.niks.myapplogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoggedActivity extends AppCompatActivity {
    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged);

        logout = (Button) findViewById(R.id.logout1);
        logout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent twoIntent = new Intent(LoggedActivity.this,MainActivity.class);
                startActivity(twoIntent);
                Toast.makeText(getApplicationContext(),"Logged out Successfully",Toast.LENGTH_LONG).show();
            }

        } );

    }
}
