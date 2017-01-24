package com.example.keith.a1_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView    mtv;
    Button      myButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get a handle to UI elements of interest
        mtv         =(TextView)findViewById(R.id.textView);
        myButton2   =(Button)findViewById(R.id.button2);

        //manually add an anonymous listener for button2, button1 is handled through XML
        myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.mtv.setText(R.string.text_b2);
            }
        });

    }

    public void doButton1(View view) {
        mtv.setText(R.string.text_b1);
    }
}
