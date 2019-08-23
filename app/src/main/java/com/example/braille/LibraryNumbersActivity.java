package com.example.braille;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import braille.BrailleEngine;

public class LibraryNumbersActivity extends AppCompatActivity {

    private Button backButton;
    private Button zero,one,two,three,four,five,six,seven,eight,nine, az;
    private TextView txtView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_numbers);

        addListenerOnButton();
        txtView = (TextView)findViewById(R.id.editTextNumbers);

    }

    private void addListenerOnButton() {

        backButton = (Button) findViewById(R.id.buttonMenu);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LibraryNumbersActivity.this, MenuActivity.class));

            }
        });

        az = (Button) findViewById(R.id.buttonAZ);
        az.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LibraryNumbersActivity.this, LibraryAlphabetActivity.class));

            }
        });

        zero = (Button) findViewById(R.id.buttonZero);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("0"));
            }
        });
        one = (Button) findViewById(R.id.buttonOne);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("1"));
            }
        });
        two = (Button) findViewById(R.id.buttonTwo);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("2"));
            }
        });
        three = (Button) findViewById(R.id.buttonThree);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("3"));
            }
        });
        four = (Button) findViewById(R.id.buttonFour);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("4"));
            }
        });
        five = (Button) findViewById(R.id.buttonFive);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("5"));
            }
        });
        six = (Button) findViewById(R.id.buttonSix);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("6"));
            }
        });
        seven = (Button) findViewById(R.id.buttonSeven);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("7"));
            }
        });
        eight = (Button) findViewById(R.id.buttonEight);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("8"));
            }
        });
        nine = (Button) findViewById(R.id.buttonNine);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("9"));
            }
        });


    }
}
