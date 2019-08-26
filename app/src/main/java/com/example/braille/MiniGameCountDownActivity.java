package com.example.braille;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

import android.os.CountDownTimer;
import android.widget.TextView;


public class MiniGameCountDownActivity extends AppCompatActivity {
    private String word;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_game_countdown);

        textView = (TextView)findViewById(R.id.countdownView);

        startGame();
    }

    private void startGame(){

        //starts 3 sec countdown
        CountDownTimer countDownTimer = new CountDownTimer(4000, 1000) {
            public void onTick(long millisUntilFinished) {
                textView.setText(String.format(Locale.getDefault(), "%d", millisUntilFinished / 1000L));
            }

            public void onFinish() {
                startActivity(new Intent(MiniGameCountDownActivity.this, MiniGameNormalGameActivity.class));
            }
        }.start();

    }



}
