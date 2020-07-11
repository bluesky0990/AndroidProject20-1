package com.nellem.practice04.main;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.nellem.practice04.R;
import com.nellem.practice04.login.Login;

public class Mains extends AppCompatActivity {

    public static Activity mainsActivity;

    TextView tvWelcome;
    Button btnRealtime, btnOnePerson, btnProfile, btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mains);

        mainsActivity = Mains.this;

        tvWelcome = (TextView)findViewById(R.id.tvId);
        tvWelcome.setText(Login.dbId + "님 환영합니다.");

        btnRealtime = (Button)findViewById(R.id.btnRealtime);
        btnRealtime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Mains_Realtime.class);
                startActivity(intent);
            }
        });

        btnOnePerson = (Button)findViewById(R.id.btnOnePerson);
        btnOnePerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Mains_Oneperson.class);
                startActivity(intent);
            }
        });

        btnProfile = (Button)findViewById(R.id.btnProfile);
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Mains_Profile.class);
                startActivity(intent);
            }
        });

        btnLogout = (Button)findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Login.dbId = null;
                finish();
            }
        });
    }
}
