package com.example.codebreakerv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Extras extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent quordle = new Intent(Extras.this, Quordle_view.class);
        Intent nerdle = new Intent(Extras.this, Nerdle_view.class);
        Intent wordle = new Intent(Extras.this, Wordle_view.class);
        Intent octordle = new Intent(Extras.this, Octordle_view.class);


        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extras);

        Button btnquordle = findViewById(R.id.btnquordle);
        Button btnnerdle = findViewById(R.id.btnnerdle);
        Button btnwordle = findViewById(R.id.btnwordle);
        Button btnoctordle = findViewById(R.id.btnoctordle);

        btnquordle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(quordle);
            }
        });

        btnnerdle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(nerdle);
            }
        });

        btnwordle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(wordle);
            }
        });

        btnoctordle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(octordle);
            }
        });
    }
}