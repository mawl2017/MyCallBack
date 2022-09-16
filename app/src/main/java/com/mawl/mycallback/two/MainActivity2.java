package com.mawl.mycallback.two;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.mawl.mycallback.R;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        MyTestTwo myTestTwo=new MyTestTwo();
        TextView textView=findViewById(R.id.textView);

        myTestTwo.testLLK("武静", new MyTestTwo.CallBackTwo() {
            @Override
            public void testTT(String gg) {
                textView.setText(gg);
            }

            @Override
            public void testOO(String hh) {
                textView.setText(hh);
            }
        });
    }
}