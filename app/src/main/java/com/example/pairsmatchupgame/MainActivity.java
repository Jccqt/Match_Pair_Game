package com.example.pairsmatchupgame;

import android.animation.ObjectAnimator;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, resetBtn;
    ImageButton [] buttons;
    int flipCount = 0, totalFlipCount = 0, pastID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btn1 = findViewById(R.id.img1pair1);
        btn2 = findViewById(R.id.img2pair2);
        btn3 = findViewById(R.id.img3pair3);
        btn4 = findViewById(R.id.img4pair3);
        btn5 = findViewById(R.id.img5pair2);
        btn6 = findViewById(R.id.img6pair1);
        btn7 = findViewById(R.id.img7pair4);
        btn8 = findViewById(R.id.img8pair5);
        btn9 = findViewById(R.id.img9pair6);
        btn10 = findViewById(R.id.img10pair6);
        btn11 = findViewById(R.id.img11pair5);
        btn12 = findViewById(R.id.img12pair4);
        resetBtn = findViewById(R.id.resetBtn);

        buttons = new ImageButton[]{btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12};

        View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator flipAnimator = ObjectAnimator.ofFloat(v, "rotationY", 0f, 180f);
                flipAnimator.setDuration(300); // Duration of the flip animation
                flipAnimator.start();

                if (v.getId() == R.id.img1pair1) {
                    btn1.setImageResource(R.drawable.jessie);
                    flipCount++;
                    if (flipCount == 2) {
                        if (pastID == R.id.img6pair1) {
                            totalFlipCount++;
                            Log.i("Flip", "FlipCount: " + totalFlipCount);
                            btn1.setEnabled(false);
                            pastID = 0;
                            flipCount = 0;
                        } else {
                            flipCount = 0;
                            btn1.setEnabled(true);
                            ((ImageButton)findViewById(pastID)).setEnabled(true);
                            btn1.setImageResource(R.drawable.personicon);
                            ((ImageButton) findViewById(pastID)).setImageResource(R.drawable.personicon);
                            pastID = 0;
                        }
                    } else {
                        pastID = v.getId();
                        btn1.setEnabled(false);
                    }
                } else if (v.getId() == R.id.img2pair2) {
                    btn2.setImageResource(R.drawable.jc);
                    flipCount++;
                    if (flipCount == 2) {
                        if (pastID == R.id.img5pair2) {
                            totalFlipCount++;
                            Log.i("Flip", "FlipCount: " + totalFlipCount);
                            btn2.setEnabled(false);
                            pastID = 0;
                            flipCount = 0;
                        } else {
                            flipCount = 0;
                            btn2.setEnabled(true);
                            ((ImageButton) findViewById(pastID)).setEnabled(true);
                            btn2.setImageResource(R.drawable.personicon);
                            ((ImageButton) findViewById(pastID)).setImageResource(R.drawable.personicon);
                            pastID = 0;
                        }
                    } else {
                        pastID = v.getId();
                        btn2.setEnabled(false);
                    }
                } else if (v.getId() == R.id.img3pair3) {
                    btn3.setImageResource(R.drawable.adrianne);
                    flipCount++;
                    if (flipCount == 2) {
                        if (pastID == R.id.img4pair3) {
                            totalFlipCount++;
                            Log.i("Flip", "FlipCount: " + totalFlipCount);
                            btn3.setEnabled(false);
                            pastID = 0;
                            flipCount = 0;
                        } else {
                            flipCount = 0;
                            btn3.setEnabled(true);
                            ((ImageButton) findViewById(pastID)).setEnabled(true);
                            btn3.setImageResource(R.drawable.personicon);
                            ((ImageButton) findViewById(pastID)).setImageResource(R.drawable.personicon);
                            pastID = 0;
                        }
                    } else {
                        pastID = v.getId();
                        btn3.setEnabled(false);
                    }
                } else if (v.getId() == R.id.img4pair3) {
                    btn4.setImageResource(R.drawable.adrianne);
                    flipCount++;
                    if (flipCount == 2) {
                        if (pastID == R.id.img3pair3) {
                            totalFlipCount++;
                            Log.i("Flip", "FlipCount: " + totalFlipCount);
                            btn4.setEnabled(false);
                            pastID = 0;
                            flipCount = 0;
                        } else {
                            flipCount = 0;
                            btn4.setEnabled(true);
                            ((ImageButton) findViewById(pastID)).setEnabled(true);
                            btn4.setImageResource(R.drawable.personicon);
                            ((ImageButton) findViewById(pastID)).setImageResource(R.drawable.personicon);
                            pastID = 0;
                        }
                    } else {
                        pastID = v.getId();
                        btn4.setEnabled(false);
                    }
                } else if (v.getId() == R.id.img5pair2) {
                    btn5.setImageResource(R.drawable.jc);
                    flipCount++;
                    if (flipCount == 2) {
                        if (pastID == R.id.img2pair2) {
                            totalFlipCount++;
                            Log.i("Flip", "FlipCount: " + totalFlipCount);
                            btn5.setEnabled(false);
                            pastID = 0;
                            flipCount = 0;
                        } else {
                            flipCount = 0;
                            btn5.setEnabled(true);
                            ((ImageButton) findViewById(pastID)).setEnabled(true);
                            btn5.setImageResource(R.drawable.personicon);
                            ((ImageButton) findViewById(pastID)).setImageResource(R.drawable.personicon);
                            pastID = 0;
                        }
                    } else {
                        pastID = v.getId();
                        btn5.setEnabled(false);
                    }
                } else if (v.getId() == R.id.img6pair1) {
                    btn6.setImageResource(R.drawable.jessie);
                    flipCount++;
                    if (flipCount == 2) {
                        if (pastID == R.id.img1pair1) {
                            totalFlipCount++;
                            Log.i("Flip", "FlipCount: " + totalFlipCount);
                            btn6.setEnabled(false);
                            pastID = 0;
                            flipCount = 0;
                        } else {
                            flipCount = 0;
                            btn6.setEnabled(true);
                            ((ImageButton) findViewById(pastID)).setEnabled(true);
                            btn6.setImageResource(R.drawable.personicon);
                            ((ImageButton) findViewById(pastID)).setImageResource(R.drawable.personicon);
                            pastID = 0;
                        }
                    } else {
                        pastID = v.getId();
                        btn6.setEnabled(false);
                    }
                } else if(v.getId() == R.id.img7pair4) {
                    btn7.setImageResource(R.drawable.nathan);
                    flipCount++;
                    if (flipCount == 2) {
                        if (pastID == R.id.img12pair4) {
                            totalFlipCount++;
                            Log.i("Flip", "FlipCount: " + totalFlipCount);
                            btn7.setEnabled(false);
                            pastID = 0;
                            flipCount = 0;
                        } else {
                            flipCount = 0;
                            btn7.setEnabled(true);
                            ((ImageButton) findViewById(pastID)).setEnabled(true);
                            btn7.setImageResource(R.drawable.personicon);
                            ((ImageButton) findViewById(pastID)).setImageResource(R.drawable.personicon);
                            pastID = 0;
                        }
                    } else {
                        pastID = v.getId();
                        btn7.setEnabled(false);
                    }
                } else if(v.getId() == R.id.img8pair5){
                    btn8.setImageResource(R.drawable.robby);
                    flipCount++;
                    if (flipCount == 2) {
                        if (pastID == R.id.img11pair5) {
                            totalFlipCount++;
                            Log.i("Flip", "FlipCount: " + totalFlipCount);
                            btn8.setEnabled(false);
                            pastID = 0;
                            flipCount = 0;
                        } else {
                            flipCount = 0;
                            btn8.setEnabled(true);
                            ((ImageButton) findViewById(pastID)).setEnabled(true);
                            btn8.setImageResource(R.drawable.personicon);
                            ((ImageButton) findViewById(pastID)).setImageResource(R.drawable.personicon);
                            pastID = 0;
                        }
                    } else {
                        pastID = v.getId();
                        btn8.setEnabled(false);
                    }
                } else if(v.getId() == R.id.img9pair6){
                    btn9.setImageResource(R.drawable.ashly);
                    flipCount++;
                    if (flipCount == 2) {
                        if (pastID == R.id.img10pair6) {
                            totalFlipCount++;
                            Log.i("Flip", "FlipCount: " + totalFlipCount);
                            btn9.setEnabled(false);
                            pastID = 0;
                            flipCount = 0;
                        } else {
                            flipCount = 0;
                            btn9.setEnabled(true);
                            ((ImageButton) findViewById(pastID)).setEnabled(true);
                            btn9.setImageResource(R.drawable.personicon);
                            ((ImageButton) findViewById(pastID)).setImageResource(R.drawable.personicon);
                            pastID = 0;
                        }
                    } else {
                        pastID = v.getId();
                        btn9.setEnabled(false);
                    }
                } else if(v.getId() == R.id.img10pair6){
                    btn10.setImageResource(R.drawable.ashly);
                    flipCount++;
                    if (flipCount == 2) {
                        if (pastID == R.id.img9pair6) {
                            totalFlipCount++;
                            Log.i("Flip", "FlipCount: " + totalFlipCount);
                            btn10.setEnabled(false);
                            pastID = 0;
                            flipCount = 0;
                        } else {
                            flipCount = 0;
                            btn10.setEnabled(true);
                            ((ImageButton) findViewById(pastID)).setEnabled(true);
                            btn10.setImageResource(R.drawable.personicon);
                            ((ImageButton) findViewById(pastID)).setImageResource(R.drawable.personicon);
                            pastID = 0;
                        }
                    } else {
                        pastID = v.getId();
                        btn10.setEnabled(false);
                    }
                } else if(v.getId() == R.id.img11pair5){
                    btn11.setImageResource(R.drawable.robby);
                    flipCount++;
                    if (flipCount == 2) {
                        if (pastID == R.id.img8pair5) {
                            totalFlipCount++;
                            Log.i("Flip", "FlipCount: " + totalFlipCount);
                            btn11.setEnabled(false);
                            pastID = 0;
                            flipCount = 0;
                        } else {
                            flipCount = 0;
                            btn11.setEnabled(true);
                            ((ImageButton) findViewById(pastID)).setEnabled(true);
                            btn11.setImageResource(R.drawable.personicon);
                            ((ImageButton) findViewById(pastID)).setImageResource(R.drawable.personicon);
                            pastID = 0;
                        }
                    } else {
                        pastID = v.getId();
                        btn11.setEnabled(false);
                    }
                } else if(v.getId() == R.id.img12pair4){
                    btn12.setImageResource(R.drawable.nathan);
                    flipCount++;
                    if (flipCount == 2) {
                        if (pastID == R.id.img7pair4) {
                            totalFlipCount++;
                            Log.i("Flip", "FlipCount: " + totalFlipCount);
                            btn12.setEnabled(false);
                            pastID = 0;
                            flipCount = 0;
                        } else {
                            flipCount = 0;
                            btn12.setEnabled(true);
                            ((ImageButton) findViewById(pastID)).setEnabled(true);
                            btn12.setImageResource(R.drawable.personicon);
                            ((ImageButton) findViewById(pastID)).setImageResource(R.drawable.personicon);
                            pastID = 0;
                        }
                    } else {
                        pastID = v.getId();
                        btn12.setEnabled(false);
                    }
                } else if(v.getId() == R.id.resetBtn){
                    resetAll();
                }

            }
        };

        btn1.setOnClickListener(click);
        btn2.setOnClickListener(click);
        btn3.setOnClickListener(click);
        btn4.setOnClickListener(click);
        btn5.setOnClickListener(click);
        btn6.setOnClickListener(click);
        btn7.setOnClickListener(click);
        btn8.setOnClickListener(click);
        btn9.setOnClickListener(click);
        btn10.setOnClickListener(click);
        btn11.setOnClickListener(click);
        btn12.setOnClickListener(click);
        resetBtn.setOnClickListener(click);
    }

    public void resetAll(){
        for(ImageButton button : buttons){
            button.setImageResource(R.drawable.personicon);
            button.setEnabled(true);
        }
        flipCount = 0;
        totalFlipCount = 0;
        ((TextView)findViewById(R.id.txtCongrats)).setText("Match all pairs.");
    }
}