package com.example.codebreakerv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MenuScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Intent startgame = new Intent(MenuScreen.this, MainActivity.class);
        Intent extras = new Intent(MenuScreen.this, Extras.class);
        Intent help = new Intent(MenuScreen.this, HelpStuff.class);

        Button btnstart = findViewById(R.id.btnstart);
        Button btnextras = findViewById(R.id.btnextras);
        Button btnhelp = findViewById(R.id.btnhelp);

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(startgame);
            }
        });



        btnextras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(extras);
            }
        });

        btnhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(help);
            }
        });


    }

    public void onBackPressed()
    {
        finishAffinity();
        finish();
    }
}