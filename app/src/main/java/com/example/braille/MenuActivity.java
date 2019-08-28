package com.example.braille;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuActivity extends AppCompatActivity {
    Button libraryButton;
    Button translateButton;
    Button miniGameButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        try {
            //InputStream is = getAssets().open("data.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(getAssets().open("data.txt")));
            String text = null;
            for (int i = 1; i < 10; i++) {
                if (i == 7) {
                    text = reader.readLine();
                } else
                    reader.readLine();
            }
            System.out.println(text);

        } catch (IOException e) {
            e.printStackTrace();
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        TextView txtView = (TextView)findViewById(R.id.textView3);

        libraryButton = (Button) findViewById(R.id.buttonLibrary);
        translateButton = (Button) findViewById(R.id.buttonTranslate);
        miniGameButton = (Button) findViewById(R.id.buttonGame);


        libraryButton.setTextColor(getApplication().getResources().getColor(R.color.Black2Grey)); //TAKE DEFAULT COLOR
        translateButton.setTextColor(getApplication().getResources().getColor(R.color.Black2Grey)); //TAKE DEFAULT COLOR
        miniGameButton.setTextColor(getApplication().getResources().getColor(R.color.Black2Grey)); //TAKE DEFAULT COLOR


        addListenerOnButton();





    }

    private void addListenerOnButton() {




        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, LibraryAlphabetActivity.class));

            }
        });

        translateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, WordConvertActivity.class));

            }
        });


        miniGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, MiniGameMenuActivity.class));

            }
        });

    }




}
