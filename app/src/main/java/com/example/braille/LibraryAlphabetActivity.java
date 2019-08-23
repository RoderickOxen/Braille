package com.example.braille;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import braille.BrailleEngine;

public class LibraryAlphabetActivity extends AppCompatActivity {

    private Button backButton;
    private Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z, numbers;
    private TextView txtView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_alphabet);

        addListenerOnButton();
        txtView = (TextView)findViewById(R.id.editText3);

    }

    private void addListenerOnButton() {
        backButton = (Button) findViewById(R.id.buttonMenu);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LibraryAlphabetActivity.this, MenuActivity.class));

            }
        });

        numbers = (Button) findViewById(R.id.buttonNumbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LibraryAlphabetActivity.this, LibraryNumbersActivity.class));

            }
        });


        a = (Button) findViewById(R.id.buttonA);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("a"));
            }
        });
        b = (Button) findViewById(R.id.buttonB);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("b"));
            }
        });
        c = (Button) findViewById(R.id.buttonC);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("c"));
            }
        });
        d = (Button) findViewById(R.id.buttonD);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("d"));
            }
        });
        e = (Button) findViewById(R.id.buttonE);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("e"));
            }
        });
        f = (Button) findViewById(R.id.buttonF);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("f"));
            }
        });
        g = (Button) findViewById(R.id.buttonG);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("g"));
            }
        });
        h = (Button) findViewById(R.id.buttonH);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("h"));
            }
        });
        i = (Button) findViewById(R.id.buttonI);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("i"));
            }
        });
        j = (Button) findViewById(R.id.buttonJ);
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("j"));
            }
        });
        k = (Button) findViewById(R.id.buttonK);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("k"));
            }
        });
        l = (Button) findViewById(R.id.buttonL);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("l"));
            }
        });
        m = (Button) findViewById(R.id.buttonM);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("m"));
            }
        });
        n = (Button) findViewById(R.id.buttonN);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("n"));
            }
        });
        o = (Button) findViewById(R.id.buttonO);
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("o"));
            }
        });
        p = (Button) findViewById(R.id.buttonP);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("p"));
            }
        });
        q = (Button) findViewById(R.id.buttonQ);
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("q"));
            }
        });
        r = (Button) findViewById(R.id.buttonR);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("r"));
            }
        });
        s = (Button) findViewById(R.id.buttonS);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("s"));
            }
        });
        t = (Button) findViewById(R.id.buttonT);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("t"));
            }
        });
        u = (Button) findViewById(R.id.buttonU);
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("u"));
            }
        });
        v = (Button) findViewById(R.id.buttonV);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("v"));
            }
        });
        w = (Button) findViewById(R.id.buttonW);
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("w"));
            }
        });
        x = (Button) findViewById(R.id.buttonX);
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("x"));
            }
        });
        y = (Button) findViewById(R.id.buttonY);
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("y"));
            }
        });
        z = (Button) findViewById(R.id.buttonZ);
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BrailleEngine brailleEngine = new BrailleEngine();
                txtView.setText(brailleEngine.initialState("z"));
            }
        });



    }


}
