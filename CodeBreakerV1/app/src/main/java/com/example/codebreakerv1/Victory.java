package com.example.codebreakerv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Victory extends AppCompatActivity {

    Button btnrestart;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victory);


        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Intent recvd = getIntent();
        Intent rstrt = new Intent(Victory.this, MainActivity.class);
        String txt = recvd.getStringExtra("victory");

        tv1 = findViewById(R.id.tv1);
        btnrestart = findViewById(R.id.btnrestart);
        tv1.setText(txt);

        btnrestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(rstrt);
            }
        });
    }

}