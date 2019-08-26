package com.example.braille;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import braille.BrailleEngine;

public class TranslateActivity extends AppCompatActivity {

    private EditText input;
    private TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_convert);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        addListenerOnButton();

        txtView = (TextView)findViewById(R.id.textView);
        txtView.setMovementMethod(new ScrollingMovementMethod());


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void addListenerOnButton() {

        input = (EditText) findViewById(R.id.editText);

        Button translateButton = (Button) findViewById(R.id.button);

        Button menuButton = (Button) findViewById(R.id.button2);

        translateButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                BrailleEngine b = new BrailleEngine();

                TextView tv = new TextView(TranslateActivity.this);
                System.out.println(input.getText().toString().toLowerCase());

                tv.setText(input.getText().toString().toLowerCase());

                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
                //    makeText(context, text, duration);
                //toast.makeText(TranslateActivity.this, input.getText(), toast.LENGTH_SHORT).show()

                txtView.setText(b.initialState(input.getText().toString()));

                input.onEditorAction(EditorInfo.IME_ACTION_DONE); //hide keybord after button clicked

            }
        });

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TranslateActivity.this, MenuActivity.class));
            }
        })

        ;



    }
}
