package com.example.codebreakerv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String ans = randomno();
    String inp = "----"; //User input string
    int pos = 0;
    int kp_pos = 0;

    Intent victory;

    Button btnkeypad1, btnkeypad2, btnkeypad3,
            btnkeypad4, btnkeypad5, btnkeypad6,
            btnkeypad7, btnkeypad8, btnkeypad9,
            btnkeypad0;

    Button btntest1, btntest2, btntest3, btntest4,
            btntest5, btntest6, btntest7, btntest8,
            btntest9, btntest10, btntest11, btntest12,
            btntest13, btntest14, btntest15, btntest16;

    Button btndel;

    Button btnrestart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        victory = new Intent(MainActivity.this, Victory.class);

        btnrestart = findViewById(R.id.btnrestart);

        btntest1 = findViewById(R.id.btntest1);
        btntest2 = findViewById(R.id.btntest2);
        btntest3 = findViewById(R.id.btntest3);
        btntest4 = findViewById(R.id.btntest4);
        btntest5 = findViewById(R.id.btntest5);
        btntest6 = findViewById(R.id.btntest6);
        btntest7 = findViewById(R.id.btntest7);
        btntest8 = findViewById(R.id.btntest8);
        btntest9 = findViewById(R.id.btntest9);
        btntest10 = findViewById(R.id.btntest10);
        btntest11 = findViewById(R.id.btntest11);
        btntest12 = findViewById(R.id.btntest12);
        btntest13 = findViewById(R.id.btntest13);
        btntest14 = findViewById(R.id.btntest14);
        btntest15 = findViewById(R.id.btntest15);
        btntest16 = findViewById(R.id.btntest16);


        btnkeypad1 = findViewById(R.id.btnkeypad1);
        btnkeypad2 = findViewById(R.id.btnkeypad2);
        btnkeypad3 = findViewById(R.id.btnkeypad3);
        btnkeypad4 = findViewById(R.id.btnkeypad4);
        btnkeypad5 = findViewById(R.id.btnkeypad5);
        btnkeypad6 = findViewById(R.id.btnkeypad6);
        btnkeypad7 = findViewById(R.id.btnkeypad7);
        btnkeypad8 = findViewById(R.id.btnkeypad8);
        btnkeypad9 = findViewById(R.id.btnkeypad9);
        btnkeypad0 = findViewById(R.id.btnkeypad0);

        btndel = findViewById(R.id.btndel);

        btnrestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                overridePendingTransition(0, 0);
                startActivity(getIntent());
                overridePendingTransition(0, 0);
            }
        });

        btnkeypad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitbox("1");
            }
        });

        btnkeypad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitbox("2");
            }
        });

        btnkeypad3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitbox("3");
            }
        });

        btnkeypad4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitbox("4");
            }
        });

        btnkeypad5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitbox("5");
            }
        });

        btnkeypad6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitbox("6");
            }
        });

        btnkeypad7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitbox("7");
            }
        });

        btnkeypad8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitbox("8");
            }
        });

        btnkeypad9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitbox("9");
            }
        });

        btnkeypad0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitbox("0");
            }
        });

        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (kp_pos == 4 | kp_pos == 8 | kp_pos == 12 | kp_pos == 16 | kp_pos == 20 | kp_pos == 24) {
                    System.out.print("Last letter filled do not do anything");
                } else {
                    System.out.println("Pos of pos on del: " + pos);

                    if (kp_pos == 1) {
                        btntest1.setText("");
                    }
                    if (kp_pos == 2) {
                        btntest2.setText("");
                    }

                    if (kp_pos == 3) {
                        btntest3.setText("");
                    }

                    if (kp_pos == 4) {
                        btntest4.setText("");
                    }
                    if (kp_pos == 5) {
                        btntest5.setText("");
                    }
                    if (kp_pos == 6) {
                        btntest6.setText("");
                    }

                    if (kp_pos == 7) {
                        btntest7.setText("");
                    }

                    if (kp_pos == 8) {
                        btntest8.setText("");
                    }

                    if (kp_pos == 9) {
                        btntest9.setText("");
                    }

                    if (kp_pos == 10) {
                        btntest10.setText("");
                    }

                    if (kp_pos == 11) {
                        btntest11.setText("");
                    }

                    if (kp_pos == 12) {
                        btntest12.setText("");
                    }

                    if (kp_pos == 13) {
                        btntest13.setText("");
                    }

                    if (kp_pos == 14) {
                        btntest14.setText("");
                    }
                    if (kp_pos == 15) {
                        btntest15.setText("");
                    }
                    if (kp_pos == 16) {
                        btntest16.setText("");
                    }


                    if (pos < 4) {
                        if (pos == 0) {
                            System.out.println("Do nothing");
                        } else {
                            pos -= 1;
                            inp = inp.substring(0, pos) + "-" + inp.substring(pos + 1);
                            kp_pos -= 1;
                            System.out.println(inp);
                        }
                    }
                }

            }
        });

    }

    public void hitbox(String i) {
        System.out.println("Answer is " + ans);
        //System.out.println("Pos:"+pos);
        if (pos < 4) {
            inp = inp.substring(0, pos) + i + inp.substring(pos + 1);
            pos += 1;
            System.out.println(inp);
        } else {
            checkcolor();
            pos = 0;
            inp = "----";
            inp = inp.substring(0, pos) + i + inp.substring(pos + 1);
            pos += 1;
            System.out.println(inp);
        }

//        if(inp.charAt(3) != '-')
//        {
//            checkcolor()
//        }

        kp_pos += 1;
        //System.out.println("User answer: "+inp);


        if (kp_pos == 1) {
            btntest1.setText(i);
        }
        if (kp_pos == 2) {
            btntest2.setText(i);
        }

        if (kp_pos == 3) {
            btntest3.setText(i);
        }

        if (kp_pos == 4) {
            btntest4.setText(i);
        }
        if (kp_pos == 5) {
            btntest5.setText(i);
        }
        if (kp_pos == 6) {
            btntest6.setText(i);
        }

        if (kp_pos == 7) {
            btntest7.setText(i);
        }

        if (kp_pos == 8) {
            btntest8.setText(i);
        }

        if (kp_pos == 9) {
            btntest9.setText(i);
        }

        if (kp_pos == 10) {
            btntest10.setText(i);
        }

        if (kp_pos == 11) {
            btntest11.setText(i);
        }

        if (kp_pos == 12) {
            btntest12.setText(i);
        }

        if (kp_pos == 13) {
            btntest13.setText(i);
        }

        if (kp_pos == 14) {
            btntest14.setText(i);
        }
        if (kp_pos == 15) {
            btntest15.setText(i);
        }
        if (kp_pos == 16) {
            btntest16.setText(i);
        }

        if (inp.charAt(3) != '-') {
            checkcolor();
            checkans();
        }
    }

    String randomno() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);

        String result = "";
        for (int i = 0; i < 4; i++) {
            result += numbers.get(i).toString();
        }
        return result;
    }

    void checkcolor() {
        if (inp.charAt(3) != '-')
        {
            if (kp_pos <= 4) {
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (inp.charAt(i) == ans.charAt(j)) {
                            if (i == 0) {
                                btntest1.setBackgroundColor(Color.BLUE);
                            }
                            if (i == 1) {
                                btntest2.setBackgroundColor(Color.BLUE);
                            }
                            if (i == 2) {
                                btntest3.setBackgroundColor(Color.BLUE);
                            }
                            if (i == 3) {
                                btntest4.setBackgroundColor(Color.BLUE);
                            }
                        }
                    }
                    if (inp.charAt(i) == ans.charAt(i)) {
                        //btntest 1, 2, 3, 4 to be changed in colours based on this
                        if (i == 0) {
                            btntest1.setBackgroundColor(Color.GREEN);
                        }
                        if (i == 1) {
                            btntest2.setBackgroundColor(Color.GREEN);
                        }
                        if (i == 2) {
                            btntest3.setBackgroundColor(Color.GREEN);
                        }
                        if (i == 3) {
                            btntest4.setBackgroundColor(Color.GREEN);
                        }
                    }

                }
            } else if (kp_pos <= 8) {
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (inp.charAt(i) == ans.charAt(j)) {
                            if (i == 0) {
                                btntest5.setBackgroundColor(Color.BLUE);
                            }
                            if (i == 1) {
                                btntest6.setBackgroundColor(Color.BLUE);
                            }
                            if (i == 2) {
                                btntest7.setBackgroundColor(Color.BLUE);
                            }
                            if (i == 3) {
                                btntest8.setBackgroundColor(Color.BLUE);
                            }
                        }
                    }
                    if (inp.charAt(i) == ans.charAt(i)) {
                        //btntest 1, 2, 3, 4 to be changed in colours based on this
                        if (i == 0) {
                            btntest5.setBackgroundColor(Color.GREEN);
                        }
                        if (i == 1) {
                            btntest6.setBackgroundColor(Color.GREEN);
                        }
                        if (i == 2) {
                            btntest7.setBackgroundColor(Color.GREEN);
                        }
                        if (i == 3) {
                            btntest8.setBackgroundColor(Color.GREEN);
                        }
                    }

                }
            }
            else if (kp_pos <= 12) {
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (inp.charAt(i) == ans.charAt(j)) {
                            if (i == 0) {
                                btntest9.setBackgroundColor(Color.BLUE);
                            }
                            if (i == 1) {
                                btntest10.setBackgroundColor(Color.BLUE);
                            }
                            if (i == 2) {
                                btntest11.setBackgroundColor(Color.BLUE);
                            }
                            if (i == 3) {
                                btntest12.setBackgroundColor(Color.BLUE);
                            }
                        }
                    }
                    if (inp.charAt(i) == ans.charAt(i)) {
                        //btntest 1, 2, 3, 4 to be changed in colours based on this
                        if (i == 0) {
                            btntest9.setBackgroundColor(Color.GREEN);
                        }
                        if (i == 1) {
                            btntest10.setBackgroundColor(Color.GREEN);
                        }
                        if (i == 2) {
                            btntest11.setBackgroundColor(Color.GREEN);
                        }
                        if (i == 3) {
                            btntest12.setBackgroundColor(Color.GREEN);
                        }
                    }

                }
            }
            else {
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (inp.charAt(i) == ans.charAt(j)) {
                            if (i == 0) {
                                btntest13.setBackgroundColor(Color.BLUE);
                            }
                            if (i == 1) {
                                btntest14.setBackgroundColor(Color.BLUE);
                            }
                            if (i == 2) {
                                btntest15.setBackgroundColor(Color.BLUE);
                            }
                            if (i == 3) {
                                btntest16.setBackgroundColor(Color.BLUE);
                            }
                        }
                    }
                    if (inp.charAt(i) == ans.charAt(i)) {
                        //btntest 1, 2, 3, 4 to be changed in colours based on this
                        if (i == 0) {
                            btntest13.setBackgroundColor(Color.GREEN);
                        }
                        if (i == 1) {
                            btntest14.setBackgroundColor(Color.GREEN);
                        }
                        if (i == 2) {
                            btntest15.setBackgroundColor(Color.GREEN);
                        }
                        if (i == 3) {
                            btntest16.setBackgroundColor(Color.GREEN);
                        }
                    }

                }
            }

        }
    }
    int checkans()
    {
        System.out.println("Checking answer");
        System.out.println("Input was: "+inp+"\nAnswer is "+ans);
        if(inp.equals(ans))
        {
            victory.putExtra("victory","YOU WON!");
            startActivity(victory);
            return 1;

        }
        if(kp_pos >= 16)
        {
            victory.putExtra("victory","YOU LOST!");
            startActivity(victory);
            return 0;
        }
        return 0;
    }
    public void onBackPressed()
    {
        Intent gohome = new Intent(MainActivity.this, MenuScreen.class);
        startActivity(gohome);
    }

}
