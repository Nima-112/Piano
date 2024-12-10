package com.example.mypiano;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonCSharp = findViewById(R.id.buttonCSharp);
        Button buttonGSharp = findViewById(R.id.buttonGSharp);
        Button buttonFSharp = findViewById(R.id.buttonFSharp);
        Button buttonESharp = findViewById(R.id.buttonESharp);
        Button buttonDSharp = findViewById(R.id.buttonDSharp);


        Button buttonC = findViewById(R.id.buttonC);
        Button buttonD = findViewById(R.id.buttonD);
        Button buttonE = findViewById(R.id.buttonE);
        Button buttonF = findViewById(R.id.buttonF);
        Button buttonG = findViewById(R.id.buttonG);
        Button buttonA = findViewById(R.id.buttonA);
        Button buttonB = findViewById(R.id.buttonB);


        buttonC.setOnClickListener(v -> playSound(R.raw.note_c));
        buttonD.setOnClickListener(v -> playSound(R.raw.note_d));
        buttonE.setOnClickListener(v -> playSound(R.raw.note_e));
        buttonF.setOnClickListener(v -> playSound(R.raw.note_f));
        buttonG.setOnClickListener(v -> playSound(R.raw.note_g));
        buttonA.setOnClickListener(v -> playSound(R.raw.note_a));
        buttonB.setOnClickListener(v -> playSound(R.raw.note_b));




        buttonCSharp.setOnClickListener(v -> {
            v.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_press));
            playSound(R.raw.note_c_sharp);
        });
        buttonGSharp.setOnClickListener(v -> {
            v.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_press));
            playSound(R.raw.note_g_sharp);
        });
        buttonFSharp.setOnClickListener(v -> {
            v.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_press));
            playSound(R.raw.note_f_sharp);
        });
        buttonESharp.setOnClickListener(v -> {
            v.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_press));
            playSound(R.raw.note_e_sharp);
        });
        buttonDSharp.setOnClickListener(v -> {
            v.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_press));
            playSound(R.raw.note_d_sharp);
        });
    }


    private void playSound(int soundResourceId) {
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(this, soundResourceId);
        mediaPlayer.start();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
    }
}
